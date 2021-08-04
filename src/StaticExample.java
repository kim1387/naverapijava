class Subin{
    private int age;

    public Subin(int age) {
        this.age = age;
    }
    public void introduce(){
        System.out.println("나는 "+age+"살 수빈!");
    }

    public static void smart(){
        System.out.println("나는 수빈! 나는 개 똑똑함! 겜공 1등임!");
    }

    public void cute(){
        System.out.println("안녕! 나는 수빈! 기현선배보다는 아니지만 귀여움!");
    }
}
public class StaticExample {
    public static void main(String[] args) {
        Subin subin = new Subin(21);

        // 1. static 미사용
        subin.cute();
        // Subin.cute(); // 에러! 이렇게는 당연하지만 사용할 수 없음 위에처럼 객체를 만든 후 사용해야함

        //2. static 사용
        Subin.smart(); // static이 붙음 클래스.메소드로 실행 가능!
        //subin.smart(); // 주석 풀어보면 알겠지만 intellij에서 알려줌(노란색 하이라이트- 경고)! 돌아는 가긴하는데 굳이..?
        // 객체를 만들 필요가 없을 때 사용

        //3 이경우는 static 쓸 수 없음
        subin.introduce();// 이거는 static이 붙을 수 없음! 이유는  static은 객체가 없는데 객체가 없으면 메소드에 age 값을 알 수 없음

    }
}
