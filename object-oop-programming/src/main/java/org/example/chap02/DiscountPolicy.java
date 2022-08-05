package org.example.chap02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author henoh@nkia.co.kr on 2022-08-05
 * @desc
 */
public abstract class DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition condition : conditions) {
            if(condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    protected abstract Money getDiscountAmount(Screening screening);

}
