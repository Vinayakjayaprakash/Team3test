package ist242;
import java.util.Scanner;
public class Charm extends Jewelry{
    
    private String charmfieldid;
    private String charmmanufacture;
    private String charmmodelnumber;
    private String charmdepartment;
    private String charmholediameter;
    private String charmmaterial;
    private String charmtype;
    private String charmcolor;
    private String charmsize;
    public Charm(){
    }
    public void setCharmfieldid(String charmfieldid) {
        charmfieldid = charmfieldid;
    }
    public void setCharmmanufacture(String charmmanufacture) {
        charmmanufacture = charmmanufacture;
    }

    public void setCharmmodelnumber(String charmmodelnumber) {
        charmmodelnumber = charmmodelnumber;
    }

    public void setCharmdepartment(String charmdepartment) {
        charmdepartment = charmdepartment;
    }

    public void setCharmholediameter(String charmholediameter) {
        charmholediameter = charmholediameter;
    }

    public void SetCharmmaterial(String charmmaterial){
        charmmaterial = charmmaterial;
    }

    public void setCharmtype(String charmtype) {
        charmtype = charmtype;
    }

    public void setCharmjewel(String charmcolor) {
        charmcolor = charmcolor;
    }

    public void setCharmsize(String charmsize) {
        charmsize = charmsize;
    }
    
    public String getCharmfieldid(){
        return charmfieldid;
    }
    
    public String getCharmmanufacture(){
        return charmmanufacture;
    }

    public String getCharmmodelnumber(){
        return charmmodelnumber;
    }

    public String getCharmdepartment(){
        return charmdepartment;
    }

    public String getCharmholediameter(){
        return charmholediameter;
    }

    public String getCharmmaterial(){
        return charmmaterial;
    }

    public String getCharmtype(){
        return charmtype;
    }

    public String getCharmcolor(){
        return charmcolor;
    }

    public String getCharmsize(){
        return charmsize;
    }

    public void promptUserCharm() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Charm Field ID: ");
        charmfieldid = scan.nextLine();
        System.out.println("Enter Charm Manufacture: ");
        charmmanufacture = scan.nextLine();
        System.out.println("Enter Charm Model Number: ");
        charmmodelnumber = scan.nextLine();
        System.out.println("Enter Charm Department(Male, Female, Uni-sex): ");
        charmdepartment = scan.nextLine();
        System.out.println("Enter Charm Hole Diameter(in MM): ");
        charmholediameter = scan.nextLine();
        System.out.println("Enter Charm Material: ");
        charmmaterial = scan.nextLine();
        System.out.println("Enter Charm Type: ");
        charmtype = scan.nextLine();
        System.out.println("Enter Charm Color: ");
        charmcolor = scan.nextLine();
        System.out.println("Enter Charm Size(in MM): ");
        charmsize = scan.nextLine();
    }
}
