package encapsulation;

import encapsulation.entity.Product;

public class Example3 {
    public static void main(String[] args) {
        Product product= new Product(122223,"Hair dryer","Available in 3 colors ",5.0f);
        System.out.println(product);
    }
}
