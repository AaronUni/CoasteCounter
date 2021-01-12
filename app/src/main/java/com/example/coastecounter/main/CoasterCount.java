package com.example.coastecounter.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.example.coastecounter.R;
import com.example.coastecounter.achterbahn.AchterbahnController;
import com.example.coastecounter.badge.BadgeController;
import com.example.coastecounter.badge.BadgeKategorieController;
import com.example.coastecounter.benutzer.BenutzerController;
import com.example.coastecounter.bewertung.BewertungsController;
import com.example.coastecounter.dashboard.DashboardController;
import com.example.coastecounter.park.ParkController;
import com.example.coastecounter.park.ParkRepo;
import com.example.coastecounter.suche.AchterbahnSucheController;

public class CoasterCount extends AppCompatActivity {

    private BewertungsController bewertungsController;

    private ParkController parkController;

    private BenutzerController benutzerController;

    private BadgeKategorieController badgeKategorieController;

    private AchterbahnController achterbahnController;

    private BadgeController badgeController;

    private ParkRepo parkRepo;

    public void main() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);        //wird benötigt für den Backpfeil  https://stackoverflow.com/questions/35810229/how-to-display-and-set-click-event-on-back-arrow-on-toolbar
        Button bAchterbahnzeigen = findViewById(R.id.button_dashboard_achterbahn);
        bAchterbahnzeigen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoasterCount.this, AchterbahnSucheController.class);
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.id_action_perstatistik:
                Intent intent = new Intent(CoasterCount.this, AchterbahnSucheController.class);
                startActivity(intent);
        }
        return true;
    }

}
