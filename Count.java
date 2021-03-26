package PACKAGE;

class Count extends Thread // creating thread
{
    Count() {
        super("MY THREAD EXTENDING ");
        System.out.println("MY THREAD CREATED " + this);
        start();
    }

    public void run() // declaring run() method

    {

        try {
            for (int i = 0; i < 10; i++) // for loop
            {
                System.out.println("PRINTING THE COUNT VALUE : " + i);
                System.out.println("PRIORITY : " + getPriority());

                Thread.sleep(1000); // sleep method causes the currently running thread to sleep for a specified
                // amount of time
            }
        } catch (InterruptedException Exception) { // catches the exception thrown by the try block
            System.out.println("MY THREAD - INTERRUPTED ");
        }
        System.out.println("MY THREAD 'RUN' IS OVER! "); // end of the thread
    }
}

class ExtendingThread { // main method
    public static void main(String args[]) {
        Count c = new Count();
        // creating object for COUNT
        c.setPriority(Thread.MAX_PRIORITY);
        try {
            while (c.isAlive()) {
                System.out.println("MAIN THREAD WILL BE ALIVE TILL THE CHILD THREAD IS LIVE... ");

                Thread.sleep(1500); // sleep method causes the currently running thread to sleep for a specified
                                    // amount of time
            }
        }

        catch (InterruptedException Exception) // catches the exception thrown by the try block

        {
            System.out.println("MAIN THREAD - INTERRUPTED ! "); // Printing statements
        }
        System.out.println("MAIN THREAD'S RUN IS OVER. ");
    }
}