package ch2.exercise;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 경계가 없는 문자열의 큐를 표현하는 Queue 클래스를 구현하라. 뒤에 추가하는 add 메서드와
 * 앞에서 제거하는 remove 메서드를 구현한다. 요소들은 노드의 연결 리스트로 저장한다.
 * Node는 중첩 클래스로 만든다. Node가 정적 클래스여야 하는가, 그렇지 않아야 하는가?
 */
public class Queue {
    // Node는 정적 클래스면 안된다.
    // 이유는 Queue 의 갯수가 하나가 아니고 각각의 프로세스 큐마다 노드들이 있기 때문에
    public class Node{
        private int number;
        private String name;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    ArrayList<Queue.Node> nodeList = new ArrayList<>();

    // Node 추가 메서드
    public void addNode(int num, String name){
        Node node = new Node();
        node.setNumber(num);
        node.setName(name);
        nodeList.add(node);
    }

    // Node 삭제 메서드
    public void remove(int num){
        nodeList.remove(num);
    }

    /*
     * hasNext() 와 next() 메소드를 갖는 Iterator 클래스
     */
    public class Iterator{
        public boolean hasNext(){
            return nodeList.size() == 0 ? false : true;
        }
        public Queue.Node next(){
            Node node = nodeList.get(0);
            nodeList.remove(0);
            return node;
        }
    }

    // Iterator 객체를 return 하는 메서드
    public Iterator iterator(){
       return new Iterator();
    }

}
