package ru.netology.stats;

public class StatsService {
    public int amountAll(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSales(long[] sales) {
        return amountAll(sales) / sales.length;
    }

    public int minimumSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maximumSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        int summMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                month = 1;
                summMonth = summMonth + month;
            }
            month++;
        }
        return summMonth;
    }

    public int aboveAverageSales(long[] sales) {
        int summMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                month = 1;
                summMonth = summMonth + month;
            }
            month++;
        }
        return summMonth;
    }
}

