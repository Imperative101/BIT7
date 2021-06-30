 /* 
 PYTHON EQUAL JAVA
 
//1. hello world


java:

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}

python:

print("Hello, World!")



// 2.equality

java:




python:

if 5 > 2:
  print("Five is greater than two!")



public class Main {
  public static void main(String[] args) {
    if (5 > 2) {
      System.out.println("Five is greater than two!"); // obviously
    }  
  }
}



// 3. variables in java

int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte


4. string

public class Main {
  public static void main(String[] args) {
    String greeting = "Hello";
    System.out.println(greeting);
  }
}

python:

print("Hello")


strings


txt = "The best things in life are free!"
if "free" in txt:
  print("Yes, 'free' is present.")


public class Main {
  public static void main(String[] args) {
    String txt = "The best things in life are free!";
    System.out.println("Yes, 'free' is present: " + txt.length());
  }
}



greather than python:

a = 200
b = 33

if b > a:
  print("b is greater than a")
else:
  print("b is not greater than a")



public class Main {
  public static void main(String[] args) {
    int a = 200;
    int b = 33;
    if (a > b) {
      System.out.println("b is greater than a.");
    } else {
      System.out.println("b is not greater than a.");
    }  
  }
}

// 5. true/false

public class Main {
  public static void main(String[] args) {
    boolean isJavaFun = true;
    boolean isFishTasty = false;    
    System.out.println(isJavaFun);
    System.out.println(isFishTasty);
  }
}

def myFunction() :
  return True

if myFunction():
  print("YES!")
else:
  print("NO!")


// 6.  WHILE LOOP - pyhton

i = 1
while i < 6:
  print(i)
  i += 1

1
2
3
4
5

public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }  
  }
}

​
0
1
2
3
4


or

public class Main {
  public static void main(String[] args) {
    int i = 0;
    do {
      System.out.println(i);
      i++;
    }
    while (i < 5);  
  }
}


6. for loop
0 2 4 6 8 10

public class Main {
  public static void main(String[] args) {
    for (int i = 0; i <= 10; i = i + 2) {
      System.out.println(i);
    }  
  }
}

python:



for x in range(0, 10, 2):
  print(x) 


  list:

public class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);
    }    
  }
}


fruits = ["apple", "banana", "cherry"]
for x in fruits:
  print(x) 



7. arrays

public class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(cars[0]);
  }
}

output: volvo

python:
cars = ["Ford", "Volvo", "BMW"]
cars[0] = "Toyota"
print(cars)





tasks to 2021.06.29

PLOTIS
IN JAVA

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


PLOTIS
IN PYTHON

l=int(input("Length : "))
w=int(input("Width : "))
g=int(input("Price : "))
area=l*w
perimeter=2*(l+w)
double price=g * w * 1.05
print("Area of Rectangle : ",area)
print("Perimeter of Rectangle : ",perimeter)
 


pyhon even or odd number:

num = int(input("Enter a number: "))  
if (num % 2) == 0:  
   print("{0} is Even number".format(num))  
else:  
   print("{0} is Odd number".format(num))  


   8. switch in java and in python

   public static void switch_demo(String[] args) {
 
        int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
}


def switch_demo(argument):
    switcher = {
        1: "January",
        2: "February",
        3: "March",
        4: "April",
        5: "May",
        6: "June",
        7: "July",
        8: "August",
        9: "September",
        10: "October",
        11: "November",
        12: "December"
    }
    print switcher.get(argument, "Invalid month")



BOOLEAN ARRAY IN JAVA VS LIST IN PYTHON


// Creates a boolean array of a specified size with true values at prime indices and
  false values at composite indices.

private static boolean[] sieve(int size){
    boolean[] array = new boolean[size];

    //Assume all numbers greater than 1 are prime//
    for(int i = 2; i < array.length; i++){ 
        array[i] = true;
    }

    //Execute Sieve of Eratosthenes algorithm//
    for(int p = 2; p < size; p = nextPrimeInArray(array, p)){ 
        for(int i = p + p; i < size; i += p){
            array[i] = false; // i.e., mark as composite
        }
    }

    return array;
}

 Finds the next index in the array that is not marked composite
 
public static int nextPrimeInArray(boolean[] array, int p){

    do{
        p++;
    }while(p < array.length && !array[p]);
    return p;
}
PYTHON:

def getPrimeList(limit):
    """returns a list of True/False values, where list[i] is True if i is prime and False otherwise"""
    primes = []

    # Initially assume all numbers in the list are prime
    for i in range(limit):
        primes.append(True)

    # Set 0 and 1 to False
    primes[0] = False
    primes[1] = False

    for p in range(2, limit):
        for i in range(p + p, limit, p):
            primes[i] = False
        p = nextPrimeInList(primes, p)
    return primes

def nextPrimeInList(list, p):
    """Helper method for getPrimeList that finds the next index in list not marked composite"""
    p += 1
    while p < len(list) and not list[p]:
        p += 1
    return p



 */

