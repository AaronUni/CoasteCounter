package com.example.coastecounter.achterbahn;

import java.util.ArrayList;
import java.util.List;

public class AchterbahnDB {

    Achterbahn colossos_HeidePark = new Achterbahn(1, "Colossos - Kampf der Giganten", 1344,
            50, 48.5, 0, "Airtime Hill, Helix", 1030, 5, 2, "Intamin",
            "13-04-2001", "Collosos - Kampf der Giganten steht im Heide Park Resort und ist eine eine Holzachterbahn " +
            "von Intamin im Out-and-back Layout und wurde zusammen mit Holzbau Cordes im Prefabricated Track verfahren gebaut. Am 19 April 2019 " +
            "wurde die Bahn nach einem Retrack der Schiene zusammen mit neuer Thematisierung und neuem Soundtrack(IMAScore) wiedereröffnet", null,
            null, "Feuer", "Prefabricated", 110);
    Achterbahn kaernan_HansaPark = new Achterbahn(2, "Schwur des Kärnan", 1235, 73, 67.0,
            0, "Vertical Lift, Heardline Roll", 850, 4, 3, "Gerstlauer", "01-07-2015",
            "Der Schwur des Kärnan steht im Norddeutschen Hansapark und ist ein Hypercoaster vom deutschen Hersteller Gerstlauer. Zusammen mit " +
            "Silver Star ist Kärnan mit 73m die höchste Achterbahn Deutschlands.", null, null, null, "Infinity Coaster, Hyper Coaster", 127);
    Achterbahn blueFire_Europapark = new Achterbahn(3, "Blue Fire Megacoaster", 1056, 38, 32, 4,
            "LSM Launch 0-100 2,5sek., Twisted Horsehoe Roll, In-Line Twist, Heardline Roll, Looping", 1720, 5, 5, "Mack Rides", "04-04-2009",
            "Blue Fire ist der erste Launch Coaster von Mack Rides. Sie katapultiert die Fahrgäste mit hilfe einem LSM Antriebs von 0-100km/h in 2,5 sek.. ", null,
            null, null, "Lunched Coaster - Mega Coaster", 100);
    Achterbahn nessi_HansaPark = new Achterbahn(4, "Nessi", 741, 26, 24, 1, "Looping, Helix", 1700, 7, 2, "Schwarzkopf",
            "01-07-1980", "Nessi ist die erste stationäre Looping-Achterbahn deutschlands und wurde vom Hersteller Schwarzkopf gebaut.", null, null,
            null, "Looping Coaster", 85);
    private List<Achterbahn> achterbahnList = new ArrayList<Achterbahn>();
    public AchterbahnDB() {

        this.achterbahnList.add(colossos_HeidePark);
        this.achterbahnList.add(kaernan_HansaPark);
        this.achterbahnList.add(blueFire_Europapark);
        this.achterbahnList.add(nessi_HansaPark);
    }

    public void add(Achterbahn bahn) {
        achterbahnList.add(bahn);
    }

    public List<Achterbahn> getList() {
        return this.achterbahnList;
    }

    public Achterbahn getById(int coasterID) {
        Achterbahn result = null;
        for (int i = 0; i < achterbahnList.size(); i++) {
            if (achterbahnList.get(i).getCoasterID() == coasterID) {
                result = achterbahnList.get(i);
                break;
            }
        }
        return result;
    }

    public Achterbahn getByName(String name) {
        Achterbahn result = null;
        for (int i = 0; i < achterbahnList.size(); i++) {
            if (achterbahnList.get(i).getName() == name) {
                result = achterbahnList.get(i);
                break;
            }
        }
        return result;
    }


}
