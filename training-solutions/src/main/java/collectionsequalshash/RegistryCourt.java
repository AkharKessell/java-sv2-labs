package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {
    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();

        companies.add(new Company("AAA", "11111"));
        companies.add(new Company("BBB", "2222"));
        companies.add(new Company("CCC", "3333"));

        System.out.println(companies.contains(new Company("AAA", "1111")));
        System.out.println(companies.contains(new Company("BBB", "2222")));
        System.out.println(companies.contains(new Company("CCC", "3333")));
    }
}