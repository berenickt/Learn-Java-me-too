package chap_10.converter;

// 📌 함수형 인터페이스로 사용하겠다는 어노테이션
// 일반 인터페이스와 함수형 인터페이스를 구분하기 위해 사용
@FunctionalInterface
public interface ConvertibleWithNoParams {
  void convert();
}
