package practice;

interface attackUnit {
    abstract void attack();
}


public class TerranProject {
    public static void main(String[] args) {
        final Unit[] units1 = {
                new Marine(), new Marine(), new Marine(),
                new Tank(), new Tank(),
                new Scv(),
                new Dropship(), new Dropship(), new Dropship(), new Dropship()
        };
        for(int i=0;i<10;i++){
            units1[i].printName();
        }
        System.out.println("===========================================");

        attackUnit[] attackUnits1 = {
                new Tank(), new Tank(), new Tank(),
                new Marine(), new Marine(),
                new Scv(), new Scv(), new Scv(), new Scv(), new Scv(),
                //new Dropship() 은 attackUnit을 상속받지 않아서 사용 불가능.
        };
        for(int i=0;i<10;i++){
            attackUnits1[i].attack();
        }
        units1[8].fly();
    }
}
