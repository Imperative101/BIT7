/* 21.06.2021

package MyPackage;
public class MyClass2 {
    public static void main(String[] args) {
        int i=0;
    i=0;
    for (; i<10; i++) {
        System.out.println(i - 1);
    }
    }
    }  


    import java.util.Scanner;
public class MyClass2 {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        System.out.print("Iveskite kiek turite plitu:");
        int p=in.nextInt();
        int aukstis=0;
        while (p>aukstis) {
            aukstis++;
            p=p-aukstis;
        }
        System.out.println("Galime pastatyti" +aukstis);
    }
    
}




package MyPackage;

import java.util.Scanner;

public class class3 {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        System.out.print("Iveskite kiek turite saldainiu:");
        int p=in.nextInt();
        int dienos=0;
        while (p>0) {
            dienos++;
            p=p-dienos;
        }
        System.out.println("suvalge per"+dienos +" dienu.");
    }


}



import java.util.Scanner;
public class class4 {
    public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Iveskite skaiciu seka: ");
        int suma=0;
        int kartai=0;
        int sk=in.nextInt();
        while(sk!=0) {
            suma=suma+sk;
            kartai++;
            System.out.print("Iveskite skaiciu(pabaigia 0):");
            sk=in.nextInt();
        }
        double vid = (double) suma / kartai;
        
        System.out.print("Visu ivestu skaiciu: "+suma);
        System.out.print("Visu skaiciu vidurkis: %5.2f ". vid);
    }
    }

}



import java.util.Scanner;
public class class4 {
    public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Iveskite skaiciu seka: ");
        int suma=0;
        int kiek=0;
        int sk;
        do {
            System.out.print("Iveskite skaiciu(pabaigia 0):");
            sk=in.nextInt();
            suma=suma+sk;
            kiek++;
        } while (sk!=0);
        System.out.print("Visu ivestu skaiciu: "+(double) suma/(kiek-1));
    }
    }

import java.io.File;
import java.ioFileMotFoundException;
import java.util.Scanner;
package MyPackage;
public class class5 {
    public class void main(String[] args) {
        Scanner in=new Scanner(new File("dumenys.txt"));
        int sk;
        while (in.hasNextInt()) {
            sk=in.nextInt();
            System.out.print(sk+",");
        }
        in.close();
    }
}


import java.util.Scanner;
package MyPackage;

public class class6 {
    public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        System.out.print();
        int alga=in.nextInt();
        System.out.print("");
        int padidejimas=in.nextInt();
        int men=0;
        int alga=alga;
        while (algaE>alga*2){
            men++;
            algaE+=padidejamas;
        }
        System.out.println("Jus dvigubai daugiau uzdirbsite po"+men"men.");
    }
}

Scanner in = new Scanner(System.in);
System.out.print("Įvekite dabartinį atlyginimą: ");
int alga = in.nextInt();
int dviguba=alga*2;
System.out.print("Kiek Eurų alga bus padidinta kas mėnesį? ");
int x = in.nextInt();
int menuo = 0;
do {
alga = alga + x;
menuo++;
} while (dviguba > alga);
System.out.println("Alga bus didesne negu dviguba po: " + menuo + " menesių");
in.close();





import java.util.Scanner;
package MyPackage;

public class class6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Iveskite skaiciu: ");
        int n = in.nextInt();
        
        int suma=0;
        while (n!=0) {
            suma=suma + n % 10;
            n / = 10;
        }

        System.out.print("Skaitmenu suma: "+suma );

    }
}



import java.util.Scanner;
package MyPackage;

public class class6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Iveskite skaiciu: ");
        int n = in.nextInt();
        
        int suma=0;
        while (n!=0) {
            suma=suma + n % 10;
            n / = 10;
        }

        System.out.print("Skaitmenu suma: "+suma );

    }
}


public static void main(String[]args) {
    Scanner in=new Scanner(System.im);
    System.out.print("Pirmas atl.:");
    int alt=in.nextInt();
    System.out.print("Kiek dides atl.:");
    int padidejimas=in.nextInt();
    int men=0;
    int altE=atl;
    while (atl<atl*2) {
        men++;
        atlE+=padidejimas;
    }
    System.out.println("Uzdarbis > nei 2 l/ po "+men+" men.")
}

last 3 for homework*/
