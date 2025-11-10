public class TreadExe {
    // Example showing thread creation by extending Thread and implementing Runnable


        // Thread by extending Thread class
        static class MyThread extends Thread {
            public void run() {
                System.out.println("Thread by extending Thread class is running.");
                for(int i = 1; i <= 5; i++) {
                    System.out.println("MyThread: Count " + i);
                    try {
                        Thread.sleep(500); // Sleep for 500 milliseconds
                    } catch (InterruptedException e) {
                        System.out.println("MyThread interrupted.");
                    }
                }
                System.out.println("MyThread finished.");
            }
        }


        static class MyRunnable implements Runnable {
            public void run() {
                System.out.println("Thread by implementing Runnable is running.");
                for(int i = 1; i <= 5; i++) {
                    System.out.println("MyRunnable: Count " + i);
                    try {
                        Thread.sleep(500); // Sleep for 500 milliseconds
                    } catch (InterruptedException e) {
                        System.out.println("MyRunnable interrupted.");
                    }
                }
                System.out.println("MyRunnable finished.");
            }
        }

        public static void main(String[] args) {
            System.out.println("Main thread started.");

            // Create and start thread using Thread class extension
            MyThread t1 = new MyThread();
            t1.start();

            // Create and start thread using Runnable implementation
            Thread t2 = new Thread(new MyRunnable());
            t2.start();
            t2.setPriority(Thread.MAX_PRIORITY);


            // Main thread doing its own work
            for(int i = 1; i <= 5; i++) {
                System.out.println("Main thread: Count " + i);
                try {
                    Thread.sleep(400);

                } catch (InterruptedException e) {
                    System.out.println("Main thread interrupted.");
                }
            }

            System.out.println("Main thread finished.");
        }
    }


