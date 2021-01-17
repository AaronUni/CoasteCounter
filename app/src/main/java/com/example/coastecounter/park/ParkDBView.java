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

public class ParkDBView extends AppCompatActivity {

    ArrayList<String> myList;
    ArrayAdapter adapter;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park_d_b_view);
        setUpToolbar();
        initializeSearch();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    private void setUpToolbar() {
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        setTitle(R.string.string_parkauswahl);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //BackPfeil
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ParkDBView.this, DashboardView.class);
                startActivity(intent);
            }
        });
    }

    private void initializeSearch() {
        ParkDB parkDB = new ParkDB();
        myList = parkDB.getListByName();
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, myList);
        ListView listView = findViewById(R.id.listview_parksuchen);
        listView.setAdapter(adapter);
        searchView = findViewById(R.id.searchview_parkSuchen);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchView.clearFocus();
                if (myList.contains(query)) adapter.getFilter().filter(query);
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
                Intent intent = new Intent(ParkDBView.this, DashboardView.class);
                Bundle b = new Bundle();
                b.putString("Parkname", (String) parent.getItemAtPosition(position));
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}
