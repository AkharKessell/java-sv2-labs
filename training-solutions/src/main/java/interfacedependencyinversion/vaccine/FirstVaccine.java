package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {
    private final List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registered) {
        vaccinationList.addAll(getPregnants(registered));
        vaccinationList.addAll(getOld(registered));
        vaccinationList.addAll(registered);
    }

    private List<Person> getPregnants(List<Person> registered) {
        List<Person> pregnants = new ArrayList<>();
        for (Person actual : registered) {
            if (actual.getPregnant() == Pregnancy.YES) {
                pregnants.add(actual);
            }
        }
        registered.removeAll(pregnants);
        return pregnants;
    }

    private List<Person> getOld(List<Person> registered) {
        List<Person> old = new ArrayList<>();
        for (Person actual : registered) {
            if (actual.getAge() > 65) {
                old.add(actual);
            }
        }
        registered.removeAll(old);
        return old;
    }
}
