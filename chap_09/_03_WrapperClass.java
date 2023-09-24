package chap_09;

public class _03_WrapperClass {
  public static void main(String[] args) {
    // 📌 (1) 래퍼 (Wrapper) 클래스
    // 정의 : 기본 자료타입(primitive type)을 객체로 다루기 위해서 사용하는 클래스
    // 다시말해, int double float char을 객체 형태로 만들어서 사용할 수 있게 해주는 클래스

    Integer i = 123; // int i = 123;
    Double d = 1.0; // double d = 1.0;
    Character c = 'A'; // char c = 'A';

    System.out.println(i); // 123
    System.out.println(d); // 1.0
    System.out.println(c); // A

    System.out.println("---------------");

    System.out.println(i.intValue()); // 123
    System.out.println(d.intValue()); // 1
    System.out.println(c.charValue()); // A

    System.out.println("---------------");
    String s = i.toString();
    System.out.println(s); // 123
  }
}
// 📌 래퍼 클래스 종류
// byte ==========> Byte
// char ==========> Character
// int ===========> Integer
// float =========> Float
// double ========> Double
// boolean =======> Boolean
// long ==========> Long
// short =========> Short
//
// char타입과 int타입이 각각 Character와 Integer의 래퍼 클래스를 가지고 있고,
// 나머지는 기본 타입의 첫 글자를 대문자로 바꾼 이름
