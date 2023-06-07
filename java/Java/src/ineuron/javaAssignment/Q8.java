package ineuron.javaAssignment;

class EvenOddRunnable implements Runnable{  
    int MAX;  
    static int  counter = 1;  
    int rem;  
    static Object lock = new Object();  
     
    EvenOddRunnable(int rem, int MAX)  
    {  
        this.rem = rem;  
        this.MAX = MAX;  
    }    
    @Override  
    public void run() {  
         
        while (counter < MAX) {  
            
            synchronized (lock) {  
                while (counter % 2 != rem) {
                    try {  
                        lock.wait();  
                    } catch (InterruptedException e) {  
                        e.printStackTrace();  
                    }  
                }  
                System.out.println(Thread.currentThread().getName() + " " + counter);  
                
                counter++;  
                lock.notifyAll();  
            }  
        }  
    }  
}  

public class Q8 {
	public static void main(String[] args) {
	 
        int MAX=10;  
        
        EvenOddRunnable runnable1 = new EvenOddRunnable(1, MAX );  
        EvenOddRunnable runnable2 = new EvenOddRunnable(0, MAX);  
         
        Thread thread1 = new Thread(runnable1,"Odd");  
        Thread thread2 = new Thread(runnable2,"Even");         

        thread1.start();  
        thread2.start();  
    }  
}  
