package inheritanceconstructor.tea;

public class TeaMain {
    public static void main(String[] args) {
        Tea tea = new Tea("Black tea", 1);
        System.out.println(tea.getName() + " | " + tea.getPrice() + " USD");
        HerbalTea herbalTea = new HerbalTea("Herbal tea", 2);
        System.out.println(herbalTea.getName() + " | " + herbalTea.getPrice() + " USD");
    }
}