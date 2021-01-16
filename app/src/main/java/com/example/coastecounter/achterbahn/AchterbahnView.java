package com.example.coastecounter.achterbahn;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.coastecounter.R;
import com.example.coastecounter.dashboard.DashboardView;

public class AchterbahnView extends AppCompatActivity {

    private AchterbahnController achterbahnController;

    private String pos;

    public void openCoasterFrame() {

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.achterbahnanzeigen);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageView img = (ImageView) findViewById(R.id.imageView_achterbahnanzeigen);
        img.setImageResource(R.drawable.coastercounterlogo);
        Bundle b = getIntent().getExtras();
        if (b != null) pos = b.getString("id");
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AchterbahnView.this, DashboardView.class);
                startActivity(intent);
            }
        });
        AchterbahnDB achterbahnDB = new AchterbahnDB();
        achterbahnLaden(achterbahnDB.getByName(pos));
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
        length.setText(String.valueOf(a.getLength()));
        TextView height = findViewById(R.id.text_achterbahnanzeigen_hoehe);
        height.setText(String.valueOf(a.getHeight()));
        TextView descent = findViewById(R.id.text_achterbahnanzeigen_abfahrt);
        descent.setText(String.valueOf(a.getDescent()));
        TextView inversions = findViewById(R.id.text_achterbahnanzeigen_inversionen);
        inversions.setText(String.valueOf(a.getInversions()));
        TextView elements = findViewById(R.id.text_achterbahnanzeigen_elemente);
        elements.setText(a.getElements());
        TextView capacity = findViewById(R.id.text_achterbahnanzeigen_kapazitaet);
        capacity.setText(String.valueOf(a.getCapacity()));
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
        speed.setText(String.valueOf(a.getSpeed()));
        TextView theme = findViewById(R.id.text_achterbahnanzeigen_theme);
        theme.setText(a.getTheme());
        ImageView picture = findViewById(R.id.imageView_achterbahnanzeigen);
        picture.setImageResource(a.getImage());
    }

}
