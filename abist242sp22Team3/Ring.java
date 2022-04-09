package ist242;
import java.util.Scanner;
public class Ring extends Jewelry{
    
    private String ringfieldid;
    private String ringmaterial;
    private String ringtype;
    private String ringjewel;
    private String ringsize;
    private String ringmanufacture;

    public Ring() {
    }
    public void setRingfieldid(String rfieldid) {

        ringfieldid = rfieldid;
    }
    public void setRingmaterial(String rmaterial) {

        ringmaterial = rmaterial;
    }
    public void setRingmanufacture(String rmanufacture) {

        ringmanufacture = rmanufacture;
    }
    public void setRingtype(String rtype) {
        ringtype = rtype;
    }

    public void setRingsize(String rsize) {
        ringsize = rsize;
    }

    public void setRingjewel(String rjewel) {
        ringjewel = rjewel;
    }
    public String getRingFieldid() {
        return ringfieldid;
    }
    public String getRingMaterial() {
        return ringmaterial;
    }

    public String getRingtype() {
        return ringtype;
    }

    public String getRingjewel() {
        return ringjewel;
    }

    public String getRingsize() {
        return ringsize;
    }
    public String getringmanufacture() {
        return ringmanufacture;
    }
        public void promptUserRing(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Ring Field ID: ");
            ringfieldid = scan.nextLine();
            scan.nextLine();
            System.out.println("Enter Ring Material: ");
            ringmaterial = scan.nextLine();
            scan.nextLine();
            System.out.println("Enter Ring Type: ");
            ringtype = scan.nextLine();
            scan.nextLine();
            System.out.println("Enter Ring Jewel: ");
            ringjewel = scan.nextLine();
            System.out.println("Enter Ring Size: ");
            ringsize = scan.nextLine();
            System.out.println("Enter Ring Manufacture: ");
            ringmanufacture = scan.nextLine();
        }

    }

