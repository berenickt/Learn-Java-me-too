package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

// 📌 (1) Super
// 자신이 상속받은 부모를 가리키는 참조 변수 super
public class _15_Super {
  public static void main(String[] args) {
    FactoryCam factoryCam = new FactoryCam();
    SpeedCam speedCam = new SpeedCam();

    factoryCam.recordVideo();
    System.out.println("-----------------");
    speedCam.takePicture();
  }
}
