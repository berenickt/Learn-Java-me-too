package chap_12;

import chap_12.clean.CleanRunnable;

// 📌 Java에서 쓰레드(Thread)를 만드는 2가지 방법
// 1. Thread 클래스 확장
// -- Thread 클래스에는 상당히 많은 메소드가 있는데, 그 중에서 run() 이라는 메소드만 오버라이드해주면 됨
//
// 2. Runnable 인터페이스 구현
// -- 클래스 이름 뒷 부분이 extends Thread에서 implements Runnable로 바뀐 것 빼고는 동일
// -- Runnable 인터페이스는 구현할 메소드가 run() 하나 뿐인 함수형 인터페이스
public class _02_Runnable {
  public static void main(String[] args) {
    CleanRunnable cleanRunnable = new CleanRunnable();
    Thread thread = new Thread(cleanRunnable);
    thread.start(); // ⭐️ 새로운 Thread를 만들어 거기서 cleanRunnable내 run()메서드가 동작

    cleanByBoss();
  }

  public static void cleanByBoss() {
    System.out.println("-- 사장 청소 시작 --");

    for (int i = 1; i <= 10; i += 2) {
      System.out.println("(사장) " + i + "번방 청소 중");
    }

    System.out.println("-- 사장 청소 끝 --");
  }
}
