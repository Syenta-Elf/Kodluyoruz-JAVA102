import java.util.ArrayList;
import java.util.Comparator;

class Main{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(100);
        list.add(104);
        list.add(112);
        list.add(13);
        list.add(50);
        list.add(53);
        list.add(893);
        list.add(13);
        list.add(5);
        list.add(5);
        list.add(5);

        list.stream().forEach(num -> System.out.println(num));
        System.out.println("-------");
        list.stream().filter(num -> num > 60).forEach(num -> System.out.println(num));
        System.out.println("-------");
        list.stream().distinct().forEach(num -> System.out.println(num));
        System.out.println("-------");
        list.stream().sorted().forEach(num -> System.out.println(num));
        System.out.println("-------");
        list.stream().sorted(Comparator.reverseOrder()).forEach(number -> System.out.println(number));
        System.out.println("-------");
        list.stream().limit(5L).forEach(number -> System.out.println(number));
        System.out.println("-------");
        list.stream().skip(3L).limit(4L).forEach(num -> System.out.println(num));
        System.out.println("-------");
        long count =list.stream().filter(num -> num <30).distinct().count(); 
        System.out.println("count: "+count);
        System.out.println("-------");
        list.stream().filter(num -> num <30).distinct().forEach(num -> System.out.println(num));
        System.out.println("-------");
        boolean match1 = list.stream().anyMatch(number -> number < 5);System.out.println(match1);
        System.out.println("-------");
        boolean match2 = list.stream().allMatch(number -> number < 5);System.out.println(match2);
        System.out.println("-------");
        boolean match3 = list.stream().noneMatch(number -> number < 5);System.out.println(match3);
        System.out.println("-------");
        list.stream().map(number -> number * 2).forEach(number -> System.out.println(number));
        System.out.println("-------");
        list.stream().map(number -> Math.sqrt(number)).forEach(number -> System.out.println(number));

    }
}