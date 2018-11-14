package com.ggomi.whereparcel.controller;

import com.ggomi.whereparcel.domain.ParcelRequestBodyDto;
import com.ggomi.whereparcel.service.ParcelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;


@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
public class RestController {
    private ParcelService parcelService;
    // 우체국 택배 조회
    @GetMapping("/")
    public void searchParcel(@RequestBody ParcelRequestBodyDto dto) {
        parcelService.search(dto);
    }
}
