
import java.util.Scanner;

public class Restaurant {
  public static void main(String[] args) {
    System.out.println("Welcome to the restaurant");
    System.out.println("Please choose from the menu");
    System.out.println("1. Food");
    System.out.println("2. Drinks");
    System.out.println("3. Order");
    System.out.println("4. Bill");
    System.out.println("5. Pay");
    System.out.println("6. Store");
    System.out.println("7. Exit");
    Scanner input = new Scanner(System.in);
    int choice = input.nextInt();
    switch (choice) {
      case 1:
        System.out.println("Chapo");
        System.out.println("Beef@190");
        System.out.println("Ugali");
        System.out.println("Pork@300");
        System.out.println("Mchele dengu@140");
        break;
      case 2:
        System.out.println("Soda@50");
        System.out.println("Afya@70");
        System.out.println("Juice@70");
        System.out.println("Uji@30");
        break;
      case 3:
        System.out.println("Please enter your order");
        String order = input.next();
        System.out.println("Your order is " + order);
        break;
      case 4:
        System.out.println("Please enter the amount you have spent");
        int amount = input.nextInt();
        System.out.println("You have spent " + amount);
        break;
      case 5:
        System.out.println("Please enter your mobile money number");
        int number = input.nextInt();
        System.out.println("Please enter the amount you want to pay");
  
        System.out.println("You have paid " + amount + " to " + number);
        break;
      case 6:
        System.out.println("Please enter the data you want to store");
        String data = input.next();
        System.out.println("The data you have entered is " + data);
        break;
      case 7:
        System.out.println("Thank you for visiting the restaurant");
        break;
      default:
        System.out.println("Invalid choice");
        break;
    }
  }
}