package practicejava;

class Myclass {
    public static void main(String[] args) {
        System.out.println(0);
        try {
            System.out.println(1);
            System.out.println(0 / 0); //문제 발생, 바로 catch 문으로 이동.
            System.out.println(2);
        } catch (ArithmeticException ae) {
            System.out.println(3);
        } catch (Exception e){ //ArithmeticException 을 제외한 모든 Exception 발생 시 실행된다.
            System.out.println("Exception occurs!");
        }

    }
}