package chap_10;

public class _02_AnonymousClass2 {
  public static void main(String[] args) {
    HomeMadeBurger broMadeBurger = getBroMadeBurger();
    broMadeBurger.cook();

    System.out.println("----------------------------");

    HomeMadeBurger momMadeBurger = getMomMadeBurger();
    momMadeBurger.cook();

  }

  private static HomeMadeBurger getBroMadeBurger() {
    // 📌 익명 클래스 : 동생표 수제버거
    return new HomeMadeBurger() {
      // 📌 추상 메서드
      @Override
      public void cook() {
        System.out.println("집에서 만드는 동생표 군대리아");
        System.out.println("재료 : 빵, 치킨패티, 양배추 샐러드, 딸기잼, 치즈, 삶은 계란");
      }
    };
  }

  public static HomeMadeBurger getMomMadeBurger() {
    // 📌 익명 클래스 : 엄마표 수제버거
    return new HomeMadeBurger() {
      // 📌 추상 메서드
      @Override
      public void cook() {
        System.out.println("집에서 만드는 엄마표 수제 버거");
        System.out.println("재료 : 빵, 소고기패티, 해시브라운, 양상추, 마요네즈, 피클");
      }
    };
  }
}


// 📌 추상 클래스
// 익명 클래스를 이용하면,
// 필요에 따라 추상 클래스, 추상메서드를 직접구현하면서,
// 이름없이 추상 클래스를 구현한 객체를 전달 할 수 있습니다.
abstract class HomeMadeBurger {
  public abstract void cook();
}
