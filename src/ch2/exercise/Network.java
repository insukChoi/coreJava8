package ch2.exercise;

import java.util.ArrayList;
/**
 * Network 클래스를 컴파일하자. 내부 클래스 파일의 이름이 Network$Member.class 임을 유의해야 한다.
 * 생성된 코드를 javap 프로그램으로 조사해보자(리눅스/OS X에서는 javap를 실행할 때 $ 기호 앞에 \ 를 붙여야 한다)
 * 다음 명령은 메서드와 인스턴스 변수를 표시한다.
 *
 *  javap -private 클래스명
 *
 * 외부 클래스에 대한 참조가 어디에 있는가?
 */
public class Network {
    public class Member {
        private String name;
        private ArrayList<Member> friends;

        public Member(String name){
            this.name = name;
            friends = new ArrayList<>();
        }
    }

    private ArrayList<Member> members;
}

/*  javap -private Network$Member.class 결과
 *
  public class ch2.exercise.Network$Member {
      private java.lang.String name;
      private java.util.ArrayList<ch2.exercise.Network$Member> friends;
      final ch2.exercise.Network this$0;
      public ch2.exercise.Network$Member(ch2.exercise.Network, java.lang.String);
  }
 */