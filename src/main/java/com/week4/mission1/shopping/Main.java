package com.week4.mission1.shopping;


import com.week4.mission1.shopping.customer.Customer;
import com.week4.mission1.shopping.customer.DiamondCustomer;
import com.week4.mission1.shopping.customer.PlatinumCustomer;
import com.week4.mission1.shopping.customer.RedCustomer;

/**
 * James	RED	10000원	2시간
 * Tomas	RED	30000원	2시간
 * Edward	PLATINUM	10000원	2시간
 * Percy	PLATINUM	30000원	2시간
 * Elizabet	DIAMOND	30000원	2시간
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new RedCustomer("James", "RED", 10000, 2);
//        if (customer instanceof RedCustomer) {
//            RedCustomer redCustomer = (RedCustomer) customer;
//            redCustomer.printCustomer();
//        }
        Customer customer2 = new RedCustomer("Tomas", "RED", 30000, 2);
        Customer customer3 = new PlatinumCustomer("Edward", "PLATINUM", 10000, 2);
        Customer customer4 = new PlatinumCustomer("Percy", "PLATINUM", 30000, 2);
        Customer customer5 = new DiamondCustomer("Elizabet", "DIAMOND", 30000, 2);
//        RedCustomer redCustomer = (RedCustomer) customer2;
//        redCustomer.printCustomer();
//        PlatinumCustomer platinumCustomer = (PlatinumCustomer) customer3;
//        platinumCustomer.printCustomer();
//        platinumCustomer = (PlatinumCustomer) customer4;
//        platinumCustomer.printCustomer();
//        DiamondCustomer diamondCustomer = (DiamondCustomer) customer5;
//        diamondCustomer.printCustomer();
        customer.printCustomer();
        customer2.printCustomer();
        customer3.printCustomer();
        customer4.printCustomer();
        customer5.printCustomer();
    }
}
