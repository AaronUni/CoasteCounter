package com.example.coastecounter.achterbahn;

import java.util.ArrayList;
import java.util.List;

public class AchterbahnDB {

    Achterbahn colossos_HeidePark = new Achterbahn(1, "Colossos - Kampf der Giganten", 1344,
            50, 48.5, 0, "Airtime Hill, Helix", 1030, 5, 2, "Intamin",
            "13-04-2001", "Collosos - Kampf der Giganten steht im Heide PArk Resort und ist eine eine Holzachterbahn " +
            "von Intamin im Out-and-back Layout und wurde zusammen mit Holzbau Cordes im Prefabricated Track verfahren gebaut. Am 19 April 2019 " +
            "wurde die Bahn nach einem Retrack der Schiene zusammen mit neuer Thematisierung und neuem Soundtrack(IMAScore) wiedereröffnet", null,
            null, "Feuer", "Prefabricated", 110);

    private List<Achterbahn> achterbahnList = new ArrayList<Achterbahn>();
    public AchterbahnDB() {
        this.achterbahnList.add(colossos_HeidePark);
    }

    public void addAchterbahn(Achterbahn bahn) {
        achterbahnList.add(bahn);
    }

    public List<Achterbahn> getAchterbahnList() {
        return this.achterbahnList;
    }

    public Achterbahn getAchterbahnById(int coasterID) {
        Achterbahn result = null;
        for (int i = 0; i < achterbahnList.size(); i++) {
            if (achterbahnList.get(i).getCoasterID() == coasterID) {
                result = achterbahnList.get(i);
                break;
            }
        }
        return result;
    }

    public Achterbahn getAchterbahnByName(String name) {
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
