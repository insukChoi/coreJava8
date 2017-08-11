package ch2.exercise;

/**
 * ch01.sec01 패키지에 HelloWorld 클래스를 선언하는 HelloWorld.java 파일을 만든다. 만든 파일을 서브디렉터리 ch01/sec01 이
 * 아닌 다른 디렉토리에 넣어둔다. 해당 디렉터리에서 javac HelloWorld.java 명령을 실행한다. 클래스 파일이 생겼는가?
 * 그럼 어디서 생겼는가? 이제 java HelloWorld 명령을 실행해보자. 무슨 일이 일어나는가? 그 이유는 무엇인가?
 * (힌트 : javap HelloWorld 명령을 실행한 후 경고 메시지를 연구한다) 마지막으로 javac -d . HelloWorld.java 명령을 실행해보자.
 * 이 방법이 더 좋은 이유는 무엇인가?
 */
public class ex12 {
    // ch01/sec01 에서 만든 자바파일을 sec02 로 이동시켜서 javac 명령을 실행하면 클래스가 파일이 생김.
    // 하지만, 실행시 Error: class not found: HelloWolrd 에러가 난다.
    // javac -d 옵션을 줘서 컴파일 하면 올바른 디렉토리가 아닐경우 컴파일 되지 않는다.
}
