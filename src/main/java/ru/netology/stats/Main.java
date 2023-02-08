package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long arr = service.amountAll(sales);
        System.out.println("Сумма продаж за все мясяц " + arr);
        long arr2 = service.averageSales(sales);
        System.out.println("Средняя сумма продаж " + arr2);
        long arr3 = service.minimumSales(sales);
        System.out.println("Месяц, в котором был минимум продаж " + arr3);
        long arr4 = service.maximumSales(sales);
        System.out.println("Месяц, в котором был максимум продаж " + arr4);
        long arr5 = service.belowAverageSales(sales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего " + arr5);
        long arr6 = service.aboveAverageSales(sales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего " + arr6);
    }
}