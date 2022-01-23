public class Out {
    public int a = 0;

    /**
     * In
     */
    public class In {

        public int a = 19;
        
        public void run(){
            int a = 5;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Out.this.a);
        }
    }
    public void run()
    {
        In in = new In();
        in.run();
    }

    public In getIn()
    {
       return new In();
       
    }
}
