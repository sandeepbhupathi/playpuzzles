package evenodd;

public class EvenOddPrint {
    boolean isOdd = true;

    public synchronized void printEven(int i) throws InterruptedException {
        if(isOdd)
            wait();
        System.out.println("Printing Even : "+i);
        isOdd=true;
        notifyAll();
    }

    public synchronized void printOdd(int i) throws InterruptedException {
        if(!isOdd)
            wait();
        System.out.println("Printing Odd : "+i);
        isOdd=false;
        notifyAll();
    }
}
