import cz.uhk.zlomky.model.Zlomek;

public class ZlomkyApp {
    public static void main (String[] args){
        System.out.println("ZlomkoAplikace");

        //vytvoření instance (objektu) třídy Zlomek
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek (2, 5);

        Zlomek c =a.krat(b);
        System.out.println("a * b = " + c.zkratit());
        System.out.println("a / b = " + a.deleno(b).zkratit());
        System.out.println("a + b = " + a.plus(b).zkratit());
        System.out.println("a - b = " + a.minus(b).zkratit());

        Zlomek [] poleZlomku = new Zlomek[4];
        poleZlomku[0] = a;
        poleZlomku[1] = b;
        poleZlomku[2] = c;
        poleZlomku[3] = a.deleno(b);

        System.out.println("Suma pole zlomke =  " + sumaZlomku(poleZlomku));
    }

    public static Zlomek sumaZlomku(Zlomek [] pole){
        Zlomek soucet = new Zlomek(0, 1);
        for (Zlomek z : pole) {
            soucet = soucet.plus(z);
        }

        return soucet.zkratit();
    }
}
