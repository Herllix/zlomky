import cz.uhk.zlomky.model.Zlomek;

public class ZlomkyApp {
    public static void main (String[] args){
        System.out.println("ZlomkoAplikace");

        //vytvoření instance (objektu) třídy Zlomek
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek (2, 5);

        Zlomek c =a.krat(b);
        System.out.println("a * b = " + c.zkratit());
        c = a.deleno(b);
        System.out.println("a / b = " + c.zkratit());
        c = a.plus(b);
        System.out.println("a + b = " + c);
        c = a.minus(b);
        System.out.println("a - b = " + c);
    }
}
