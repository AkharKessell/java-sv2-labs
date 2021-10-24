package packages.namemain;


import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {

    public static void main(String[] args) {
        Prefix preFix = new Prefix("Dr.");
        FirstName firstName = new FirstName("Johnny");
        LastName lastName = new LastName("Sins");

        System.out.println(preFix.getPre() + " "+ firstName.getFirst() + " " + lastName.getLast()+" ");
    }
}
