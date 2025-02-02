package org.example.ch05;

import org.example.ch03.ver1.Money;

import java.time.Duration;

public class NoneDiscountMovie extends Movie{
    public NoneDiscountMovie(String title, Duration runningTime, Money fee, DiscountCondition... discountConditions) {
        super(title, runningTime, fee, discountConditions);
    }

    @Override
    protected Money calculateDiscountAmount() {
        return Money.ZERO;
    }
}
