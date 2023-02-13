package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();


    @Test
    public void shouldMinSales() {

        int expendedMin = 8;
        int actualMin = service.minSales(sales);

        Assertions.assertEquals(expendedMin, actualMin);
    }

    @Test
    public void shouldMaxSales() {

        int expendedMax = 7;
        int actualMax = service.maxSales(sales);

        Assertions.assertEquals(expendedMax, actualMax);
    }

    @Test
    public void shouldTotal() {

        int expendedSum = 180;
        int actualSum = service.sumSales(sales);

        Assertions.assertEquals(expendedSum, actualSum);
    }

    @Test
    public void shouldAverage() {

        int expendedAverage = 15;
        int actualAverage = service.averageSales(sales);

        Assertions.assertEquals(expendedAverage, actualAverage);
    }

    @Test
    public void shouldMoreAverage() {

        int expendedMore = 5;
        int actualMore = service.moreSales(sales);

        Assertions.assertEquals(expendedMore, actualMore);
    }

    @Test
    public void souldLessAverage() {

        int expendedLess = 5;
        int aclualLess = service.lessSales(sales);

        Assertions.assertEquals(expendedLess, aclualLess);
    }
}
