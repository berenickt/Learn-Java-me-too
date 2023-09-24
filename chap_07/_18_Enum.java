package chap_07;

// 📌 열거형 (Enum) :
// 한정된 값만을 갖는 데이터 타입으로 몇 개의 열거 상수 중에서 하나의 상수를 저장하는 데이터 타입
// 즉, 상수들의 묶음
//
// e.g.
// 달력 : JAN, FEB, MAR, ...
// 옷 사이즈 : S, M, L, XL
// OS 종류 : WIN10, WIN11, MACOS, LINUX, ...
// 해상도 : HD, FHD, QHD, UHD, ...
public class _18_Enum {
  public static void main(String[] args) {
    Resolution resolution = Resolution.HD;
    System.out.println(resolution);

    resolution = Resolution.FHD;
    System.out.println(resolution);

    System.out.print("동영상 녹화 품질 : ");
    switch (resolution) {
      case HD:
        System.out.println("일반화질");
        break;
      case FHD:
        System.out.println("고화질");
        break;
      case UHD:
        System.out.println("초고화질");
        break;
    }

    resolution = Resolution.valueOf("UHD");
    System.out.println(resolution);

    System.out.println("-------------------");

    for (Resolution myRes : Resolution.values()) {
      System.out.println(myRes.name() + " : " + myRes.ordinal());
    }

    System.out.println("-------------------");
    for (Resolution myRes : Resolution.values()) {
      System.out.println(myRes.name() + " : " + myRes.getWidth());
    }
  }
}


// 📌 열거형(enum) 선언 ; Enumeration(열거, 목록)의 약어
// 열거 타입 이름은 관례적으로 첫 문자를 대문자, 나머지는 소문자로 구성
enum Resolution {
  HD(1280), FHD(1920), UHD(3840);

  private final int width;

  Resolution(int width) {
    this.width = width;
  }

  public int getWidth() {
    return width;
  }
}
