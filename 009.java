/* 
ITPROGER 
JAVA

CLASS + OBJECT


package com.company;
public class Person {
    int height = 180;
    public void say() {
        System.out.println("Hello," + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person vitya = new Person();
        vitya.height = 120;
        vitya.say("George");
        System.out.println(vitya.height);
        Person vlad = new Person();
        System.out.println(vlad.height);
    }
}

CONSTRUCTOR

package com.company;
public class Person {
    public int height = 180;
    public String name="Default";
    public void say() {
        System.out.println("Hello," + name);
    }

 public Person () {}

    public Person (int h, String n) {
        height = h;
        name = n;
          
    }
    public Person (String n) {
        name = n;
    }
}

public class Main {
    public static void main(String[] args) {
        Person vitya = new Person(120, "Vitya");
        vitya.say("George");
        System.out.println(vitya.name + "\' height is" + vitya.height);
        Person vlad = new Person(180);
        System.out.println(vlad.height);
    }
}

INHERITANCE

package com.company;
public class Person {
    public int height = 180;
    public String name="Default";

    public void say(String name) {
        System.out.println("Hello," + name);
    }

 public Person () {}

    public Person (int h, String n) {
        height = h;
        name = n;
          
    }
    public Person (String n) {
        name = n;
    }
}

// наследование 
(create new class file)

public class Student extends Person{
    int course = 1;

}

public class Freshmen extends Person{
    int course = 1;
    void tell ( ) {
        System.out.println(super.name);
    }
}

*/