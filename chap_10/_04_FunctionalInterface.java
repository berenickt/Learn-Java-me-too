package chap_10;

import chap_10.converter.*;

// 📌 함수형 인터페이스(Functional Interface)
// 1 개의 추상 메소드를 갖는 인터페이스
// 인터페이스는 기본 구현체를 포함한 디폴트 메서드 (default method) 를 포함할 수 있습니다.
// 여러 개의 디폴트 메서드가 있더라도 추상 메서드가 오직 하나면 함수형 인터페이스입니다.
// 자바의 람다 표현식은 함수형 인터페이스로만 사용 가능합니다
public class _04_FunctionalInterface {
  public static void main(String[] args) {
    KRWConverter converter = new KRWConverter();
    // converter.convert(2);

    // convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"), 1);

    Convertible convertible = USD -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
    convertUSD(convertible, 2);

    // 📌 (1) 전달값이 하나도 없다면?
    ConvertibleWithNoParams c1 = () -> System.out.println("1 달러 = 1400 원");
    c1.convert();

    // 📌 (2) 두 줄 이상의 코드가 있다면?
    c1 = () -> {
      int USD = 5;
      int KRW = 1400;
      System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
    };
    c1.convert();

    // 📌 (3) 전달값이 2개인 경우?
    ConvertibleWithTwoParams c2 = (d, w) -> System.out.println(d + " 달러 = " + (d * w) + " 원");
    c2.convert(10, 1400);

    // 📌 (4) 반환값이 있는 경우?
    ConvertibleWithReturn c3 = (d, w) -> d * w;
    int result = c3.convert(20, 1400);
    System.out.println("20 달러 = " + result + " 원");
  }

  public static void convertUSD(Convertible converter, int USD) {
    converter.convert(USD);
  }
}
