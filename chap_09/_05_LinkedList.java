package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
  public static void main(String[] args) {
    // 📌 (1) 링크드 리스트
    // ArrayList는 배열 기반 리스트
    // LinkedList는 연결리스트 기반 리스트(선으로 연결되어 있음)
    LinkedList<String> list = new LinkedList<>();

    // 📌 (2) 데이터 추가 (뒤에 추가) =============> add
    list.add("유재석");
    list.add("조세호");
    list.add("김종국");
    list.add("박명수");
    list.add("강호동");

    // 📌 (3) 데이터 조회 (인덱스) =====> get
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.getFirst());
    System.out.println(list.getLast());

    System.out.println("-------------------------");

    // 📌 (4) 추가 (앞에 추가) =====> addFirst
    list.addFirst("서장훈");
    for (String s : list) {
      System.out.println(s);
    }

    System.out.println("-------------------------");

    // 📌 (5) 추가 (뒤에 추가) =====> addLast
    list.addLast("김희철");
    for (String s : list) {
      System.out.println(s);
    }

    System.out.println("-------------------------");

    System.out.println("학생 추가 전 (index 1) : " + list.get(1));
    list.add(1, "김영철"); // 중간에 추가하기 (1번 인덱스에 "김영철")
    System.out.println("학생 추가 후 (index 1) : " + list.get(1));
    System.out.println("학생 추가 후 (index 2) : " + list.get(2));

    System.out.println("-------------------------");

    // 📌 (6) 삭제 =====> remove
    System.out.println("남은 학생 수 (제외 전) : " + list.size());
    list.remove(list.size() - 1);
    System.out.println("남은 학생 수 (제외 후) : " + list.size());

    System.out.println("-------------------------");

    // 📌 (7) removeFirst, removeLast
    // 처음 학생과 마지막 학생이 전학
    for (String s : list) {
      System.out.println(s);
    }
    System.out.println("남은 학생 수 (전학 전) : " + list.size());
    list.removeFirst(); // 처음 데이터
    list.removeLast(); // 마지막 데이터
    System.out.println("남은 학생 수 (전학 후) : " + list.size());
    for (String s : list) {
      System.out.println(s);
    }

    System.out.println("-------------------------");

    // 📌 (8) 변경 (수강권 양도) =====> set
    list.set(0, "이수근");
    System.out.println(list.get(0));

    // 📌 (9) 확인 =====> indexOf
    System.out.println(list.indexOf("김종국"));
    if (list.contains("김종국")) {
      System.out.println("수강 신청 성공");
    } else {
      System.out.println("수강 신청 실패");
    }

    System.out.println("-------------------------");

    // 📌 (10) 전체 삭제 =====> clear
    list.clear();
    if (list.isEmpty()) {
      System.out.println("학생 수 : " + list.size());
      System.out.println("리스트가 비었습니다.");
    }

    System.out.println("-------------------------");

    // 📌 (11) 새로운 학기
    list.add("유재석");
    list.add("조세호");
    list.add("김종국");
    list.add("박명수");
    list.add("강호동");

    // 📌 (12) 정렬 ==============> sort(가나다순, )
    Collections.sort(list);
    for (String s : list) {
      System.out.println(s);
    }
  }
}
