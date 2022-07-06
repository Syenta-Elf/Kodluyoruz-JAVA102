import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notebook extends Product {

    public static List<Notebook> notebooks = new ArrayList<>();
    private Integer storageSize;

    public Notebook(){
        if(notebooks.isEmpty()){
            makeNotebookList();
        }
    }

    protected Notebook(String productId, String productName, Double sellingPrice, Integer stockAmount, Brand brandInfo,
            Double screenSize, Integer ram, Integer storageSize) {
        super(productId, productName, sellingPrice, stockAmount, brandInfo, screenSize, ram);
        setStorageSize(storageSize);
        
    }

    public Integer getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(Integer storageSize) {
        this.storageSize = storageSize;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString().replace("Product", "Notebook")+ "[storageSize=" + storageSize + "]";
    }   

    private static List<Notebook> makeNotebookList(){
        
        Notebook r550VX = new Notebook("1", "R550VX", 4999.99, 5, Brand.ASUS, 15.6, 8, 256);
        Notebook ideaPad_81VU006STX= new Notebook("2", "81VU006STX", 3999.99, 2, Brand.LENOVO, 15.6, 8, 512);

        notebooks.add(r550VX);
        notebooks.add(ideaPad_81VU006STX);
        
        return notebooks;
    }

    public static void showNotebookList(Scanner sc){
        if(notebooks.isEmpty()){
            makeNotebookList();
        }
        
        String leftAlignFormat = "| %-2s | %-12s | %-8s TL | %-8s | %-8d GB | %-8s | %-5d GB |%n";
        String line = "+--------------------------------------------------------------------------------+%n";
        System.out.format(line);
        System.out.format("| ID | Ürün Adı     | Fiyat       | Marka    | Depolama    | Ekran    | RAM      |%n");
        System.out.format(line);

        

        for (Notebook notebook : notebooks) {
            System.out.format(leftAlignFormat,notebook.getProductId(),notebook.getProductName(),notebook.getSellingPrice(),
            notebook.getBrandInfo(),notebook.getStorageSize(),notebook.getScreenSize(),notebook.getRam());
        }
        System.out.format(line);
    
        System.out.println("-------Menu-------");
        System.out.println("[1] Notebook ekle ekle."); 
        System.out.println("[2] Ana Menüye dön");
        System.out.println("Çıkmak için herhangi bir tuşa basın.");
        int secim = sc.nextInt();

        switch(secim){
            case 1:
                addNotebook(new Notebook());
                break;
            case 2:
                Main.main(null);
                break;
            default:
                break;
        }
    }
    public static void addNotebook(Notebook getNotebook){

        Scanner sc = new Scanner(System.in);
        Notebook notebook = (Notebook) Product.addProduct(getNotebook);
        
        System.out.print("Depolama:");
        notebook.setStorageSize(sc.nextInt());

        notebooks.add(notebook);
        showNotebookList(sc);
        
    }
}
