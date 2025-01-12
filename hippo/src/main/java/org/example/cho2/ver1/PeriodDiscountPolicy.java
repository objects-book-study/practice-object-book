package org.example.cho2.ver1;

public class PeriodDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PeriodDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
