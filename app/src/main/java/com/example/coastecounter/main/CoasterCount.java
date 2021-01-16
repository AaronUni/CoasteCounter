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
import com.example.coastecounter.achterbahn.Achterbahn;
import com.example.coastecounter.achterbahn.AchterbahnController;
import com.example.coastecounter.achterbahn.AchterbahnDB;
import com.example.coastecounter.badge.BadgeController;
import com.example.coastecounter.badge.BadgeKategorieController;
import com.example.coastecounter.benutzer.BenutzerController;
import com.example.coastecounter.bewertung.BewertungsController;
import com.example.coastecounter.dashboard.DashboardController;
import com.example.coastecounter.dashboard.DashboardView;
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

    private DashboardController dashboardControler;

    private ParkRepo parkRepo;
    Achterbahn colossos_HeidePark = new Achterbahn(1, "Colossos - Kampf der Giganten", 1344,
            50, 48.5, 0, "Airtime Hill, Helix", 1030, 5, 2, "Intamin",
            "13-04-2001", "Collosos - Kampf der Giganten steht im Heide PArk Resort und ist eine eine Holzachterbahn " +
            "von Intamin im Out-and-back Layout und wurde zusammen mit Holzbau Cordes im Prefabricated Track verfahren gebaut. Am 19 April 2019 " +
            "wurde die Bahn nach einem Retrack der Schiene zusammen mit neuer Thematisierung und neuem Soundtrack(IMAScore) wiedereröffnet", null,
            null, "Feuer", "Prefabricated", 110);

    public void main() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(CoasterCount.this, DashboardView.class);
        startActivity(intent);
    }

}
