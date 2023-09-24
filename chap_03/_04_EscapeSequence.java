package chap_03;

public class _04_EscapeSequence {
  public static void main(String[] args) {
    // 📌 (1) 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
    // \n \t \\ \" \'
    System.out.println("자바가");
    System.out.println("너무");
    System.out.println("재밌어요");

    // 📌 (2) \n : 줄바꿈
    System.out.println("자바가\n너무\n재밌어요");

    // 📌 (3) \t : 탭
    // 해물파전 9000원
    // 김치전 8000원
    // 부추전 8000원
    System.out.println("해물파전\t\t9000원");
    System.out.println("김치전\t\t8000원");
    System.out.println("부추전\t\t8000원");

    // 📌 (4) \\ : 역슬래시 (\로 바뀌어서 줄력됨)
    System.out.println("C:\\Program Files\\Java");

    // 📌 (5) \" : 큰따옴표
    // 단비가 "냐옹" 이라고 했어요
    System.out.println("단비가 \"냐옹\" 이라고 했어요");

    // 📌 (6) \' : 작은따옴표
    // 단비가 '뭘 봐?' 라는 표정을 지었어요
    System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
    System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");

    char c = 'A';
    c = '\'';
    System.out.println(c);
  }
}
