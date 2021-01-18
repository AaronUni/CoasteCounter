package com.example.coastecounter.park;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.coastecounter.R;
import com.example.coastecounter.dashboard.DashboardView;

import java.util.ArrayList;

public class ParkSuchenView extends AppCompatActivity {

    ArrayList<String> myList; //Gesamtliste der Parks
    ArrayAdapter adapter;   //erzeugt für jeden Eintrag eine eigene View Ansicht
    SearchView searchView;  //Suchleiste

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parksuchen);    //wechselt zum Parksuchen Layout
        setUpToolbar(); //setzt Toolbar
        initializeSearch(); //setzt Suche
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Öffnet das Menü und befüllt dieses mit Items, wenn welche vorhanden sind
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    private void setUpToolbar() {
        //erstellt die Toolbar mit passender Überschrift und steuert den Zurück-Pfeil
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar); //setzt Toolbar
        setTitle(R.string.string_parkauswahl);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //setzt Zurück-Pfeil
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //Aktion bei Drücken des Zurückpfeils
                Intent intent = new Intent(ParkSuchenView.this, DashboardView.class);  //setzt nächste View
                Bundle b = getIntent().getExtras(); //lädt Bundle
                intent.putExtras(b);    //übergibt das Bundle
                startActivity(intent);  //Viewwechsel
            }
        });
    }

    private void initializeSearch() {
        //erstellt die Suche
        ParkDB parkDB = new ParkDB();   //lädt Parkdatenbank
        myList = parkDB.getListByName(); //erzeugt Liste der Parks
        //erzeugt ArrayAdapter nach Vorlage für die Liste der Parks
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, myList);
        ListView listView = findViewById(R.id.listview_parksuchen); //erzeugt ListView
        listView.setAdapter(adapter);   //übergibt den ArrayAdapter der ListView
        searchView = findViewById(R.id.searchview_parkSuchen);  //setzt Suchleiste
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {  //Aktion bei EIngabe in der Suchleiste
            @Override
            public boolean onQueryTextSubmit(String query) {
                //bei Bestätigung ändert sich die ListView-Anzeige entsprechend und der Fokus ist nicht mehr in der Suchleiste
                searchView.clearFocus();
                if (myList.contains(query)) adapter.getFilter().filter(query);
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                //bei Eingabe in der Suchleiste ändert sich die ListView-Anzeige entsprechend
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {  //Aktion bei Auswahl eines Parks
                Intent intent = new Intent(ParkSuchenView.this, ParkView.class); //setzt nächste View
                Bundle b = getIntent().getExtras(); //lädt übergebenes Bundle
                b.putString("Parkname", (String) parent.getItemAtPosition(position)); //fügt dem Bundle die Info Parkname hinzu
                intent.putExtras(b);    //übergibt das Bundle
                startActivity(intent);  //Viewwechsel
            }
        });
    }
}
