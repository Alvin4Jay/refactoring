package com.jay.refactoring.chapter1.price;

import com.jay.refactoring.chapter1.Movie;

/**
 * 新片价格
 *
 * @author zhongshuo.xwj
 */
public class NewReleasePrice extends Price {

    @Override
    public double getCharge(int dayRented) {
        return dayRented * 3;
    }

    @Override
    public double getFrequentRenterPoints(int dayRented) {
        return dayRented > 1 ? 2 : 1;
    }

    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
