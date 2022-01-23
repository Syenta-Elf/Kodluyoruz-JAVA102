public class Locale {


    public void run()
    {
        class InnerLocale {
        
            private int a = 5;
            InnerLocale(int a)
            {
                this.setA(a);
            }
            public int getA() {
                return a;
            }
            public void setA(int a) {
                this.a = a;
            }
        }
        InnerLocale innerLocale = new InnerLocale(15);
        System.out.println(innerLocale.getA());
        innerLocale.setA(70);
        System.out.println(innerLocale.getA());
    }

    
    
}
