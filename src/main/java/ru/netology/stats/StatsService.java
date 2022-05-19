package ru.netology.stats;

public class StatsService {
    public long sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public float avgSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        float avgSum = sum / sales.length;
        return avgSum;
    }

    public long maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }

    public long minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public long countMonthBelow(int[] sales) {

        float avgSum = avgSum(sales);
        int countMonth = 0;
        for (int sale : sales) {
            if (avgSum > sale) {
                countMonth++;
            }
        }

        return countMonth;
    }

    public long countMonthAbove(int[] sales) {

        float avgSum = avgSum(sales);
        int countMonth = 0;
        for (int sale : sales) {
            if (avgSum > sale) {
                countMonth++;
            }
        }

        return countMonth;
    }
}



