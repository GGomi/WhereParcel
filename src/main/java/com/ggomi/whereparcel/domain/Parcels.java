package com.ggomi.whereparcel.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// (lombok) 기본 생성자 자동 생성
@NoArgsConstructor(access = AccessLevel.PROTECTED)
// (lombok) Getter 자동생성
@Getter
public class Parcels {
    // 택배회사 코드
    private String key;

    // 송장번호
    private String parcelCode;

    @Builder
    public Parcels(String key, String parcelCode) {
        this.key = key;
        this.parcelCode = parcelCode;
    }
}
