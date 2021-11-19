package compositionlist.computer;

import java.util.ArrayList;
import java.util.List;

public class Hardware {
    private String name;
    private String model;
    private List<Hardware> hardwares = new ArrayList<>();

    public Hardware(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "name= " + name + " model= " + model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Hardware> getHardwares() {
        return hardwares;
    }

    public void setHardwares(List<Hardware> hardwares) {
        this.hardwares = hardwares;
    }
}
