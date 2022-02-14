public class Main {
    public static void main(String[] args) {
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println("kawai");
            };
        };

        r.run();

        //Runnable r2 = () -> System.out.println("r2 sinifi");
        Runnable r2 = () -> {
            System.out.println("r2 sinifi");
        };
        r2.run();

        Matematik toplama = (a,b) ->  a+b; 
        Matematik cikarma = (a,b) ->  a-b; 
        Matematik carpma = (a,b) ->  a*b; 
        Matematik bolme = (a,b) ->  {
            if(b==0)
            {
                return 0;
            }
            return a/b;
        }; 

        System.out.println(toplama.transaction(10, 2));
        System.out.println(cikarma.transaction(10, 2));
        System.out.println(carpma.transaction(10, 2));
        System.out.println(bolme.transaction(10, 2));
    }
}
