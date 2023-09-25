package chap_09;

import java.util.*;

// 📌 (1) 이터레이터(Iterator)
// 정의 : 순서대로 다음 값을 리턴할 수 있는 객체를 의미
// 즉, Collection Framework에서 배운 list나 set같은 데이터를 순회하는 것을 의미
//
// Iterator를 사용하면, 그 자리에서 바로 삭제 가능
// e.g. for문을 통해 순회할 수 있는 객체를 Iterable하다고 생각하시면 됩니다
public class _08_Iterator {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("유재석");
    list.add("(알 수 없음)");
    list.add("김종국");
    list.add("(알 수 없음)");
    list.add("강호동");
    list.add("(알 수 없음)");
    list.add("박명수");
    list.add("(알 수 없음)");
    list.add("조세호");

    for (String s : list) {
      System.out.println(s);
    }
    System.out.println("1------------------------");

    // 📌 (1) 이터레이터(Iterator) ======================> iterator
    Iterator<String> it = list.iterator(); // 순회하는 객체

    // 📌 (2) 현재 위치에서 다음 커서로 1칸씩 이동해 그 값을 찾음 ====> next
    System.out.println(it.next()); // 유재석
    System.out.println(it.next()); // (알 수 없음)
    System.out.println(it.next()); // 김종국
    System.out.println(it.next()); // (알 수 없음)

    System.out.println("2------------------------");
    it = list.iterator(); // 📌 커서를 처음 위치로 이동
    // 📌 (3) 다음에 가져올 데이터 있는지 반환(있으면 true) ========> hasNext
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    System.out.println("3------------------------");

    it = list.iterator();
    while (it.hasNext()) {
      String s = it.next();
      // 📌 (4) "알 수 없음"이란 글자가 포함되어 있으면 true ========> contains
      if (s.contains("(알 수 없음)")) {
        it.remove(); // 삭제
      }
    }

    it = list.iterator(); // 📌 커서를 처음 위치로 이동
    // "알 수 없음"이란 글자를 삭제되었는지 확인하기
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    System.out.println("4-Set-순회----------------");

    HashSet<String> set = new HashSet<>();
    set.add("유재석");
    set.add("박명수");

    Iterator<String> itSet = set.iterator();
    while (itSet.hasNext()) {
      System.out.println(itSet.next());
    }
    System.out.println("5-Map-key-순회-------------");

    HashMap<String, Integer> map = new HashMap<>();
    map.put("유재석", 10);
    map.put("박명수", 5);

    // 📌 map.iterator() // 제공되지 않음
    Iterator<String> itMapKey = map.keySet().iterator();
    while (itMapKey.hasNext()) {
      System.out.println(itMapKey.next());
    }
    System.out.println("6-Map-value-순회------------");

    Iterator<Integer> itMapValue = map.values().iterator();
    while (itMapValue.hasNext()) {
      System.out.println(itMapValue.next());
    }
    System.out.println("7-Map-key-value-순회--------");

    Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
    while (itMap.hasNext()) {
      System.out.println(itMap.next());
    }
  }
}
