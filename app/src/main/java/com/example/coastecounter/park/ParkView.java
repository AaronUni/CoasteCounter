package com.example.coastecounter.park;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import androidx.appcompat.app.AppCompatActivity;
import com.example.coastecounter.R;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.example.coastecounter.dashboard.DashboardView;

public class ParkView extends AppCompatActivity {

    private ParkController parkController;

    private String pos;

    private int count = 0;

    private ParkDB parkDB = new ParkDB();

    public void openParkFrame() {

    }

    public void openParkStatisticsFrame() {

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parkanzeigen);
        setUpToolbar();
        ImageView img = (ImageView) findViewById(R.id.imageView_parkanzeigen);
        img.setImageResource(R.drawable.coastercounterlogo);
        Bundle b = getIntent().getExtras();
        if (b != null) {
            count = ((int[]) b.get("countParks"))[parkDB.getByName(b.getString("Parkname")).getParkID()];
            parkLaden(parkDB.getByName(b.getString("Parkname")));       //Hier muss noch irgendwie auf den richtigen Eintrag navigiert werden
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    private void parkLaden(Park a) {
        TextView name = findViewById(R.id.text_parkanzeigen_name);
        name.setText(a.getName());
        TextView email = findViewById(R.id.text_parkanzeigen_email);
        email.setText(a.getEmail());
        TextView addresse = findViewById(R.id.text_parkanzeigen_addresse);
        addresse.setText(a.getAddress());
        TextView telephone = findViewById(R.id.text_parkanzeigen_telephone);
        telephone.setText(a.getTelephone());
        TextView fax = findViewById(R.id.text_parkanzeigen_fax);
        fax.setText(a.getFax());
        TextView besucherzahlen = findViewById(R.id.text_parkanzeigen_besucherzahlen);
        besucherzahlen.setText(String.valueOf(a.getMaxGuests()));
        TextView flaeche = findViewById(R.id.text_parkanzeigen_flaeche);
        flaeche.setText(String.valueOf(a.getSurfaceArea()));
        TextView website = findViewById(R.id.text_parkanzeigen_website);
        website.setText(a.getWebsite());
        TextView kurzbeschreibung = findViewById(R.id.text_parkanzeigen_kurzbeschreibung);
        kurzbeschreibung.setText(a.getDescription());
        RatingBar rating = findViewById(R.id.parkanzeigen_ratingbar);
        rating.setRating(a.getParkbewertung());
        TextView thema = findViewById(R.id.text_parkanzeigen_thema);
        thema.setText(a.getTheme());
        TextView betreiber = findViewById(R.id.text_parkanzeigen_betreiber);
        betreiber.setText(a.getOwner());
        ImageView picture = findViewById(R.id.imageView_parkanzeigen);
        picture.setImageResource(a.getImage());
        TextView counter = findViewById(R.id.textView_parkanzeigen_counter);
        counter.setText(String.valueOf(count));
    }

    public void count(View view) {
        count += 1;
        TextView counter = findViewById(R.id.textView_parkanzeigen_counter);
        counter.setText(String.valueOf(count));
        Intent intent = new Intent(ParkView.this, DashboardView.class);
        Bundle b = getIntent().getExtras();
        if (b != null) {
            int[] visits = (int[]) b.get("countParks");
            visits[parkDB.getByName(b.getString("Parkname")).getParkID()] = count;
            b.remove("countParks");
            b.putIntArray("countParks", visits);
        }
        intent.putExtras(b);
        startActivity(intent);
    }

    public void setUpToolbar() {
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ParkView.this, ParkSuchenView.class);
                Bundle b = getIntent().getExtras();
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }


}
