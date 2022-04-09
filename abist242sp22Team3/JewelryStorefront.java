package ist242;

import ist242.Store;
import ist242.Earring;
public class JewelryStorefront {
    public static void main(String[] args) {
        Store coffeeStore = new Store(" Jewelry.java Storefront");
        System.out.println(coffeeStore.getStorename());
        Earring earring = new Earring();
        earring.promptUserEarring();
        System.out.println("Enter Earring Field ID: " + earring.getEarfieldid());
        System.out.println("Enter Earring Manufacture: " + earring.getEarmanufacture());
        System.out.println("Enter Earring Type: " + earring.getEartype());
//        System.out.println("Enter Earring Material: " + );
        System.out.println("Enter Earring Color: " + earring.getEarcolor());

        Necklace necklace = new Necklace();
        necklace.promptUserNecklace();
        System.out.println("Enter Necklace Field ID: " + necklace.getNecklacefieldid());
        System.out.println("Enter Necklace Manufacture: " + necklace.getNecklacemanufacture());
        System.out.println("Enter Necklace Material: " + necklace.getNecklacematerial());
        System.out.println("Enter Necklace Type: " + necklace.getNecklacetype());
        System.out.println("Enter Necklace Color: " + necklace.getNecklacecolor());
        System.out.println("Enter Necklace Size: " + necklace.getNecklacesize());

        Ring ring = new Ring();
        ring.promptUserRing();
        System.out.println("Enter Ring Field ID: " + ring.getRingFieldid());
        System.out.println("Enter Ring Manufacture: " + ring.getringmanufacture());
        System.out.println("Enter Ring Material: " + ring.getRingMaterial());
        System.out.println("Enter Ring Type: " + ring.getRingtype());
        System.out.println("Enter Ring Jewel: " + ring.getRingjewel());
        System.out.println("Ring Size: " + ring.getRingsize());

        Charm charm = new Charm();
        charm.promptUserCharm();
        System.out.println("Enter Charm Field ID: " + charm.getCharmfieldid());
        System.out.println("Enter Charm Manufacture: " + charm.getCharmmanufacture());
        System.out.println("Enter Charm Material: " + charm.getCharmmaterial());
        System.out.println("Enter Charm Type: " + charm.getCharmtype());
        System.out.println("Enter Charm Color: " + charm.getCharmcolor());
        System.out.println("Enter Charm Size: " + charm.getCharmsize());

        Pendent pendent = new Pendent();
        pendent.promptUserRing();
        System.out.println("Enter Pendent Field ID: " + pendent.getPendentfieldid());
        System.out.println("Enter Pendent Manufacture: " + pendent.getPendentmanufacture());
        System.out.println("Enter Pendent Size: " + pendent.getPendentsize());
        System.out.println("Enter Pendent Type: " + pendent.getPendenttype());
        System.out.println("Enter Pendent Color: " + pendent.getPendentcolor());

        Cash cash = new Cash(.20);
        System.out.println(100.00 + cash.handlePayment(100.00));

        CreditCard cc = new CreditCard(200.00);
        cc.setCreditCardExpDate();
        cc.setCreditCardName(" ");
        System.out.println("Credit Card Name:" + cc.getCreditCardName());
        System.out.println("Credit Card Check:" + Luhn.Check("  "));
        System.out.println("Credit Card Check:" + Luhn.Check("  "));
        System.out.println("Credit Card EXP DATE: " + cc.getCreditCardExpDate());
        System.out.println("Credit Card CVC:" +cc.getCreditCardCvc());

        DebitCard dd = new DebitCard(100.00);
        dd.setDebitCardName(" ");
        dd.setDebitCardNumber(0123456);
        dd.setDebitCardPin(1234);
        dd.setDebitCardExpDate();
        System.out.println("Debit Card Name:" + dd.getDebitCardName());
        System.out.println("Debit Card Pin:" + dd.getDebitCardPin());

        /*
        Inventory inv = new Inventory();
        inv.addInventoryItem();
        inv.printInventoryItems();
        inv.updateInventoryItem();
        inv.getInventoryItem();
        inv.printSortedInventoryItems();
        inv.removeInventoryItem();
        inv.clearInventoryItems();              */
    }
    }


