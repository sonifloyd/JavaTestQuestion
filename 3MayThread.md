public class MyRunnable implements Runnable 
{
    public void run() 
    {
        // some code here
    }
}
which of these will create and start this thread?
A.	new Runnable(MyRunnable).start();
B.	new Thread(MyRunnable).run();
C.	new Thread(new MyRunnable()).start();	@
D.	new MyRunnable().start();
 ans c - Because the class implements Runnable, an instance of it has to be passed to the Thread constructor, 
and then the instance of the Thread has to be started.

A is incorrect. There is no constructor like this for Runnable because Runnable is an interface, and
it is illegal to pass a class or interface name to any constructor.

B is incorrect for the same reason; you can't pass a class or interface name to any constructor.

D is incorrect because MyRunnable doesn't have a start() method, and the only start() method that can start
a thread of execution is the start() in the Thread class.
# Which class or interface defines the wait(), notify(),and notifyAll() methods?
 ans -The Object class defines these thread-specific methods.
 # Which of the following will not directly cause a thread to stop?

 ans -A.	notify()	@
B.	wait()
C.	InputStream access
D.	sleep()
Answer: Option A

Explanation:

Option A is correct. notify() - wakes up a single thread that is waiting on this object's monitor.

Option B is wrong. wait() causes the current thread to wait until another thread invokes the notify() method or 
the notifyAll() method for this object.

Option C is wrong. Methods of the InputStream class block until input data is available, the end of the stream is 
detected, or an exception is thrown. Blocking means that a thread may stop until certain conditions are met.

Option D is wrong. sleep() - Causes the currently executing thread to sleep (temporarily cease execution) for 
a specified number of milliseconds. The thread does not lose ownership of any monitors.
# Which method registers a thread in a thread scheduler?

A.	run();
B.	construct();
 ans C.	start();
D.	register();
Answer: Option C

Explanation:

Option C is correct. The start() method causes this thread to begin execution; the Java Virtual Machine calls the 
run method of this thread.

Option A is wrong. The run() method of a thread is like the main() method to an application. Starting the thread 
causes the object's run method to be called in that separately executing thread.

Option B is wrong. There is no construct() method in the Thread class.

Option D is wrong. There is no register() method in the Thread class.
# Which two of the following methods are defined in class Thread?

start()
wait()
notify()
run()
terminate()
A.	1 and 4
B.	2 and 3
C.	3 and 4
D.	2 and 4
Answer: Option A

Explanation:

(1) and (4). Only start() and run() are defined by the Thread class.

(2) and (3) are incorrect because they are methods of the Object class. 
(5) is incorrect because there's no such method in any thread-related class.
# Which three guarantee that a thread will leave the running state?

 1.yield()
2. wait()
3. notify()
4. notifyAll()
5. sleep(1000)
6. aLiveThread.join()
7. Thread.killThread()
A.	1, 2 and 4
B.	2, 5 and 6
C.	3, 4 and 7
D.	4, 5 and 7
Answer: Option B

Explanation:

(2) is correct because wait() always causes the current thread to go into the object's wait pool.

(5) is correct because sleep() will always pause the currently running thread for at least the duration specified in the sleep argument (unless an interrupted exception is thrown).

(6) is correct because, assuming that the thread you're calling join() on is alive, the thread calling join() will immediately block until the thread you're calling join() on is no longer alive.

(1) is wrong, but tempting. The yield() method is not guaranteed to cause a thread to leave the running state, although if there are runnable threads of the same priority as the currently running thread, then the current thread will probably leave the running state.

(3) and (4) are incorrect because they don't cause the thread invoking them to leave the running state.

(7) is wrong because there's no such method.
# Which of the following will directly stop the execution of a Thread?

A.	wait()	@
B.	notify()
C.	notifyall()
D.	exits synchronized code
Answer: Option A

Explanation:

Option A is correct. wait() causes the current thread to wait until another thread invokes the notify() method or 
the notifyAll() method for this object.

Option B is wrong. notify() - wakes up a single thread that is waiting on this object's monitor.

Option C is wrong. notifyAll() - wakes up all threads that are waiting on this object's monitor.

Option D is wrong. Typically, releasing a lock means the thread holding the lock (in other words, the thread 
currently in the synchronized method) exits the synchronized method. At that point, the lock is free until some
other thread enters a synchronized method on that object. Does entering/exiting synchronized code mean that the thread 
execution stops? Not necessarily because the thread can still run code that is not synchronized. I think the word directly
in the question gives us a clue. Exiting synchronized code does not directly stop the execution of a thread.
# Which method must be defined by a class implementing the java.lang.Runnable interface?

A.	void run()
B.	public void run()
C.	public void start()
D.	void run(int priority)
Answer: Option B

Explanation:

Option B is correct because in an interface all methods are abstract by default therefore they must be overridden by 
the implementing class. The Runnable interface only contains 1 method, the void run() method therefore it must be 
implemented.

Option A and D are incorrect because they are narrowing the access privileges i.e. package(default) access is narrower
than public access.

Option C is not method in the Runnable interface therefore it is incorrect.
# Which will contain the body of the thread?

A.	run();	@
B.	start();
C.	stop();
D.	main();
Answer: Option A

Explanation:

Option A is Correct. The run() method to a thread is like the main() method to an application. Starting the
thread causes the object's run method to be called in that separately executing thread.

Option B is wrong. The start() method causes this thread to begin execution; the Java Virtual Machine calls the 
run method of this thread.

Option C is wrong. The stop() method is deprecated. It forces the thread to stop executing.

Option D is wrong. Is the main entry point for an application.
# What is the name of the method used to start a thread execution?

A.	init();
B.	start();	@
C.	run();
D.	resume();
Answer: Option B

Explanation:

Option B is Correct. The start() method causes this thread to begin execution; the Java Virtual Machine calls the 
run method of this thread.

Option A is wrong. There is no init() method in the Thread class.

Option C is wrong. The run() method of a thread is like the main() method to an application. Starting the thread causes 
the object's run method to be called in that separately executing thread.

Option D is wrong. The resume() method is deprecated. It resumes a suspended thread.
# Which two are valid constructors for Thread?

Thread(Runnable r, String name)
Thread()
Thread(int priority)
Thread(Runnable r, ThreadGroup g)
Thread(Runnable r, int priority)
A.	1 and 3
B.	2 and 4
C.	1 and 2
D.	2 and 5
Answer: Option C

Explanation:

(1) and (2) are both valid constructors for Thread.

(3), (4), and (5) are not legal Thread constructors, although (4) is close. If you reverse the arguments in (4),
you'd have a valid constructor.
# Which three are methods of the Object class?

1. notify();
2. notifyAll();
3. isInterrupted();
4. synchronized();
5. interrupt();
7. 6. wait(long msecs);
8. sleep(long msecs);
9. yield();
A.	1, 2, 4
B.	2, 4, 5
C.	1, 2, 6	@
D.	2, 3, 4
Answer: Option C

Explanation:

(1), (2), and (6) are correct. They are all related to the list of threads waiting on the specified object.

(3), (5), (7), and (8) are incorrect answers. The methods isInterrupted() and interrupt() are instance methods of Thread.

The methods sleep() and yield() are static methods of Thread.

D is incorrect because synchronized is a keyword and the synchronized() construct is part of the Java language.
# 
Class X implements Runnable 
{ 
    public static void main(String args[]) 
    {
        /* Missing code? */
    } 
    public void run() {} 
}
Which of the following line of code is suitable to start a thread ?
A.	Thread t = new Thread(X);
B.	Thread t = new Thread(X); t.start();
 ans -C.	X run = new X(); Thread t = new Thread(run); t.start();
D.	Thread t = new Thread(); x.run();
# Which cannot directly cause a thread to stop executing?

A.	Calling the SetPriority() method on a Thread object.
B.	Calling the wait() method on an object.
C.	Calling notify() method on an object.
D.	Calling read() method on an InputStream object.
Answer: Option C

Explanation:

Option C is correct. notify() - wakes up a single thread that is waiting on this object's monitor.















