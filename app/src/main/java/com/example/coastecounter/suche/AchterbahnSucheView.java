package com.example.coastecounter.suche;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.coastecounter.R;
import com.example.coastecounter.dashboard.DashboardView;

import java.util.ArrayList;

public class AchterbahnSucheView extends AppCompatActivity {
    ArrayList myList;
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
        myList = new ArrayList<String>();
        myList.add("deine");
        myList.add("Fadda");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myList);
        ListView listView = findViewById(R.id.list_view);
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
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }
}
