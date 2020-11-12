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
        StatsService service = new StatsService();
        long sum = service.sumSales(sales);
        float averageSum = (float) sum / 12;
        return averageSum;
    }

    public int[] monthWithMaxSales(int[] sales) {
        long max = sales[0];
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        int index = 0;
        int[] month = new int[12];
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale == max) {
                month[index++] = numberMonth;
            }
            numberMonth++;
        }
        return month;
    }

    public int[] monthWithMinSales(int[] sales) {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        int index = 0;
        int[] month = new int[12];
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale == min) {
                month[index++] = numberMonth;
            }
            numberMonth++;
        }
        return month;
    }

    public int countMonthUnderMiddle(int[] sales) {
        StatsService service = new StatsService();
        float averageSum = service.averageAmount(sales);
        int countMonth = 0;
        for (long sale : sales) {
            if (sale < averageSum) {
                countMonth += 1;
            }
        }
        return countMonth;
    }

    public int countMonthOverMiddle(int[] sales) {
        StatsService service = new StatsService();
        float averageSum = service.averageAmount(sales);
        int countMonth = 0;
        for (long sale : sales) {
            if (sale > averageSum) {
                countMonth += 1;
            }
        }
        return countMonth;
    }


}
