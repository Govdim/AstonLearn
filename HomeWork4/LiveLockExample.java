package HomeWork4;

public class LiveLockExample{

    static class Resource {
        private volatile boolean isAvailable = true;

        public synchronized boolean use(String threadName) {
            if(isAvailable){
                System.out.println(threadName + " использует ресурс");
                isAvailable = false;
                return true;
            }
            return false;
        }

        public synchronized void release(String threadName) {
            System.out.println(threadName + " освобождает ресурс");
            isAvailable = true;
        }
    }

    public static void main(String[] args) {
        Resource resource = new Resource();

        Runnable task = () -> {
            String name = Thread.currentThread().getName();

            while(true){
                if(resource.use(name)){
                    try {
                        Thread.sleep(50);
                    } catch(InterruptedException ignored){}

                    resource.release(name);
                    System.out.println(name + " уступает другому потоку");
                }
            }
        };

        new Thread(task, "Thread-1").start();
        new Thread(task, "Thread-2").start();
    }
}
