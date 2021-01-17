package com.example.coastecounter.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.coastecounter.R;
import com.example.coastecounter.achterbahn.AchterbahnController;
import com.example.coastecounter.park.ParkDBView;
import com.example.coastecounter.suche.AchterbahnSucheView;

public class DashboardView extends AppCompatActivity{

    private String name = "";
    private boolean ridden[] = new boolean[4];
    private int countSingle[] = new int[4];
    private int count = 0;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        initialise();
        if (bundle != null) name = bundle.getString("Parkname");
        TextView park = findViewById(R.id.Parkname_Dashboard);
        park.setText(name);
        park.setTextSize(32);
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
                Intent intent = new Intent(DashboardView.this, AchterbahnController.class);
                startActivity(intent);
        }
        return true;
    }

    private void setUpToolbar() {
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        setTitle(R.string.title_dashboard);
    }

    public void starteSuche(View view) {
        Intent intent = new Intent(this, AchterbahnSucheView.class);
        startActivity(intent);
    }

    public void parkSearch(View view) {
        Intent intent = new Intent(this, ParkDBView.class);
        startActivity(intent);
    }

    private void initialise() {
        setUpToolbar();
        bundle = getIntent().getExtras();
    }
}