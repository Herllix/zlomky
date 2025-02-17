import cz.uhk.zlomky.model.Zlomek;

public class ZlomkyApp {
    public static void main (String[] args){
        System.out.println("ZlomkoAplikace");

        //vytvoření instance (objektu) třídy Zlomek
        Zlomek a = new Zlomek(3, 4);

        System.out.println("Zlomek a = " + a);
    }
}
