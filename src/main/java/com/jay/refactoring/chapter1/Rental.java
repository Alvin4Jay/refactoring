package com.jay.refactoring.chapter1;

/**
 * 租赁载体
 *
 * @author zhongshuo.xwj
 */
public class Rental {

    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public double getCharge() {
        return movie.getCharge(dayRented);
    }

    public double getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(dayRented);
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    public void setDayRented(int dayRented) {
        this.dayRented = dayRented;
    }
}
