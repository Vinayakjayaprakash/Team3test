package ist242;
import java.util.Scanner;
public class Pendent extends Jewelry{
    private String pendentfieldid;
    private String pendentsize;
    private String pendenttype;
    private String pendentcolor;
    private String Pendentmanufacture;
    //Constructor
    public Pendent(){
    }

    public String getPendentsize(){
        return pendentsize;
    }
    public String getPendentfieldid(){
        return pendentfieldid;
    }
    public String getPendenttype(){
        return pendenttype;
    }
    public String getPendentcolor(){ return pendentcolor;}
    public String getPendentmanufacture(){ return Pendentmanufacture;}

    public void setPendentfieldid(String pfieldid) {
        this.pendentfieldid = pfieldid;
    }
    public void setPendentsize(String psize) {
        this.pendentsize = psize;
    }
    public void setPendenttype(String ptype) {
        this.pendenttype = ptype;
    }
    public void setPendentcolor(String pcolor){ this.pendentcolor = pcolor;}
    public void setPendentmanufacture(String pmanufacture){ this.Pendentmanufacture = pmanufacture;}

    public void promptUserRing(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Pendent Field ID: ");
        pendentfieldid = scan.nextLine();
        scan.nextLine();
        System.out.println("Enter Pendent Size: ");
        pendentsize = scan.nextLine();
        scan.nextLine();
        System.out.println("Enter Pendent type: ");
        pendenttype = scan.nextLine();
        scan.nextLine();
        System.out.println("Enter Pendent Color: ");
        pendentcolor = scan.nextLine();
        System.out.println("Enter Pendent Manufacture: ");
        Pendentmanufacture = scan.nextLine();
    }


}
