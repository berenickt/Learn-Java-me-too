package chap_06;

public class _03_Return {
  // 📌 (1) 호텔 전화번호
  public static String getPhoneNumber() {
    String phoneNumber = "02-1234-5678";
    return phoneNumber;
  }

  // 📌 (2) 호텔 주소
  public static String getAddress() {
    return "서울시 어딘가";
  }

  // 📌 (3) 호텔 액티비티
  public static String getActivities() {
    return "볼링장, 탁구장, 노래방";
  }

  public static void main(String[] args) {
    // 반환값, Return
    String contactNumber = getPhoneNumber();
    System.out.println("호텔 전화번호 : " + contactNumber);

    String address = getAddress();
    System.out.println("호텔 주소 : " + address);

    System.out.println("호텔 액티비티 : " + getActivities());
  }
}
