package atm_machine;

import java.util.Scanner;

public class main { // Renamed class to follow convention
    public static void main(String[] args) { // Added main method
    	operation op=new atm_operation();
        int atm_number = 1234567890;
        int pin_number = 1234;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM machine");
        System.out.print("Enter the ATM number: ");
        int atm = sc.nextInt();
        System.out.print("Enter the PIN number: ");
        int pin = sc.nextInt();
        if ((atm == atm_number) && (pin == pin_number)) {
            while(true) {
            	System.out.println("1.View balance\n2.Withdraw amount\n3.Deposit amount\n4.Exit");
            	System.out.println("Enter your choice:");
            	int ch=sc.nextInt();
            	switch(ch) {
            	case 1:
            		op.viewBalance();
            		break;
            	case 2:
            		System.out.println("Enter the amount to be withdrawed:");
            		double withdraw=sc.nextDouble();
            		op.withdrawAmount(withdraw);
            		break;
            	case 3:
            		System.out.println("Enter the amount to be deposited:");
            		double deposit=sc.nextDouble();
            		op.depositAmount(deposit);
            		break;
            	case 4:
            		System.out.print("Collect your atm card.\nThank You");
            		sc.close(); // Closing scanner before exiting
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            	}
           }
        } else {
            System.out.println("Incorrect ATM PIN");
            System.exit(0);
        }
        sc.close();
    }
}
