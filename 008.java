/* OOP JAVA CHEAT SHEET

JAVA CLASS

class Test {
    // class body
    member variables
    methods
}

JAVA OBJECTS

Test t = new Test();

DEFAULT CONSTRUCTOR 

class Test {
    public static void main (String args[]) {
        Test testObj = new Test();
    }
}

Parameterized Constructor

public class Test {
    int appId;
    String appName;
    Test (int id, String name) {
        this.appId = id;
        this.appName = name;
    }
    void info() {
        System.out.println ("Id:"+appId"+ Name: "+appName);
    }
public static void main(String args[]) {
    Test obj1 = new Test(11001, "Facebook");
    Test obj2 = new Test(23003, "Instagram");
    obj.info();
    obj2.info();
}
}

MODIFIERS IN JAVA
Acess Modifiers

Scope                           Private    Default    Protected    Public
Same class                          +          +           +           +
Same package subclass               -          +           +           +
Same package non-subclass           -          +           +           +
Diferent package subclass           -          -           +           +
Different package non-subclass      -          -           -           -

Non-Acess Modifiers
Static      Makes the atribute depebds on class
Final       Once defined, doesn't allow any changes
Abstract    Makes the classes and methods abstract
Synchronized    Used to synchronize the threads

INHERITANCE

Single Inheritance

Class A {
    // parent class code
}
Class B extends A {
    // child class code
}

Multi Level Inheritance


Class A { 
    // parent class code
}

Class B extends A {
    // child class code
}
Class C extends B {
    // child class code
}

HYBRID INHERITANCE


A           OR    A
B  C              B
D     F         C   D

Herarchical Inheritance

Class A {
    // parent class code
}


Class B extends A {
    // child class code
}
Class C extends A {
    // child class code
}


MULTIPLE INHERITANCE

Class A {
    // parent class code
}

Class B {
    // parent class code
}

Class C extends A,D {
    // child class code
}

POLYMORPHISM

class Calculator {
    static int add (int a, int b) {
        return a+b;
    }
    static double add {double a, double b} {
        return a+b;
    }
    public static void main(String args[]) {
    System.out.println(Calculator.add(123,17));
    System.out.println(Calculator.add(13.3,1.9));
    }
}

RUN TIME POLYMORPHISM

public class Mobile{}
void sms()(System.out.println("mobile class");} }
public class OnePlus extends Mobile(
    void sms() {
        System.out.println("one plus class");
    }
    public static void main(String[] args) {
        OnePlus smsObj = new OnePlus();
        smsObj.sms();
    }
    }
}

ABSTRACTION

public abstract class MyAbstractClass {
    public abstract void abstractMethod();
    public void display(){
        System.out.println(Calculator.add("Concrete method");
    }
}

INTERFACE

public interface Bile {public void start(); }
class Honds implements Bike {
    public void start() {
        System.out.println("Honda Bike"); 
    }
}

class Apache implements Bike {
    public void start() {
        System.out.println("Apache Bike"); 
    }
}
class Rider implements Bike {
    public static void main (String args[]) {
        Bike b1=new Honds();
        b1.start();
        Bike b2=new Apache();
        b2.start();
    }
}

*/