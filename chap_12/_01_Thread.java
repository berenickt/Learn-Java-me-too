package chap_12;

import chap_12.clean.CleanThread;

// 📌 프로세스(Process) : cpu에 의해 메모리에 올려져 실행중인 프로그램
// 자신만의 메모리 공간을 포함한 독립적인 실행 환경을 가짐
// JVM(Java Virtual Machine)은 주로 하나의 프로세스로 실행되며,
// 동시에 여러 작업을 수행하기 위해서 멀티 스레드를 지원
//
// 📌 쓰레드 (Thread) : 프로세스안에서 실질적으로 작업을 실행하는 단위
// 자바에서는 JVM(Java Virtual Machine)에 의해 관리됨
// 프로세스에는 적어도 한개 이상의 스레드가 있으며,
// Main 스레드 하나로 시작하여 스레드를 추가 생성하게 되면 멀티 스레드 환경이 됨
public class _01_Thread {
  public static void main(String[] args) {
    // 💡 호텔 방 구조 (방 동시에 청소하기)
    // 1 3 5 7 9
    // 2 4 6 8 10

    // cleanBySelf();
    CleanThread cleanThread = new CleanThread();
    // cleanThread.run(); // 직원 청소
    cleanThread.start(); // ⭐️ 새로운 Thread를 만들어 거기서 CleanThread내 run()메서드가 동작

    cleanByBoss(); // 사장 청소
  }

  public static void cleanBySelf() {
    System.out.println("-- 혼자 청소 시작 --");
    for (int i = 1; i <= 10; i++) {
      System.out.println("(혼자) " + i + "번방 청소 중");
    }
    System.out.println("-- 혼자 청소 끝 --");
  }

  public static void cleanByBoss() {
    System.out.println("-- 사장 청소 시작 --");
    for (int i = 1; i <= 10; i += 2) {
      System.out.println("(사장) " + i + "번방 청소 중");
    }
    System.out.println("-- 사장 청소 끝 --");
  }
}
