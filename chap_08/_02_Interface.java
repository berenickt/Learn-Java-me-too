package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.reporter.*;

// 📌 인터페이스(interface)
// 클래스를 이용하여 다중 상속을 할 경우
// 메소드 출처의 모호성 등 여러 가지 문제가 발생할 수 있어
// Java에서는 클래스를 통한 다중 상속은 지원하지 않습니다.
// 하지만 다중 상속의 이점을 버릴 수는 없기에 자바에서는 인터페이스라는 것을 통해 다중 상속을 지원하고 있습니다.
// 다른 클래스를 작성할 때 기본이 되는 틀을 제공하면서, 다른 클래스 사이의 중간 매개 역할까지 담당하는 일종의 추상 클래스를 의미합니다.
//
// Java에서 추상 클래스는 추상 메소드뿐만 아니라 생성자, 필드, 일반 메소드도 포함할 수 있습니다.
// 하지만 interface는 오로지 추상 메소드와 상수만을 포함할 수 있습니다.
public class _02_Interface {
  public static void main(String[] args) {
    Reportable normalReporter = new NormalReporter();
    normalReporter.report();

    Reportable videoReporter = new VideoReporter();
    videoReporter.report();

    System.out.println("---------------------");

    Detectable fireDetector = new FireDetector();
    fireDetector.detect();

    Detectable advancedFireDetector = new AdvancedFireDetector();
    advancedFireDetector.detect();

    System.out.println("---------------------");

    FactoryCam factoryCam = new FactoryCam();
    factoryCam.setDetector(advancedFireDetector);
    factoryCam.setReporter(videoReporter);

    factoryCam.detect();
    factoryCam.report();
  }
}
