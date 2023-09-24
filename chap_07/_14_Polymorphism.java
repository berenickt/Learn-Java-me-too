package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

// 📌 (1) 다형성
// 하나의 객체가 여러 가지 형태를 가질 수 있는 것을 의미
// 여러 개를 의미하는 poly와 형태 또는 실체를 의미하는 morphism의 결합어
//
// class Person : 사람
// class Student extends Person : 학생 (학생은 사람이다. Student is a person)
// class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person)
public class _14_Polymorphism {
  public static void main(String[] args) {
    Camera camera = new Camera();
    Camera factoryCam = new FactoryCam();
    Camera speedCam = new SpeedCam();

    camera.showMainFeature();
    factoryCam.showMainFeature();
    speedCam.showMainFeature();

    System.out.println("----------------");

    Camera[] cameras = new Camera[3];
    cameras[0] = new Camera();
    cameras[1] = new FactoryCam();
    cameras[2] = new SpeedCam();

    for (Camera cam : cameras) {
      cam.showMainFeature();
    }

    System.out.println("----------------");

    // factoryCam.detectFire();
    // speedCam.checkSpeed();
    // speedCam.recognizeLicensePlate();

    if (camera instanceof Camera) {
      System.out.println("카메라입니다.");
    }

    if (factoryCam instanceof FactoryCam) {
      ((FactoryCam) factoryCam).detectFire();
    }

    if (speedCam instanceof SpeedCam) {
      ((SpeedCam) speedCam).checkSpeed();
      ((SpeedCam) speedCam).recognizeLicensePlate();
    }
    // Object[] objs = new Object[3];
    // objs[0] = new Camera();
    // objs[1] = new FactoryCam();
    // objs[2] = new SpeedCam();
  }
}
