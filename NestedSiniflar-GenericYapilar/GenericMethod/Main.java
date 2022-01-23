public class Main {
    public static void main(String[] args) {
        
        Integer[] integerList = {2,3,1,7};
        String[] str = {"abc","def","qwe"};
        test(integerList);
        test(str);
    }

    static <T> void test(T[] nesne)
    {
            System.out.println(nesne.getClass().getName());
        for (T item : nesne) {
            System.out.print(item+ " ");
        }
            System.out.println("");
    }
}
