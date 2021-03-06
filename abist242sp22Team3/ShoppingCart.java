package ist242;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> shopCart;

    public ShoppingCart() {
        shopCart = new ArrayList<Product>();
    }

    public void addProductToCart(Product prod) {
        shopCart.add(prod);
    }

    public void updateProduct(int prodIndex, Product prod) {
        shopCart.set(prodIndex, prod);
    }

    public void removeProduct(int prodindex){
        shopCart.remove(prodindex);
    }

    public int getNumberOfProducts() {
        return shopCart.size();
    }

    public void emptyCart() {
        shopCart.clear();
    }

    public void printProductItems() {
        for (Product prod : shopCart) {
            System.out.println(prod);
        }
    }
}
