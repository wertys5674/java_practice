package practicejava;


enum Kind  {A,B,C,D};
enum Num {a,b,c,d}

public class EnumPrac {
    public static void main(String[] args) {
//        System.out.println(Card.Kind.A==Card.Num.a); //타입이 달라져서 비교 자체가 불가능해져버림.
        System.out.println(Kind.valueOf("A"));
        Num num = Num.a;
    }
}
