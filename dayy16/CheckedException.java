package dayy16;

public class CheckedException {

}
/*
 * Checked Exception
 * -java compiler checks whether exception is handled or
 * reported by a method
 * -method from within which exception is thrown must handle
 *  such a exception
 * -if method itself does not handle then that method must report such a 
 * exception to its caller method so that caller can handle
 * -compile time checking exception
 * -exception and all its subclasses except runtime exception are checked exception
 * -FileNotFoundException
 * 
 *  Unchecked Exception
 *  -Java compiler does not check whether exception is 
 *  handled or reported by a method
 *  -Method from within which exception is thrown need not handle such a exception
 *  -method need not report such a exception to its caller method, if itself does 
 *  not handle
 *  -not compile time checking exception
 *  -run time exception and is all its subclasses are unchecked exception
 *  -ArithmeticException
 *  
 *  JAVA EXCEPTION CLASSES
 *  Checked Classes
 *  	IOException
 *  	FileNotFoundException
 *  	ClassNotFoundException
 *  	MalformedURLException
 *  	SQLException
 *  	InterruptedException
 *  	EOFException
 *  
 *  Unchecked classes
 *  	Arithmetic
 *  	NullPointer 
 *  	ArrayIndexOutOfBounds
 *  	IndexOutOfBounds
 *  	ClassCast
 *  
 *  Identify the block of Code-try block
 *  try
 *  	code is executed assuming that there are no errors
 *  	if some error is expected in the code, it is enclosed in 'try' block
 *  
 *  catch
 *  	if error occur in the try block, handling of error should b done 
 *  	using catch block
 *  	catch block can take parameter of exception class type only
 *  	catch block must follow try block
 */
