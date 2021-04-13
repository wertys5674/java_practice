package practice;

class Unit {
    private final String name;
    private final int attackPoint;

    public Unit(final String name, final int attackPoint) {
        this.name = name;
        this.attackPoint = attackPoint;
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

    public void fly() {
        if (attackPoint == 0)
            System.out.println(name + " 준비 완료");
    }
}
