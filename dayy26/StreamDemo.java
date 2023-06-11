package day6;

public class StreamDemo
{
	
}

/*
 * STREAM
 * 
 * InputStream- this depicts the flow of bytes from data source to the program memory
 * OutputStream- this depicts the flow of bytes from the programs memory to the
 * 	destination data store.
 * Java views these streams in terms of object that will perform different operations 
 *  on the streams through their method calls.
 * 2 basic operations involved are
 * -read from input stream
 * -write to output stream
 * 
 * File class
 * -an abstract representation of file and directry pathnames
 * -models an os dir entry, enabling you to access info about a file.
 * -objects of file do not actually opens a file or provide any file processing
 * 	capabilities
 * -file objects are used to do all operations related to files and directories
 * 
 * File class methods
 * 
 * public boolean canRead()
 * 		tests whether the application can read the file
 * 
 * public boolean isAbsolute()
 * 		tests whether the abstarct pathname is absolute
 * 
 * public boolean exists()
 * 		test whether the file or directry denoted exists
 * 
 * public long length()
 * 		returns the length of file
 * 
 * public boolean delete()
 * 		deletes the file or directory
 * 
 * public boolean createNewFile()
 * 		creates new empty file only if file does not exists
 * 
 * public boolean mkdir()
 * 		creates new empty folder only if file does not exists
 * 
 * FileInputStream class
 * --this class helps to open a file in read mode
 * --throws FileNotFoundException, if file does not exist
 * --int read() method to read next byte of data
 * --terminates reading if end of streanm is reached
 * 
 * FileOutputStream class
 * --this class helps to open a file in write or append mode
 * --creates a file, if does not exists
 * --write(int b) method to write next byte of data
 * 
 * RandomAccessFile class
 * --this class helps to find or write data anywhere in a file
 * --a randomAccessFile has a file-pointer
 * --the file pointer indicates the position of the next record that will be read or 
 * 	written
 * 
 * Serialization- need for persistent objects
 * 
 * -persistance- storing the state of an object
 * -reason-for futyre reuse
 * -serialization is the process of writing objects to stream and reading them back
 * -to be serialised, your objects must implement the serializable interface
 * -serializable interface is marker interface 
 * 
 * 
 */
