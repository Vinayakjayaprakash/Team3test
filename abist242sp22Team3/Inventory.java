package ist242;

import java.util.ArrayList;
import java.util.Collections;

public class Inventory implements InvInterface {
    private ArrayList<String> inventory;

        public Inventory() {
            inventory = new ArrayList<String>();
        }
        public void addInventoryItem(String item){
            inventory.add(item);
        }
        public String getInventoryItem(int index){
            return inventory.get(index);
        }
        public void updateInventoryItem(int index, String item){
            inventory.set(index, item);
        }
        public void removeInventoryItem(int index){
            inventory.remove(index);
        }
        public void clearInventoryItems(){
            inventory.clear();
        }
        public int getNumberInventoryItems(){
            return inventory.size();
        }
        public void printInventoryItems(){
            Collections.sort(inventory);
            for (String m : inventory ){
                System.out.println(m);
            }
        }
        public void printSortedInventoryItems(){
            Collections.sort(inventory);
            for (String m : inventory){
                System.out.println(m);
            }
        }
    }


