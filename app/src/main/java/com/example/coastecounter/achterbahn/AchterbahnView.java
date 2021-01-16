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

    public void openCoasterFrame() {

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.achterbahnanzeigen);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);        //wird benötigt für den Backpfeil  https://stackoverflow.com/questions/35810229/how-to-display-and-set-click-event-on-back-arrow-on-toolbar
        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.coastercounterlogo);
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AchterbahnView.this, DashboardView.class);
                startActivity(intent);
            }
        });
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
        length.setText((int) a.getLength());
        TextView height = findViewById(R.id.text_achterbahnanzeigen_hoehe);
        height.setText((int) a.getHeight());
        TextView descent = findViewById(R.id.text_achterbahnanzeigen_abfahrt);
        descent.setText((int) a.getDescent());
        TextView inversions = findViewById(R.id.text_achterbahnanzeigen_inversionen);
        inversions.setText(a.getInversions());
        TextView elements = findViewById(R.id.text_achterbahnanzeigen_elemente);
        elements.setText(a.getElements());
        TextView capacity = findViewById(R.id.text_achterbahnanzeigen_kapazitaet);
        capacity.setText(a.getCapacity());
        TextView cars = findViewById(R.id.text_achterbahnanzeigen_wagen);
        cars.setText(a.getCars());
        TextView trains = findViewById(R.id.text_achterbahnanzeigen_zuege);
        trains.setText(a.getTrains());
        TextView manufacturer = findViewById(R.id.text_achterbahnanzeigen_erbauer);
        manufacturer.setText(a.getManufacturer());
        TextView constructed = findViewById(R.id.text_achterbahnanzeigen_baujahr);
        constructed.setText(a.getConstructed());
        TextView description = findViewById(R.id.text_achterbahnanzeigen_kurzbeschreibung);
        description.setText(a.getDescription());
        TextView speed = findViewById(R.id.text_achterbahnanzeigen_geschwindigkeit);
        speed.setText(a.getSpeed());
    }

}
