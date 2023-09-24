package chap_07;

// 📌 인스턴스 (instance) 멤버
// 객체(인스턴스) 를 생성한 후 사용할 수 있는 필드와 메소드를 의미
// (인스턴스 필드, 인스턴스 메소드라고 불린다.)
public class _02_InstanceVariables {
  public static void main(String[] args) {
    // 📌 (1) 처음 만든 블랙박스
    BlackBox b1 = new BlackBox();
    b1.modelName = "까망이";
    b1.resolution = "FHD";
    b1.price = 200000;
    b1.color = "블랙";

    System.out.println(b1.modelName);
    System.out.println(b1.resolution);
    System.out.println(b1.price);
    System.out.println(b1.color);

    System.out.println("-------------------");

    // 📌 (2) 새로운 블랙박스 제품
    BlackBox b2 = new BlackBox();
    b2.modelName = "하양이";
    b2.resolution = "UHD";
    b2.price = 300000;
    b2.color = "화이트";

    System.out.println(b2.modelName);
    System.out.println(b2.resolution);
    System.out.println(b2.price);
    System.out.println(b2.color);
  }
}
