public class Main {

    public static void main(String[] args) {

        // sınıflandırma
        InnerMain<Integer> test = new InnerMain<>();
        test.run(5);

    }

    public static class InnerMain<T extends Number> {

        public void run(T t) {
            System.out.println(t + " " + t.getClass().getName());
        }
    }

}
