package org.example.ch01.ver2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 티켓을 판매하기 위한 매표소
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
