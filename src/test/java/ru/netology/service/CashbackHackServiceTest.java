package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testRemainWithCashback() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }
}