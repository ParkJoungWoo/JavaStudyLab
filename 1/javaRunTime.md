# JAVA의 특징

1. 모든 운영체제에서 실행 가능
2. 객체 지향 프로그래밍에 특화
3. 메모리를 자동 관리
4. 라이브러리가 다양함

기계어 -> 바이너리 코드\
소스파일(프로그래밍 언어) -> 사람이 이해할 수 있는 자연어\
소스파일 -> 기계어 = 컴파일

## 자바 프로그램 컴파일 과정
1. java 소스파일을 java언어로 작성
2. java 소스파일을 `javac` 명령어로 바이트 코드 파일인 `class 파일`로 컴파일
3. `class 파일`인  바이트 코드 파일을 `java`명령어로 실행(JVM이 중간에 기계어로 번역)

## What is JVM
자바 가상 기계는 바이트 코드 파일을 다양한 운영체제에서 수정하지 않고 사용할 수 있게 한다.

Process
```
        java
(javac) ⬇️
        class
(java)  ⬇️
    <JavaVirtualMachine>
⬇️(기계어)               ⬇️(기계어)
윈도우OS                  리눅스OS
```
바이트 코드는 어디에? -> bin 폴더 아래

컴파일 명령어
```bash
javac -d bin srrc/sec03/exam01/*.java
javac -d [바이트 코드 파일 저장 위치] [소스파일 경로, 소스파일 경로]
java -p [바이트 코드 파일 저장 위치] -m [패키지이름..클래스이름]
```
```java
module chap01{
    requires java.se; <-- 의존성 모듈(Java SE가 필요하다.)
}
```
위와 같은 경우에만 module-info.java가 필요!


