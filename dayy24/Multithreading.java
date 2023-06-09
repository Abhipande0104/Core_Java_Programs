package day4;

public class Multithreading {

}

/*
 * Demystifying Multi 
 * 
 * Multi-Processor
 * 	a system that is built using multiple processors for performing a task
 * 
 * Multi-Task
 * 	an approach where multiple tasks get executed by one or more processors
 * 
 * Multi-Process
 * 	a concrete implementation of multi-tasking
 * 
 * Multi-Threading
 * 	to execute program in thread.
 * 	
 * 
 * 
 * Multiprocessing
 * -a process is program in execution
 * -a processor can execute multiple processes simultaneously
 * 		WinAmp-listening songs
 * 		WinWord-creating documents
 * -CPU executed each process for a predefined time before switching to 
 * another process
 * -each process has data associated with it
 * 
 * Thread need
 * -program is a sequential execution of logical modules grouped together.
 * -module execution depends on successful completion of earlier module
 * -One rogue module (time consuming) can hold up innocent victims (other modules).
 * 
 * Thread
 * -not all modules are dependent on earlier modules
 * -while the system respond to a modules request, CPU remains idle.
 * -this idle time can be utilised by queuing up other tasks of the process with CPU.
 * -such independent intra-process executions are called as threads.
 * 
 * -a thread is a lightweight, smallest unit of processing.
 * -a process is made up of multiple threads
 *  -each thread has its own stack(runtime stack) to handle its data
 *  -a thread shares the memory space with other threads of the same process
 *  
 * -when to use multi-threading
 *  -performing operations that take a large amount of time
 *  -prioritizing of tasks
 *  -application shas to wait for some event to occur
 *  
 *  Threads- Context Switch
 *  -switching between threads is controlled by the OS
 *  -while switching thread-specific data needs to be stored
 *  -threads share same memory space, context switch lightweight(comparatively).
 *  
 *  Thread life cycle methods
 *  run
 *  -mandatory override, contains thread execution code.
 *  start 
 *  -intimates the scheduler that thread is ready to run.
 *  sleep
 *  -makes currently executing thread stop execution for specified millliseconds
 */
