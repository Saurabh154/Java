package Oops.Project.BankingManagementSystem;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Account implements utility{
    String bankName;
    String name;
    String branchName;
    int initial_amt;
//    private static String idfc;
    private static long accountNum = 1000;
    long acNum;

    Account(){
        acNum = accountNum++;
    }

    @Override
    public void getDetails() {
        System.out.println("Bank Name: "+bankName);
        System.out.println("Bank Branch Name: "+branchName);
        System.out.println("Customer Name: "+name);
        System.out.println("Account Number: "+acNum);
        System.out.println("Initial Amount: "+initial_amt);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER ACCOUNT DETAILS *** =======================");
        System.out.println();
        System.out.print("BANK NAME: ");
        bankName = sc.nextLine();
        System.out.print(("BRANCH NAME: "));
        branchName = sc.nextLine();
        System.out.print("CUSTOMER NAME: ");
        name = sc.nextLine();
        System.out.print("INITIAL AMOUNT DEPOSIT: ");
        initial_amt = sc.nextInt();
    }


}
