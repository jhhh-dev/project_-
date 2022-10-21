# 영화 예매 사이트 프로젝트

개발 기간 2022.08.29 ~ 2022.09.30

### 프로젝트 소개
* JSP, Model2를 이용한 영화 예매 사이트.
* 회원 관리, 영화 정보 확인, 영화 예매 및 결제 기능 구현.
* 기술 스택 - JSP, JAVA8, HTML5, CSS3, jQuery, JavaScript, AJAX, MySQL
  
    
#### 목차
1. [설계 단계](#1.-설계-단계)
    - 요구사항 분석 및 설계
    - 테이블 정의서(디비 설계)
    - ERD 다이어그램
2. 주요 기능
    * 회원 관리
    * 영화 정보
    * 예매 및 결제


## 1. 설계 단계
1. 요구사할 분석 및 설계
   ![Untitled](https://user-images.githubusercontent.com/115868277/197087098-04ae9234-4383-42e3-aee9-bc9a0b192322.png)
<br>
<br>

2. 테이블 정의서 (디비 설계)
   ![Untitled (1)](https://user-images.githubusercontent.com/115868277/197088520-204d47ee-4a7e-4bf9-a76a-59ea0a0305a2.png)
<br>
<br>

3. ERD 다이어그램   
    ![Untitled (2)](https://user-images.githubusercontent.com/115868277/197088825-e01476bf-c1e4-4c6e-8178-3b18bb1ec01a.png)
    
    
<br>
<br>  
<br>  
<br>  

## 2. 주요 기능
1. 회원 관리  
    * 회원 가입
        * AJAX를 이용한 아이디, 전화번호 유효성 검사.
        * 필수요소 미기재/미체크 시 페이지 이동 제어. 
        <img src="" width="700" height="370">
        <img src="" width="700" height="370">
        <img src="" width="700" height="370">
    * 로그인, 로그아웃, 관리자
        * 관리자 페이지 - 영화 등록 기능.
    * 마이페이지
        * 예매 내역, 포인트 적립, 사용 내역 조회.
        * 회원 정보 수정, 탈퇴.

<br>
<br>

2. 영화 정보   
   * 영화 정보 확인
      * 예매율 순 현재상영작 출력.
      * 개봉작, 개봉 예정작, 장르별 영화 조회.
   * 영화 리뷰
      * 리뷰 작성, 리뷰작성 시 포인트 지급.
      * 예매 여부에 따라 리뷰입력 제어.

<br>
<br>

3. 
    
   
