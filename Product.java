import java.util.*;

class Product1 {
    int code, price;
    String name;

    Product1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = s.nextLine();  // Read the product name
        System.out.println("Enter the code:");
        code = s.nextInt();  // Read the product code
        s.nextLine();  // Consume the newline character left by nextInt()
        System.out.println("Enter the price:");
        price = s.nextInt();  // Read the product price
    }
}

class Product {
    public static void main(String[] args) {
        // Create objects of Product1
        Product1 obj1 = new Product1();
        Product1 obj2 = new Product1();
        Product1 obj3 = new Product1();

        // Compare prices
        if ((obj1.price > obj2.price) && (obj1.price > obj3.price)) {
            System.out.println("First product is largest");
        } else if ((obj2.price > obj1.price) && (obj2.price > obj3.price)) {
            System.out.println("Second product is largest");
        } else {
            System.out.println("Third product is largest");
        }
    }
}
