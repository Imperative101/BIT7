/* failopaieskossistema.java

import java.util.scanner;
public class Failopsieskossistema {
    public static void paieska (File f, String name) {
        String[] names=f.list();
        for (int i=0; i<names.length; i++) {
            File fi=new File(f.getAbsolutePath()+"/"+ names[i]);
            if (names[i].equals(name)) {
                System.out.println(fi.getAbsolutePath());
            }
            if (fi.isDirectory()) {
                paieska(fi, name);
            }
        }
    }
    public static void main (String[] args) throws fileIsNotFoundException {
        Scanner in=new Scanner(System.in);
        System.out.println("Iveskite kataloga kuriame ieskosime failu: ");
        String dir=in.next();
        System.out.println("Iveskite faila kuriame ieskosime: ");
        String file = in.next();
        paieska(new File(dir), file);
    }
}

.... Užduotis 1 „Trupmenos“

Sukurkime klasę Trupmena, ją turėtų sudaryti trys atributai: sveikojiDalis, skaitiklis, dalikl

public class Vykdymas {
    public static void main(String[] args) {
        Trupmena t=new Trupmena(8,2,3);
        System.out.println(t);
        t.prideti (6,7);
        t.prideti(2,5,7);

        Trupmena t1=new Trupmena(5,8);
        Trupmena t2=new Trupmena(3,7)
        t1.prideti(t2);
        
        System.out.println(t1.toDouble());
    }
}





public class Trupmena {
    public int sveikojiDalis;
    public int skaitiklis;
    public int daliklis;

    public Trupmena () {

    }

    public Trupmena(int skaitiklis, int daugiklis) {
        this.skaitiklis = skaitiklis;
        this.daliklis = daliklis;
    }


    public Trupmena(int skaitiklis, int daliklis) {
        this.skaitiklis = skaitiklis;
        this.daliklis = dalikis;
 }

 public Trupmena (int sveikojiDalis, int skaitiklis, int daliklis) {
 
     this.sveikojiDalis = sveikojiDalis;
     this.skaitiklis = skaitiklis;
     this.daliklis = daliklis;
 }


    public void

     public int getSveikojiDalis ();  {
        return sveikojiDalis;
    }

    public void setSveikojiDalis(int SveikojiDalis) {
        this.SveikojiDalis = SveikojiDalis;
    }
  
    public int getSkaitiklis ();  {
        return skaitiklis;
    }

    public void setSkaitiklis(int skaitiklis) {
        this.skaitiklis = skaitiklis;
    }

    public int getDaliklis () {
        return daliklis;
    }

    public void setDaliklis(int daliklis) {
        this.daliklis = daliklis;
    }
   @Override
   public String toString() {
       if (sveikojiDalis!=0) {
           return sveikojiDalis + "" + skaitiklis + "/" + daliklis;
       } else {
           return skaitiklis + "/" + daliklis;
       }
   }
   public void prideti(int x) {
       sveikojiDalis+=x;
    
    public int dbd(int x, int y) {
        int dbd=1;
        for (int i=1; i<=x; i++) {
            if (x%1==0 && y%i==0) {
                dbd=i;
            }
        }
        return dbd;
    }
       
   }
   public void prideti(int s, int d) {
       skaitiklis=daliklis*s+d*skaitiklis;
       daliklis=daliklis * d;
       sveikojiDalis=sveikojiDalis+(skaitiklis / daliklis);
       int dbd=dbd(skaitiklis, daliklis);
       skaitiklis=skaitiklis / dbd;
       daliklis=daliklis / dbd;
   }

   public void prideti (int sveikas, int s, int d) {
       prideti(sveikas);
       prideti(s,d);

   }

   public void prideti(Trupmena t) {
       prideti(t.sveikojiDalis);
       prideti(t.skaitiklis, t.daliklis);
   }
   public double toDouble() {
       double d=sveikojiDalis + ((double)skaitiklis / daliklis);
       return d;
   }
}

//// source - generate getters and setters
/// source - generate constructor using fields


/////////////////////// task 2 

vykdymas.java

package Gyvunai;
public class Vykdymas {
    public static void main(String[] args) {

        final int z=50;
        /z++;
        System.out.println(z);

        Gyvunas g1=new Gyvunas("Brius", "Suo", "Naminukas");
        Gyvunas g2=new Gyvunas("Lese", "Suo", "Koli");
        Gyvunas g3=new Suo("Dingas", "Suo", "Laukinis skalisas");
        Gyvunas g4=new Gyvunas("Barnis", "Ziurkenas");
        Kate g5=new Kate("Murklys", "Kate", "Trumpaplauke");
        Gyvunas g6=new Kate("Rainis", "Kate", "Siamo");  

        g1.suzymeti(3);
        g2.suzymeti(4);
        g3.suzymeti(15);
        g4.suzymeti(8);
        g5.suzymeti(17);


        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
        System.out.println(g5);

        final int i=5;
        final Gyvunas g=new Gyvunas("Barnis", "Ziurkenas");

        i=8;
        g.vardas="Bernis";
        g=new Gyvunas("", "");
        g=g4;
    }
}

kate.java



suo.java

package Gyvunai;
public class Suo extends Gyvunas {
    public String veisle;
    public Suo(String vardas, String tipas) {

        super(vardas, tipas);
    }
    public Suo(String vardas, String tipas, String veisle) {
        super(vardas,tipas);
        this.veisle = veisle;
    }

    @Override
    public String toString() {
        return vardas +"," + tipas + " id="+ id+ "[veise: "+this.veisle+"]";
    }

        this.tipas=tipas;
        this.vardas=vardas;
    }
}





gyvunai.java

package Gyvunai;
public class Gyvunas {
    public string vardas;
    public string tipas;
    protected string id;

    public final amzius=12;

    public Gyvunas() {
        amzius=5;
    }

    public Gyvunas(String vardas, String tipas) {
        this.vardas = vardas;
        this.tipas = tipas;
    }
    public void suzymeti(int id) {
        this.id="G -" + id;
    }
}

public String getVardas() {
    return vardas;
}

public void setVardas(String vardas) {
    this.vardas = vardas;
}

public String getTipas() {
    return tipas;
}

public void setTipas(String tipas) {
    this.tipas = tipas;
}


public String getId() {
    return Id;
}

public void setId(String id) {
    this.Id = Id;
}

@Override {
    public void suzymeti (int id) {
        this.id="K -"+id;
    }
}

@Override
public String toString() {
    return "Gyvunas [vardas= " + vardas + ", tipas=" + tipas +", id=" + id + "]";
}



*/