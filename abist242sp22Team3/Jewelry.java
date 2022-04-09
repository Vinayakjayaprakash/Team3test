package ist242;
import java.util.Scanner;

public abstract class Jewelry {
    private String itemname;
    private String manufacturer;
    private String type;
    private String color;
    private String size;
//private int fieldID;

    //setters and getters
    public String getItemname() {return itemname;}
    public void setItemname(String _itemname) {itemname =_itemname;}

    public String getManufacturer() {return manufacturer;}
    public void setManufacturer(String _manufacturer) {manufacturer = _manufacturer;}
    public String getType() {return type;}
    public void setType(String _type) {type = _type;}
    public String getColor() {return color;}
    public void setColor(String _color) {color = _color;}
    public String getSize() {return size;}
    public void setSize(String _size) {size = _size;}

}

//test comment