package org.example.chap02;

/**
 * @author henoh@nkia.co.kr on 2022-08-05
 * @desc
 */
public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
