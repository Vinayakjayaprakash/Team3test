package ist242;

import java.util.Collections;

public interface InvInterface {
    public void addInventoryItem(String item);
    public String getInventoryItem(int index);
    public void updateInventoryItem(int index, String item);
    public void removeInventoryItem(int index);
    public void clearInventoryItems();
    public int getNumberInventoryItems();
    public void printInventoryItems();
    public void printSortedInventoryItems();
}