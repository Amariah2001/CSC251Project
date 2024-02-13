// Amariah Robinson
// 02/09/2024
// CSC-251: N801
// Professor Schoenheit
// Project 1

import java.util.Scanner;
public class Policy {
    Scanner keyboard = new Scanner(System.in);
    private int policyNum; // used to get policy number
    private String providerName; // used to get provider name
    private String policyFirstName; // used to get policyholder's First Name
    private String policyLastName; // used to get policyholder's last name
    private int policyAge; // used to get policyholder's age
    private String policyStatus; // used to get policyholder's smoking status
    private double policyHeight; // used to get policyholder's height in inches
    private double policyWeight; // used to get policyholder's weight in pounds
    private double policyBMI; // used to get the policyholder's BMI
    private double BASE_FEE = 600.00; // base fee for the insurance policy
    private double totalPrice; // used to get the total price of the insurance policy
    private double additionalFee; // used to calculate the additional fee of the insurance policy, if needed
    private double ADD_FEE75 = 75.00; // used if the policyholder is > 50 years old
    private double ADD_FEE100 = 100.00; // used when the policyholder is a smoker

    Policy() { // no arg constructor contains default values if setters and getters are not made correctly!
        policyNum = 0;
        providerName = " ";
        policyFirstName = " ";
        policyLastName = " ";
        policyAge = 0;
        policyStatus = " ";
        policyHeight = 0;
        policyWeight = 0.0;
        policyBMI = 0.0;
    }

    public initializePolicy(int polyNum, String provName, String polyFirst, String polyLast, int age, String polyStatus, int polyHeight, double polyWeight) { // constructor that accepts arguments needed to fully intialize Policy object
        policyNum = polyNum;
        providerName = provName;
        policyFirstName = polyFirst;
        policyLastName = polyLast;
        policyAge = age;
        policyStatus = polyStatus;
        policyHeight = polyHeight;
        policyWeight = polyWeight;
    }

    public void setPolicyNum(int polyNum) {
        policyNum = polyNum;
    }

    public int getPolicyNum() { // getter for policyholder's policy number
        return policyNum;
    }

    public void setProviderName(String provName) {
        providerName = provName;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setPolicyFirst(String polyFirst) {
        policyFirstName = polyFirst;
    }

    public String getPolicyFirst() {
        return policyFirstName;
    }

    public void setPolicyLast(String polyLast) {
        policyLastName = polyLast;
    }
    
    public String getPolicyLast() {
        return policyLastName;
    }

    public void setPolicyAge(int polyAge) {
        policyAge = polyAge;
    }

    public int getPolicyAge() {
        return policyAge;
    }

    public void setPolicyStatus(String polyStatus) {
        policyStatus = polyStatus;
    }

    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyHeight(double polyHeight) {
        policyHeight = polyHeight;
    }

    public double getPolicyHeight() {
        return policyHeight;
    }

    public void setPolicyWeight(double polyWeight) {
        policyWeight = polyWeight;
    }

    public double getPolicyWeight() {
        return policyWeight;
    }

    public void setPolicyBMI(double BMI) {
        policyBMI = BMI;
    }

    public double getBMI(double policyWeight, double policyHeight) { // method used to calculate and return the BMI of the policyholder
        policyBMI = (policyWeight * 703) / (policyHeight * policyHeight);
        return policyBMI;
    }

    public void setInsurancePolicy(double fee) {
        additionalFee = fee;
    }

    public double getPrice() {
        if (policyAge > 50) {
            totalPrice = BASE_FEE + ADD_FEE75;
        }
        if (policyStatus == "smoker" || policyStatus == "Smoker") {
            totalPrice = BASE_FEE + ADD_FEE100;
        }
        if (policyBMI > 35) {
            additionalFee = (policyBMI - 35) * 20; 
            totalPrice = BASE_FEE + additionalFee;
        }
        else {
            totalPrice = BASE_FEE;
        }
        return totalPrice;
    }
}