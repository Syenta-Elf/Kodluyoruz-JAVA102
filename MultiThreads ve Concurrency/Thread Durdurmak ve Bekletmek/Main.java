class Main{
    public static void main(String[] args) {
        Counter c1 = new Counter("c1",1);
        Counter c2 = new Counter("c2",2);
        Thread  t1  = new Thread(c1);
        Thread  t2  = new Thread(c2);
        //Thread  t3  = new Thread(new Counter("c3",3));

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c1.stop();  
        
        t2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c2.stop();

    }
}