public class Main {
    public static void main(String[] args) {
        Out out = new Out();
        out.run();

        // Out.In outIn = out.new In();
        // outIn.run();

        Out.In oi = out.getIn();
        //oi.run();
    }
}
