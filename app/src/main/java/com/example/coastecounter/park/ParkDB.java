package com.example.coastecounter.park;

import com.example.coastecounter.achterbahn.Achterbahn;

import java.util.ArrayList;
import java.util.List;

public class ParkDB {
    Park heidePark = new Park(1, "Heide Park Resort", "info@heidepark.de", "Heide Park 1,\n29614 Soltau",
            "01805-919101","01805-545801", null, 1480000, null, null, 85,
            "Das Heide Park Resort ist auf der Fläche deutschlands zweit größter Freizeitpark...,", "www.heide-park.de",
            null, null, null, null,null);
    Park hansaPark = new Park(2, "Hansa Park", "info@hansapark.de", "Am Fahrenkrog 1, \n23730 Sierksdorf", "04563-4740", "04563-474100",
            null, 1400000, null, null, 46, "Deutschlands einziger Erlebnispark am Meer liegt in der Lübecker Bucht",
            "www.hansapark.de", null, null, null, null, null);
    Park europaPark = new Park(3, "Europa-Park", "info@europapark.de", "Europa-Park-Straße 2, \n77977 Rust", "07822 77-6688",
            "07822 77-11605", null, 5800000, null, null, 95, "Europpark liegt in Rust(Baden-Württemberg) und ist mit rund 5,8 Millionen Besuchern(2019)" +
            "der meistbesuchte Freizeitpark im deutschsprachigen Raum. Der Europa-Park öffnte 12 Juli 1975 zunächst als Ausstellungsfläche des Hauseignen Fahrgeschäftehersteller.", "www.europapark.de",
            null, null, null, null, null);


    private List<Park> parkList = new ArrayList<Park>();

    public ParkDB() {
        this.parkList.add(heidePark);
        this.parkList.add(hansaPark);
        this.parkList.add(europaPark);
    }

    public void add(Park park) {
        parkList.add(park);
    }

    public List<Park> getList() {
        return this.parkList;
    }

    public Park getbyID(int parkID) {
        Park result = null;
        for (int i = 0; i < parkList.size(); i++) {
            if (parkList.get(i).getParkID() == parkID) {
                result = parkList.get(i);
                break;
            }
        }
        return result;
    }

    public Park getByName(String name) {
        Park result = null;
        for (int i = 0; i < parkList.size(); i++) {
            if (parkList.get(i).getName() == name) {
                result = parkList.get(i);
                break;
            }
        }
        return result;
    }

}

