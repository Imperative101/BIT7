/* 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

package MyPackage;

public class masyvas {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in=new Scanner (new File("duomenys.txt"));
        int n=in.nextInt();
        int[] m= new int [n];
        int suma=0;

        for (int i=0; i<n; i++) {
            mas [i]= in.nextInt();
            suma += m[i];
        }
        System.out.println("Vidutine temperatura: " + (double)suma/n);
        System.out.println ("Viso duomenu:" +n);
        Arrays.sort(m);
        System.out.println("Dvi didziausios temperaturos: " + m[n-1] + ","+m[n-2]);
        System.out.println("Dvi maziausios temperaturos: " + m[0] + ","+m[1];

        }
    }



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

package MyPackage;

public class masyvo {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in=new Scanner (new File("duomenys.txt"));
        int m=in.new int[0];
        while (in.hasNextInt()) {
            int sk=in.nextInt();
            int[] t=new int[m.length+1];
            for(int i=0; i<m.length; i++) {
                t[i]=m[i];
            }
            t[t.length-1]=sk;
            m=t;
            
        }
        for (int i=0; i<m.length; i++) {
            system.out.println(m[i]+ " ");
        }
        system.out.println("\nMasyvo dydis: "+m.length);
        
    }
    
}

// clonuojama atminties vieta.
package MyPackage;

public class colne {
    public static vois main (String[] args) {
        int [] ,= {2,3,5};
        int[] t=m.clone();
        t[0] = 99;
        System.out.println(Arrays.toString(m));
        System.out.println(Arrays.toString(t));
    }
}


public class masyvas {
    public static void main(String[] args) throws FileNotFoundException { 
        Scanner in = new Scanner (new File ("skaiciai.txt"));
        int[] m=new int[0];
        while (in.hasNextInt()) {
            int sk=in.nextInt();
            m=Arrays.copyOf (m, m.length+1);
            int[] t=new int[m.length+1];
            for (int i=0; i<m.length; i++) {
                t[i]=,[i];
            }
            t[t.length-1]=sk;
            m=t;
        }
        System.out.println(Arrays.toString(m));
        System.out.println("\nMasyvo dydis:"+,.length);
    }

public class Vykdymas {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in=new Scanner (new File("namai.txt"));
        int n=in.nextInt();
        int[] namai=new int[n];
        for (int i=0; i<n; i++) {
            namai[i]=in.nextInt();
        }
        int gyvK=0;
        int gyvD=0;
        int namK=0;
        int namD=0;
        for (int i=0; i<n; i++) {
            if ((i+1)%2==0) {
                gyvD=gyvD+namai[i];
                namD++;
            } else {
                gyvK=gyvK+namai[i];
                namL++;
            }
        }
        System.out.println("Viso gyventoju: "+(gyvD+gyvK));
         System.out.println("Kaireje gyvena: "+gyvK+ "Desineje gyvena:"gyvD);
        System.out.println("Vidutin kaireje gyvena:"+ (double)gyvK / namK));
        System.out.println("Vidutin desineje gyvena:"+ (double)gyvD / namD));
    }
}


public static void main(String[] args) throws FileNotFoundException {
    Scanner in=new Scanner(new File("pirminiai.txt"));
    int[] m=new int[n];
    for (int i=0; i<n; i++) {
        m[i]=in.nextInt();
    }
    System.out.printLn("Pirminiai skaiciai: ");
    for (int i=0; i<n; i++) {
        boolean pirminis= true;
        for (int y=2; y<m[i]; y++) {
            if (m[i] % y==0) {
                pirminis=false;
                break;
            }
        }
        if (pirminis ==true) {
            System.out.print(m[i]+ "");
        }
    }
}


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

package MyPackage;

public class Rikiavimas {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in=new Scanner(new File("duomenys.txt"));
        int n=in.nextInt();
        int[] m=new int [n];
        for (int i=0; i<n; i++) {
            m[i]=in.nextInt();
        }
        for (int i=0; i<n; i++) {
            System.out.print(m[i]+" ");
        }
        System.out.println();
        for (int i=0; i<n-1; i++) {
            for (int y=i+1; y<n; y++) {
                if (m [i]>m[y]) {
                    int t=m[i];
                    m[i]=m[y];
                    m[y]=t;
                
                }
            }
        }
        For (int i=0; i<n; i++) {
            System.out.print(m[i]+" ");
        }
        System.out.println();
    }




import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

package MyPackage;

public class Statistika {
     public static void main(String[] args) throws FileNotFoundException {
         Scanner in=new Scanner(new File("duomenys.txt"));
         int n=in.nextInt();
         int[] m=new int[n];
         int suma=0;
         for (int i=0; i<n; i++) {
             m[i] = in.nextInt();
             suma=suma+m[i];
         }
         System.out.println("Vidurkis:"+(double) suma/n);
         Arrays.sort(m);
         if (n % 2 !=0) {
             System.out.println("Mediana:"+m[n / 2]);
         }else {
             System.out.println ("Mediana:"+(double)(m[(n/2)-1] + m[n/2]) /2);
         }
         System.out.println(Arrays.toString(m));
        }


            
        Scanner in = new Scanner(System.in);
        System.out.print("Iveskite (dideli, sveika) skaiciu: ");
        
        int i = in.nextInt();
        
        int lyg=0;
        int nelyg=0;
        int m = 0;
        
        while (i != 0) {​​​​​​​
            m = i % 10;
            if (m % 2==0) {​​​​​​​
                lyg++;
            }​​​​​​​ else {​​​​​​​
                nelyg++;
            }​​​​​​​
            i =i /10;
//            System.out.println(m);


        }​​​​​​​
        
        System.out.println("Lyginiu skaitmenu sioje sekoje yra: " +lyg);
        System.out.println("NE-lyginiu skaitmenu sioje sekoje yra: " +nelyg);


        in.close();



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

 

public class Apskritimai {

 

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("data.txt"));
        
        int n = in.nextInt();
        int[] mas = new int[n];
        System.out.print("Turimos spindulių reikšmės: ");
        for (int i=0; i<n; i++) {
            mas[i] = in.nextInt();
            System.out.print(mas[i]+", ");
        }
        int kiek = 0, r = mas[0];
        
        for (int i = 0; i < n; i++) {
            if (mas[i] > r) {
                r = mas[i];
            }
            
            }
        for (int i=0; i < n; i++) { 
        if (mas[i] == r) {
            kiek++;
        }
        }
        System.out.println("\nDidžiausio apskritimo spindulys: " + r);
        System.out.println("Ir tokių apskritimų yra: " + kiek + " vnt.");

 

        

 

    }

 

}
 


*/
