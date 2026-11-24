package com.exponent.bankapplication.controller;

import java.util.Scanner;

import com.exponent.bankapplication.service.RBI;
import com.exponent.bankapplication.serviceimpl.SBIImpl;

public class AdminController {
	public static void main(String[] args) {
		System.out.println("*Welcomes you to Online banking by RBI*");
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		RBI rbi = new SBIImpl();

		while (flag) {
			
			System.out.println("*********************************");
			System.out.println("|1.| Create Account           |");
			System.out.println("|2.| Show Account Details     |");
			System.out.println("|3.| Show Account Balance     |");
			System.out.println("|4.| Deposit Money            |");
			System.out.println("|5.| Withdraw Money           |");
			System.out.println("|6.| Update Account Details   |");
			System.out.println("|7.| Exit                     |");
			System.out.println("|__|__________________________|");
			System.out.println("Enter your choice between 1 to 7: ");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				rbi.createAccount();
				break;
			case 2:
				rbi.showAccountDetails();
				break;
			case 3:
				rbi.showAccountBalance();
				break;
			case 4:
				rbi.depositeMoney();
				break;
			case 5:
				rbi.withdrawMoney();
				break;
			case 6:
				rbi.updateAccountDetails();
				break;
			case 7:
				flag = false;
				break;
			default:
				System.out.println("Entered Wrong choice, Plzz enter the valid choice");

			}

		}
		System.out.println("********* Thankyou for Visiting *********");
		sc.close();
	}

}
