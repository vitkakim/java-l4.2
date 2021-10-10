package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {
    TicketByPriceAscComparator comparator = new TicketByPriceAscComparator();

    @Test
    void shouldSortByPrice() {
        Ticket ticket1 = new Ticket(1, 3100, "LED", "ASF", 60);
        Ticket ticket2 = new Ticket(2, 3000, "LED", "AAQ", 180);
        Ticket ticket3 = new Ticket(3, 20000, "LED", "SCO", 6230);
        Ticket ticket4 = new Ticket(4, 1500, "LED", "VKO", 60);
        Ticket[] expected = new Ticket[]{ticket4, ticket2, ticket1, ticket3};
        Ticket[] actual = new Ticket[]{ticket1, ticket2, ticket3, ticket4};
        Arrays.sort(actual, comparator);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindTicket() {
        Ticket ticket = new Ticket();
        ticket.setFromAirport("LED");
        ticket.setToAirport("VKO");
        boolean actual = ticket.matches("LED", "VKO");
        assertTrue(actual);
    }

    @Test
    void shouldNotFindTicket() {
        Ticket ticket = new Ticket();
        ticket.setFromAirport("LED");
        ticket.setToAirport("VKO");
        boolean actual = ticket.matches("AAQ", "VKO");
        assertFalse(actual);
    }
}