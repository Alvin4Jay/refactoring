package com.jay.refactoring.chapter1.price;

import com.jay.refactoring.chapter1.Movie;

/**
 * 儿童片价格
 *
 * @author zhongshuo.xwj
 */
public class ChildrenPrice extends Price {
    @Override
    public double getCharge(int dayRented) {
        double result = 1.5;
        if (dayRented > 3) {
            result += (dayRented - 3) * 1.5;
        }
        return result;
    }

    @Override
    public int getPriceCode() {
        return Movie.CHILDREN;
    }
}
