/* 22.06.2021

package MyPackage;
import java.util.Scanner;
public class masyvai {
    public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        int[]temp=new int[5];
        for (int i=0; i<5;i++){
            System.out.println("Masyvo elementai: "+temp[1]);
            temp[i]=in.nextInt();
        }
        for (int i=0; i<5; i++) {
            System.out.print(temp[i] + ",");
        }
    }
}




package MyPackage;
        import java.util.Scanner;
public class masyvai {
    public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        int[]temp=new int[5];
        for (int i=0; i<5;i++) 
            System.out.println("Iveskite masyvo "+i+" elementa:");
        temp[i]=in.nextInt();
        {
            int[] mas;
            mas=temp;
            System.out.println("Masyvas temp: ");
            for (int i=0; i<5; i++) {
                System.out.print(temp[i] + ",");
        }
            System.out.println("\nMasyvas MAS: ");
            for (int i=0; i<5; i++) {
                System.out.print(mas[i] + ",");
        }
    }
}



import java.io.File;
import java.io.FileNotFoundException;
import java.utiL.Scanner;
package MyPackage;
public class programa {
    public static void main(String[]args){
        Scanner in=new Scanner(new File("duomenys.txt"));
        int n=in.nextInt();
        int[] mas=mew int[n];
        for(int  i=0l i<n; i++) {
            mas[i]=in.nextInt();
        }
        int suma, min=mas[0], max=mas[0];
        for (int i=0; i<n; i++) {
            if (mas[i]>max) max = mas[i];
            if (mas[i]<min)
                min = mas[i];
            suma=suma+mas[i];
        }
        System.out.println("Visurkis: "+(double) suma/n);
        System.out.println("Min: "+min);
        System.out.println("Min: "+max);
        for (int i=0; i<n; i++) {
            System.out.print(mas[i]+", ");
            
        }
    }
}


// double atlieka 5,000 reiksme


 public static void main(String[] args) throws FileNotFoundException {
        Scanner in=new Scanner(new File("duomenys.txt"));

        int n=in.nextInt();
        int[] mas=new int[n];

        for (int i=0; i<n; i++) {
            mas[i]=in.nextInt();
        }

        int suma=0, min=mas[0], max=mas[0];

        for (int i=0; i<n; i++) {
            if (mas[i]>max)
                max = mas[i];
            if (mas[i]<min)
                min = mas[i];
            suma=suma+mas[i];
        }
        System.out.println("Vidurkis: "+ (double)suma/n);
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);

        for (int i=0; i<n; i++) {
            System.out.print(mas[i]+", ");
        }
    }





    // 8: 5, 10, 7, 9, 10, 5, 10, 5
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in=new Scanner(new File("duomenys.txt"));

        int n=in.nextInt();
        int[] mas=new int[n];
        System.out.println("Turimos spinduliu reiksmes:");
        for (int i=0; i<n; i++) {
            mas[i]=in.nextInt();
        System.out.println(mas[i]+",");
        }

        int kiek=0, r=mas[0], max=mas[10];

        for (int i=0; i<n; i++) {
            if (mas[i]>max)
                max = mas[i];
            if (mas[i]<min)
                min = mas[i];
            suma=suma+mas[i];
        }
        System.out.println("Vidurkis: "+ (double)suma/n);
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);

        for (int i=0; i<n; i++) {
            System.out.print(mas[i]+", ");
        }
    }


public static void main(String[] args) throws FileNotFoundException {
Scanner in=new Scanner(new File("apskritimai.txt"));
int n=in.nextInt();
int[] a=new int[n];

for (int i=0; i<n; i++) {
a[i]=in.nextInt();
}

int max=a[0];
for (int i=0; i<n; i++) {
if (a[i]>max)
max=a[i];
}

int kiekis=0;
for (int i=0; i<n; i++) {
if (a[i]==max)
kiekis++;
}
System.out.println("Maksimumas: "+max);
System.out.println("Kiekis: "+kiekis);



}







import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Saukstai {
   public static void main(String[] args) throws FileNotFoundException {
        Scanner in=new Scanner(new File("saukstai.txt"));
    int n=in..nextInt();
    int[] d=new int[7];
    int[] k= new int[n];

    while (in.hasNextInt()) {
        int dn=in.nextInt();
        int sk=in.nextInt();
        int dk-=in.nextin();
        d[dn]=d[dn]+sk;
        k[dk]=k[dk]+sk; 
    }
       for(int i=0; i<7; i++) {
           System.out.println((i+1)+"diena pagaminta"+d[i]+" saukstu");
       }
       for(int i=0; i<7; i++) {
           System.out.println((i+1)+"darbuotojas pagamino: "+k[i]+" saukstu");
}



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Saukstai {
   public static void main(String[] args) throws FileNotFoundException {
        Scanner in=new Scanner(new File("saukstai.txt"));
    int[] m=new int[10];
    while (in.hasNextInt()) {
         m[sk] = in.nextTnt();
    }
            for (int i=0; i<10; i++){
           System.out.println(i"");
       }
    }



    public static void main(String[] args) throws FileNotFoundException {
Scanner in = new Scanner(new File("skaiciai.txt"));
int[] m=new int[10];
while (in.hasNextInt()) {
int sk=in.nextInt();
m[sk]++;
}

for (int i=0; i<10; i++) {
System.out.println(i+ " - "+m[i]);
}



}

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





*/

