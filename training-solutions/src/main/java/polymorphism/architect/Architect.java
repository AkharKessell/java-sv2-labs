package polymorphism.architect;

public class Architect {
    public static void main(String[] args) {
        Plan sketchPlan1 = new SketchPlan(10, "Home");
        Plan permitPlan1 = new PermitPlan(10, "Home", "JohnDoe", "Neverland");
        Plan constructionPlan1 = new ConstructionPlan(10, "Home", "JohnDoe", "Neverland", 10);

        System.out.println(sketchPlan1.getPagesOfDocumentation());
        System.out.println(permitPlan1.getPagesOfDocumentation());
        System.out.println(constructionPlan1.getPagesOfDocumentation());

        SketchPlan sketchPlan2 = new SketchPlan(20, "Home");
        SketchPlan permitPlan2 = new PermitPlan(20, "Home", "JohnDoe", "Neverland");
        SketchPlan constructionPlan2 = new ConstructionPlan(20, "Home", "JohnDoe", "Neverland", 20);

        System.out.println(sketchPlan2.getPagesOfDocumentation());
        System.out.println(sketchPlan2.getTitle());
        System.out.println(permitPlan2.getPagesOfDocumentation());
        System.out.println(permitPlan2.getTitle());
        System.out.println(constructionPlan2.getPagesOfDocumentation());
        System.out.println(constructionPlan2.getTitle());

        Header permitPlan3 = new PermitPlan(30, "Home", "JohnDoe", "Neverland");
        Header constructionPlan3 = new ConstructionPlan(30, "Home", "JohnDoe", "Neverland", 30);

        System.out.println(permitPlan3.getNameOfClient());
        System.out.println(permitPlan3.getAddressOfBuilding());
        System.out.println(constructionPlan3.getNameOfClient());
        System.out.println(constructionPlan3.getAddressOfBuilding());

        PermitPlan permitPlan4 = new PermitPlan(40, "Home", "JohnDoe", "Neverland");
        PermitPlan constructionPlan4 = new ConstructionPlan(40, "Home", "JohnDoe", "Neverland", 40);

        System.out.println(permitPlan4.getAddressOfBuilding());
        System.out.println(permitPlan4.getTitle());
        System.out.println(permitPlan4.getHeader());
        System.out.println(permitPlan4.getPagesOfDocumentation());
        System.out.println(permitPlan4.getNameOfClient());
        System.out.println(constructionPlan4.getAddressOfBuilding());
        System.out.println(constructionPlan4.getTitle());
        System.out.println(constructionPlan4.getHeader());
        System.out.println(constructionPlan4.getPagesOfDocumentation());
        System.out.println(constructionPlan4.getNameOfClient());

        ConstructionPlan constructionPlan5 = new ConstructionPlan(50, "Home", "JohnDoe", "Neverland", 50);

        System.out.println(constructionPlan5.getHeader());
        System.out.println(constructionPlan5.getSheetsOfConstructionDrawings());
        System.out.println(constructionPlan5.getTitle());
        System.out.println(constructionPlan5.getNameOfClient());
        System.out.println(constructionPlan5.getAddressOfBuilding());
        System.out.println(constructionPlan5.getPagesOfDocumentation());
    }
}