package balancepuzzile;

class Reentrantcy {
    synchronized void doAll() {
        doFirst();
        doSecond();
    }
    synchronized void doFirst() {
        System.out.println("First operation is" +
                "successful.");
    }
    synchronized void doSecond() {
        System.out.println("Second operation is" +
                "successful.");
    }

    public void test(){
        System.out.println("test");
    }
}
