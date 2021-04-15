package practice;

class Unit {
    private final String name;
    private final int attackPoint;

    public Unit(final String name, final int attackPoint) {
        this.name = name;
        this.attackPoint = attackPoint;
    }
    void add(Unit unit){

    }

    void move() {
        System.out.println("이동한다.");
    }

    void printName() {
        System.out.println(name);
    }

    public void attack() {
        System.out.println(name + " 공격!" + "with : " + attackPoint);
    }
    //"Geek"한 녀석은 여기서 attack 함수를 private 메서로 처리했던데 그러면 불러올 수가 없지 않나? ..생성자로 생성할 때 뽑아내는거 외에는..?

    public void fly() {
        if (attackPoint == 0)
            System.out.println(name + " 준비 완료");
    }
}
