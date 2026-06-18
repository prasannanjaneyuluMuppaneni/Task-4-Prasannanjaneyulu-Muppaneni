import java.util.Scanner;
public class DecodeLabs_Java_P4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                System.out.println("\n1. USD to INR");
                System.out.println("2. INR to USD");
                System.out.println("3. EUR to INR");
                System.out.println("4. INR to EUR");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                if (choice < 1 || choice > 5) {
                    throw new Exception("Invalid Choice! Enter between 1 and 5.");
                }

                if (choice == 5) {
                    System.out.println("Thank You!");
                    break;
                }

                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();

                if (amount < 0) {
                    throw new Exception("Amount cannot be negative.");
                }

                double result;

                switch (choice) {
                    case 1:
                        result = amount * 83.50;
                        System.out.println("INR = " + result);
                        break;

                    case 2:
                        result = amount / 83.50;
                        System.out.println("USD = " + result);
                        break;

                    case 3:
                        result = amount * 90.75;
                        System.out.println("INR = " + result);
                        break;

                    case 4:
                        result = amount / 90.75;
                        System.out.println("EUR = " + result);
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }

        sc.close();
    }
}