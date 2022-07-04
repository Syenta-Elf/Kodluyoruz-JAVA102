import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>(25);
        ArrayList<Integer> list2 = new ArrayList<>(25);
        ArrayList<Integer> list3 = new ArrayList<>(25);
        ArrayList<Integer> list4 = new ArrayList<>(25);
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
    
        list1.addAll(numbers.subList(0, 25));
        list2.addAll(numbers.subList(25, 50));
        list3.addAll(numbers.subList(50, 75));
        list4.addAll(numbers.subList(75, 100));

        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);

        for (ArrayList<Integer> arrayList : lists) {      
            OddNumbers o1 = new OddNumbers(arrayList);
            Thread t1 = new Thread(o1);
            t1.start(); 
            EvenNumbers e1 = new EvenNumbers(arrayList);
            Thread t2 = new Thread(e1);
            t2.start();
        }
        

        

    }
}