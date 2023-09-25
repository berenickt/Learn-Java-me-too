package chap_10;

// 📌 (1) 람다식 : 아주 간결한 형태의 코드 뭉치
// 메소드와 비슷하게 어떤 동작을 구현하지만, 또 익명 클래스처럼 별도의 이름은 없습니다.
// 👉 문법 : (전달값1, 전달값2, ...) -> { 코드 }
// JS의 화살표함수와 유사, 더 정확히는 JS의 익명함수
public class _03_Lambda {
  public static void main(String[] args) {}

  // public void print() {
  // String s = "test";
  // System.out.println(s);
  // }

  // 📌 (2) 위 코드를 람다식으로 바꿔보면
  // () -> {
  // String s = "test";
  // System.out.println(s);
  // }

  // ======================================
  // public void print(String s) {
  // System.out.println(s);
  // }

  // 📌 (3) 위 코드를 람다식으로 바꿔보면
  // s -> System.out.println(s)

  // ======================================
  // public int add(int x, int y) {
  // return x + y;
  // }

  // 📌 (4) 위 코드를 람다식으로 바꿔보면
  // (x, y) -> x + y
}
