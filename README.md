# 영화 예매 사이트 프로젝트

개발 기간 2022.08.29 ~ 2022.09.30

### 프로젝트 소개
* JSP, Model2를 이용한 영화 예매 사이트.
* 회원 관리, 영화 정보 확인, 영화 예매 및 결제 기능 구현.
* 기술 스택 - JSP, JAVA8, HTML5, CSS3, jQuery, JavaScript, AJAX, MySQL
  
    
#### 목차
1. [설계 단계](#예매)
    - [요구사항 분석 및 설계](#1.-요구사할-분석-및-설계)
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
    * 로그인, 로그아웃, 관리자
        * 관리자 페이지 - 영화 등록 기능.
    * 마이페이지
        * 예매 내역, 포인트 적립, 사용 내역 조회.
        * 회원 정보 수정, 탈퇴.
        <img src="https://user-images.githubusercontent.com/115868277/197092937-f3d9a938-1c41-45d6-b118-7916e4167330.png" width="300" height="400">
        <img src="https://user-images.githubusercontent.com/115868277/197092954-f1767f62-f876-4ec0-89b5-f8f0d71684b9.png" width="300" height="400">
        <img src="https://user-images.githubusercontent.com/115868277/197092945-cb9f49a7-d021-4178-9d11-93126a2d2563.png" width="300" height="400">
        

<br>
<br>

2. 영화 정보   
   * 영화 정보 확인
      * 예매율 순 현재상영작 출력.
      * 개봉작, 개봉 예정작, 장르별 영화 조회.
   * 영화 리뷰
      * 리뷰 작성, 리뷰작성 시 포인트 지급.
      * 예매 여부에 따라 리뷰입력 제어.
      <img src="https://user-images.githubusercontent.com/115868277/197093448-e3fc0301-a53e-4c36-a701-9ddaec7ff3e5.png" width="450" height="400">
      <img src="https://user-images.githubusercontent.com/115868277/197093451-31db0632-cf3c-4206-8c86-943319153136.png" width="450" height="400">
      

<br>
<br>

3. 예매 및 결제
    * 예매
        * AJAX를 이용한 영화, 상영 날짜, 상영 시간 선택.
        * 좌석 선택 - 예매된 좌석 제어.
        * 미선택 시 이동 제어.
    * 결제
        * 예매 정보 확인 및 포인트 사용.
        * 예매 동기화 제어.
        * 결제 API - 아임포트.
        <img src="https://user-images.githubusercontent.com/115868277/197094076-1ef06392-dc1c-4a92-ba49-9b132b7fc3e1.png" width="900" height="250">  
        <img src="https://user-images.githubusercontent.com/115868277/197094069-8827c6ca-7185-48f0-92e2-394304e69bfa.png" width="900" height="300">     
        <img src="https://user-images.githubusercontent.com/115868277/197094082-0ee3bb38-abd4-4237-8d10-be01f1d62266.png" width="900" height="300">   
    
   
