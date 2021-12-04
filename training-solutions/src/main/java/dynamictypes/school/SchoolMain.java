package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School("General", 12);
        School pSchool = new PrimarySchool("General School", 8);
        School sSchool = new SecondarySchool("Secondary", 4);

        System.out.println(school);
        System.out.println(pSchool);
        System.out.println(sSchool);

        /*
        School{name='General', numberOfYears=12}
        School{name='General School', numberOfYears=8}
        School{name='Secondary', numberOfYears=4}
         */
    }
}