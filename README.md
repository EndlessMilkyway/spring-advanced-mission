# Spring 프레임워크 고급 미션

## 태스크 1번. Spring MVC에서 템플릿 엔진 사용(Thymeleaf)

### 요구사항

- Spring MVC에서 Thymeleaf 템플릿 엔진을 사용하여 동적 웹 페이지를 구현한다.
- 서버에서 데이터를 Thymeleaf 템플릿으로 전달하고, HTML 페이지에 동적으로 반영하는 방법을 구현한다

### 결과물

- 실행 결과 스크린샷

  

## 태스크 2번. Spring MVC에서 모델과 뷰 처리

### 요구사항

- Spring MVC에서 Model을 활용하여 데이터를 뷰로 전달하고, 이를 HTML에서 표시하는 방법을 구현
- `@ModelAttritube`와 `@RequestMapping`을 활용하여 데이터 바인딩을 처리하고 뷰에 전달

### 결과물

- 실행 결과 스크린샷

  

## 태스크 3번. Spring MVC에서 요청 파라미터 처리하기

### 요구사항

- Spring MVC에서 `@RequestParam`을 사용하여 URL 쿼리 파라미터나 폼 데이터를 처리한뒤 이를 모델에 전달하는 방법을 구현

### 결과물

- 실행 결과 스크린샷

  

## 태스크 4번. Spring MVC에서 유효성 검사 및 예외 처리

### 요구사항

- Spring MVC의 `@Valid`와 `@ExceptionHandler`를 사용하여 유효성 검사를 구현하고, 예외 로직을 추가

### 결과물

- 실행 결과 스크린샷

  

## 태스크 5번. Spring MVC에서 인터셉터 구현하기

### 요구사항

- Spring MVC에서 인터셉터를 구현하여 요청과 응답을 가로채고, 처리 전후로 특정 작업을 수행

### 결과물

- 실행 결과 스크린샷



## 태스크 6번. Spring Boot를 사용하여 웹 애플리케이션 프로젝트 생성하기

### 요구사항

- Spring Boot를 사용하여 웹 애플리케이션 프로젝트를 생성
- 프로젝트 생성 과정에서 필요한 의존성을 추가

### 결과물

- 프로젝트 생성 결과 스크린샷

  

## 태스크 7, 8번. Spring Boot와 Spring MVC를 활용하여 웹 애플리케이션 개발하기 (요구사항 중복)

### 요구사항

- Spring Boot와 Spring MVC를 함께 사용하여 웹 애플리케이션을 개발
- 컨트롤러, 서비스, 리포지토리 등의 계층 구조를 구현

### 결과물

- 웹 애플리케이션 스크린샷

  

## 태스크 9번. 게시판 화면 구현하기

### 요구사항

- 웹 프론트엔드 기술(HTML, CSS, JavaScript)을 사용하여 게시판 화면을 구현
- 게시글 작성, 목록 조회, 상세 보기 등의 기능을 화면에 구현

### 결과물

- 게시판 화면 구현 결과

  

## 태스크 10번. Spring Security 기본 설정하기

### 요구사항

- Spring Security를 사용하여 웹 애플리케이션의 기본 보안 설정을 구성
- 기본 로그인 페이지와 사용자 인증을 설정하고, 로그인 후 리다이렉트 동작을 테스트

### 결과물

- 실행 결과 스크린샷

  

## 태스크 11번. Spring Security 권한 부여 및 접근 제한

### 요구사항

- Spring Security를 사용하여 특정 URL에 대해 권한을 설정
- 권한이 없는 사용자가 접근 시 오류 메시지를 반환하도록 설정

### 결과물

- 실행 결과 스크린샷



## 태스크 12번. Spring Security를 사용하여 회원가입 기능 구현하기

### 요구사항

- Spring Security를 활용하여 회원가입 기능을 구현
- 사용자 정보를 입력받아 데이터베이스에 저장하는 회원가입 로직을 작성
- 회원가입 기능이 올바르게 동작하는지 확인

### 결과물

- 회원가입 과정과 결과 스크린샷

  

## 태스크 13번. Spring Security를 사용하여 로그인 기능 구현하기

### 요구사항

- Spring Security 라이브러리를 사용하여 로그인 기능을 구현
- 사용자 인증 과정을 설정하고, 로그인 폼 및 로그인 처리 로직을 작성
- 로그인 기능이 올바르게 동작하는지 확인

### 결과물

- 로그인 과정과 결과 스크린샷

  

## 태스크 14번. Spring Security를 사용하여 로그아웃 기능 구현하기

### 요구사항

- Spring Security를 사용하여 로그아웃 기능을 구현
- 로그아웃 처리 과정을 설정하고, 로그아웃 기능이 정상적으로 동작하는지 확인

### 결과물

- 로그아웃 동작 과정과 결과 스크린샷

  

---

# 고객 요구사항

- 게시판 기능을 제공하는 웹 애플리케이션을 개발해야 한다.

  - 회원과 관련된 기능으로는 회원가입, 로그인 및 로그아웃이 존재한다.
    - 시간적 여유가 있을 경우 회원 탈퇴 기능도 구현할 예정

  - 로그인을 하지 않은 익명 유저는 로그인을 하지 않을 경우 게시글 작성이 불가능하다.
    - 이는 익명 유저는 목록 조회와 상세 보기만 가능하다는 것을 의미한다.

  - 회원은 게시판에 게시글 작성(CREATE), 목록 조회 및 상세 보기(READ)가 가능하다.
    - 시간적 여유가 있을 경우 게시글 수정 및 삭제 기능도 구현할 예정

# 개발 요구사항

- Thymeleaf 템플릿 엔진을 사용하여 동적인 웹 페이지를 구현해야 한다.
  - [x] 의존성 추가 완료
- Spring Boot와 Spring MVC를 활용하여 개발을 진행해야 한다.
  - [x] 의존성 추가 완료
- Spring Security를 활용하여 개발을 진행해야 한다.
  - [x] 의존성 추가 완료
- Contorller, Service, Repository 계층을 분리하여 MVC 패턴을 준수하며 개발을 진행하야 한다.
- `@ModelAttritube`와 `@RequestMapping`을 활용하여 데이터 바인딩을 처리하고 뷰에 전달해야 한다.
  - 적용 가능한 부분: 게시글 목록 및 게시글 상세 페이지 로딩 시
- `@RequestParam`을 사용하여 URL 쿼리 파라미터나 폼 데이터를 처리한뒤 이를 모델에 전달해야 한다.
  - 적용 가능한 부분: 웹 애플리케이션 내에 존재하는 모든 URI
- `@Valid`와 `@ExceptionHandler`를 사용하여 유효성 검사를 구현하고, 예외 로직을 추가해야 한다.
  - 적용 가능한 부분: 게시글 등록, 회원 등록 시 클라이언트 측에서 넘어온 입력 데이터를 검증
- 인터셉터를 구현하여 요청과 응답을 가로채고, 처리 전후로 특정 작업을 수행해야 한다.
  - 적용 가능한 부분: Spring Security와 관련된 부분, 쿼리 성능 측정
