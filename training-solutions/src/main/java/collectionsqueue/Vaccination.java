package collectionsqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {

    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination();
        List<Person> people = new ArrayList<>(List.of(
                new Person("John Doe", 11),
                new Person("Jane Doe", 22),
                new Person("Jack Doe", 33),
                new Person("James Doe", 44),
                new Person("Jill Doe", 55)
        ));

        Queue<Integer> vaccinatedAges = vaccination.getVaccinationOrder(people);
        System.out.println(vaccinatedAges);
        System.out.println(vaccinatedAges.poll());
    }

    public Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> result = new PriorityQueue<>();
        for (Person p : people) {
            int pAge = p.getAge();
            if (pAge >= 18 && pAge <= 65) {
                result.add(pAge);
            }
        }
        return result;
    }
}