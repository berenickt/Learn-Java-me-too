package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

// 📌 (1) Final
// 변수(variable), 메서드(method), 또는 클래스(class)에 사용 가능
//
// 변수에 final을 붙이면 이 변수는 수정할 수 없다는 의미를 가짐
// 수정될 수 없기 때문에 초기화 값은 필수적
// 수정 할 수 없다는 범위는 그 변수의 값에 한정합니다.
// 즉, 다른 객체를 참조하거나 할 때 참조하는 객체의 내부의 값은 변경할 수 있다라는 의미
//
// 메서드에 final을 붙이면 override를 제한
// 클래스에 final을 붙이면 상속 불가능 클래스가 됨
public class _17_Final {
  public static void main(String[] args) {


    // public (final) class ..
    // public (final) void ...
    // public > abstract > static > final > ...

    ActionCam actionCam = new ActionCam();
    // actionCam.lens = "표준렌즈";
    actionCam.recordVideo();
    actionCam.makeVideo();

    System.out.println("------------------");

    SlowActionCam slowActionCam = new SlowActionCam();
    slowActionCam.makeVideo();
  }
}
