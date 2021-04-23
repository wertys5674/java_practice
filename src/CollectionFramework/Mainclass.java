package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Mainclass {
    public static void main(String[] args) {
        Stack st =new Stack(); //Java 에서 스택은 클래스 , 큐는 인터페이스.
        st.push(0);
        st.push(1);
        st.push(2);

        Queue q = new LinkedList(); //Queue 는 인터페이스라서, 큐를 구현한 다른 클래스인 linkedlist 를 사용한다.
        q.offer(0);
        q.offer(1);
        q.offer(2);

        System.out.println("=Stack=");
        while(!st.empty()){
            System.out.println(st.pop());
        }

        System.out.println("=Queue=");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

    }
}
