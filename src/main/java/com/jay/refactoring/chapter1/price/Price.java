package com.jay.refactoring.chapter1.price;

/**
 * 价格计算
 *
 * @author zhongshuo.xwj
 */
public abstract class Price {

    public abstract double getCharge(int dayRented);


    public double getFrequentRenterPoints(int dayRented) {
        return 1;
    }

    public abstract int getPriceCode();

}
