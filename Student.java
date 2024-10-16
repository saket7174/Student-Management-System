package com.first.ok;

import java.util.*;

class Manage {
		String userName = "ABC", uName, name, grade ;
		int userid = 123, uid, menu,age ,id;
		String options[] = new String[4];

		List<String> listStudents = new ArrayList<>();
//		listStudents.add("RAm");
//		listS
		Scanner r = new Scanner(System.in);

		boolean Login() {
			System.out.println("Enter User Name :");
			uName = r.next();
			System.out.println("Enter user id :");
			uid = r.nextInt();
			// r.close().
			if (uName.equals(userName) && uid == userid) {
				System.out.println("Login Successful ! ");
				System.out.println("------------------------------");
				Operations();//Khali isi ko call kiye hai
				return true;
			} else {
				System.out.println("Login Failed ! Incorrect Credentials");
				return false;

		}
	}
	//***********************************e to login k liye hai koi lena den nahi hai
		void Exit() {
			System.out.println("Thank You");
			System.exit(0);
		}

		void NewName() {//****************Add
			name=r.next().toUpperCase();//user se dalwai
			if (name.matches("[a-zA-Z]+")) {
//			*************************************
				System.out.println(name);
				System.out.println(name +" Added successsfully ");
			} else {
				System.out.println("Invalid name");
			}
			System.out.println("-------------------");
		}

		void View() {//**********************************************
//			if (name.matches("[a-zA-Z]+")) {
////				balance = balance - amount;
////				name = "Ram";
//				System.out.println("Name Added Successfully in Database");
//			} else {
//				System.out.println(" Wrong Input  ! Name cant be Integer Value ");
//			}
			System.out.println("1. Ram \n 2. Shyam \n 3. Shita\n 4. Gita ");
		}

		void Delete() {
//			balance = balance + amount;
//			System.out.println("Your account balance after depositing Rs: "+amount+"is Rs " + balance);
//			System.out.println("Name Removed from the Database ");
		}


		void Operations() {
			System.out.println("Operations Menue");
			System.out.println("-----------------------------");
			options[0] = "Add New Student\n  ";
			options[1] = "View All Student\n ";
			options[2] = "Remove/Delete Student\n";
			options[3] = "Exit  ";
			

			for (int i = 0; i < options.length; i++) {
				System.out.println(i + 1 + " " + options[i]);
			}
			System.out.println("---------------------------");
			do {
				System.out.println("Select the operations(Select your option . )");
				menu = r.nextInt() -1;
				switch (menu) {
				case 0: {
					System.out.println("Enter the Name to be Added ");
					NewName();
					break;
				}
				case 1: {
					System.out.println(" 1. Ram\n 2. Shyam\n 3. Shita\n 4. Gita");
					ArrayList<String> names=new ArrayList<String>();
//					amount = r.nextInt();
//					View();
					break;
				}
				case 2: {
					System.out.println("Name Deleated from the DataBase  ");
					 String name = r.nextLine();;
					Delete();
					break;
				}
				case 3: {
					Exit();
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value:" + (menu + 1));
				}
			} while (menu < 4);
			r.close();
		}

	}

////////////////////////////////////////
//	public class Practice {
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method
		System.out.println("*-------Welcome to Student Management System-------*\n\n ");
		Manage bank = new Manage();
		bank.Login();
	}

}
