package com.example.coastecounter.achterbahn;

import com.example.coastecounter.R;

import java.util.ArrayList;
import java.util.List;

public class AchterbahnDB {
    private static Achterbahn colossosHeidePark = new Achterbahn(0, "Colossos - Kampf der Giganten",
            1344, 50, 48.5, 0, "Airtime Hill\nHelix", 1030, 5, 2,
            "Intamin", "13-04-2001",
            "Collosos - Kampf der Giganten steht im Heide Park Resort und ist eine eine Holzachterbahn "
                    + "von Intamin im Out-and-back Layout und wurde zusammen mit Holzbau Cordes im Prefabricated"
                    + " Track verfahren gebaut. Am 19 April 2019 wurde die Bahn nach einem Retrack der Schiene"
            + " zusammen mit neuer Thematisierung und neuem Soundtrack(IMAScore) wiedereröffnet",
            "Heide Park Resort",null, "Feuer", "Prefabricated",
            110, R.drawable.colossos);
    private static Achterbahn kaernanHansaPark = new Achterbahn(1, "Schwur des Kärnan", 1235,
            73, 67.0, 0, "Vertical Lift\n Heardline Roll", 850, 4, 3,
            "Gerstlauer", "01-07-2015", "Der Schwur des Kärnan steht im Norddeutschen"
            + " Hansapark und ist ein Hypercoaster vom deutschen Hersteller Gerstlauer. Zusammen mit "
            + "Silver Star ist Kärnan mit 73m die höchste Achterbahn Deutschlands.", "Hansa Park",
            null, "Mittelalter", "Infinity Coaster, Hyper Coaster",
            127, R.drawable.kaernan);
    private static Achterbahn blueFireEuropapark = new Achterbahn(2, "Blue Fire Megacoaster",
            1056, 38, 32, 4,
            "LSM Launch 0-100 2,5sek.\n Twisted Horsehoe Roll\n In-Line Twist, Heardline Roll\n Looping",
            1720, 5, 5, "Mack Rides", "04-04-2009",
            "Blue Fire ist der erste Launch Coaster von Mack Rides. Sie katapultiert die Fahrgäste mit"
                    + " hilfe einem LSM Antriebs von 0-100km/h in 2,5 sek.. ", "Europa Park",
            null, "Island", "Lunched Coaster - Mega Coaster",
            100, R.drawable.bluefire);
    private static Achterbahn nessieHansaPark = new Achterbahn(3, "Nessie", 741, 26,
            24, 1, "Looping\n Helix", 1700, 7, 2, "Schwarzkopf",
            "01-07-1980", "Nessi ist die erste stationäre Looping-Achterbahn deutschlands und wurde"
            + " vom Hersteller Schwarzkopf gebaut.", "Hansa Park", null,
            "Schottland", "Looping Coaster", 85, R.drawable.nessi);
    private final List<Achterbahn> achterbahnList = new ArrayList<>();

    public AchterbahnDB() {

        achterbahnList.add(colossosHeidePark);
        achterbahnList.add(kaernanHansaPark);
        achterbahnList.add(blueFireEuropapark);
        achterbahnList.add(nessieHansaPark);
    }

    public void add(Achterbahn bahn) {
        achterbahnList.add(bahn);
    }

    public List<Achterbahn> getList() {
        return this.achterbahnList;
    }

    public Achterbahn getById(int coasterID) {
        Achterbahn result = null;
        for (Achterbahn achterbahn : achterbahnList) {
            if (achterbahn.getCoasterID() == coasterID) {
                result = achterbahn;
                break;
            }
        }
        return result;
    }

    public ArrayList<String> getListByName(String park) {
        ArrayList<String> out = new ArrayList<String>();
        for (Achterbahn a : achterbahnList) {
            if (park != null && !park.isEmpty()) {
                if (a.getPark().equals(park)) out.add(a.getName());
            } else {
                out.add(a.getName());
            }
        }
        return out;
    }


    public Achterbahn getByName(String name) {
        Achterbahn result = null;
        for (Achterbahn achterbahn : achterbahnList) {
            if (achterbahn.getName().equals(name)) {
                result = achterbahn;
                break;
            }
        }
        return result;
    }


}
