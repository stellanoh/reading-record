package org.example.chap02;

import java.time.LocalDateTime;

/**
 * @author henoh@nkia.co.kr on 2022-08-04
 * 요구사항
 * 상영할 영화, 순번, 상영 시작 시간을 인스턴스 변수로 포함
 * 상영 시작 시간을 반환하는 getStartTime 메서드
 * 순번의 일치 여부를 검사하는 isSequence 메서드
 * 기본 요금을 반환하는 getMovieFee 메서드 포함
 */
public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime screeningTime;

    public Screening(Movie movie, int sequence, LocalDateTime screeningTime) {
        this.movie = movie;
        this.sequence = sequence;
        this.screeningTime = screeningTime;
    }

    public LocalDateTime getStartTime() {
        return screeningTime;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }
}
