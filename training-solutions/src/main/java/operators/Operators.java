package operators;

public class Operators {
    //Írd ki a konzolra egy általad tetszőlegesen választott egész szám kettes számrendszer-beli alakját!
    public String isBinary(int number) {
        return Integer.toBinaryString(number);
    }

    //Hozz létre egy boolean isEven(int n) metódust, mely visszaadja,
    // hogy a paraméterként átadott egész szám páros-e!
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    //Írj egy getResultOfDivision(int number, int divisor) metódust,
    // amely a következőhöz hasonló szöveges formában visszaadja
    // egy osztás eredményét: “16 / 3 = 5, maradék: 1”
    public String getResultOfDivision(int number, int divisor) {
        return number + "/" + divisor + "=" + number + ", maradék :" + (number % divisor);
    }

    //Írj egy isNull(String s) metódust, amely a három operandusú operátor
    // használatával eldönti a paraméterként megadott Stringről, hogy null
    // értékű-e vagy sem, és ennek megfelelő szöveget ad vissza (“null értékű” vagy “nem null értékű”)!
    public String isNull(String s) {
        return s == null ? "null értékű" : "nem nulll értékű";
    }

    //Írj egy isEmpty(String s) metódust, amely igazat ad vissza akkor, ha a paraméterként megadott
    // String üres String vagy null. Minden más esetben false-t adjon vissza! Vigyázz,
    // hogy a feltételeket jó sorrendben add meg!
    public boolean isEmpty(String s) {
        return (s == null) || s.equals("");
    }
}
