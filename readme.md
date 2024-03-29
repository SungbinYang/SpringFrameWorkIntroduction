# Spring PetClinic Sample Application [![Build Status](https://github.com/spring-projects/spring-petclinic/actions/workflows/maven-build.yml/badge.svg)](https://github.com/spring-projects/spring-petclinic/actions/workflows/maven-build.yml)

## Understanding the Spring Petclinic application with a few diagrams
<a href="https://speakerdeck.com/michaelisvy/spring-petclinic-sample-application">See the presentation here</a>

## Running petclinic locally
Petclinic is a [Spring Boot](https://spring.io/guides/gs/spring-boot) application built using [Maven](https://spring.io/guides/gs/maven/). You can build a jar file and run it from the command line (it should work just as well with Java 8, 11 or 17):


```
git clone https://github.com/spring-projects/spring-petclinic.git
cd spring-petclinic
./mvnw package
java -jar target/*.jar
```

You can then access petclinic here: http://localhost:8080/

<img width="1042" alt="petclinic-screenshot" src="https://cloud.githubusercontent.com/assets/838318/19727082/2aee6d6c-9b8e-11e6-81fe-e889a5ddfded.png">

Or you can run it from Maven directly using the Spring Boot Maven plugin. If you do this it will pick up changes that you make in the project immediately (changes to Java source files require a compile as well - most people use an IDE for this):

```
./mvnw spring-boot:run
```

> NOTE: Windows users should set `git config core.autocrlf true` to avoid format assertions failing the build (use `--global` to set that flag globally).

## In case you find a bug/suggested improvement for Spring Petclinic
Our issue tracker is available here: https://github.com/spring-projects/spring-petclinic/issues


## Database configuration

In its default configuration, Petclinic uses an in-memory database (H2) which
gets populated at startup with data. The h2 console is automatically exposed at `http://localhost:8080/h2-console`
and it is possible to inspect the content of the database using the `jdbc:h2:mem:testdb` url.
 
A similar setup is provided for MySql in case a persistent database configuration is needed. Note that whenever the database type is changed, the app needs to be run with a different profile: `spring.profiles.active=mysql` for MySql.

You could start MySql locally with whatever installer works for your OS, or with docker:

```
docker run -e MYSQL_USER=petclinic -e MYSQL_PASSWORD=petclinic -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=petclinic -p 3306:3306 mysql:5.7.8
```

Further documentation is provided [here](https://github.com/spring-projects/spring-petclinic/blob/main/src/main/resources/db/mysql/petclinic_db_setup_mysql.txt).

## Working with Petclinic in your IDE

### Prerequisites
The following items should be installed in your system:
* Java 8 or newer (full JDK not a JRE).
* git command line tool (https://help.github.com/articles/set-up-git)
* Your preferred IDE 
  * Eclipse with the m2e plugin. Note: when m2e is available, there is an m2 icon in `Help -> About` dialog. If m2e is
  not there, just follow the install process here: https://www.eclipse.org/m2e/
  * [Spring Tools Suite](https://spring.io/tools) (STS)
  * IntelliJ IDEA
  * [VS Code](https://code.visualstudio.com)

### Steps:

1) On the command line
    ```
    git clone https://github.com/spring-projects/spring-petclinic.git
    ```
2) Inside Eclipse or STS
    ```
    File -> Import -> Maven -> Existing Maven project
    ```

    Then either build on the command line `./mvnw generate-resources` or using the Eclipse launcher (right click on project and `Run As -> Maven install`) to generate the css. Run the application main method by right clicking on it and choosing `Run As -> Java Application`.

3) Inside IntelliJ IDEA
    In the main menu, choose `File -> Open` and select the Petclinic [pom.xml](pom.xml). Click on the `Open` button.

    CSS files are generated from the Maven build. You can either build them on the command line `./mvnw generate-resources` or right click on the `spring-petclinic` project then `Maven -> Generates sources and Update Folders`.

    A run configuration named `PetClinicApplication` should have been created for you if you're using a recent Ultimate version. Otherwise, run the application by right clicking on the `PetClinicApplication` main class and choosing `Run 'PetClinicApplication'`.

4) Navigate to Petclinic

    Visit [http://localhost:8080](http://localhost:8080) in your browser.


## Looking for something in particular?

|Spring Boot Configuration | Class or Java property files  |
|--------------------------|---|
|The Main Class | [PetClinicApplication](https://github.com/spring-projects/spring-petclinic/blob/main/src/main/java/org/springframework/samples/petclinic/PetClinicApplication.java) |
|Properties Files | [application.properties](https://github.com/spring-projects/spring-petclinic/blob/main/src/main/resources) |
|Caching | [CacheConfiguration](https://github.com/spring-projects/spring-petclinic/blob/main/src/main/java/org/springframework/samples/petclinic/system/CacheConfiguration.java) |

## Interesting Spring Petclinic branches and forks

The Spring Petclinic "main" branch in the [spring-projects](https://github.com/spring-projects/spring-petclinic)
GitHub org is the "canonical" implementation, currently based on Spring Boot and Thymeleaf. There are
[quite a few forks](https://spring-petclinic.github.io/docs/forks.html) in a special GitHub org
[spring-petclinic](https://github.com/spring-petclinic). If you have a special interest in a different technology stack
that could be used to implement the Pet Clinic then please join the community there.


## Interaction with other open source projects

One of the best parts about working on the Spring Petclinic application is that we have the opportunity to work in direct contact with many Open Source projects. We found some bugs/suggested improvements on various topics such as Spring, Spring Data, Bean Validation and even Eclipse! In many cases, they've been fixed/implemented in just a few days.
Here is a list of them:

| Name | Issue |
|------|-------|
| Spring JDBC: simplify usage of NamedParameterJdbcTemplate | [SPR-10256](https://jira.springsource.org/browse/SPR-10256) and [SPR-10257](https://jira.springsource.org/browse/SPR-10257) |
| Bean Validation / Hibernate Validator: simplify Maven dependencies and backward compatibility |[HV-790](https://hibernate.atlassian.net/browse/HV-790) and [HV-792](https://hibernate.atlassian.net/browse/HV-792) |
| Spring Data: provide more flexibility when working with JPQL queries | [DATAJPA-292](https://jira.springsource.org/browse/DATAJPA-292) |


# Contributing

The [issue tracker](https://github.com/spring-projects/spring-petclinic/issues) is the preferred channel for bug reports, features requests and submitting pull requests.

For pull requests, editor preferences are available in the [editor config](.editorconfig) for easy use in common text editors. Read more and download plugins at <https://editorconfig.org>. If you have not previously done so, please fill out and submit the [Contributor License Agreement](https://cla.pivotal.io/sign/spring).

# License

The Spring PetClinic sample application is released under version 2.0 of the [Apache License](https://www.apache.org/licenses/LICENSE-2.0).

[spring-petclinic]: https://github.com/spring-projects/spring-petclinic
[spring-framework-petclinic]: https://github.com/spring-petclinic/spring-framework-petclinic
[spring-petclinic-angularjs]: https://github.com/spring-petclinic/spring-petclinic-angularjs 
[javaconfig branch]: https://github.com/spring-petclinic/spring-framework-petclinic/tree/javaconfig
[spring-petclinic-angular]: https://github.com/spring-petclinic/spring-petclinic-angular
[spring-petclinic-microservices]: https://github.com/spring-petclinic/spring-petclinic-microservices
[spring-petclinic-reactjs]: https://github.com/spring-petclinic/spring-petclinic-reactjs
[spring-petclinic-graphql]: https://github.com/spring-petclinic/spring-petclinic-graphql
[spring-petclinic-kotlin]: https://github.com/spring-petclinic/spring-petclinic-kotlin
[spring-petclinic-rest]: https://github.com/spring-petclinic/spring-petclinic-rest

# Index

## 스프링 예제 프로젝트 PetClinic
- 프로젝트 설정
    * JDK 버전: 11이상
    * 소스 코드: https://github.com/spring-projects/spring-petclinic
    * IDE: 인텔리J (커뮤니티 버전도 가능)
    * 실행 방법: 
        * ./mvnw package
        * java -jar target/*jar
        * IDE에서 메인 애플리케이션 실행
- 프로젝트 살펴보기
    * 프로젝트 구조 설명
        * 일반적인 메이븐 프로젝트
        * src/main/java
        * src/main/resources
        * src/test/java
        * src/test/resources
    * 스프링 부트 기반 프로젝트
        * 스프링 부트
        * 스프링 데이터 JPA
        * DB: HSQLDB
        * 뷰: 타임리프
        * 캐시: EHCache
    * 코드가 어떻게 흘러가는 걸까?
        * 로그로 분석하는 방법
        * 디버거로 분석하는 방법
    * 코드를 조금 고쳐볼까?
        * LastName이 아니라 FirstName으로 검색해 볼까?
        * 정확히 일치하는게 아니라 해당 키워드가 들어있는 걸 찾아볼까?
        * Owner에 age 추가
- 프로젝트 살펴보기 과제 풀이
    * LastName이 아니라 FirstName으로 검색해 볼까?
        * 뷰 변경
        * 코드 조금 변경
    * 정확히 일치하는게 아니라 해당 키워드가 들어있는 걸 찾아볼까?
        * 쿼리만 변경
    * Owner에 age 추가
        * 모델 변경
        * 스키마 변경
        * 데이터 변경
        * 뷰 변경
- Inversion of Control (제어권이 뒤바뀜?)
    * 일반적인 (의존성에 대한) 제어권: “내가 사용할 의존성은 내가 만든다.” 
    
    ```java
    class OwnerController {
        private OwnerRepository repository = new OwnerRepository();
    }
    ```
    * IoC: “내가 사용할 의존성을 누군가 알아서 주겠지”
        * 내가 사용할 의존성의 타입(또는 인터페이스)만 맞으면 어떤거든 상관없다.
        * 그래야 내 코드 테스트 하기도 편하지.

    ```java
    class OwnerController {
       private OwnerRepository repo;
       public OwnerController(OwnerRepository repo) {
       this.repo = repo;
      } 
     // repo를 사용합니다.
    }

    class OwnerControllerTest {
      @Test
      public void create() {
        OwnerRepository repo = new OwnerRepository();
        OwnerController controller = new OwnerController(repo);
      }
    }

    ```
  * 참고
    * https://martinfowler.com/articles/injection.html

- IoC (Inversion of Control) 컨테이너 (ApplicationContext (BeanFactory))
    * 빈(bean)을 만들고 엮어주며 제공해준다.
    * 빈 설정
        * 이름 또는 ID
        * 타입
        * 스코프
    * 아이러니하게도 컨테이너를 직접 쓸 일은 많지 않다.
    * 참고
        * https://github.com/spring-guides/understanding/tree/master/application-context
        * https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationContext.html
        * https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/BeanFactory.html

- 빈 (Bean) (스프링 IoC 컨테이너가 관리하는 객체)
    * 어떻게 등록하지?
        * Component Scanning
            * @Component
                * @Repository
                * @Service
                * @Controller
                * @Configuration
        * 또는 직접 일일히 XML이나 자바 설정 파일에 등록
    * 어떻게 꺼내쓰지?
        * @Autowired 또는 @Inject
        * 또는 ApplicationContext에서 getBean()으로 직접 꺼내거나
    * 특징
        * 오로지 “빈"들만 의존성 주입을 해줍니다.

- 의존성 주입 (Dependency Injection) (필요한 의존성을 어떻게 받아올 것인가..)
    * @Autowired / @Inject를 어디에 붙일까?
        * 생성자
        * 필드
        * Setter

- AOP 소개 (흩어진 코드를 한 곳으로 모아)
    * 흩어진 AAAA 와 BBBB
    
    ```java
    class A {
       method a () {
               AAAA -> AAA
               오늘은 7월 4일 미국 독립 기념일이래요.
               BBBB -> BB
       }
     
       method b () {
               AAAA -> AAA
               저는 아침에 운동을 다녀와서 밥먹고 빨래를 했습니다.
               BBBB -> BB
       }
    }
    
    class B {
      method c() {
              AAAA -> AAA
              점심은 이거 찍느라 못먹었는데 저녁엔 제육볶음을 먹고 싶네요.
              BBBB -> BB
      }
    }
    ```
  * 모아 놓은 AAAA 와 BBBB
  
    ```java
    class A {
       method a () {
               오늘은 7월 4일 미국 독립 기념일이래요.
       }
     
       method b () {
               저는 아침에 운동을 다녀와서 밥먹고 빨래를 했습니다.
       }
    }
    
    class B {
      method c() {
              점심은 이거 찍느라 못먹었는데 저녁엔 제육볶음을 먹고 싶네요.
      }
    }
    
    class AAAABBBB {
        method aaaabbb(JoinPoint point) {
             AAAA
          point.execute()
             BBBB
        }
    }
    ```
  * 다양한 AOP 구현 방법
    * 컴파일  A.java ----(AOP)---> A.class (AspectJ)
    * 바이트코드 조작 A.java -> A.class ---(AOP)---> 메모리 (AspectJ)
    * 프록시 패턴 (스프링 AOP)
  * 프록시 패턴
    * https://refactoring.guru/design-patterns/proxy

- 프록시 패턴 (기존 코드 건드리지 않고 새 기능 추가하기)

- AOP 적용 예제 (@LogExecutionTime 으로 메소드 처리 시간 로깅하기)
    * @LogExecutionTime 애노테이션 (어디에 적용할지 표시 해두는 용도)

    ```java
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface LogExecutionTime {
    }
    ```
    * 실제 Aspect (@LogExecutionTime 애노테이션 달린곳에 적용)
    ```java
    @Component
    @Aspect
    public class LogAspect {
    
       Logger logger = LoggerFactory.getLogger(LogAspect.class);
    
       @Around("@annotation(LogExecutionTime)")
       public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
           StopWatch stopWatch = new StopWatch();
           stopWatch.start();
    
           Object proceed = joinPoint.proceed();
    
           stopWatch.stop();
           logger.info(stopWatch.prettyPrint());
    
           return proceed;
       }
    
    }
    ```

- PSA 소개 (잘 만든 인터페이스)
    * 나의 코드
      * 확장성이 좋지 못한 코드 or 기술에 특화되어 있는 코드
    * 나의 코드
      * 잘 만든 인터페이스 (PSA)
      * 확장성이 좋지 못한 코드 or 기술에 특화되어 있는 코드
    * Service Abstraction
      * https://en.wikipedia.org/wiki/Service_abstraction

- 스프링 웹 MVC (@Controller 와 @RequestMapping)
    * 나의 코드
    * @Controller | @ReuqestMapping | ...
    * Servlet | Reactive
    * 톰캣, 제티, 네티, 언더토우

- 스프링 트랜잭션 (PlatformTransactionManager)
    * 나의 코드
    * @Transactional
    * [PlatformTransactionManager](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/PlatformTransactionManager.html)
    * JpaTransacionManager | DatasourceTransactionManager | HibernateTransactionManager

- 스프링 캐시 (CacheManager)
    * 나의 코드
    * @Cacheable | @CacheEvict | ...
    * [CacheManager](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/cache/CacheManager.html)
    * JCacheManager | ConcurrentMapCacheManager | EhCacheCacheManager | ...
