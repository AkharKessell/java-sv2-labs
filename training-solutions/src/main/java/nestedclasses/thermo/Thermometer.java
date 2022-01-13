package nestedclasses.thermo;

public class Thermometer {
    /**Rendelkezik a szoba neve és hőmérséklete adatokkal, valamint egy ThermometerObserver referenciával,
     akit értesíteni kell!*/
    private int temperature;
    private String roomName;
    private ThermometerObserver observer;
     /**Létrehozáskor a szoba nevét és a hőmérsékletét lehet megadni, figyelő nincsen*/
    public Thermometer(String roomName, int temperature) {
        this.temperature = temperature;
        this.roomName = roomName;
    }
    /**Legyenek getterei a tagokhoz!*/
    public int getTemperature() {
        return temperature;
    }
    public String getRoomName() {
        return roomName;
    }
    public ThermometerObserver getObserver() {
        return observer;
    }
    /**Legyen egy metódusa (onTemperatureChanged()), amely ha van bejegyzett figyelő
     meghívja a figyelő handleTemperatureChange metódusát!*/
    public void onTemperatureChanged() {
        if (observer != null) {
            observer.handleTemperatureChange(temperature, roomName);
        }
    }
    /**Legyen setter metódus a hőmérséklet adatra (setTemperature), amelyik az
     adatbeállításon kívül még meghívja az onTemperatureChanged metódust!*/
    public void setTemperature(int newTemperature) {
        this.temperature = newTemperature;
        onTemperatureChanged();
    }
    /**Legyen metódusa, amely meghívásával a figyelő bejegyezheti magát mint figyelő
     (setThermometerObserver(ThermometerObserver observer))! (Figyeljünk rá, hogy a
     figyelő bejegyzése hőmérséklet változásnak számít.)*/
    public void setThermometerObserver(ThermometerObserver observer) {
        this.observer = observer;
        onTemperatureChanged();
    }
}
