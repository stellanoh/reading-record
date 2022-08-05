package org.example.chap02;

/**
 * @author henoh@nkia.co.kr on 2022-08-05
 * @desc 고객, 상영정보, 예매 요금, 인원 수를 속성으로 가짐
 */
public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
