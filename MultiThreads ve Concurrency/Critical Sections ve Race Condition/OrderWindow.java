public class OrderWindow implements Runnable {
    private final Object LOCK = new Object();
    private int number;

    public OrderWindow() {
    setNumber(1);
    }
    @Override
    public void run() {
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        increase();

        System.out.println(this.number);
    }

    public synchronized void increase()
    {
        System.out.println("Thread :"+ Thread.currentThread().getName()+" Order : "+ this.number);
        this. number++;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    
}
