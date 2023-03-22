package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testUnder1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(actual, expected);

    }

    @Test
    public void test1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);

    }

    @Test
    public void testOver1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 200;
        int actual = service.remain(1800);

        assertEquals(actual, expected);

    }
}