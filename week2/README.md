
# Spring-Trash 2nd Week HW

## 목표

1. 주어진 기획안을 분석하여 테이블을 설계할 수 있다.
2. `MyBatis`를 이용해 DB를 접근할 수 있다.

## 💡 요구사항

> 드디어 어떤 DB를 이용할 지 윗선에서 결정이 났습니다. 사용할 DB는 아무래도 점유율이 높은 `MySQL`이 되었습니다. 그리고 Spring 환경에서 DB 접근 방법은 `MyBatis`를 이용하기로 결정되었습니다. 지금까지 제작한 회원 기능을 `MyBatis`를 이용해서 작동하도록 만들어주세요. 추가적으로 사내 게시판을 만들려고 합니다. 게시판은 자유 게시판과 공지사항 게시판이 있습니다. 공지 사항은 관리자들만 작성, 수정, 삭제가 가능하게 해주세요. 일반 게시글(자유 게시판 글)은 작성자만이 수정, 삭제가 가능하게 해주세요.


## TODO - LIST

|이름 | O/X |
|---|-----|
| Member Table 생성| X   |
| MyBatis 관련 Repository 생성 | X   |
| Member에 역할(관리자, 사원) 추가 | X   |
| 게시판 Table 생성 | X   |
| 게시판 기능 생성 | X   |
| 공지사항 기능 생성 | X   |
| 권한 별 기능 제한넣기  | X  |
| 게시판, 공지사항 JSP 파일 만들기 | X |
| 게시판 페이징 기능 추가 (선택과제)  | X |


### 제한 사항
요구사항에는 `MySQL` 명시하였지만, 선호하는 다른 `DBMS`가 있는 경우 그것을 사용해도 좋습니다. 
`MyBatis`를 이용함에 있어서 어떤 제한도 없습니다. `xml`을 쓰던 `annotation`을 쓰건 상관 없습니다.

## 과제 방법

이전에 작성한 코드에 Repository 단을 수정해주세요. 이전에 의존성을 잘 줄여왔다면, 크게 수정하는 데 어렵지 않을 것 입니다.
과제를 완료했다면 `PR`을 작성할 때, Table의 이미지 혹은 DDL을 함께 작성해주세요.


## 변경 이력
| 날짜       | 버전   | 작성자   | 설명        |
|------------|--------|----------|-------------|
| 2023-10-18 | 0.0    | 윤주석  | 초안 작성   |
| 2023-10-22 | 1.0    | 장청룡  | MyBatis 연동 |
| 2023-10-22 | 1.0    | 장청룡  | MemberMapperRepository 생성 |
| 2023-10-24 | 1.0    | 장청룡  | MemberService 생성 |
| 2023-10-25 | 1.0    | 장청룡  | MemberController 생성 |
