package chap_06;

// 📌 퀴즈 5
// 개인정보 중 일부를 비공개로 전환하는 프로그램을 작성하시오
// 이름 : 나코딩
// 주민등록번호 : 990130-1234567
// 전화번호 : 010-1234-5678
//
// 🖥️ 실행결과
// 이름 : 나**
// 주민등록번호 : 990130-1******
// 전화번호 : 010-1234-****
//
// 💡 힌트
// substring()
// length()
//
// ✅ 조건
// - 개인정보를 비공개로 전환하는 메소드 작성
// - 하나의 메소드에서 모든 동작 처리
// - 각 정보는 아래 위치부터 비공개 적용
// - 이름(2글자), 주민등록번호(9번쨰글자), 전화번호(10번쨰글자)
public class _Quiz_06 {
  public static String getHiddenData(String data, int index) {
    String hiddenData = data.substring(0, index); // 나코딩 -> 나
    // for (int i = index; i < data.length(); i++)
    for (int i = 0; i < data.length() - index; i++) {
      hiddenData += "*"; // 나**
    }
    return hiddenData;
  }

  public static void main(String[] args) {
    String name = "나코딩"; // 이름
    String id = "990130-1234567"; // 주민등록번호
    String phone = "010-1234-5678"; // 전화번호

    System.out.println("이름 : " + getHiddenData(name, 1)); // 개인정보, 비공개 시작 위치
    System.out.println("주민등록번호 : " + getHiddenData(id, 8));
    System.out.println("전화번호 : " + getHiddenData(phone, 9));
  }
}
