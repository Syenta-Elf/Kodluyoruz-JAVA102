public class Counter implements Runnable {

    public String name;

    public Counter(String name)
    {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(this.name+" Start");
        for (int i = 0; i < 10; i++) {
            System.out.println(this.name+":"+i);
        }
        
        System.out.println(this.name+" Finish");
    }
    
}
