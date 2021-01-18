package com.example.coastecounter.park;

import android.os.Bundle;
import android.widget.ImageView;
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
            //count = ((int[]) b.get("countSingle"))[parkDB.getByName(b.getString("id")).getParkID()];
            //parkLaden(parkDB.getByName(b.getString("id")));       Hier muss noch irgendwie auf den richtigen Eintrag navigiert werden
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
        besucherzahlen.setText(a.getMaxGuests());
        TextView flaeche = findViewById(R.id.text_parkanzeigen_flaeche);
        flaeche.setText(a.getSurfaceArea());
        TextView website = findViewById(R.id.text_parkanzeigen_website);
        website.setText(a.getWebsite());
        TextView kurzbeschreibung = findViewById(R.id.text_parkanzeigen_kurzbeschreibung);
        kurzbeschreibung.setText(a.getDescription());
        TextView rating = findViewById(R.id.parkanzeigen_ratingbar);
        //
        TextView thema = findViewById(R.id.text_parkanzeigen_thema);
        thema.setText(a.getTheme());
        TextView betreiber = findViewById(R.id.text_parkanzeigen_betreiber);
        betreiber.setText(a.getOwner());
        TextView counter = findViewById(R.id.textView_parkanzeigen_counter);
        counter.setText(String.valueOf(count));
    }

    public void count(View view) {
        count += 1;
        TextView counter = findViewById(R.id.textView_parkanzeigen_counter);
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
                Intent intent = new Intent(ParkView.this, DashboardView.class);
                Bundle b = getIntent().getExtras();
                if (b != null) {
                    int[] rides = (int[]) b.get("countSingle");
                    rides[parkDB.getByName(b.getString("id")).getParkID()] = count;
                    b.remove("countSingle");
                    b.putIntArray("countSingle", rides);
                    if (count > 0 && !((boolean[])b.get("ridden"))
                            [parkDB.getByName(b.getString("id")).getParkID()]) {
                        ((boolean[])b.get("ridden"))[parkDB.getByName(b.getString("id")).getParkID()] = true;
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
