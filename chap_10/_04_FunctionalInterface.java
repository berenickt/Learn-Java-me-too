package chap_10;

import chap_10.converter.*;

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
