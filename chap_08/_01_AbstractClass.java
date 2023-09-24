package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

// 📌 데이터 추상화 (Data Abstraction) : 몰라도 되는 부분은 숨기고, 꼭 필요한 정보만 공개하는 과정
// 📌 추상 클래스 (아직 완성되지 않은 클래스, 즉 미완성 설계도)
// 📌 추상 메소드 (추상 클래스에서만 사용 가능한, 껍데기만 있는 메소드)
// 추상 클래스, 추상 메서드 둘 다 abstract를 붙여서 만듬
public class _01_AbstractClass {
  public static void main(String[] args) {

    // Camera camera = new Camera();
    FactoryCam factoryCam = new FactoryCam();
    factoryCam.showMainFeature(); // 화재 감지

    SpeedCam speedCam = new SpeedCam();
    speedCam.showMainFeature(); // 속도 측정, 번호 인식
  }
}
