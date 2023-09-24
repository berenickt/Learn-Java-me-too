package chap_09;

import java.util.HashSet;

public class _06_HashSet {
  public static void main(String[] args) {
    // 📌 (1) 세트(HashSet) : 중복허용x,
    HashSet<String> set = new HashSet<>();

    // 📌 (2) 데이터 추가 ==========> add
    set.add("삼겹살");
    set.add("쌈장");
    set.add("음료");
    set.add("소금");
    set.add("후추");
    set.add("삼겹살");
    set.add("깻잎");
    set.add("상추");
    set.add("삼겹살");

    System.out.println("총 구매 상품 수 : " + set.size()); // 7, 9번 add했지만 중복제거됨

    // 📌 (3) 순회
    for (String s : set) {
      System.out.println(s);
    }
    System.out.println("------------------");

    // 📌 (4) 확인 ==========> contains : 포함되어 있으면 true 반환
    if (set.contains("삼겹살")) {
      System.out.println("삼겹살 사러 출발");
    }
    System.out.println("------------------");

    // 📌 (5) 삭제 ==========> remove
    System.out.println("총 구매 상품 수 (삼겹살 구매 전) : " + set.size()); // 7
    set.remove("삼겹살");
    System.out.println("총 구매 상품 수 (삼겹살 구매 후) : " + set.size()); // 6
    System.out.println("------------------");

    // 📌 (6) 전체 삭제 ==========> clear
    set.clear();
    if (set.isEmpty()) {
      System.out.println("남은 구매 상품 수 : " + set.size());
      System.out.println("집으로 출발");
    }
    System.out.println("------------------");

    // 📌 (7) 세트 : 중복 허용 X, 순서 보장 X
    HashSet<Integer> intSet = new HashSet<>();
    intSet.add(1);
    intSet.add(13);
    intSet.add(2);

    for (int i : intSet) {
      System.out.println(i);
    }
  }
}
