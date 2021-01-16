package com.example.coastecounter.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.coastecounter.R;
import com.example.coastecounter.achterbahn.AchterbahnController;
import com.example.coastecounter.suche.AchterbahnSucheView;

public class DashboardView extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        setUpToolbar();
        Button bAchterbahnzeigen = findViewById(R.id.button_dashboard_achterbahn);
        bAchterbahnzeigen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardView.this, AchterbahnSucheView.class);
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

}