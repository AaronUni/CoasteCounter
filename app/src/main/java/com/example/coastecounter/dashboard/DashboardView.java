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
import com.example.coastecounter.park.ParkSuchenView;
import com.example.coastecounter.suche.AchterbahnSucheView;

public class DashboardView extends AppCompatActivity{

    private String name = "";      //Name des ausgewählten Parkes
    private boolean ridden[] = new boolean[4];  //ob Achterbahn gefahren
    private int countSingle[] = new int[4]; //zählt die Fahrten pro Achterbahn
    private int countParks[] = new int[3]; //zählt die Besuche pro Park
    private int count = 0;  //Count der gefahrenen Achterbahnen
    private Bundle bundle;  //bündelt die Datenfelder, um sie beim Viewwechsel mit zu übergeben

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard); //wechselt zum Dashboard Layout
        initialise();   //setzt Toolbar und befüllt bundle
        if (bundle != null) {   //setzt Datenfelder aus dem Bundle
            name = bundle.getString("Parkname");
            ridden = (boolean[]) bundle.get("ridden");
            countSingle = (int[]) bundle.get("countSingle");
            countParks = (int[]) bundle.get("countParks");
            count = (int) bundle.get("count");
        }
        TextView park = findViewById(R.id.Parkname_Dashboard);
        park.setText(name); //setzt ausgewählten Parknamen
        park.setTextSize(32);
        TextView counted = findViewById(R.id.textView_dashboard_totalCounterAnzeige);
        counted.setText(String.valueOf(count)); //setzt den Count
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Öffnet das Menü und befüllt dieses mit Items, wenn welche vorhanden sind
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //bei Auswahl aus dem Menü
        switch (item.getItemId()) {
            case R.id.id_action_perstatistik:
                Intent intent = new Intent(DashboardView.this, AchterbahnController.class);
                startActivity(intent);
        }
        return true;
    }

    private void setUpToolbar() {
        //erstellt die Toolbar mit passender Überschrift
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar); //setzt Toolbar
        setTitle(R.string.title_dashboard);
    }

    public void starteSuche(View view) {
        //wird in der dashboard.xml aufgerufen, bei OnClick auf button_dashboard_achterbahn
        Intent intent = new Intent(this, AchterbahnSucheView.class); //setzt nächste View
        Bundle b = new Bundle(); //erstellt neues Bundle mit den aktuellen Datenfeldern
        b.putBooleanArray("ridden", ridden);
        b.putIntArray("countSingle", countSingle);
        b.putIntArray("countParks", countParks);
        b.putInt("count", count);
        b.putString("Parkname", name);
        intent.putExtras(b);    //übergibt das Bundle
        startActivity(intent);  //wechselt View
    }

    public void parkSearch(View view) {
        //wird in der dashboard.xml aufgerufen, bei OnClick auf button_dashboard_parkauswahl
        Intent intent = new Intent(this, ParkSuchenView.class); //setzt nächsten View
        Bundle b = new Bundle();    //erstellt neues Bundle mit den aktuellen Datenfeldern
        b.putBooleanArray("ridden", ridden);
        b.putIntArray("countSingle", countSingle);
        b.putIntArray("countParks", countParks);
        b.putInt("count", count);
        b.putString("Parkname", name);
        intent.putExtras(b);
        startActivity(intent);
    }

    private void initialise() {
        //setzt Toolbar und befüllt das Bundle mit dem Übergebenen
        setUpToolbar();
        bundle = getIntent().getExtras();
    }
}