/* Intercommunication thread class */
class InterThread {
    int num;
    boolean valueSet = false;

    public synchronized void put(int num) {
        /* While valueSet is true, you should always wait
        (once value is put, do not immediately put again)
        Force end (terminate) execution with Ctrl+C */
        while (valueSet) {
            try { wait(); }
            catch (Exception e) {}
        }
        System.out.println("Put : " + num);
        this.num = num; // assign value
        valueSet = true;
        notify(); // notifies Consumer thread; requires method to be synchronized
    }
    public synchronized int get() {
        while (!valueSet) {
            try { wait(); }
            catch (Exception e) {}
        }
        valueSet = false;
        notify(); // awaken single thread waiting on object monitor

        return num; // retrieve value
    }
}

/* Produce new value on each run */
class Producer implements Runnable {
    InterThread no;

    public Producer(InterThread no) {
        this.no = no;
        Thread t = new Thread(this, "Producer"); // specify object, object name
        t.start(); // call run() method
    }
    public void run() {
        int counter = 0;
        while (true) {
            no.put(counter++); // on every run, increment value of num
            /* See value w/ try-catch block */
            try { Thread.sleep(1000); } // sleep() method belongs to thread class, but wait() belongs to object class
            catch (Exception e) {}
        }
    }
}

class Consumer implements Runnable {
    InterThread no;

    public Consumer(InterThread no) {
        this.no = no;
        Thread t = new Thread(this, "Consumer"); // specify object, object name
        t.start();
    }
    public void run() {
        while (true) {
            System.out.println("Get : " + no.get()); // read value
            /* See value w/ try-catch block */
            try { Thread.sleep(1000); }
            catch (Exception e) {}
        }
    }
}

class HelloWorld extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Hello World!");
            try { Thread.sleep(300); } catch (Exception e) {}
        }
    }
}
/* Functional interface implemented has only one method: run() */
class GoodbyeWorld implements Runnable {
    /* Instead of calling show() method call run() because start() method always calls run() method */
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Goodbye World!  " + Thread.currentThread().getPriority());
            /* We want to see multithread printing so instead we suspend thread with sleep() method */
            try { Thread.sleep(300); } catch (Exception e) {} // force pause for 300 milliseconds
            if(i == 5) System.out.println("Goodbye Cruel World!");
        }
    }
}

/*
*Multithread to fully utilize CPU power
*Main method by default is a thread
*Asynctask in Android, fast handling client requests and server responses
*Java web application servlets quick access
*Multithreading is crucial in gaming
*Class w/ run method specifies what thread does
*Start() method automatically calls run method
*Use sleep method to forcefully pause thread for set amount of time
*Implement Runnable interface to achieve multiple inheritance for multiple threads in a class
*Extend a thread class
*Single-purpose class contents can be placed within new Runnable() {} braces to create an anonymous class
*Functional interfaces accommodate usage of lambda expressions
*When two threads take the same action simultaneously (such as incrementing the same value) both threads
fetch value, but increment only once bc both threads increment simultaneously; fix w/ synchronized keyword,
applying it to your threads' drawn method to make it thread-safe (only one thread can use it at a time)
*
*/

public class Multithreading {
    public static void main(String[] args) throws Exception {
        HelloWorld obj1 = new HelloWorld();
        Runnable obj2 = new GoodbyeWorld();

        /* This calls run() method of thread itself, not our class' run() methods;
        can pass obj2 into new Thread object because GoodbyeWorld class implements Runnable */
        Thread t1 = new Thread();
        Thread t2 = new Thread(obj2);

        t2.setName("Thread-Goodbye"); // common practice is to name threads for later use
        t2.setPriority(4); // set thread priority to less important than default of 5, range of 1 to 10

        /* You may also use MIN_PRIORITY or MAX_PRIORITY
        t2.setPriority(MIN_PRIORITY);
        t1.setPriority(MAX_PRIORITY);
        */

        System.out.print(t1.getName());
        System.out.println(" Priority " + t1.getPriority());
        System.out.print(t2.getName());
        System.out.println(" Priority " + t2.getPriority());

        t1.start();
        t2.start();

        /* After creating two objects, we next call class methods show()
        Changing from show() to start(), both threads start simultaneously with a difference in
        milliseconds; for even execution we require a scheduler to pick up threads in an order
        rather than at random...or slightly different sleep() method time values,
        but use of thread priority setting is recommended */
        obj1.start();
        // obj2.start();

        /* Once t1 and t2 finish execution, proceed to next main thread lines */
        t1.join();
        t2.join();

        System.out.println(t2.isAlive()); // checks whether or not thread is still active
        System.out.println("\n" + "This is not the end...");

        InterThread no = new InterThread();
        new Producer(no);
        new Consumer(no);
    }
}
