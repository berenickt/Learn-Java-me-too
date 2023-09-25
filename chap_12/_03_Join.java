package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
  public static void main(String[] args) {
    CleanRunnable cleanRunnable = new CleanRunnable();
    Thread thread = new Thread(cleanRunnable);
    thread.start();

    try {
      // 📌 thread.join() : 쓰레드가 종료될 떄까지 기다렸다가 끝나면, 다음줄로 넘어감
      // 멀티 스레드 환경에서 멀티 스레드에 대한 실행 순서를 제어
      // OS는 멀티 스레드에 대한 실행한 순서를 보장하지 않음
      //
      // 만약 thread1.join(); 이라는 코드가 호출됐다면, 여기서의 스레드는 'thread1'이 된다
      // 즉, 'thread1의 실행이 완료될 때 까지'라는 뜻이
      thread.join(2500); // 2.5 초 대기
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    cleanByBoss();
  }

  public static void cleanByBoss() {
    System.out.println("-- 사장 청소 시작 --");
    for (int i = 1; i <= 10; i += 2) {
      System.out.println("(사장) " + i + "번방 청소 중");

      try {
        // 📌 Thread.sleep() : 지정한 시간동안 프로그램 수행이 잠깐 멈춤
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    System.out.println("-- 사장 청소 끝 --");
  }
}
