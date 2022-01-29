import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        //ArrayList senkronize olmadığı için Vector sınıfına göre daha hızlıdır. Elbette hızlı olmanın bir bedeli vardır.
        //Senkronize olmaması demek, çoklu işlem ortamında güvenirliğin azalması demektir.
        Vector<String> v = new Vector<>();
        v.add("e");        
        v.add("e");        
        v.add("e");        
        v.add("e");        
        v.add("e");
        
        v.add(2,"a");

        for (String string : v) {
            System.out.println(string);
        }
    }
}