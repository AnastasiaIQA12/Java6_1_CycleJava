package ru.netology.stats;

public class StatsService {

    public long sumSales(int[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public float averageAmount(int[] sales) {
        long sum = sumSales(sales);
        float averageSum = (float) sum / 12;
        return averageSum;
    }

    public int monthWithMaxSales(int[] sales) {
        long max = sales[0];
        int index = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= max) {
                max = sale;
                month = index;
            }
            index++;
        }
        return month;
    }

    public int monthWithMinSales(int[] sales) {
        long min = sales[0];
        int index = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= min) {
                min = sale;
                month = index;
            }
            index++;
        }
        return month;
    }
    public int countMonthUnderMiddle(int[] sales) {
        float averageSum = averageAmount(sales);
        int countMonth = 0;
        for (long sale : sales) {
            if (sale < averageSum) {
                countMonth += 1;
            }
        }
        return countMonth;
    }

    public int countMonthOverMiddle(int[] sales) {
        float averageSum = averageAmount(sales);
        int countMonth = 0;
        for (long sale : sales) {
            if (sale > averageSum) {
                countMonth += 1;
            }
        }
        return countMonth;
    }


}
