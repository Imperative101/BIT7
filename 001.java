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



  public class pasirinkimas {

	public static void main(String[] args) {
		int i=1;
		if(i == 3)
			System.out.println("treciadienis");
		if (i == 4)
			System.out.println("ketvirtadienis");
		switch (i) {
		case 1: System.out.println("pirm");
		case 2: System.out.println("antr");
		case 3: System.out.println("trec");
		}
	}

}



public class sutrumpintasif {

	public static void main(String[] args) {
		int lytis=1;
		
	String lytisS;
	/* if(lytis==0) {
		lytisS="Moteris";
	} else {
		lytisS="Vyras";
	} */
	 lytisS=(lytis==0)?"Moteris":"Vyras";
	 
	 
	 
	 
// System.out.println("Zmogaus lytis:+lytisS");
	 System.out.println("Zmogaus lytis: "+((lytis==0)?"moteris":"vyras"));
	}

}



/* */
public class menesiai {

	public static void main(String[] args) {
		Scanner on = new Scanner (System.in);
		System.out.println("Iveskite metus ir menesiai: ");
		int metai=in.nextInt();
		int menuo=in.nextInt();
		int diena=in.nextInt();
		
		int dienu = 0;
		
		switch (menuo) {
		case 12: 
			dienu=dienu +30;
		case 11: 
			dienu = dienu+ 31;
			break;
		case 10:
			dienu += 30;
			break;
		case 9:
			dienu += 31;
			break;
		case 8:
			dienu += 31;
		case 7:
			dienu += 30;
		case 6:
			dienu = 31;
		case 5:
			dienu += 31;
		case 4:
			dienu += 30;
		case 3:
			dienu += 28;
		case 2:
			dienu += 31;
			
		
			
		}
		
		if (menuo > 2) {
			if(metai % 4== 0 && metai % 100 != 0 || metai % 400 == 0  )
				dienu++;
		}
		
		dienu=dienu + diena;
		System.out.println("Dienu:" + dienu);

	}

}

/*  tasks*/

package pirma;
import java.util.Scanner;
public class pirmas {
    public static void main(String[] args) {
        Scanner ivedimas=new Scanner(System.in);

        int svoris,ugis;
        System.out.print("Iveskite svori (kilogramais):");
        svoris = ivedimas.nextInt();

        System.out.print("Iveskite ugi (centimetrais):");
        ugis=ivedimas.nextInt();
        double ugisMetrais = (double)ugis/100;
        double kmi = svoris / (ugisMetrais*ugisMetrais);
        System.out.println("Jusu kmi yra: (float)kmi");
        ivedimas.close();

    }
}


/* homework 1*//////////////////////////////////
import java.util.Scanner;
public class Trikampis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Iveskite metus:");
        int metai = in.nextInt();
        If((metai >= 1896) &&(metai % 4 == 0)){
            System.out.println("Metai olympiniai");
            System.out.println("Olympiniu zaidymu numeris: " +(metai / 4-473));
            int n = (metai % 1896) / 4+1;
            System.out.println(n);
        }else {
            System.out.println("Metai neolimpiniai");
        }
        in.close();
    }
}

/* laikrodis */
import java.util.Scanner;
public class Laikrodis {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Iveskite kiek laiko rodo laikrodis (h,m,s):");
        int h=in.nextInt();
		int m=in.nextInt();
		int s=in.nextInt();
        s++;
        if (s==60){
            m++;
            s=0;
            if (m==60){
                h++;
                m=0;
                if (h == 24) {
                    h = 0;
                }
            }
        }
        System.out.println("Povienos sekundes bus: "+h+":"+m+":"+s);
}

}


/* metai */

import java.util.Scanner;
public class Metai {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite metus: ");
        int metai = in.nextInt();
        If (metai % 4 == 0 && metai % 100 !=0 || metai % 400==0){
            System.out.println("Metai keliamieji");
        } else {
            System.out.println("Metai paprastieji");
        }
    }
}


/* 2 scanners*/
public class Vykdymas {
    public static void main(String[]args)throws FileNotFoundException {
        Scanner inC=new Scanner(System.in);
        System.out.print("Is kokio failo skaityti:");
        int e=inC.nextInt();
        System.out.println("Pa"+n*n);
        in.close();
        inC.close();
    }
}



import java.io.*;
import java.util.Scanner;
public class Vykdymas {
    public static void main(String[]args)throws FileNotFoundException {
        Scanner inC=new Scanner(System.in);
        System.out.print("Is kokio failo skaityti:");
        int e=inC.nextInt();




    Scanner in=new Scanner(new File(f));
    int n=in.nextInt();
    for (int i=1; i<=n; i++) {
        int t=in.nextInt();
        int suma=0;
        suma=suma+t;
        System.out.println(i+" d.Temperatura:"+t);
    }

        System.out.println("visu temperaturu suma");

        in.close();
        inC.close();
    }
}

/* */


import java.io*;
import java.util.Scanner;
public class Klasesvidurk {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inF - new Scanner(System.in);
        System.out.println("Nurodykite faila:");
        String f = inF.next();
        Scanner in = new Scanner(new File(new File(f));
        int n = in.nextInt();
        for (int i=1; i<=n; i++) {
            int v = in.nextInt();
            vid = (vid +v);
        }
        vid= vid / n;
        System.out.printf("%5.2f", vid);
    }
}

import java.io.*;
import java.util.Scanner;
public class pazymiai {
    public static void main(String[]args)throws FileNotFoundException {
        Scanner inC=new Scanner(System.in);
        System.out.print("Is kokio failo skaityti:");
        int e=inC.nextInt();

    Scanner in=new Scanner(new File(f));
    int n=in.nextInt();
    for (int i=1; i<=n; i++) {
        int t=in.nextInt();
        int suma=0;
        suma=suma+t;
        System.out.println(i+" pazymiai:"+t);
    }
        System.out.println("pazymiu suma");
        in.close();
        inC.close();
    }
}






public class pirminiai {

	public static void main(String[] args) {
		int i=21;
		boolean pirminis=true;
		for (int y=2; y<i; y++) {
			if (i % y == 0) {
				pirminis=false;
				break;
		}

	}
		if (pirminis) {
			System.out.println("Pirminis");
			
		} else {
			System.out.println("Nepirminis");
		}

}
}

/*  svarbus variantas*/

public class UzduotisN {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int a, b, i, j, f;
        System.out.printf("Iveskite intervalo pradzia:");
        a = in.nextInt();
        System.out.printf("Iveskite intervalo pabaiga:");
        b = in.nextInt();
        System.out.printf("Pirminiai skaiciai tarp %d ir %d yra:", a, b,);
        for (i = a; i <= b; i++) {
            if (i == 1 || i == 0)
            continue;
            f = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    f = 0;
                     break;
                }
            }
            if (f == 1)
            System.out.println(i);
        }

    }
}


import java.util.Scanner;
public class Vykdymas {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Iveskite kokia daugybos lentele norite gauti:");
        int n=in.nextInt();
        for (int i=1; i<20; i++){
            System.out.println(n+" */t " +i+" \t= "+(n*i));
        }
    }
}

import java.util.Scanner;
public class Vykdymas {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int y=0; y<10; y++) {
                if (i==4 || i==5 || i==y || i==9-y) {
               System.out.print(" "); 
            }else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
    in.close();
}
