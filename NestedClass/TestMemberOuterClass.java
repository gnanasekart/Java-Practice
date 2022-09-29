package NestedClass;


/*
 
 Types-
  
1. Member Inner Class	- A class created within class and outside method.
2. Anonymous Inner Class - A class created for implementing an interface or extending class. 
						   The java compiler decides its name.
3. Local Inner Class - A class was created within the method.
4. Static Nested Class - A static class was created within the class.
5. Nested Interface	- An interface created within class or interface.
  
Syntax:
OuterClassReference.new MemberInnerClassConstructor(); 



 */
public class TestMemberOuterClass
{  
	private final int data=30;
	class Inner
	{  
		void msg(){
			System.out.println("data is "+data);
			}  
	}  
	public static void main(String[] args)
	{  
		TestMemberOuterClass obj=new TestMemberOuterClass();  
		TestMemberOuterClass.Inner in=obj.new Inner();  
		in.msg();  
	}  
}  

/*
 * 
 * 
 * 
Internal code generated by the compiler

import java.io.PrintStream;  
class Outer$Inner  
{  
    final Outer this$0;  
    Outer$Inner()  
    {   super();  
        this$0 = Outer.this;  
    }  
    void msg()  
    {  
        System.out.println((new StringBuilder())
        			.append("data is ")  
                    .append(Outer.access$000(Outer.this))
                    .toString());  
    }  
}  
*/
