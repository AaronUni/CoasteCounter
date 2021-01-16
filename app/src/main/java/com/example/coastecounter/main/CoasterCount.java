package com.example.coastecounter.main;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.coastecounter.achterbahn.AchterbahnController;
import com.example.coastecounter.badge.BadgeController;
import com.example.coastecounter.badge.BadgeKategorieController;
import com.example.coastecounter.benutzer.BenutzerController;
import com.example.coastecounter.bewertung.BewertungsController;
import com.example.coastecounter.dashboard.DashboardController;
import com.example.coastecounter.dashboard.DashboardView;
import com.example.coastecounter.park.ParkController;
import com.example.coastecounter.park.ParkRepo;

public class CoasterCount extends AppCompatActivity {

    private BewertungsController bewertungsController;

    private ParkController parkController;

    private BenutzerController benutzerController;

    private BadgeKategorieController badgeKategorieController;

    private AchterbahnController achterbahnController;

    private BadgeController badgeController;

    private DashboardController dashboardControler;

    private ParkRepo parkRepo;

    public void main() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(CoasterCount.this, DashboardView.class);
        startActivity(intent);
    }

}
