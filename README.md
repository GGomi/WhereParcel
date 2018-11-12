# WhereParcel


[![Build Status](https://travis-ci.org/ggomi/WhereParcel.svg?branch=master)](https://travis-ci.org/ggomi/WhereParcel)

<!logo 위치>

WhereParcel은 대표 택배사의 배송추적 페이지를 파싱하여 Json형태로 제공해주는 API.

- dependencies

## Courier List

Key Name | Courier Name | Progress
---- | ---- | ----
Post Office | 우체국택배 | #TODO
CJ Express | CJ대한통운 | #TODO
KG Logis | KG 로지스 | 예정
Logen | 로젠택배 | 예정

## Result

**Category** | **Name** | **Explain**
:----: | :----: | :----:
**기본정보** | 등기번호 | 입력한 등기번호
|-| 보내는분 | 해당 소포 발송자
|-| 배달결과 | 현재 배달 상태
|-|-|-|
**배송진행상황** | 날짜 | 현재위치에 입력되어있는 장소에 처리된 날짜
|-| 시간 | 처리된 시간
|-| 현재위치 | 소포의 위치
|-| 처리현황 | 현재위치에서의 소포처리상태
 




