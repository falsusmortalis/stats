package ru.netologe.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual;
        actual = service.amountAll(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual;
        actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMinimumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual;
        actual = service.minimumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMaximumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual;
        actual = service.maximumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcBelowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual;
        actual = service.belowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual;
        actual = service.aboveAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
