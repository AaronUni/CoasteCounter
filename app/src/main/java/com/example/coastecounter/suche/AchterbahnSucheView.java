package com.example.coastecounter.suche;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.coastecounter.R;
import com.example.coastecounter.achterbahn.AchterbahnDB;
import com.example.coastecounter.achterbahn.AchterbahnView;
import com.example.coastecounter.dashboard.DashboardView;

import java.util.ArrayList;

public class AchterbahnSucheView extends AppCompatActivity {
    ArrayList<String> myList;
    ArrayAdapter adapter;
    SearchView searchView;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.achterbahnsuchen);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        setTitle("Achterbahn suchen");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //BackPfeil
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AchterbahnSucheView.this, DashboardView.class);
                startActivity(intent);
            }
        });
        AchterbahnDB achterbahnDB = new AchterbahnDB();
        myList = achterbahnDB.getListByName();

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myList);
        final ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        searchView = findViewById(R.id.searchview_achterbahnsuchen);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchView.clearFocus();
                if(myList.contains(query)) adapter.getFilter().filter(query);
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(AchterbahnSucheView.this, AchterbahnView.class);
                Bundle b = new Bundle();
                b.putString("id", (String) parent.getItemAtPosition(position));
                intent.putExtras(b);
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
}
