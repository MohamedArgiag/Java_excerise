//x00154556
//Mohamed Argiag

package ex1;

public class Painting {

    private String artist;
    private String title;
    private double purchaseprice;
    private double sellingprice;
    private int yearcreated;

    public Painting(String artist, String title, double pPrice, double sPrice, int yCreated) {
        this.artist = artist;
        this.title = title;
        this.purchaseprice = pPrice;
        this.sellingprice = sPrice;
        this.yearcreated = yCreated;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public double getPurchaseprice() {
        return purchaseprice;
    }

    public double getSellingprice() {
        return sellingprice;
    }

    public int getYearcreated() {
        return yearcreated;
    }
}
