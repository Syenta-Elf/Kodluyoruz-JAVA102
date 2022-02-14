public class OrderWindow implements Runnable {
    private int orderNumber;
    private final Object LOCK = new Object();
    public OrderWindow() {
        this.orderNumber = 1;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        synchronized(LOCK){
            System.out.println("Thread :"+ Thread.currentThread().getName()+" Order : "+ this.orderNumber);
            this.orderNumber ++;
        }
    }


    public int getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
}
