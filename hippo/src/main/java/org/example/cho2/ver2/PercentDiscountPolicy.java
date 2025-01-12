package org.example.cho2.ver2;

public class PercentDiscountPolicy implements DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        this.percent = percent;
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
