public class Main {

    public static void main(String[] args) {
        
        //undefined
        String s;
      
        //null
        String s1 = null;

        //empty
        String s2 = "2";

        Integer a1 = 10;

        Double d2 = 20d;
        Nullable<String> nullable1 = new Nullable<>(s1);
        Nullable<String> nullable2 = new Nullable<>(s2);
        Nullable<Integer> nullable3 = new Nullable<>(a1);
        Nullable<Integer> nullable4 = new Nullable<>(15);

        nullable1.run();
        nullable2.run();
        nullable3.run();
        nullable4.run();

        Test<Double,String,Integer> test = new Test<>(d2,s2,a1);
        test.showInfo();
        
    }    
}