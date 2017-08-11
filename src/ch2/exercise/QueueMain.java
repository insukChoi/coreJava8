package ch2.exercise;

/**
 * Created by admin on 2017-08-11.
 */
public class QueueMain {
    public static void main(String[] args) {

        Queue myqueue = new Queue();
        myqueue.addNode(1, "insuk");
        myqueue.addNode(2, "she");
        myqueue.addNode(3, "good");

        Queue.Iterator iterator = myqueue.iterator();
        while (iterator.hasNext()){
            Queue.Node node = iterator.next();
            System.out.println("노드번호 : "+node.getNumber() + " , 노드명 :" + node.getName());
        }

    }
}
