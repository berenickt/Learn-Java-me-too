package chap_12;

// 📌 멀티 스레드 : 말 그대로 스레드가 여러 개
// 직원 2명(쓰레드 2개)을 고용해 방 청소하기
public class _04_MultiThread {
  public static void main(String[] args) {
    // (1) 청소직원 1(쓰레드 1번), Runnable 인터페이스를 이용해 쓰레드 생성
    Runnable cleaner1 = new Runnable() {
      @Override
      public void run() {
        System.out.println("-- 직원1 청소 시작 --");
        for (int i = 1; i <= 10; i += 2) {
          System.out.println("(직원1) " + i + "번방 청소 중");

          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
        System.out.println("-- 직원1 청소 끝 --");
      }
    };

    // (2) 청소직원 2(쓰레드 2번), Runnable 인터페이스를 이용해 쓰레드 생성
    Runnable cleaner2 = () -> {
      System.out.println("-- 직원2 청소 시작 --");
      for (int i = 2; i <= 10; i += 2) {
        System.out.println("(직원2) " + i + "번방 청소 중");

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
      System.out.println("-- 직원2 청소 끝 --");
    };

    Thread cleanerThread1 = new Thread(cleaner1);
    Thread cleanerThread2 = new Thread(cleaner2);

    cleanerThread1.start();
    cleanerThread2.start();
  }
}
