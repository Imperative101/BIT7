/* package MyPackage;
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

*/