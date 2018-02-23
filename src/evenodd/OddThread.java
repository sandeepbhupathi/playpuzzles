package evenodd;

public class OddThread implements Runnable {
    private EvenOddPrint evenOddPrint;

    public OddThread(EvenOddPrint evenOddPrint){
        this.evenOddPrint =evenOddPrint;
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            if(i%2!=0){
                try {
                    evenOddPrint.printOdd(i);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
