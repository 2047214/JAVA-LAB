package PACKAGE;

class Halton implements Runnable {
    private Thread t;
    private String HALTON_WALDROF;

    Halton(String name) {
        HALTON_WALDROF = name;
        System.out.println("ESTABLISHED IN THE YEAR 1987 " + HALTON_WALDROF); // CREATING THREAD
    }

    public void run() {
        System.out.println("PRIVATE INSTITUTE UNDERTAKEN " + HALTON_WALDROF); // RUNNING THREAD
        try {
            for (int i = 6; i > 0; i--) {
                System.out.println("Thread: " + HALTON_WALDROF + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(1550);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + HALTON_WALDROF + " interrupted.");
        }
        System.out.println("Thread " + HALTON_WALDROF + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + HALTON_WALDROF);
        if (t == null) {
            t = new Thread(this, HALTON_WALDROF);
            t.start();
        }
    }
}

public class H {

    public static void main(String args[]) {
        Halton H1 = new Halton("THREAD-1");
        H1.start();
        Halton H2 = new Halton("THREAD-2");
        H2.start();
    }
}
