public class Main {
    public static void main(String[] args) {
        Out out = new Out();
        out.run();

        // Out.In outIn = out.new In();
        // outIn.run();

        Out.In oi = out.getIn();
        //oi.run();
        Locale locale = new Locale();
        locale.run();

        Anonim an = new Anonim(){
            public int a=5;

            @Override
            public void run() {
                System.out.println("Override anonim");
                System.out.println(a);
                print();
            };
            public void print()
            {
                System.out.println("deneme");
            }
        };
        an.run();
    }
}
