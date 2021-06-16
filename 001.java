/* JAVA TRAINING  */

import java.util.Scanner;
public class Vykdymas {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Koks kambario ilgis: ");
        int ilgis=in.nextInt();

        System.out.print("Koks kambario plotis: ");
        int plotis=in.nextInt();

        System.out.print("Kokia pliteliu kaina");
        double kaina=in.nextDouble();

        int plotas=ilgis * plotis;

        double suma=kaina * plotas * 1.05;

        System.out.printf("Plyteliu kaina: %8.2f "+ suma);

        in.close();
    }
}

/* new java class */

package laikrodis;
import java.util.Scanner;
public class Laikrodis {
        public static void naim (String[] args) {
            Scanner in=new Scanner(System.in);
            System.aout.print("Iveskite kada studentas pradejo spresti uzdavinius (h. m.): ")
            int h1=in.nextInt();
            int m1=in.nextInt();

            System.out.print("Iveskite kada (h m): ")
            int h2 = in.nextInt();
            int m2 = in.nextInt();

            int laikosprende = m2 - m1 + (h2 - h1) * 60;
            int h=laikoSprende / 60;
            int m=laikosprende % 60;
            System.out.println("Studentas sprande "+h+" h.  "+m+" m.")
        in.close();

}

/*  
uzd2  
book per month (v)
book per year (n)

book per m? v*12 = n

m - year

per 1 month 1 lank read book
vm / n

*/

package knygos;
import java.util.Scanner;
public class Knygos {
        public static void main(String[] args) {
            Scanner in=new Scanner (System.in);
            System.out.print();
            int v=in.nextInt();

            System.out.print();
            int n=in.nextInt();

            int vm=v*12;
            //4. vidutiniskai vienas lankytojas persk knygos
            int vis=vm / n;

            System.out.println("Vidutiniskai bus perskaitytas per metus: "+vid+" knygu.")


        }   
}

// 5 uzd

import java.util.Scanner;
public class KvadratoPlotas {
    Public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.printIn("iceskite staciakampio ilgi:");
        int ilgis=in.nextInt();

        System.out.printIn("iveskite staciakampio ploti: ");
        int plotis=in.nextInt();

        int plotis=ilgis * plotis;
        Sysytem.out.println("staciakampio plotas:" + plotas);

    }
}

/* */
package salyginis;
import java.util.Scanner;
public class Salyginis {
    public static void main(String[]args) {
        Scanner in=new Scanner (System.in);
        System.out.print();
        int x=in.nextInt();

        System.out.print();
        int y=in.nextInt();

        if (x==y) {
            System.out.println("ivesti skaiciai lygus");
        }else {
            system.out.println("ivesti skaiciai nelygus");
        }


    }
}


/* class 

n



*/

import java.util.Scanner;
public class Test { 
    public static void main(String[]args) {
        Scanner in=new Scanner (System.in);
        System.out.print("ivesti lygtniu skaiciu");
        int n=in.nextInt();
       
        if (n % 2 ==0) {
            System.out.println("ivesti skaiciai lygus");
        }else {
            System.out.println("ivesti skaiciai nelygus");
        }


    }

}

/* */
 

import java.util.Scanner;

 

public class Staciakampis {

 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Įveskite stačiakampio kraštinių ilgius: ");
        int a = in.nextInt();    
        int b = in.nextInt();    
        int c = in.nextInt();    
        int d = in.nextInt();
        
        if ((a==b || a==c || a==d) && ((b==c || b==d || c==d)))  {
            System.out.print("Iš įvestų kraštinių galima sudaryti stačiakampį");
            if (a==b && a==c) {
                System.out.print("Iš įvestų kraštinių galima sudaryti stačiakampį ir tai bus kvadratas");
            }
        }
        
        else {
            System.out.print("Iš įvestų kraštinių negalima sudaryti stačiakampio");
        }
    in.close();

 

    }

 

}

/* Trikampis */
import java.util.Scanner;
public class Trikampis {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in;)
        System.out.print("Iveskite trikampio krastiniu ilgius:");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        if (a<b+c && c<a+b) {
            System.out.println("Is ivestu krastiniu trikampiu sudaryti galima");
        } else{
            System.out.println("trikampio sudaryti negalima");
        }
    }

} 


/* staciakampis */
import java.util.Scanner;

 

public class Trikampis {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.print("Įveskite trikampio kraštinių ilgius: ");
        int a = in.nextInt();    
        int b = in.nextInt();    
        int c = in.nextInt();    
        
        if ((a+b>c) && (a+c>b) && (c+b>a))  {
            System.out.print("Iš įvestų kraštinių galima sudaryti trikampį");
        }
        else {
            System.out.print("Iš įvestų kraštinių negalima sudaryti trikampio");
        }
    in.close();
    }
    

 

}

/* homework

1 - penktadienis
2 - sestadienis
8 - penktadienis

*/

import java.util.Scanner;
public class Trikampis {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.print(Iveskite dienos numeri: );
        int diena=in.nextInt();
        1-5
        int savDiena=(diena+4) % 7;

        if(savDiena==1) System.out.println("Piemadienis");
        if(savDiena==2) System.out.println("Antradienis");
        if(savDiena==3) System.out.println("Treciadienis");
        if(savDiena==4) System.out.println("Ketvirtadienis");
        if(savDiena==5) System.out.println("Penktadienis");
        if(savDiena==6) System.out.println("Sestadienis");
        if(savDiena==0) System.out.println("Sekmadienis");


    }
}


/* 
1.
ar metai buvo olympiniai/neolympiniai
kelintas numeris tu metu

> arba = 

2. h/m/s
po sekundes bus val, m, s,

*/




import java.util.Scanner;
public class Staciakampis {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in;)

        String fromYear = "1896"
        String toYear = "2021"

        System.out.print("Iveskite staciakampio krastiniu ilgius:");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        if (a=b+c && c<a+b) {
            System.out.println("Staciakampis");
        } else{
            System.out.println("Staciakampio sudaryti negalima");
        }
    }

} 

