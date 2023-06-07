package ineuron.javaAssignment;

interface A{
	void a();//by default, public and abstract  
	void b();  
	void c();  
	void d();
	
	public static final int a=5;//Interface has only static and final variables.
}  
 //Interface supports multiple inheritance.
 //Creating abstract class that provides the implementation of one method of A interface  
abstract class B implements A{ 
	public void c(){
		System.out.println("I am C");
		}  
	}
//Creating subclass of abstract class, need to provide the implementation of rest of the methods  
class M extends B{  
	public void a(){
		System.out.println("I am a");
		}  
	public void b(){
		System.out.println("I am b");
		}  
	public void d(){
		System.out.println("I am d");
		} 
	
	int b; //Abstract class can have final, non-final, static and non-static variables.
	}
  
//Creating a test class that calls the methods of A interface  
public class Q5 {

	public static void main(String[] args) {
		A a=new M();  
		a.a();  
		a.b();  
		a.c();  
		a.d();

	}
}
