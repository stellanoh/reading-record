package org.example.chap02;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodDiscountCondition implements DiscountCondition {
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        if(!screening.getStartTime().getDayOfWeek().equals(dayOfWeek)) {
            return false;
        }
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek)
                && screening.getStartTime().toLocalTime().isAfter(startTime)
                && screening.getStartTime().toLocalTime().isBefore(endTime);
    }
}
