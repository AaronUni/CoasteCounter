package com.example.coastecounter.achterbahn;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.coastecounter.R;
import com.example.coastecounter.dashboard.DashboardView;

public class AchterbahnView extends AppCompatActivity {

    private AchterbahnController achterbahnController;

    private String pos;

    private int count = 0;

    private AchterbahnDB achterbahnDB = new AchterbahnDB();

    public void openCoasterFrame() {

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.achterbahnanzeigen);
        setUpToolbar();
        ImageView img = (ImageView) findViewById(R.id.imageView_achterbahnanzeigen);
        img.setImageResource(R.drawable.coastercounterlogo);
        Bundle b = getIntent().getExtras();
        if (b != null) {
            count = ((int[]) b.get("countSingle"))[achterbahnDB.getByName(b.getString("id")).getCoasterID()];
            achterbahnLaden(achterbahnDB.getByName(b.getString("id")));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    private void achterbahnLaden(Achterbahn a) {

        TextView name = findViewById(R.id.text_achterbahnanzeigen_name);
        name.setText(a.getName());
        TextView length = findViewById(R.id.text_achterbahnanzeigen_laenge);
        length.setText(a.getLength() + " m");
        TextView height = findViewById(R.id.text_achterbahnanzeigen_hoehe);
        height.setText(a.getHeight() + " m");
        TextView descent = findViewById(R.id.text_achterbahnanzeigen_abfahrt);
        descent.setText(a.getDescent() + " m");
        TextView inversions = findViewById(R.id.text_achterbahnanzeigen_inversionen);
        inversions.setText(String.valueOf(a.getInversions()));
        TextView elements = findViewById(R.id.text_achterbahnanzeigen_elemente);
        elements.setText(a.getElements());
        TextView capacity = findViewById(R.id.text_achterbahnanzeigen_kapazitaet);
        capacity.setText(a.getCapacity() + " per/h");
        TextView cars = findViewById(R.id.text_achterbahnanzeigen_wagen);
        cars.setText(String.valueOf(a.getCars()));
        TextView trains = findViewById(R.id.text_achterbahnanzeigen_zuege);
        trains.setText(String.valueOf(a.getTrains()));
        TextView manufacturer = findViewById(R.id.text_achterbahnanzeigen_erbauer);
        manufacturer.setText(a.getManufacturer());
        TextView constructed = findViewById(R.id.text_achterbahnanzeigen_baujahr);
        constructed.setText(a.getConstructed());
        TextView description = findViewById(R.id.text_achterbahnanzeigen_kurzbeschreibung);
        description.setText(a.getDescription());
        TextView speed = findViewById(R.id.text_achterbahnanzeigen_geschwindigkeit);
        speed.setText(a.getSpeed() + " km/h");
        TextView theme = findViewById(R.id.text_achterbahnanzeigen_theme);
        theme.setText(a.getTheme());
        ImageView picture = findViewById(R.id.imageView_achterbahnanzeigen);
        picture.setImageResource(a.getImage());
        TextView counter = findViewById(R.id.textView_counter);
        counter.setText(String.valueOf(count));
        TextView park = findViewById(R.id.text_achterbahnanzeigen_park);
        park.setText(String.valueOf(a.getPark()));
        RatingBar rating = findViewById(R.id.ratingBar_achterbahnanzeigen);
        rating.setRating(a.getAchterbahnbewertung());
    }

    public void count(View view) {
        count += 1;
        TextView counter = findViewById(R.id.textView_counter);
        counter.setText(String.valueOf(count));
    }

    public void setUpToolbar() {
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AchterbahnView.this, DashboardView.class);
                Bundle b = getIntent().getExtras();
                if (b != null) {
                    int[] rides = (int[]) b.get("countSingle");
                    rides[achterbahnDB.getByName(b.getString("id")).getCoasterID()] = count;
                    b.remove("countSingle");
                    b.putIntArray("countSingle", rides);
                    if (count > 0 && !((boolean[])b.get("ridden"))
                            [achterbahnDB.getByName(b.getString("id")).getCoasterID()]) {
                        ((boolean[])b.get("ridden"))[achterbahnDB.getByName(b.getString("id")).getCoasterID()] = true;
                        int i = (int) b.get("count") + 1;
                        b.remove("count");
                        b.putInt("count", i);
                    }
                }
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}
