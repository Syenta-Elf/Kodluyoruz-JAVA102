public class Counter implements Runnable {
    public String name;
    public int id;
    private boolean isRun = true;

    public Counter(String name,int id)
    {
        this.name = name;
        this.id = id;
    }
    @Override
    public void run() {
        while(isRun)
        {
            for (int i = 0; i < 10; i++) {
                if(this.id >= 1)
                    try {
                        Thread.sleep(1000L*this.id);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                System.out.println(this.name+": "+i);
            }
            
        }
    }
    public void stop()
    {
        this.isRun = false;
    }    
}
