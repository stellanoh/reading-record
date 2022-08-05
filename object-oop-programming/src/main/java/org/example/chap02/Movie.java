package org.example.chap02;

import java.time.Duration;

/**
 * @author henoh@nkia.co.kr on 2022-08-05
 * 제목, 상영 시간, 기본 요금, 할인 정책을 속성으로 가지고,
 * 속성 값은 생성자를 통해 주입 받음
 */
public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    /*
     * discountPolicy에 calculateDiscountAmount 메시지를 전송해 할인 요금을 반환 받음
     * Movie는 기본요금 fee 에서 반환된 할인 요금 차감
     */
    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }

}
