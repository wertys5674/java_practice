package practice;

abstract class Unit {
    int x,y;
    abstract void move (int x,int y);
    void stop(){
        System.out.println("종료합니다.");
    }
}
interface Fight { //interface 의 모든 메서드는 모두 public 이다.
    public abstract void move (int x,int y);
    public abstract void attack(Fight f);
}

class Fighter extends Unit implements Fight {
    //오버라이딩 규칙 : 조상보다 범위가 넓으면 안된다. 조상이 public 이라, 아래의 구현도 public 으로 해줘야한다.
    public void move(int x,int y){
        System.out.println("x="+x+"y="+y+"로 이동하였습니다.");
    }
    public void attack(Fight f){
        System.out.println(f+"위치로 공격 명령");
    }
}
public class MainClass {
    public static void main(String[] args){
        Unit u =new Fighter();
        Fight f =new Fighter();
        Fighter f2 =new Fighter();

        u.move(100,200);
        u.stop();
        //u.attack();   Unit 에는 attack method 가 없다. ERROR

        f.move(200,300);
        //f.stop(); Fight interface 가 stop() method 가 없음
        f.attack(f);

        f2.move(300,400);
        f2.stop();
        f2.attack(f2);
    }
}

