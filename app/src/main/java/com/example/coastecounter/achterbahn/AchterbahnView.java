package com.example.coastecounter.achterbahn;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.coastecounter.R;
import com.example.coastecounter.dashboard.DashboardView;

public class AchterbahnView extends AppCompatActivity {

    private AchterbahnController achterbahnController;

    private String pos;

    private int count = 0;  //Gesamtcount der ausgewählten Achterbahn

    private AchterbahnDB achterbahnDB = new AchterbahnDB(); //Achterbahndatenbank

    public void openCoasterFrame() {

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.achterbahnanzeigen);    //wechselt zum Achterbahnanzeigen Layout
        setUpToolbar(); //setzt Toolbar
        ImageView img = (ImageView) findViewById(R.id.imageView_achterbahnanzeigen); //lädt Default Bild
        img.setImageResource(R.drawable.coastercounterlogo);    //setzt Default Bild
        Bundle b = getIntent().getExtras(); //lädt übergebenes Bundle
        if (b != null) {
            //liest aus dem Bundle die Anzahl der Fahrten für die ausgewählte Achterbahn aus
            count = ((int[]) b.get("countSingle"))[achterbahnDB.getByName(b.getString("id")).getCoasterID()];
            achterbahnLaden(achterbahnDB.getByName(b.getString("id"))); //lädt ausgewählte Achterbahn
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Öffnet das Menü und befüllt dieses mit Items, wenn welche vorhanden sind
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    private void achterbahnLaden(Achterbahn a) {
        //befüllt die TextView's mit Informationen der Achterbahn
        TextView name = findViewById(R.id.text_achterbahnanzeigen_name);
        name.setText(a.getName());
        TextView length = findViewById(R.id.text_achterbahnanzeigen_laenge);
        length.setText(a.getLength() + " m");
        TextView height = findViewById(R.id.text_achterbahnanzeigen_hoehe);
        height.setText(a.getHeight() + " m");
        TextView descent = findViewById(R.id.text_achterbahnanzeigen_abfahrt);
        descent.setText(a.getDescent() + " m");
        TextView inversions = findViewById(R.id.text_achterbahnanzeigen_inversionen);
        inversions.setText(String.valueOf(a.getInversions()));
        TextView elements = findViewById(R.id.text_achterbahnanzeigen_elemente);
        elements.setText(a.getElements());
        TextView capacity = findViewById(R.id.text_achterbahnanzeigen_kapazitaet);
        capacity.setText(a.getCapacity() + " per/h");
        TextView cars = findViewById(R.id.text_achterbahnanzeigen_wagen);
        cars.setText(String.valueOf(a.getCars()));
        TextView trains = findViewById(R.id.text_achterbahnanzeigen_zuege);
        trains.setText(String.valueOf(a.getTrains()));
        TextView manufacturer = findViewById(R.id.text_achterbahnanzeigen_erbauer);
        manufacturer.setText(a.getManufacturer());
        TextView constructed = findViewById(R.id.text_achterbahnanzeigen_baujahr);
        constructed.setText(a.getConstructed());
        TextView description = findViewById(R.id.text_achterbahnanzeigen_kurzbeschreibung);
        description.setText(a.getDescription());
        TextView speed = findViewById(R.id.text_achterbahnanzeigen_geschwindigkeit);
        speed.setText(a.getSpeed() + " km/h");
        TextView theme = findViewById(R.id.text_achterbahnanzeigen_theme);
        theme.setText(a.getTheme());
        ImageView picture = findViewById(R.id.imageView_achterbahnanzeigen);
        picture.setImageResource(a.getImage());
        TextView counter = findViewById(R.id.textView_counter);
        counter.setText(String.valueOf(count));
        TextView park = findViewById(R.id.text_achterbahnanzeigen_park);
        park.setText(String.valueOf(a.getPark()));
        RatingBar rating = findViewById(R.id.ratingBar_achterbahnanzeigen);
        rating.setRating(a.getAchterbahnbewertung());
    }

    public void count(View view) {
        //wird in der achterbahnanzeigen.xml aufgerufen, bei OnClick auf button_achterbahnanzeigen_count
        count += 1; //erhöht count
        TextView counter = findViewById(R.id.textView_counter);
        counter.setText(String.valueOf(count)); //aktualisiert count Anzeige
    }

    public void setUpToolbar() {
        //erstellt die Toolbar mit passender Überschrift und steuert den Zurück-Pfeil
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar); //setzt Toolbar
        setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);  //setzt Zurück-Pfeil
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //Aktion bei Drücken des Zurückpfeils
                Intent intent = new Intent(AchterbahnView.this, DashboardView.class); //setzt nächste View
                Bundle b = getIntent().getExtras(); //lädt das Bundle
                if (b != null) {
                    //aktualisiert die Fahrten der ausgewählten Achterbahn
                    int[] rides = (int[]) b.get("countSingle");
                    rides[achterbahnDB.getByName(b.getString("id")).getCoasterID()] = count;
                    b.remove("countSingle"); //entfernt aus dem Bundle Info über gefahrene Achterbahn
                    b.putIntArray("countSingle", rides); //fügt dem Bundle aktualisierte Info über gefahrene Achterbahn wieder hinzu
                    if (count > 0 && !((boolean[])b.get("ridden"))
                            [achterbahnDB.getByName(b.getString("id")).getCoasterID()]) {
                        //wenn Achterbahn zum ersten Mal gefahren(ridden ist noch false), wird die Info Count aktualisiert
                        //und die Info ridden auf true für die ausgewählte Achterbahn gesetzt
                        ((boolean[])b.get("ridden"))[achterbahnDB.getByName(b.getString("id")).getCoasterID()] = true;
                        int i = (int) b.get("count") + 1; //aktualisiert Count
                        b.remove("count");  //entfernt die Info Count aus dem Bundle
                        b.putInt("count", i);   //fügt die aktualisierte Info Count dem undle hinzu
                    }
                }
                intent.putExtras(b);    //übergibt das Bundle
                startActivity(intent);  //Viewwechsel
            }
        });
    }
}
