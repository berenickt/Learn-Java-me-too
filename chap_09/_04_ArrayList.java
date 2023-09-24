package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
  public static void main(String[] args) {
    // 📌 (1) 컬렉션 프레임워크 (List, Set, Map)
    // 정의 : 많은 데이터를 쉽고 편하게 관리하기 위해 Java에서 제공해주는 클래스들의 모음
    // @see
    // https://velog.io/@kai6666/Java-%EC%BB%AC%EB%A0%89%EC%85%98-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC-Collection-Framework
    ArrayList<String> list = new ArrayList<>();

    // 📌 (2) 데이터 추가 =============> add
    // 배열의 경우 크기가 고정되서, 추가로 데이터를 집어넣으려면 새 배열을 만들고 기존 데이터를 모두 옮기는 복사작업이 필요함
    // ArrayList는 배열과 다르게, 원하는 만큼 데이터를 추가, 삭제 가능
    // 추가로 데이터의 포함여부, 정렬 등의 부가적인 기능을 제공
    list.add("유재석");
    list.add("조세호");
    list.add("김종국");
    list.add("박명수");
    list.add("강호동");

    // 📌 (3) 데이터 조회 (인덱스) =====> get
    System.out.println(list.get(0)); // 유재석
    System.out.println(list.get(1)); // 조세호
    System.out.println(list.get(2)); // 김종국
    System.out.println(list.get(3)); // 박명수
    System.out.println(list.get(4)); // 강호동

    System.out.println("-------------------");

    // 📌 (4) 삭제 (박명수씨가 이사) =====> remove
    System.out.println("신청 학생 수 (이사 전) : " + list.size()); // 5
    list.remove("박명수");
    System.out.println("신청 학생 수 (이사 후) : " + list.size()); // 4
    System.out.println(list.get(3));

    System.out.println("-------------------");

    System.out.println("남은 학생 수 (제외 전) : " + list.size()); // 4
    list.remove(list.size() - 1);
    System.out.println("남은 학생 수 (제외 후) : " + list.size()); // 3

    System.out.println("-------------------");

    // 📌 (5) 순회
    for (String s : list) {
      System.out.println(s);
    }

    System.out.println("-------------------");

    // 📌 (6) 변경 (수강권 양도) =====> set
    System.out.println("수강권 양도 전 : " + list.get(0));
    list.set(0, "이수근");
    System.out.println("수강권 양도 후 : " + list.get(0));

    System.out.println("-------------------");

    // 📌 (7) 확인 =================> indexOf
    System.out.println(list.indexOf("김종국"));
    // 선착순 5명 내에 포함되었는가?
    if (list.contains("김종국")) {
      System.out.println("수강 신청 성공");
    } else {
      System.out.println("수강 신청 실패");
    }

    System.out.println("-------------------");

    // 📌 (8) 전체 삭제 ==============> clear
    list.clear();
    if (list.isEmpty()) {
      System.out.println("학생 수 : " + list.size());
      System.out.println("리스트가 비었습니다.");
    }

    System.out.println("-------------------");

    // 📌 (9) 다음 학기에 새로 공부 시작
    list.add("유재석");
    list.add("조세호");
    list.add("김종국");
    list.add("박명수");
    list.add("강호동");

    // 📌 (10) 정렬 ==============> sort(가나다순, )
    Collections.sort(list);
    for (String s : list) {
      System.out.println(s);
    }
  }
}
