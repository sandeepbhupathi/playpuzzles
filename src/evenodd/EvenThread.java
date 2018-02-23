package evenodd;

public class EvenThread implements Runnable {

    private EvenOddPrint evenOddPrint;

    public EvenThread(EvenOddPrint evenOddPrint){
        this.evenOddPrint=evenOddPrint;
    }

    @Override
    public void run() {
        for(int i=2;i<=10;i++){
            if(i%2==0){
                try {
                    evenOddPrint.printEven(i);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
