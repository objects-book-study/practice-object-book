package ch06;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    // 필드 값을 제한하기 위해 생성자를 분류한다.
    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            this.ticket = ticket;
            return 0L;
        } else {
            minusAmount(ticket.getFee());
            this.ticket = ticket;
            return ticket.getFee();
        }
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}