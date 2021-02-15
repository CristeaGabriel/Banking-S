import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~ Welcome to Banking App ~");
        System.out.println("--------------------------");
        System.out.println("~       Operations       ~");
        System.out.println("-> Enter 1 to exit from system");
        System.out.println("-> Enter 2 for money transfer");
        System.out.println("-> Enter 3 to get money");
        System.out.println("--------------------------");
        System.out.println("~  Choose your operation  ~");
        int operation = sc.nextInt();

        if (operation == 1) {
            System.out.println("Exiting from system");
        } else if (operation == 2) {
                System.out.println("Enter your balance");
                int balance = sc.nextInt();
                System.out.println("How much money do you want to transfer?");
                int transfer = sc.nextInt();

                if (balance < transfer) {
                    System.out.println("~   Not enough founds   ~");
                    System.out.println("~  Exiting from system  ~");
                } else if (balance > transfer) {
                        System.out.println("You transferred      -> " + transfer);
                        System.out.println("Your current balance -> " + (balance - transfer));
                }

            } else if (operation == 3) {
                System.out.println("Enter your balance");
                int balance = sc.nextInt();
                System.out.println("How much money do you want to take?");
                int money = sc.nextInt();

                if(balance < money) {
                    System.out.println("~   Not enough founds   ~");
                    System.out.println("~  Exiting from system  ~");
                    } else if (balance > money) {
                            System.out.println("Money received ->" + money);
                            System.out.println("Your current balance -> " + (balance - money));
                        } else if (balance == money) {
                                System.out.println("Money received ->" + money);
                                System.out.println("Your current balance -> " + (balance - money));
                             }

                } else {
                     System.out.println("~    Invalid operation    ~");
        }

    }
}
