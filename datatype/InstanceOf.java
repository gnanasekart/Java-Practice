/*
In Java, all the classes are inherited from the Object class. 
The extends keyword is not used during the inheritance of the Object class. 
This inheritance happens implicitly in Java.

class Animal
{
}
class Dog
{
}
class cat
{}

class InstanceOf
{
public static void main(String []args)
{
Dog d1 = new Dog();
System.out.println("dog: " +(new Dog() instanceof Object));
System.out.println("cat: " +(new cat() instanceof Object));
}}
 */


/* object casting
In Java, an object of a subclass can be treated as an object of the superclass. 
This is called upcasting.
Java compiler automatically performs upcasting.

class Animal
{
public void showIt()
{
System.out.println("nothing to show");
}
}
class Dog extends Animal
{
}

class InstanceOf
{
public static void main(String []args)
{
Dog d = new Dog();
Animal a = d;
a.showIt();
}
}
 */
/*
This downcasting will shows error
class Animal
{
}
class Dog
{
public void show()
{
System.out.println("nothing to show");
}
}
class InstanceOf
{
public static void main(String []args)
{
Animal a1 = new Animal();
Dog d1 = (Dog)a1;
d1.show();
}
}
 */

/*
class Animal
{
}

class Dog extends Animal
{
public void show()
{
System.out.println("nothing");
}
}
class InstanceOf
{
public static void main(String []args)
{
Dog d = new Dog();
Animal a = d;
if(a instanceof Dog)
{
Dog d = (Dog)a;//Downcasting
a.show();
}
}
}*/