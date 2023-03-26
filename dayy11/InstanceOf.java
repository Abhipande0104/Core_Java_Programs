package dayy11;

public class InstanceOf {

}

/*
 * INSTANCE OF OPERATOR		(RUN TIME TYPE IDENTIFICATION)
 * 
 * Why instanceOf() operator
 * -identifying dynamic data type of an object
 * -to access objects polymorphically
 * 
 * Java runtime keeps track of the class to which each object belongs
 * This information is used by java to select the correct methods to 
 * execute at run time
 * 
 * Employee emp=new Manager();
 * if(emp instanceof Manager )
 * {
 * 		//cal/ to the method
 * }
 * 
 * 
 * 
 * 
 * Final
 * 
 * --Final variable specifies that a variable is not modifiable; any attempt 
 * do so flags error.
 * --If a final variable is a ref to object , it is the ref that must stay the 
 * same, not the object
 * --final variables must be initialized
 * 
 * Final method and Final class
 * 
 * -- a final method can not be overridden in a subclass
 * -- private methods are implicitly final
 * -- a class declared as final can not be sub-classed
 * -- every method of a final class is by default final
 * 
 * Object Class
 * --object class is cosmic super class
 * --every class in java implicitly extends object
 * --a variable of type object can be used to refer to object of any type 
 * --available in java.lang package
 * 
 *  Object obj= new Employee();
 * 
 * 
 */
