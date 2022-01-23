public class Out {
    public static int a = 0;

    /**
     * In
     */
    public static class In {

        public static int a = 19;
        
        public static void run(){
            int a = 5;
            System.out.println(a);
            System.out.println(In.a);
            System.out.println(Out.a);
        }
    }
    public static void run()
    {
        In.run();
    }

    public In getIn()
    {
       return new Out.In();
     
    }
}
