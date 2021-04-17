package practicejava;

import java.util.Objects;

class Student {
    final int id;
    final String name;
    Student(int value,String name){
        this.name=name;
        this.id =value;
    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Student)) return  false;

            Student v = (Student) obj;
            return this.id == v.id;
    }           //이런식으로 overriding 을 이용해서 변수를 비교할 때 쓰일 수 있다. 원래라면 주소 비교!
    @Override
    public String toString(){
        return "ID : "+id+" NAME : "+name; //원하는 출력형태로 맞게 return 한다.
    }
    @Override
    public int hashCode(){
        return Objects.hash(id,name);
    }
}
class Myclass {
    public static void main(String[] args) {
        Student sdt1 = new Student(32174953,"HongKyoungHyun");
        Student sdt2 = new Student(32194954,"HongMinYoung");
        Student sdt3 =new Student(32174953,"HongKyoungHyun");
        System.out.println(sdt1.equals(sdt2)); //원래의 equals()는 객체의 주소를 비교해서 같으면 true반
        System.out.println(sdt1.equals(sdt3));

        //hashCode() practice
        System.out.println(sdt1.hashCode());
        System.out.println(sdt2.hashCode());
        System.out.println(sdt3.hashCode());

        //toString() practice
        System.out.println(sdt1.toString());
        System.out.println(sdt2.toString());
        System.out.println(sdt3.toString());

        //String  비교하기
        String str1 ="abc";
        String str2 ="abc";
        String str3 =new String("abc");
        String str4 =new String("abc");

        if(str1==str2)
            System.out.println("same");
        else
            System.out.println("Not Same");

        if(str3==str4)
            System.out.println("same");
        else
            System.out.println("Not Same");
        //위 두 개의 결과가 다르기 때문에 문자열의 비교는 아래의 예시처럼 무조건 equals() 를 사용한다.

        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str4));
    }
}
