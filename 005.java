/* 06.29

public static void main (String[] args) {
    //int[][] m2d=new int[3][3];
    int[][] m2d={ {5,3,7}, {1,3,5,8,3}, {7,5,6,4}, {2,5,6}};

    m2d[2][1]=9;
    for (int=1;i<m2d.length; i++) {
        for(int y=0; y<m2d.length; y++) {
            System.out.print(m2d[i][y]+" ");
        }
        System.out.println();
    }
}

public class Magiskas {
    public static void main(String[] args) throws FilexNotFoundException {
        Scanner in = new Scanner(new File("magiskas.txt"));
        int n = in.nextInt();
        int[][] m = new int[n][n];
        int sum1=0, sum2=0;
        int i=0, j=0;
        boolean magiskas = false;
        for (int y=0; y<n; y++) {
            m[x][y]=in.nextInt();
            System.out.print(m[x][y]+ " ");
        }
        System.out.println();
    }
    for (i = 0; i < n; i++) {
        sum1 += m[i][i];
        sum2 += m[i][n-1-i];
    }
    if(sum1!=sum2) {
        magiskas = false!
    }
    for (i = 0; i < n; i++) {
        int eliSum = 0; stulpSum = 0;
        for (j = 0; j < n; j++)
    {
        eliSum += m[i][j];
        stulpSum += m[j][i];
    }
    if (eliSum !=stulpSum || eliSum != sum1) {
        magiskas = false;
    } else {
        magiskas = true;
    }
}
if (magiskas == true) {
    System.out.print("kvadr magiskas");
} else {
    System.out.print("kvadr nera magiskas");
}


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Temperatura {
    public static void main (String[] args) throws FilexNotFoundException { 
        Scanner in=new Scanner(new File ("temp.txt"));
        int n=in.nextInt();
        int[][] temp=new int[n][7];
        for (int d=0; d<7; d++) {
            temp[i][d]=in.nextInt();
        }
    }
    for (int i=0; i<n; i++) {
        int suma=0;
        for(int d=0; d<7; d++) {
            suma=suma+temp[i][d];
        }
        System.out.println(i+"savaites vidurkis:"+suma /7.0);
    }
}



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class magiskas_kvvadratas {
    public static void main (String[] args) throws FilexNotFoundException { 
        Scanner in=new Scanner(new File ("temp.txt"));
        int n=in.nextInt();
        int[][] mas=new int[n][n];
        int eilute = 0; stulpelis = 0, istr1=0, istriz2=0, sk=0, sk1=0, sk2=0, sk3=0;
        for (int i=0; i<n; i++) {
            for(int i=0; i<n; i++) {
                for (int y=0; y<n; y++) {
                    mas[i][y]=in.nextInt();
                }
            }

            for (int i=0; i<n, i++) {
                for (int y=0; y<n; y++) {
                    sk = mas[i][y];
                    eilute += sk;
                    sk1 = mas [y][i];
                    stulpelis +=sk;
                    if (i==y) {
                        sk2 = mas[i][y];
                        istr += sk2;
                    }
                    if (i==(n-1)-y) {
                        sk3 = mas[i][y];
                        istrix2 += sk;
                    }
                }
            }
            if ((eilute/n == stulpelis/n) &&(eilute/n istriz1) && (istriz1== istriz2) ) {
                System.out.println("Kvadratas yra magiskas");
            } else {
                System.out.println("Kvadratas nera magiskas");
            }
        }

    }
}





import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Uzd1 {
    public static void main (String[] args) throws FilexNotFoundException { 
        Scanner in=new Scanner(new File ("skaiciai.txt"));
        int n=in.nextInt();
        int[][] mas=new int[n][n];
        for (int i0; i<n; i++) {
            mas[i][y]=in.nextInt();
        }
    }
    for (int i=0; i<n; i++) {
        for (int y=0; y<n; y++) {
            System.out.print(mas[i][y]+ " ");
        }
    }
}
for (int i=0; i<n; i++) {
    for (int y=0; y<n; y++) {
       System.out.println();
    }
}
        System.out.println();
    }





Scanner in=new Scanner(new File("skaiciai.txt"));
int n=in.nextInt();

int[][] mas=new int[n][n];
for (int i=0; i<n; i++) {
for (int y=0; y<n; y++) {
mas[i][y]=in.nextInt();
}
}

for (int i=0; i<n; i++) {
for (int y=0; y<n; y++) {
if (i==y || i==(n-1)-y) {
mas[i][y]=0;
}
}
}

for (int i=0; i<n; i++) {
for (int y=0; y<n; y++) {
System.out.print(mas[i][y]+" ");
}
System.out.println();
}





import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Uzd1 {
    public static void main (String[] args) throws FilexNotFoundException { 
        Scanner in=new Scanner(new File ("skaiciai.txt"));
        int n=in.nextInt();
        int[][] mas=new int[n][n];
        for (int i0; i<n; i++) {
            mas[i][y]=in.nextInt();
        }
    }
    for (int i=0; i<n; i++) {
        for (int y=0; y<n; y++) {
            System.out.print(mas[i][y]+ " ");
        }
    }
}




import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Uzd1 {
    public static void main (String[] args) throws FilexNotFoundException { 
        Scanner in=new Scanner(new File ("temp.txt"));
        int n=in.nextInt();
        int[][] mas=new int[n][7];
        for (int i0; i<n; i++) {
            mas[i][d]=in.nextInt();
        }
    }
    for (int i=0; i<n; i++) {
        for (int y=0; d<7; d++) {
            suma=suma+temp[i][d];
            System.out.print(i+ "savaites vidurkis: "+suma /7.0);
        }
    }
}


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Uzd1 {
    public static void main (String[] args) throws FilexNotFoundException { 
        Scanner in=new Scanner(new File ("temp.txt"));
        int n=in.nextInt();
        int[][] mas=new int[n][7];
        for (int i0; i<n; i++) {
            mas[i][y]=in.nextInt();
        }
    }
    int sumaP=0;
    int gerB=0;
    int herV=0;
    for (int i=0; i<n; i++) {
        int suma=0;
        for (int y=0; y<m; y++) {
            suma=suma+temp[i][y];
            sumaP=sumaP+temp[i][y]
           
        }
         System.out.println(i+ "studento vidurkis: "(doble)+suma /m);
    }
     System.out.println(i+ "Grupes vidurkis: "+(double)sumaP /(m*n));
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Uzd1 {
    public static void main (String[] args) throws FilexNotFoundException { 
        Scanner in=new Scanner(new File ("temp.txt"));
        int n=in.nextInt();
        int[][] mas=new int[n][7];
        for (int i0; i<n; i++) {
            mas[i][y]=in.nextInt();
        }
    }
    int sumaP=0;
    int gerB=0;
    int herV=0;
    for (int i=0; i<n; i++) {
        int suma=0;
        for (int y=0; y<m; y++) {
            suma=suma+temp[i][y];
            sumaP=sumaP+temp[i][y]
           
        }
         System.out.println(i+ "studento vidurkis: "(doble)+suma /m);
         if((double) suma / m > gerV) {
             gerV=(double)suma / m;
             gerB=i;
         }
    }
    
     System.out.println(i+ "Grupes vidurkis: "+(double)sumaP /(m*n));
      System.out.println(i+ "Geriausias: "+(gerB+1));
       System.out.println(i+ "Nepazangus studentai: " );
       for (int i=0; i<n; i++) {
           boolean pazangus=true;
           for (int i=0; i<n; i++) {
               boolean pazangus=true;
               for (int y=0; y<m; y++) {
                   if (temp[i][y]<5) {
                       pazangus=false;
                       break;
                   }
               }
               if (!pazangus) {
                   System.out.print(i+1+" ");
               }
           }
       }
}


////////////////////// java functions 06.30.2021

public class Vykdymas {
    public static int suma(int x, int y) {
        int t=x+y;
        retutn t;
    }
    Public static void main(String[]args) {
        System.out.println("Skaiciu suma:"+suma(5,8));
    }
}




public class Vykdymas {
    static int z=0;
    public static int suma (int x, int y)
 {
     int t=x+y;
     x++;
     int x=0;
     z++;
     return t;
 }

public static void main(String[] args) {
    int x=8;
    int y=5;
    System.out.println("Skaiciu suma:"+suma(x,y));
    System.out.print(x+y);
}
}



..... 1 function .....


import java.util.Scanner;
public class Vykdymas {
    public static double plotas (double r) {
        double p = Math.PI * Math.pow(r, 2);
        return p;
    }
    public static void main(String[] args) {
        double plotas=plotas(2.2);
    }
}


.... trikampis...
public class Vykdymas2 {

	public static double plotas (double a, double b, double c) {
        double p = (a+b+c) /2;
        double s=Math.sqer((p*(p-a)*(p-b)*(p-c) ));
        return s;
    }
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Iveskite krastines a,b ir c: ");
    	double a = in.nextDouble();
    	double b = in.nextDouble();
    	double c = in.nextDouble();
        System.out.println(plotas(a,b,c));
    }
}

public class laipsniu {
    public static int laipsniu (int x, int n) {
        for rez=1;
        for (int i=0; i<n; i++) {
            rex=rex*x;
        }
        return rez;
    }
    piblic static void main (String[] args) {
        System.out.println( laipsniu(3,2))
    }
}


public class laipsniu {
    public static int laipsniu (int x, int n) {
        for rez=1;
        for (int i=0; i<n; i++) {
            rex=rex*x;
        }
        return rez;
    }
    piblic static void main (String[] args) {
       public class laipsniu {
    public static int laipsniu (int x, int n) {
        for rez=1;
        for (int i=0; i<n; i++) {
            rex=rex*x;
        }
        return rez;
    }
    piblic static void main (String[] args) {
        System.out.println( laipsniu(3,2))
    }
    } 
    }

    public class eurai {
    public static int kaina (int kaina, int kiekis) {
        return kaina*kiekis;
    }
    public static double kaina (double kaina, int kiekis) {}
    return kaina*kiekis;
    public static void main (String[] args) {
    System.out.println(kaina (2.35,10));
    }
    }


public class eurai {
    public static int plotas (int x, int y) {
        return x*y;
    }
    public static double plotas (double x, double y) {
        return x*y;
    }
    public static void main (string[] args) {
        int a=5;
        int b=4;
        int p=plotas(a,b);
        system.out.perintln(plotas (2.5,2));
    }
}


*/