import javax.xml.namespace.QName;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Products> inventory = getInventory();

        Scanner scanner = new Scanner(System.in);
        System.out.println("List of inventory: ");

        for (int i = 0; i < inventory.size(); i++) {
            Products p = inventory.get(i);
            System.out.printf("Id:%d |name:%s |Price:$%.2f%n ",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    private static ArrayList<Products> getInventory() {
        ArrayList<Products> Products = new ArrayList<>();
        Products.add(new Products(10, "Justice League", 20.00));
        Products.add(new Products(20, "Batman", 24.00));
        Products.add(new Products(40, "Titans", 10.00));
        Products.add(new Products(50, "Superman", 25.00));
        Products.add(new Products(22, "Nightwing", 26.00));
        return Products;
    }



}

