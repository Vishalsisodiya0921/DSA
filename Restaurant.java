package BinaryTreeP1;
import java.util.*;
public class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input for mess price
        int x = sc.nextInt();
        //talking input price of fancy restaurant
        int y = sc.nextInt();

        //Calculating total cost
        int totalCost = x*6 + y;

        System.out.println(totalCost);
    }
}
