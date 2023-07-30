package Java_Version_8.Functional_Interface;





//if two non-abstract methods present
//@FunctionalInterface
interface FuncInterface2 {
public void m1();

public void m2();

}
/*

CE: FuncInterface2.java:3: error: Unexpected @FunctionalInterface annotation
@FunctionalInterface
^
  FuncInterface2 is not a functional interface
    multiple non-overriding abstract methods found in interface FuncInterface2
 */

/*
If no any abstract method present under FI

@FunctionalInterface
interface FuncInterface2 {

}
CE error: Unexpected @FunctionalInterface annotation
@FunctionalInterface
^
  FuncInterface2 is not a functional interface
    no abstract method found in interface FuncInterface2

 */

/*
case 1 :- If an interface extends FI and child does not contain any abstract method,
then child interface is always FI

@FunctionalInterface
interface FuncInterface2 {
public void m1();
}

@FunctionalInterface
interface FuncInterface3 extends FuncInterface2 {

}

Valid one
Here the abstract method is consider for child interface also.
If parent interface is FI and child interface is FI and does not contain any new abstract method then it consider the parent one.

case 2 :- If the child interface we can define exactly same parent interface abstract method

@FunctionalInterface
interface FuncInterface2 {
public void m1();
}

@FunctionalInterface
interface FuncInterface3 extends FuncInterface2 {
public void m1();
}

valid one
if the child and parent have same abstract method with same name means it is acceptable.

case 3 :- If the child interface we can define any new abstract methods

@FunctionalInterface
interface FuncInterface2 {
public void m1();
}

@FunctionalInterface
interface FuncInterface3 extends FuncInterface2 {
public void m2();
}

invalid
CE - Unexpected @FI annotations, multiple non overriding abstract methods found in interface FuncInterface3.


case 4 :- If the child interface we can define any new abstract methods

@FunctionalInterface
interface FuncInterface2 {
public void m1();
}

interface FuncInterface3 extends FuncInterface2 {
public void m2();
}

valid one
second interface contains two abstract methods.

 */

