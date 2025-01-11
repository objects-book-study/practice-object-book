package org.example.ch01.ver2;

// 판매원
public class TicketSeller {
    // 판매원은 자신이 일하는 매표소를 알고 있어야 한다.
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }
}
