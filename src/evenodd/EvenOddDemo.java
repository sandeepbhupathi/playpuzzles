package evenodd;

public class EvenOddDemo {
    public static void main(String args[]){
        EvenOddPrint evenOddPrint = new EvenOddPrint();

        (new Thread(new EvenThread(evenOddPrint))).start();
        (new Thread(new OddThread(evenOddPrint))).start();
    }
}
