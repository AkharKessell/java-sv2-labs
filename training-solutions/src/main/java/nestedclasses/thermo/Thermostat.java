package nestedclasses.thermo;

import java.util.ArrayList;
import java.util.List;

public class Thermostat {

    /**A termosztát rendelkezik egy roomsToHeat listával, amely azon szobák neveit tartalmazza,
     amelyet fűt. */

    private List<String> roomsToHeat = new ArrayList<>();

    /**Rendelkezik egy Thermometer listával, egy fűtött szobák nevének listájával*/

    private List<Thermometer> thermometers = new ArrayList<>();
    private int temperatureLimit;

    /**valamint egy temperatureLimit attribútummal, amely a termosztáton beállított (minimum) hőmérséklet.
     Létrehozáskor a két lista üres legyen és a hőmérséklet limit értéke legyen 23!*/

    public Thermostat() {
        this.temperatureLimit = 23;
    }
    /**Legyen egy addThermometer(Thermometer thermometer) metódusa, amellyel egy újabb hőmérőt adhatunk
     a termosztáthoz! A hőmérő hozzáadásakor jegyezzünk be hozzá egy figyelő objektumot
     (mely egy ThermometerObserver típusú névtelen belső osztály), amelyet a bejegyzés utasításában
     definiáljunk. Implementálja a ThermometerObserver interface-t úgy, hogy ha a szoba hőmérséklete kisebb,
     mint a termosztát limit-je, akkor tegye be a fűtött szobák listájába a szobát, ha nem akkor vegye ki onnan.*/

    public void addThermometer(Thermometer thermometer) {
        thermometers.add(thermometer);
        thermometer.setThermometerObserver(
                new ThermometerObserver() {
                    @Override
                    public void handleTemperatureChange(int roomTemp, String roomName) {
                        if (roomTemp < temperatureLimit) {
                            roomsToHeat.add(roomName);
                        } else {
                            roomsToHeat.remove(roomName);
                        }
                    }
                });
    }
    /**Legyen getter a fűtött szobák listájára*/

    public List<String> getRoomsToHeat() {
        return new ArrayList<>(roomsToHeat);
    }

    public List<Thermometer> getThermometers() {
        return thermometers;
    }

    public int getTemperatureLimit() {
        return temperatureLimit;
    }
}
