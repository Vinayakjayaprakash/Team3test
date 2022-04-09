
package ist242;

import java.util.Scanner;
public class Earring extends Jewelry {
    private String earfieldid;
    private String earmaterial;
    private String eartype;
    private String earcolor;
    private String Earmanufacture;

    public Earring(){
    }
    public void SetEarmaterial(String ematerial){

        earmaterial = ematerial;
    }
    public void setEarfieldid(String efieldid){

        earfieldid = efieldid;
    }
    public void setEartype(String etype){
        eartype = etype;
    }
    public void setEarcolor(String ecolor) {
        earcolor = ecolor;
    }
    public String getEarfieldid(){
        return earfieldid;
    }
    public String getEarMaterial(){
        return earmaterial;
    }
    public String getEartype(){
        return eartype;
    }
    public String getEarcolor(){
        return earcolor;
    }
    public String getEarmanufacture(){
        return Earmanufacture;
    }

    public void promptUserEarring(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter in the earring field id: ");
        earfieldid = scan.nextLine();
        System.out.println("Please enter in the type of earring material: ");
        earmaterial = scan.nextLine();
        scan.nextLine();
        System.out.println("Please enter in the type of earring: ");
        eartype = scan.nextLine();
        scan.nextLine();
        System.out.println("Please enter in the earring color ");
        earcolor = scan.nextLine();
        System.out.println("Please enter in the earring manufacture ");
        Earmanufacture = scan.nextLine();

    }

}
