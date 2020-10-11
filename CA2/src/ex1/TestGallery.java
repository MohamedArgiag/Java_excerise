package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestGallery {
    public static void main(String[] args) {
        String artist = null;
        String title = null;
        double purchaseprice = 0.0;
        double sellingprice = 0.0;
        int ycreated = 0;

        File inFile = new File("files", "gallery.txt");
        Gallery gallery = new Gallery();
        try (Scanner in = new Scanner(inFile)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(",");
                while (lineScanner.hasNext()) {
                    artist = lineScanner.next();
                    title = lineScanner.next();
                    purchaseprice = Double.parseDouble(lineScanner.next());
                    sellingprice = Double.parseDouble(lineScanner.next());
                    ycreated = lineScanner.nextInt();
                }
                gallery.addPainting(artist,title,purchaseprice,sellingprice,ycreated);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Problem: " + ex.getMessage());
        }

        while (true) {
            System.out.println("Please press 1 to view the paintings");
            System.out.println("Please press 2 to view the tax due on paintings");
            System.out.println("Please press 3 to view the tax on profit");
            System.out.println("Press 4 to quit");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    gallery.displayList();
                    break;
                case 2:
                    gallery.calcGovermentTax();
                    break;
                case 3:
                    gallery.calcTaxOnProfit();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
