package practice;

public class TerranProject {
    public static void main(String[] args) {
        final Unit[] units1 = {
                new Marine(), new Marine(), new Marine(),
                new Tank(), new Tank(),
                new Scv(),
                new Dropship(), new Dropship(), new Dropship(), new Dropship()
        };

        for (final Unit unit : units1) {
            unit.printName();
        }

        System.out.println("===========================================");

        final AttackUnit[] attackUnits1 = {
                new Tank(), new Tank(), new Tank(),
                new Marine(), new Marine(),
                new Scv(), new Scv(), new Scv(), new Scv(), new Scv(),
                //new Dropship() 은 attackUnit을 상속받지 않아서 사용 불가능.
        };

        for (final AttackUnit attackUnit : attackUnits1) {
            attackUnit.attack();
        } //for:each 구문 연습하기.

        units1[8].fly();
    }
}