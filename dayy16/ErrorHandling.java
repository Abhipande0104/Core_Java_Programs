package dayy16;

public class ErrorHandling 
{
	
}

/*
 * Logical Errors
 *  -counter not incremented in the while loop
 *  -wrong expressions written resulting in correct output
 *  
 * Run time errors
 *  -division by zero
 *  -array out of bound
 *  -dynamic memory allocation failed
 *  -file not found
 *  -file is corrupted
 *  
 *  
 *  Limitations of procedural way of error handling
 *  
 *  --the error message can not be customized\
 *  --returned error code needs to be checked again
 *  --  if the returned error value is same as the data, there is a conflict
 *  --business logic and error handling code are not separate
 *  
 *  requirements
 *  -name of the error, error message and information regarding the error is
 *  bundled as one unit
 *  -easier to program and extend
 *    not complicated like if-else or switch case
 *  -business logic and error handling code should be separated 
 *  
 *  
 *  
 *  EXCEPTIONS
 *  
 *  -the errors that occur during the execution of a program are called
 *  run time error exceptions
 *  
 *  example
 *  division by zero
 *  access to array outside its bound
 *  stack overflow
 *  file not found
 *  data entered is not in correct format
 *  invalid type casting is done
 *  
 *  
 *  
 *  exception hierarchy
 *  --in java, exception is represented by an object of exception class type
 *  
 *  throwable(java.lang)
 *  		exception(java.lang)	error(java.lang)
 *  runtime exception(java.lang)		io exception(java.io)
 *  
 *  declare the error
 *  
 *  -to identify the potential errors
 *  two types
 *  	checked exception
 *  	this type of exception occur due to problem with resources or system setting
 *  		FileNotFoundException
 *  
 *  	unchecked exception
 *  	these type of exceptions occur due to programmers mistake
 *  	this is also called run time exception
 *  		NullPointerException
 */
