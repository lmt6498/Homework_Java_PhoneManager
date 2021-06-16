package com.codegym;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class PhoneBook extends Phone{

    ArrayList<PhoneBook> PhoneList = new ArrayList<>();

    public PhoneBook() {

    }

    public PhoneBook(String name, String phone) {
        super(name, phone);
    }


    public void show() {
        for (PhoneBook s : PhoneList) {
            System.out.println(s);
        }
    }

    @Override
    void insertPhone(String name, String phone) {
        for (PhoneBook s : PhoneList) {
            if (s.getName().equals(name)) {
                if (!s.getPhone().equals(phone)) {
                    s.setPhone(((s.getPhone() + ":" + phone)));
                    return;
                }
                return;
            }
        }
        PhoneList.add(new PhoneBook(name, phone));
    }

    @Override
    void removePhone(String name) {
        PhoneBook target = null;
        for (PhoneBook s : PhoneList) {
            if (s.getName().equals(name)) {
                target = s;
            }
        }
        PhoneList.remove(target);
    }

    @Override
    void updatePhone(String name, String newPhone) {
        for (PhoneBook s : PhoneList) {
            if (s.getName().equals(name)) {
                s.setPhone(newPhone);
                return;
            }
        }
    }

    @Override
    void searchPhone(String name) {
        for (PhoneBook s : PhoneList) {
            if (s.getName().equals(name)) {
                System.out.println(s);
            }
            return;
        }
    }

    @Override
    void sort() {
        Comparator nameComparator = new NameComparator();
        PhoneList.sort(nameComparator);
        }
    }

