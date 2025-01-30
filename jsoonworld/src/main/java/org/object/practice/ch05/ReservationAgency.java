package org.object.practice.ch05;

import org.object.practice.ch04.Screening;

public class ReservationAgency {
    private boolean isDiscountable(DiscountCondition condition, Screening screening) {
        if(condition.getType() == DiscountConditionType.PERIOD) {
            return isSatisfiedByPeriod(condition, screening);
        }

        return isSatisfiedBySequence(condition, screening);
    }

    private boolean isSatisfiedByPeriod(DiscountCondition condition, Screening screening) {
        return  screening.getWhenScreened().getDayOfWeek().equals(condition.getDayOfWeek()) &&
                condition.getStartTime().compareTo(screening.getWhenScreened()) <= 0 &&
                condition.getEndTime().compareTo(screening.getWhenScreened()) >= 0;
    }

    private boolean isSatisfiedBySequence(DiscountCondition condition, Screening screening) {
        return condition.getSequence() == screening.getSequence();
    }
}
