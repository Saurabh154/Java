package Oops.Project.BankingManagementSystem;

//import Oops.Project.CarShowroomManagementSystem.Cars;
//import Oops.Project.CarShowroomManagementSystem.Employees;
//import Oops.Project.CarShowroomManagementSystem.Showroom;

import java.sql.SQLOutput;
import java.util.Scanner;

interface utility{
    public void getDetails();
    public void setDetails();
}

public class Main {
    static void main_menu(){

        System.out.println();
        System.out.println("======================= *** WELCOME TO BANKING MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].CREATE ACCOUNT \t\t\t 2].DEPOSIT MONEY \t\t\t 3].CHECK BALANCE");
        System.out.println();
        System.out.println("4].LIST ACCOUNT \t\t\t 5].WITHDRAW MONEY \t\t\t 6].VIEW ACCOUNT DETAILS \t\t\t 7].TRANSFER MONEY");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }
    public static void main(String[] args) {
        Main.main_menu();

        Scanner sc = new Scanner(System.in);
        Account account[] = new Account[5];
        int account_counter=0;

        int choice = 100;

        while (choice!=0){

            main_menu();
            choice = sc.nextInt();

            while (choice!=9 && choice!=0){
                switch (choice){
                    case 1:
                        account[account_counter] = new Account();
                        account[account_counter].setDetails();
                        account_counter++;
                        System.out.println();
                        System.out.println("1].CREATE NEW ACCOUNT");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 2:
//                        employee[employees_counter] = new Employees();
//                        employee[employees_counter].set_details();
//                        employees_counter++;
                        System.out.println("Enter amount u want to deposit:");
                        int amt = sc.nextInt();

                        System.out.println("Enter Customer Account Number:");
                        long userAcc= sc.nextLong();

                        boolean flag = false;

                        for (int i = 0; i < account_counter; i++) {
                            if(account[i].acNum == userAcc){
                                account[i].initial_amt += amt;
                                flag = true;
                            }
                            System.out.println();
                            System.out.println();
                        }

                        if(!flag){
                            System.out.println("Invalid Account Number....");
                        }

                        System.out.println();
                        System.out.println("2].DEPOSIT MONEY");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

//                    case 3:
//                        car[car_counter] = new Cars();
//                        car[car_counter].set_details();
//                        car_counter++;
//                        System.out.println();
//                        System.out.println("3].ADD NEW CAR");
//                        System.out.println("9].GO BACK TO MAIN MENU");
//                        choice = sc.nextInt();
//                        break;
//
                    case 4:
                        System.out.println("Enter amount u want to withdraw:");
                        int withdrwaAmt = sc.nextInt();
                        boolean flag1 = false;

                        System.out.println("Enter Customer Account Number:");
                        long userAccn= sc.nextLong();
                        for (int i=0; i<account_counter; i++){
                            if(account[i].acNum == userAccn){
                                account[i].initial_amt -= withdrwaAmt;
                                flag1 = true;
                            }
                        }
                        if(!flag1){
                            System.out.println("Amount Withdrawal successfully....");
                        }

                        System.out.println();
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
//
                    case 5:
                        for (int i = 0; i < account_counter; i++) {
                            account[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
//
                    case 6:
                        System.out.println("Enter Customer Account Number:");
                        long userAccNum = sc.nextLong();
                        for (int i = 0; i < account_counter; i++) {
                            if(account[i].acNum == userAccNum){
                                account[i].getDetails();
                            }
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }
    }
}
