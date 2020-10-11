package ex1;

public class Gallery {
    private Painting[] paintings = new Painting[4];
    private int i=0;

    public void addPainting(String artist, String title, double pPrice, double sPrice, int yCreated){
        Painting p = new Painting(artist,title,pPrice,sPrice,yCreated);
        paintings[i] = p;
        i++;
    }

    public void displayList() {
        System.out.println("Paintings");
        System.out.printf("%-25s | %-20s | %-20s | %-20s%n" , "Artist","Title","Purchase Price" ,"Selling Price");
        for (int i = 0; i < paintings.length; i++) {
            System.out.printf("%-25s | %-20s | €%-,20.2f | €%-,20.2f%n",
                    paintings[i].getArtist(), paintings[i].getTitle(),
                    paintings[i].getPurchaseprice(), paintings[i].getSellingprice());
        }
        System.out.println("");
    }

    public void calcGovermentTax(){
        double pPrice;
        double taxDue;
        int ycreated;
        double TAX_RATE1 = 0.01;
        double TAX_RATE2 = 0.05;
        double TAX_RATE3 = 0.07;

        double[] taxCost = new double[paintings.length];
        System.out.println("Tax due on Paintings");
        System.out.printf("%-25s | %-10s%n","Title", "Tax Due");
        for (int i=0; i<paintings.length; i++) {
            pPrice = paintings[i].getPurchaseprice();
            ycreated = paintings[i].getYearcreated();
            if (ycreated >= 1450 && ycreated <= 1550){
                taxDue = pPrice*TAX_RATE1;
            }
            else if (ycreated >= 1551 && ycreated <= 1700){
                taxDue = pPrice*TAX_RATE2;
            }
            else if (ycreated >= 1701 && ycreated <= 1900){
                taxDue = pPrice*TAX_RATE3;
            }
            else {
                taxDue=0;
            }
            taxCost[i] = taxDue;
            System.out.printf("%-25s | €%-,10.2f%n", paintings[i].getTitle(),taxCost[i]);
            System.out.println("");
        }

    }

    public void calcTaxOnProfit() {
        String title;
        String message = "Warning Painting Sold at a loss";
        double total_tax;

        System.out.printf("%-25s | %-10s%n","Title", "Tax Due");
        for (int i=0; i<paintings.length; i++) {

        }


    }

}
