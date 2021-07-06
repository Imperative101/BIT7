/* funkcijas rekursijas

public class Loopas {
public static void main(String[] args) {
for(int i = 0;i<6;i++) {
System.out.println("i reikšmrė pirmame loop: "+i);
System.out.println();
for(int j = 0; j<3; j++) {
System.out.println("j reikšmrė antrame loop: "+j+" i reikšmė:"+i );
System.out.println();
}
}
}
}


public class vykdymas {
    public static int daugink (int x, int y) {
        if (y==1) return x;
        return x+daugink(x,y-1);
    }
    public static void main(String[] args) {
        System.out.println (daugink(8,10));
    }
}



public class vykdymas {
    public static int daugink (int x) {
        if (y==1) return x;
        return x+daugink(x,y-1);
    }
    public static int laipsniu (int x, int n) {
        if (n==1) return x;
        return x*laipsniu(x, n-1)*x;
    }
    public static void main(String[] args) {
        System.out.println (daugink(5,3));
    }
}


public class vykdymas {
    public static int skSuma (int x) {
        if (x==1) return 0;
        return skSuma(x/10) + x%10;
    }
    public static void main(String[] args) {
        System.out.println (skSuma(321456));
    }
}

public class vykdymas {
    public static void isvedimas(int x) {
        if (x!=0) {
        System.out.println (x%10+" ");
        return skSuma(x/10);
    }
}
     public static void main(String[] args) {
        isvedimas (skSuma(321));
    }
}



import java.util.scanner;
public class Failai {
    public static void isvedimas(file f) {
    String[] names=f.list();
    for (int i=0; i<names.length; i++ ) {
        System.out.println(names[i]);
        new File("C:/htdocs/ais"+"/"+"ais.sql")
    }
    }
    public static void main(String[] args) throws FileNotFoundException {
        isvedimas (new File("C:/htdocs/ais"));
    }
}




public class Failai {

public static void isvedimas(File f) {
String[] names=f.list();
for (int i=0; i<names.length; i++) {
System.out.print(f.getAbsolutePath()+"\\"+names[i]);
File fi=new File(f.getAbsolutePath()+"/"+names[i]);
System.out.println();
if (fi.isDirectory()) {
System.out.println("[katalogas]");
isvedimas(fi);
}
}
}

public static void main(String[] args) throws FileNotFoundException {
isvedimas(new File("C:/htdocs/ais"));
}
}







package pirma;

import java.util.Scanner;

public class Vykdymas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ilgis, plotis;
        double kaina, suma;
        System.out.print("Iveskite ilgi, ploti ir kaina: ");
        ilgis=in.nextInt();
        
        //System.out.print("Iveskite ploti: ");
        plotis=in.nextInt();
        
        //System.out.print("Iveskite kaina: ");
        kaina=in.nextDouble();
        
        suma=ilgis*plotis*kaina;
        System.out.println("Viso kainuos "+suma);
        
        in.close();
        /*
        Scanner in = new Scanner(System.in);
        int x, y, ats;
        
        System.out.print("Iveskite x: ");
        x=in.nextInt();
        
        System.out.print("Iveskite y: ");
        y=in.nextInt();
        
        ats= x + y;
    
        System.out.print("Suma: "+ats);
        
        in.close();
        */
        
        /*
        Scanner in = new Scanner(System.in);
        
        System.out.print("Iveskite x: ");
        int    x=in.nextInt();
        
        System.out.print("Iveskite y: ");
        int    y=in.nextInt();
        
        int ats= x + y;
    
        System.out.print("Suma: "+ats);


public class eurai {
    public static boolean pirminis (int x) {
        boolean pirminis=true;
        for (int i=2; i<x; i++) {
            if(num % 2 == 0)
            System.out.println(num + " pirminis");
       		 else
            System.out.println(num + " ne pirminis");
            }
        }
        return pirminis;
    }
    public static void main (string[] args) {
        Scanner in=new Scanner (System.in);
        int i=in.nextInt();
        if (pirminis(i) ) {
system.out.println("skaicius pirminis");
        } else {
system.out.println("skaicius nepirminis");
        
    }
}

pirminis nepirminis




public class masyvai {
    public static int[] add(int[] m, int data) {
        int[] t= new int[m.length+1];
        for (int i=0; i<m.length; i++) {
            t[i]=m[i];
        }
        t[t.length-1]=data;
        return t;
    }
    public static int[] del(int[] m,int index) {
            int[] t = new int [m.length-1];
            return t;
    }
    public static void main (string[] args) {
        int [] m = {3,7};
        system.out,println (arrays.to string(m));
    }
}

istrinti prideti

public class masyvai {
    public static int[] add(int[] m, int data) {
        int[] t= new int[m.length+1];
        for (int i=0; i<m.length; i++) {
            t[i]=m[i];
        }
        t[t.length-1]=data;
        return t;
    }
    public static int[] del(int[] m,int index) {
            int[] t = new int [m.length-1];
            t[i]=m[i];
    }


for (int i=index; i<t.length; i++)
t [i] = m[i+1];
}
return t;
    public static void main (string[] args) {
        int [] m = {3,7};
        system.out,println (arrays.to string(m));
    }
}


public static int[] add(int[] m,int data) {
int[] t = new int [m.length+1];
for (int i=0; i<m.length; i++) {
t[i]=m[i];
}
t[t.length-1] = data;
return t;
}

public static int[] del(int[] m, int index) {
int [] t = new int[m.length-1];
for (int i=0; i<index;i++) {
t[i]=m[i];
}
for (int i=index; i<t.length; i++) {
t[i] = m[i+1];
}

return t;
}



public static void main(String[] args) {
int [] m = {3,7};

System.out.println(Arrays.toString(m));
m = add(m,8);
m = add(m,7);
m = del(m,2);
System.out.println(Arrays.toString(m));
}




Scanner in=new Scanner(System.in);
do{
System.out.print("Iveskite du skaicius:");
int x=in.nextInt();
int y=in.nextInt();
System.out.println("Padalinti skaiciai:"+(double)x/y);
System.out.print("Ar testi programa(T/N):");
char a=in.next().charAt(0);
while (a=="T" || a=="t");
}

Scanner in=new Scanner(System.in);
do{
System.out.print("Iveskite du skaicius:");
int x=in.nextInt();
int y=in.nextInt();
System.out.println("Padalinti skaiciai:"+(double)x/y);
} catch (InputMismatchException e) {
System.out.println("Ivestas neteisingas skaicius");
} catch (AritmeticException e) {
System.out.println("Dalyba is 0 negalima");
}catch (Esception e) {
System.out.println("Ivyko nenustatyta klaida");
}
System.out.print("Ar testi programa(T/N):");
a=in.next().charAt(0);
while (a=="T" || a=="t");
}


public static void isvedimas (File f) {
String [] names=f.list();
for (int i=0; i<names.length; i++) {
System.out.print(f.getAbsolutePath()+"\\"+names[i]);
File fi=new File(f.getAbsolutePath()+"/"+names[i]);
if (fi.isDirectory()) {
System.out.print("[katalogas]");
String[] subNmaes=fi.list();
for (int y=0; y<subNmaes.length; y++) {
System.out.print(f.getAbsolutePath()+"\\"+names[y]);
}
}
System.out.println();
}
}
public static void main(String[] args) throws FileNotFoundException {
isvedimas(new File("C:/htdocs/ais"));
}

        */

