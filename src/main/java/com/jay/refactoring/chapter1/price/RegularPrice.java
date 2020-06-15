package com.jay.refactoring.chapter1.price;

import com.jay.refactoring.chapter1.Movie;

/**
 * 常规片价格
 *
 * @author zhongshuo.xwj
 */
public class RegularPrice extends Price {
    @Override
    public double getCharge(int dayRented) {
        double result = 2;
        if (dayRented > 2) {
            result += (dayRented - 2) * 1.5;
        }
        return result;
    }

    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }
}
