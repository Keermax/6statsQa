package ru.netology.stats;

public class StatsService {
    public int minSales(int[] sales) {

        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;

            }

        }
        return minMonth;
    }

    public int maxSales(int[] sales) {

        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int value : sales) {
            sum += value;
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int sum = sumSales(sales);
        int average = sum / sales.length;

        return average;
    }

    public int moreSales(int[] sales) {
        // int sum = sumSales(sales);
        int average = averageSales(sales);
        int more = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average)
                more++;


        }

        return more;
    }

    public int lessSales(int[] sales) {

        int average = averageSales(sales);
        int less = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average)
                less++;
        }
        return less;
    }

}