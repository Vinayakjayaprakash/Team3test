package ist242;
import java.util.Scanner;

public class Product{

    private int productId;

    private String productName;

    public Product(){
    }

    public void setProductId(int prodId) {

        productId = prodId;
    }

    public void setProductName(String prodName){

        productName = prodName;
    }

    public int getProductId(){

        return productId;
    }

    public String getProductName(){

        return productName;
    }

    public void promptUserProduct(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Product Id");

        productId = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter Product Name");

        productName = scan.nextLine();

    }



}
