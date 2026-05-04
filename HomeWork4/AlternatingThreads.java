package HomeWork4;

public class AlternatingThreads{

    private static final Object lock = new Object();
    private static boolean printOne = true;

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            while(true){
                synchronized(lock){
                    while(!printOne){
                        try {
                            lock.wait();
                        } catch (InterruptedException ignored){}
                    }

                    System.out.println("1");
                    printOne = false;
                    lock.notifyAll();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while(true){
                synchronized(lock){
                    while(printOne){
                        try {
                            lock.wait();
                        } catch (InterruptedException ignored) {}
                    }

                    System.out.println("2");
                    printOne = true;
                    lock.notifyAll();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
