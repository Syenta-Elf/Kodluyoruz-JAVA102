public class Kitap {

    private String kitapIsmi;
    private int sayfaSayisi;
    private int yayinTarihi;

    public int getYayinTarihi() {
        return yayinTarihi;
    }

    public Kitap(String kitapIsmi, int sayfaSayisi, int yayinTarihi) {
        this.kitapIsmi = kitapIsmi;
        this.sayfaSayisi = sayfaSayisi;
        this.yayinTarihi = yayinTarihi;
    }

    public void setYayinTarihi(int yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getKitapIsmi() {
        return kitapIsmi;
    }
    public void setKitapIsmi(String kitapIsmi) {
        this.kitapIsmi = kitapIsmi;
    }
}
