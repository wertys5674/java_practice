package practice;
class Car{
    String color;
    int door;
    void drive(){
        System.out.println("Drive~ Brrrr...");
    }
    void stop(){
        System.out.println("STOP!");
    }
}
class FireEngine extends Car{
    void water(){
        System.out.println("WATER!!!!");
    }
}
class Ambulance extends Car{
    void siren(){
        System.out.println("ARARARARA!");
    }

}
public class MainClass {
    public static void main(String[] args){
        Car car=new FireEngine();
        FireEngine fe=(FireEngine) car;
        fe.water(); //classCastException
    }
}

