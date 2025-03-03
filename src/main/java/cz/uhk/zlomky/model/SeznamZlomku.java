package cz.uhk.zlomky.model;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class SeznamZlomku {
    private List<Zlomek> zlomky = new ArrayList<Zlomek>();

    public void pridatZlomek(Zlomek zlomek){
        zlomky.add(zlomek);
    }
    public void odebratZlomek(int index){
        zlomky.remove(index);
    }
    public Zlomek vratZlomek(int index){
        return zlomky.get(index);
    }
    public void vypisZlomky(PrintStream out){
        for(Zlomek zlomek : zlomky){
            out.println(zlomek);
        }
    }
    public Zlomek spoctiSoucet(){
       Zlomek soucet = new Zlomek(0, 1);
       for(Zlomek zlomek : zlomky){
           soucet = soucet.plus(zlomek);
       }
       return soucet.zkratit();
    }

    public Zlomek spoctiPrumer(){
        Zlomek suma = spoctiSoucet();
        Zlomek pocet = new Zlomek(zlomky.size(), 1);
        return suma.deleno(pocet).zkratit();
    }

    public int pocetZlomku(){
        return zlomky.size();
    }
}
