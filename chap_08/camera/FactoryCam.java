package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
  private Detectable detector;
  private Reportable reporter;

  // 📌 (2) 인터페이스를 이용한 다중상속 구현
  public void setDetector(Detectable detector) {
    this.detector = detector;
  }

  public void setReporter(Reportable reporter) {
    this.reporter = reporter;
  }

  // 📌 (1) 추상메서드를 구현
  @Override
  public void showMainFeature() {
    System.out.println("화재 감지");
  }

  // 📌 (2) 인터페이스를 이용한 다중상속 구현
  @Override
  public void detect() {
    detector.detect();
  }

  @Override
  public void report() {
    reporter.report();
  }
}
