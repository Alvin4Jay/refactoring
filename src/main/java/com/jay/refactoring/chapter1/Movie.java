package com.jay.refactoring.chapter1;

import com.jay.refactoring.chapter1.price.ChildrenPrice;
import com.jay.refactoring.chapter1.price.NewReleasePrice;
import com.jay.refactoring.chapter1.price.Price;
import com.jay.refactoring.chapter1.price.RegularPrice;

/**
 * 电影
 *
 * @author zhongshuo.xwj
 */
public class Movie {

    public static final int REGULAR = 0;
    public static final int CHILDREN = 2;
    public static final int NEW_RELEASE = 1;

    private String title;
    private Price priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public double getCharge(int dayRented) {
        return priceCode.getCharge(dayRented);
    }

    public double getFrequentRenterPoints(int dayRented) {
        return priceCode.getFrequentRenterPoints(dayRented);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return priceCode.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case CHILDREN:
                this.priceCode = new ChildrenPrice();
                break;
            case REGULAR:
                this.priceCode = new RegularPrice();
                break;
            case NEW_RELEASE:
                this.priceCode = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("illegal price code");
        }
    }
}
