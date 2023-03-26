package day4;

public class note 
{

}
/*
 * static variables in memory
 * 
 *  shared by all objects
 *  					count
 *  
 *  
 *  	empId			empId		empId 
 *  	eName			eName		eName
 *  	 e1				 e2			 e3
 *  
 *  only single copy exists
 *  
 *  static methods can access static data members of a class only
 *  static method is invoked using class name
 *  <class name>.<method name>()
 *  reference 'this' is never passed to a static method
 *  
 *  static initialization block
 *  
 *  arbitrary blocks of code
 *  executed when class is loaded
 *  used for initializing static variables
 *  a class can have more than one static blocks
 *  If more than one static block exists in a program then called in the order they 
 *  appear in the source code.
 *  
 *  static
 *  {
 *  	//manipulation of static variables
 *  }
 *  
 *  
 *  
 *  public static void main
 *  
 *  main() is static method and called before instantiation of the class
 *  since, it is static, it is automatically invoked by the startup code
 *  it is the entry point of the class
 *  classLoader will load the class and then search for main method
 *  to enter into the class , so main is declared as static
 *  so classname.main(------)
 *  
 *  
 *  variables in java
 *  
 *  class variables
 *  	copy created per class
 *  	 static variables
 *  instance variables
 *  	copy created per instance of the class
 *  local variables
 *  	occur within methods and block
 *  	copy created per method call
 *  	 if used must be initialized or compiler complains
 *  
 *   
 *   
 *   Structure of memory
 *   
 *   					memory
 *   					data segment
 *   					stack area  --local variables
 *   					heap area   --dynamically allocated variables
 *   					data section  --global and static variables
 *   					code segment
 *   
 *   
 *   create an object
 *   
 *   public static void main(String [] args)
 *   {
 *   	MyDate d;
 *   	d= new MyDate();
 *   
 *   	MyDate d = new MyDate();
 *   }
 *   
 *   objects always created on heap.
 */
