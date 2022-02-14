import java.util.ArrayList;

public class OddNumbers implements Runnable {

    private ArrayList<Integer> list;
    public ArrayList<Integer> OddList = new ArrayList<>();
    public OddNumbers(ArrayList<Integer> list) {
        this.list = list;
    }
    @Override
    public void run() {
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) % 2 != 0) {
                //System.out.println(list.get(i));
                OddList.add(list.get(i));
            }
        }
        print();
    }
    public void print(){
        System.out.println(OddList.toString());
    }
}
