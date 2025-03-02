package cz.uhk.zlomky.model;

public class Zlomek extends Number{
    private int citatel;
    private int jmenovatel;

   public Zlomek(int citatel, int jmenovatel){ /*Konstruktor, this pouzivame, kdyz mame dva stejne nazvy*/
       this.citatel = citatel;
       this.jmenovatel = jmenovatel;
   }

   public int getCitatel(){
       return citatel;
   }

   public int getJmenovatel(){
       return jmenovatel;
   }

   public Zlomek krat(Zlomek druhy){
       return new Zlomek(citatel * druhy.citatel, jmenovatel * druhy.jmenovatel);
   }

   public Zlomek deleno(Zlomek druhy){
       if(druhy.citatel == 0 || jmenovatel == 0){
           throw new Error("Ve jmenovateli nemůže vyjít nula");
       }
       else{
           if (citatel * druhy.jmenovatel == 0) {
               return new Zlomek(citatel * druhy.jmenovatel, jmenovatel * druhy.citatel);
           }
           else{
               return new Zlomek(citatel * druhy.jmenovatel, jmenovatel * druhy.citatel).zkratit();
           }
       }
   }
   public Zlomek plus(Zlomek druhy){
       if (jmenovatel == druhy.jmenovatel) {
           if(citatel + druhy.citatel ==0){
               return new Zlomek (citatel + druhy.citatel, jmenovatel);
           }
           else{
               return new Zlomek (citatel + druhy.citatel, jmenovatel).zkratit();
           }
       }
       else{
           if(citatel * druhy.jmenovatel + druhy.citatel * jmenovatel ==0 ){
               return new Zlomek(citatel * druhy.jmenovatel + druhy.citatel * jmenovatel, jmenovatel * druhy.jmenovatel);
           }
           else{
               return new Zlomek(citatel * druhy.jmenovatel + druhy.citatel * jmenovatel, jmenovatel * druhy.jmenovatel).zkratit();
           }
       }
   }

   public Zlomek minus(Zlomek druhy){
       if (jmenovatel == druhy.jmenovatel) {
           if(citatel - druhy.citatel ==0){
               return new Zlomek (citatel - druhy.citatel, jmenovatel);
           }
           else{
               return new Zlomek (citatel - druhy.citatel, jmenovatel).zkratit();
           }
       }
       else{
           if(citatel * druhy.jmenovatel - druhy.citatel * jmenovatel ==0 ){
               return new Zlomek(citatel * druhy.jmenovatel - druhy.citatel * jmenovatel, jmenovatel * druhy.jmenovatel);
           }
           else{
               return new Zlomek(citatel * druhy.jmenovatel - druhy.citatel * jmenovatel, jmenovatel * druhy.jmenovatel).zkratit();
           }
       }
   }

   public Zlomek zkratit(){
       int a = Math.abs(citatel);
       int b = Math.abs(jmenovatel);
       if(a<b){
           int temp = a;
           a=b;
           b=temp;
       }
       int zb = 0;
       do{
           zb = a%b;
           a=b;
           b=zb;
       } while (zb!=0);
       return new Zlomek(citatel/a, jmenovatel/a);
   }

    @Override //anotace
    public String toString() {
        return String.format("%d / %d", citatel, jmenovatel);
    }

    @Override
    public int intValue() {
        return citatel/jmenovatel;
    }

    @Override
    public long longValue() {
        return intValue();
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override
    public double doubleValue() {
        return ((double)citatel/jmenovatel);
    }
}
