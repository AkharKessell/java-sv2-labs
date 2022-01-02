package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {
    private final List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registered) {
        vaccinationList.addAll(getYoung(registered));
        vaccinationList.addAll(getOld(registered));
    }

    private List<Person> getYoung(List<Person> registered) {
        List<Person> young = new ArrayList<>();
        for (Person actual : registered) {
            if (actual.getPregnant() == Pregnancy.NO && actual.getChronic() == ChronicDisease.NO && actual.getAge() <= 65) {
                young.add(actual);
            }
        }
        return young;
    }

    private List<Person> getOld(List<Person> registered) {
        List<Person> old = new ArrayList<>();
        for (Person actual : registered) {
            if (actual.getPregnant() == Pregnancy.NO && actual.getChronic() == ChronicDisease.NO && actual.getAge() > 65) {
                old.add(actual);
            }
        }
        return old;
    }
}
