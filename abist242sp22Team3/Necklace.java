package ist242;
import java.util.Scanner;
public class Necklace extends Jewelry{

    private String necklacefieldid;
    private String necklacematerial;
    private String necklacetype;
    private String necklacecolor;
    private String necklacesize;
    private String necklacemanufacture;
    
    public Necklace(){
    }
    public void SetNecklacefieldid(String necklacefieldid){
        necklacefieldid = necklacefieldid;
    }
    public void SetNecklacematerial(String necklacematerial){
        necklacematerial = necklacematerial;
    }
    public void setNecklacetype(String necklacetype) {
        necklacetype = necklacetype;
    }

    public void setNecklacejewel(String necklacecolor) {
        necklacecolor = necklacecolor;
    }

    public void setNecklacesize(String necklacesize) {
        necklacesize = necklacesize;
    }
    public void setnecklacemanufacture(String necklacemanufacture) {
        necklacemanufacture = necklacemanufacture;
    }

    public String getNecklacefieldid(){
        return necklacefieldid;
    }
    
    public String getNecklacematerial(){
        return necklacematerial;
    }

    public String getNecklacetype(){
        return necklacetype;
    }

    public String getNecklacecolor(){
        return necklacecolor;
    }

    public String getNecklacesize(){
        return necklacesize;
    }
    public String getNecklacemanufacture(){
        return necklacemanufacture;
    }

    public void promptUserNecklace() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter In Necklace Field ID: ");
        necklacefieldid = scan.nextLine();
        System.out.println("Enter In Necklace Material: ");
        necklacematerial = scan.nextLine();
        System.out.println("Enter In Necklace Type: ");
        necklacetype = scan.nextLine();
        System.out.println("Enter In Necklace Color: ");
        necklacetype = scan.nextLine();
        System.out.println("Enter In Necklace Size: ");
        necklacesize = scan.nextLine();
        System.out.println("Enter In Necklace Manufacture: ");
        necklacemanufacture = scan.nextLine();
    }
}
