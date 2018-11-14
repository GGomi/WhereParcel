package com.ggomi.whereparcel.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ParcelRequestBodyDto {
    private String key;
    private String parcelCode;

//    @Builder
//    public ParcelsRequestBodyDto(String key, String parcelCode) {
//        this.key = key;
//        this.parcelCode = parcelCode;
//    }
}
