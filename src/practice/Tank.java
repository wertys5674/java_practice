package practice;

class Tank extends Unit implements AttackUnit {
    public Tank() {
        super("Tank", 50);
    }

    @Override
    public void attack(){
        System.out.println("쾅쾅!!!!!!!!!");
        super.attack();  //응용도 자유롭게 할 수 있게끔
        System.out.println("쾅쾅!!!!!!!!!");
    }
}


// 탱크의 attack()에는
// "쾅쾅"
// "탱크가 공격한다"
// "쾅쾅"