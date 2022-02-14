import java.util.ArrayList;

public class EvenNumbers implements Runnable{

    private ArrayList<Integer> list ;
    private ArrayList<Integer> EvenList = new ArrayList<>() ;

    public EvenNumbers(ArrayList<Integer> list) {
        this.list = list;
    }
 
    @Override
    public void run() {
        
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) % 2 == 0) {
                //System.out.println(list.get(i));
                EvenList.add(list.get(i));
            }
        }
        print();
    }
    public void print(){
        System.out.println(EvenList.toString());
    }
    
}
