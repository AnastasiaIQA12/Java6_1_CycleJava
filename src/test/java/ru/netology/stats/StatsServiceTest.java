package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();

    @org.junit.jupiter.api.Test
    void sumSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void averageAmount() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 15.0f;
        float actual = service.averageAmount(sales, service);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void monthWithMaxSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        int actual = service.monthWithMaxSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void monthWithMinSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.monthWithMinSales(sales);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void countMonthUnderMiddle() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthUnderMiddle(sales, service);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void countMonthOverMiddle() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthOverMiddle(sales, service);
        assertEquals(expected, actual);
    }

}