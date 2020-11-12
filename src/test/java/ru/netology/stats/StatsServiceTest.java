package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void sumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.sumSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void averageAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 15.0f;

        float actual = service.averageAmount(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void monthWithMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] expected = {5, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int[] actual = service.monthWithMaxSales(sales);
        assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void monthWithMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] expected = {8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int[] actual = service.monthWithMinSales(sales);
        assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void countMonthUnderMiddle() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.countMonthUnderMiddle(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void countMonthOverMiddle() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.countMonthOverMiddle(sales);
        assertEquals(expected, actual);
    }
}