package compositionlist;

public class CapsulesMain {
    public static void main(String[] args) {
        Capsules capsules = new Capsules();

        capsules.addFirst("black");
        capsules.addLast("white");
        capsules.addLast("yellow");
        capsules.addFirst("grey");
        capsules.addFirst("red");
        System.out.println(capsules.getColours());

        capsules.removeLast();
        capsules.removeFirst();
        capsules.removeFirst();
        capsules.removeLast();

        System.out.println(capsules.getColours());
    }
}