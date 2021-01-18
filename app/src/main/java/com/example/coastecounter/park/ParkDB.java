package com.example.coastecounter.park;

import java.util.ArrayList;
import java.util.List;

import com.example.coastecounter.R;
import com.example.coastecounter.achterbahn.Achterbahn;
import com.example.coastecounter.achterbahn.AchterbahnDB;

public class ParkDB {
    Park heidePark = new Park(0, "Heide Park Resort", "info@heidepark.de",
            "Heide Park 1,\n29614 Soltau", "01805-919101","01805-545801", R.drawable.heideparklogo,
            1480000, 85,
            "Das Heide Park Resort ist auf der Fläche deutschlands zweit größter Freizeitpark...,",
            "www.heide-park.de", new ArrayList<Achterbahn>(), null, null,
            "Merlin Entertainment Group");
    Park hansaPark = new Park(1, "Hansa Park", "info@hansapark.de",
            "Am Fahrenkrog 1, \n23730 Sierksdorf", "04563-4740", "04563-474100",
            R.drawable.hansaparklogo, 1400000, 46,
            "Deutschlands einziger Erlebnispark am Meer liegt in der Lübecker Bucht", "www.hansapark.de",new ArrayList<Achterbahn>()
            , null, "Hanse", "Christoph Andreas Leicht");
    Park europaPark = new Park(2, "Europa Park", "info@europapark.de",
            "Europa-Park-Straße 2, \n77977 Rust", "07822 77-6688",
            "07822 77-11605", R.drawable.europaparklogo, 5800000, 95,
            "Europpark liegt in Rust(Baden-Württemberg) und ist mit rund 5,8 Millionen Besuchern(2019)"
                    + "der meistbesuchte Freizeitpark im deutschsprachigen Raum. Der Europa-Park öffnte 12 Juli 1975"
            + " zunächst als Ausstellungsfläche des hauseignen Fahrgeschäftehersteller.", "www.europapark.de", new ArrayList<Achterbahn>(), null, "Europa", "Familie Mack");


    private List<Park> parkList = new ArrayList<Park>();

    public ParkDB() {
        AchterbahnDB achterbahnDB = new AchterbahnDB();
        heidePark.addAchterbahn(achterbahnDB.getList().get(0));
        parkList.add(heidePark);
        hansaPark.addAchterbahn(achterbahnDB.getList().get(0));
        parkList.add(hansaPark);
        europaPark.addAchterbahn(achterbahnDB.getList().get(1));
        parkList.add(europaPark);
        hansaPark.addAchterbahn(achterbahnDB.getList().get(2));
    }

    public void add(Park park) {
        parkList.add(park);
    }

    public List<Park> getList() {
        return this.parkList;
    }

    public Park getbyID(int parkID) {
        Park result = null;
        for (Park park : parkList) {
            if (park.getParkID() == parkID) {
                result = park;
                break;
            }
        }
        return result;
    }


    public Park getByName(String name) {
        Park result = null;
        for (Park park : parkList) {
            if (park.getName().equals(name)) {
                result = park;
                break;
            }
        }
        return result;
    }

    public ArrayList<String> getListByName() {
        ArrayList<String> out = new ArrayList<String>();
        for (Park p : parkList) {
            out.add(p.getName());
        }
        return out;
    }

}

