// Amariah Robinson
// 02/12/2024
// CSC 251: N801
// Professor Schoenheit

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int polyNumber;
        String name;
        String firstName;
        String lastName;
        int age;
        String status;
        double height;
        double weight;

        Policy policy1 = new Policy(); /* creating an instance of the Policy class and
        allows me to use methods and functions from that class! */

        System.out.print("Please enter the Policy Number: ");
        polyNumber = keyboard.nextInt();
        policy1.setPolicyNum(polyNumber);

        keyboard.nextLine();

        System.out.print("Please enter the Provider Name: ");
        name = keyboard.nextLine();
        policy1.setProviderName(name);

        System.out.print("Please enter the Policyholder's First Name: ");
        firstName = keyboard.nextLine();
        policy1.setPolicyFirst(firstName);

        System.out.print("Please enter the Policyholder's Last Name: ");
        lastName = keyboard.next();
        policy1.setPolicyLast(lastName);

        System.out.print("Please enter the Policyholder's Age: ");
        age = keyboard.nextInt();
        policy1.setPolicyAge(age);

        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        status = keyboard.next();
        policy1.setPolicyStatus(status);

        System.out.print("Please enter the Policyholder's Height (in inches): ");
        height = keyboard.nextDouble();
        policy1.setPolicyHeight(height);

        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        weight = keyboard.nextDouble();
        policy1.setPolicyWeight(weight);

        policy1.getBMI(weight, height);
       
        System.out.println();
        double BMI = (weight * 703) / (height * height);

        // Print out all of the information that was provided by the user
        System.out.println("Policy Number: " + polyNumber);
        System.out.println("Provider Name: " + name);
        System.out.println("Policyholder's First Name: " + firstName);
        System.out.println("Policyholder's Last Name: " + lastName);
        System.out.println("Policyholder's Age: " + age);
        System.out.println("Policyholder's Smoking Status: " + status);
        System.out.println("Policyholder's Height: " + height + " inches");
        System.out.println("Policyholder's Weight: " + weight + " pounds");
        System.out.printf("Policyholder's BMI: %,.2f" , BMI);
        System.out.println();
        System.out.printf("Policy Price: $%.2f", policy1.getPrice());
    } 
}
