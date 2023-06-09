package day5;

public class ThreadScheduling 
{
	
}

/*
 * Thread Scheduling
 * --scheduling is decided by os
 * --scheduling algorithm basically classified as 
 * 		preemptive 
 * 		-os interupts program without consulting them
 * 		-eg-win 95,win nt
 * 		non preemptive scheduling
 * 		-programs interrupted only when they are ready to yield control
 * 		-eg-sun solaris, win3.1
 * 
 * Thread Priority
 * -used by thread schedulerto decide when each thread should be allowed to run.
 * -threads with equal priority compete equally for cpu
 * -thread scheduler picks up the highest priority thread that is currently runnable.
 * -priority level range from 1(MIN_PRIORITY) to 10(MAX_PRIORITY)
 * - 5(NORM_PRIORITY) is the default priority level.
 * 
 * Threads Method
 * -start()
 * -sleep(long millisecond)
 * -join()
 * -yield()
 * -interrupt()
 * -interrupted()
 * -isAlive()
 * -currentThread()
 * 
 * Thread-join()
 * -a task can be split into more than one thread 
 * -some scenarios demands that a thread will start execution only after another 
 * 	thread has finished execution
 * -make the current thread wait till the other thread finishes the work
 * -can be done invoking the join method on target thread
 * 
 * Thred-yield()
 * -there can be multiple threads with same priority levels, waiting for their
 * 	time slice
 * -a thread can choose to give up its slice of time
 * -scheduler will pick another thread with same priority to execute
 * -yielding thread can be scheduled to be executed immediately
 * -can be done by invoking the static method yield.
 * 
 * wait()
 * -method of the object super class(Not class Thread)
 * -allows thread to wait inside a synchronised method
 * -when invoked, the current thread is blocked and gives up the object lock.
 * -waits to be notified by another thread of a change in this object.
 * -this lets another thread entry into the monitor.
 * 
 *  Necessitive for notify(), notifyall()
 *  -when a thread enters wait(), it has no way of unblocking itself.
 *  -if all threads wait, it leads to deadlocks
 *  -notify()-wakes up a single thread that is waiting.
 *  -this method shoud only be called by a thread that is the owner of the
 *  object's monitor.
 *  -notifyAll()-wakes up all threads that are waiting on this object.
 */
