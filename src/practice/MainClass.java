package practice;

import java.sql.SQLOutput;

class product {
    int price;
    int bonusPoint;

    product(int price){
        this.price=price;
        this.bonusPoint+=(int)(price/10.0);
    }
}
class Tv extends product{
    Tv(){
        super(100);
    }
    public String toString() {return "Tv";}
}

class Radio extends product{
    Radio(){
        super(50);
    }
    public String toString() {return "Radio";}
}

class Car extends product{
    Car(){
        super(300);
    }
    public String toString() {return "Car";}
}

class Custumer {
    int budget =1000;
    int totalBp;
    void buy(product p){
        if(budget<p.price){
            System.out.println("ㅈㅇㅂㅈ");
            return;
        }
        budget-=p.price;
        totalBp += p.bonusPoint;
       // p.bonusPoint+=p.bonusPoint;
        System.out.println(p.toString()+"를 구매했습니다.");
        System.out.println(this.totalBp+"의 포인트가 적립되어있습니다.");
    }

}
public class MainClass {
    public static void main(String[] args){
    Custumer Hong=new Custumer();
    Hong.buy(new Tv());
    Hong.buy(new Radio());
    Hong.buy(new Car());
        System.out.println("잔액은 "+Hong.budget+"입니다.");
    }
}

