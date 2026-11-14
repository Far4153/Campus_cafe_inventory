import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // reading input: provided for you
        Product[] products = new Product[10];  // an array with room for 10 products
        int count = 0;                         // how many products are stored so far
        int choice;
        do {
            System.out.println("\n--- Campus Cafe Inventory ---");
            System.out.println("1. Add product");
            System.out.println("2. Display all products");
            System.out.println("3. Total stock value");
            System.out.println("4. Average price");
            System.out.println("5. Restock a product");
            System.out.println("6. Duplicate a product");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();   // clears the leftover newline after nextInt()
            if (choice < 0 || choice > 6) {
                System.out.println("Invalid choice, try again.");
            }
            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();

                    if (count==10){
                        System.out.println("Menu is full");
                    }
                    else if(price <= 0||quantity < 0){
                        System.out.println("inputs entered are incorrect");
                    }
                    else{
                        products[count]=new Product(name, price, quantity);
                        count++;
                    }
                    break;
                case 2:

                    if (count==0){
                        System.out.println("No items");

                    }
                    else{
                        for(int i = 0; i<count;i++){
                            products[i].display();
                        }
                    }
                    break;
                case 3:
                    if (count==0){
                        System.out.println("No items");
                    }

                    else{
                    double total=0;
                    for(int i=0; i<count; i++){
                        total+=products[i].stockValue();
                    }
                    System.out.println(total);
                    }
                    break;
                case 4:
                    double average=0;
                    double totalPrice=0;

                    for(int i=0; i<count; i++){
                        totalPrice+=products[i].price;
                    }

                    average=totalPrice/count;
                    System.out.println((int)average);

                    break;
                case 5:
                    System.out.print("Product number: ");
                    int num = sc.nextInt();
                    System.out.print("Quantity to add: ");
                    int extra = sc.nextInt();
                    sc.nextLine();

                    if (num < 1 || num > count || extra <= 0) {
                        System.out.println("Invalid input");
                    }
                    else {
                        products[num - 1].quantity += extra;
                        System.out.println("Product restocked successfully!");
                        }
                    break;
                case 6:
                    System.out.print("Product number: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    if (n < 1 || n > count || count == 10) {
                        System.out.println("Invalid input or inventory full");
                        }
                    else {
                        Product copy = new Product(products[n - 1]);
                        copy.name += " (copy)";
                        products[count] = copy;
                        count++;
                        System.out.println("Product duplicated successfully!");
                        }
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
            }
        } while (choice != 0);
        System.out.println("Products created in total: " + Product.totalProducts);
    }
}
