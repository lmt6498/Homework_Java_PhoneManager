package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        int choice;
        while (true) {
            System.out.println("PHONEBOOK MANAGEMENT SYSTEM");
            System.out.println("1.Insert Phone");
            System.out.println("2. Remove Phone");
            System.out.println("3. Update Phone");
            System.out.println("4. Search Phone");
            System.out.println("5. Sort:");
            System.out.println("0. Exit");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên: ");
                    String name = input.nextLine();
                    System.out.println("Nhập sđt: ");
                    String phone = input.nextLine();
                    phoneBook.insertPhone(name, phone);
                    phoneBook.show();
                    break;

                case 2:
                    System.out.println("Nhập tên: ");
                    String name1 = input.nextLine();
                    phoneBook.removePhone(name1);
                    phoneBook.show();
                    break;
                case 3:
                    System.out.println("Nhập tên: ");
                    String name2 = input.nextLine();
                    System.out.println("Nhập sđt: ");
                    String phone2 = input.nextLine();
                    phoneBook.updatePhone(name2, phone2);
                    phoneBook.show();
                    break;
                case 4:
                    System.out.println("Nhập tên: ");
                    String name3 = input.nextLine();
                    phoneBook.searchPhone(name3);
                    break;
                case 5:
                    System.out.println("Sắp xếp: ");
                    phoneBook.sort();
                    phoneBook.show();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
