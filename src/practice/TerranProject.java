package practice;

interface attackUnit {
    abstract void attack();
}

interface flyableUnit {
    abstract void fly();
}

abstract class Unit {
    String name;
    int Hp;

    void move() {
        System.out.println("이동한다.");
    }

    void setName(String str) {
        this.name = str;
    }

    abstract void printName();
}

class Scv extends Unit implements attackUnit {
    void printName() {
        setName("Scv");
        System.out.println(name);  //처음에는 28,29줄을 묶어서 sout("scv") 했는데 그럼 굳이 추상을 쓸 이유가 없어보여서 변수에도 저장을 하려고 바꿈.
    }

    public void attack() {
        System.out.println("공격!");
    }
}

class Marine extends Unit implements attackUnit {
    void printName() {
        setName("Marine");
        System.out.println(name);
    }

    public void attack() {
        System.out.println("공격!");
    }
}

class Tank extends Unit implements attackUnit {
    void printName() {
        setName("Tank");
        System.out.println(name);
    }

    public void attack() {
        System.out.println("공격!");
    }
}

class Dropship extends Unit implements flyableUnit {
    void printName() {
        setName("Dropship");
        System.out.println(name);
    }

    public void fly() {
        System.out.println("비행!");
    }
}


public class TerranProject {
    public static void main(String[] args) {
        Unit[] u = {
                new Marine(), new Marine(), new Marine(),
                new Tank(), new Tank(),
                new Scv(),
                new Dropship(), new Dropship(), new Dropship(), new Dropship()
        }; //클래스화 배열 선언 초기화  +이렇게 하는 법 밖에 없나?

        for (int i = 0; i < 10; i++) { //배열의 구성원 개수를 구하는 함수를 넣고싶다.
            u[i].printName();
        } // 이름 출력하기

        System.out.println("===========================================");

        attackUnit[] au = {
                new Tank(), new Tank(), new Tank(),
                new Marine(), new Marine(),
                new Scv(), new Scv(), new Scv(), new Scv(), new Scv(),
                //new Dropship() 은 attackUnit을 상속받지 않아서 사용 불가능.
        };
        for (int i = 0; i < 10; i++) {
            au[i].attack();
        }
//        u[2].move();
//        u[9].printName();
//        au[5].move(); error -> interface attackUnit은 Unit을 상속받지 않음.

    }
}

