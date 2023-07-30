package Java_Version_8.Functional_Interface;

import org.testng.annotations.Test;

interface interf {
    public void m1();
}

class AccessInnerClassVariable {
   // int x = 888;

    /*
    public void m2(){
        interf i = new interf() {
            int y = 999;//instance variable

            @Override
            public void m1() {
                System.out.println(this.y);//999
                System.out.println("class = "+AccessInnerClass.this.x);//888
            }
        };
        i.m1();
    }

    In Anonymous inner class this refers to inner class variable
    but in lambda expression this refers to outer class variables only
    because lambda exp internally object storage is not there but available in Anon inner class.

     public void m2(){
         interf i = () -> {
             int y = 999;//local variable
                 System.out.println(this.x);//888
                 System.out.println("class = "+AccessInnerClassVariable.this.x);//888
             };
         i.m1();
     }

     if We try to access both the variable inside LE means it will return the value, but
     if the local variable with in LE is consider as final if we are using
     if not using means it won't consider as final

     */
int x=10;
    public void m2() {
        int y = 20;//local variable
        interf i = () -> {

            System.out.println(x);//
            System.out.println(y);//
            x = 888;
            //y=999;//local variables referenced from a lambda expression must be final or effectively final
        };
        //LE block will be called as closure and the local variable value inside this block is freezed
        i.m1();
    }

    public static void main(String[] args) {
        AccessInnerClassVariable t = new AccessInnerClassVariable();
        t.m2();
    }
}
