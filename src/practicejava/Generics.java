package practicejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class Generics {
    public static void main(String[] args) {
        ArrayList<Fruit> fList = new ArrayList<Fruit>(); // Fruit 타입만 가능.
        List<Orange> orangeList = new ArrayList<Orange>(); // 이렇게는 사용 가능. 다형성 적용.
        fList.add(new Apple());
        fList.add(new Orange());
        fList.add(new BlueOrange());// 자손들도 OK. 다형성 적용.
        orangeList.add(new RedOrange());
//        fList.add(new NonFruit());
        Fruit fruit = fList.get(1);
        Apple apple = (Apple) fList.get(0); //형변환 안 하면 오류가 된다. fList.get() 의 반환값은 Fruit 이다.

//        printAll(orangeList);     오류. printAll method 는 입력값을 <Fruit> 형태로 받는다.
        printAll(fList);

//        Iterator<Fruit> it = fList.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        HashMap<String,Member> map = new HashMap<>();
        map.put("홍경현", new Member("홍경현",1,1,100,100,100));
        System.out.println(map.get("홍경현"));
    }

    public static void printAll(ArrayList<Fruit> fList) {
        for (Fruit f : fList)
            System.out.println(f);
    }
}


class Fruit {
}

class Orange extends Fruit {
    @Override
    public String toString() {
        return "Orange";
    }
}

class BlueOrange extends Orange {
    @Override
    public String toString() {
        return "BlueOrange";
    }
}

class RedOrange extends Orange {
    @Override
    public String toString() {
        return "RedOrange";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class NonFruit {
}

class Member {
    final String name;
    final int ban;
    final int num;
    final int kor;
    final int math;
    final int eng;

    Member(String name, int ban, int num, int kor, int math, int eng) {
        this.name = name;
        this.ban = ban;
        this.num = num;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", num=" + num +
                ", kor=" + kor +
                ", math=" + math +
                ", eng=" + eng +
                '}';
    }
}