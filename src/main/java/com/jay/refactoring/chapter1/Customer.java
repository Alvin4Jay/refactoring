package com.jay.refactoring.chapter1;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 顾客
 *
 * @author zhongshuo.xwj
 */
public class Customer {

    private String name;
    private Vector<Rental> rentals = new Vector<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        Enumeration<Rental> elements = rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (elements.hasMoreElements()) {
            Rental each = elements.nextElement();

            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
        }

        // add footer lines
        result += "Amount owned is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        Enumeration<Rental> elements = rentals.elements();
        String result = "<h1>Rental Record for <em>" + getName() + "</em></h1><p>\n";
        while (elements.hasMoreElements()) {
            Rental each = elements.nextElement();

            // show figures for this rental
            result += each.getMovie().getTitle() + ": " + each.getCharge() + "<br/>\n";
        }

        // add footer lines
        result += "<p>Amount owned is <em>" + getTotalCharge() + "</em><p>\n";
        result += "You owe <em>" + getTotalFrequentRenterPoints() + "</em> frequent renter points<p>";
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration<Rental> elements = rentals.elements();
        while (elements.hasMoreElements()) {
            Rental rental = elements.nextElement();
            result += rental.getFrequentRenterPoints();
        }
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration<Rental> elements = rentals.elements();
        while (elements.hasMoreElements()) {
            Rental rental = elements.nextElement();
            result += rental.getCharge();
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(Vector<Rental> rentals) {
        this.rentals = rentals;
    }
}
