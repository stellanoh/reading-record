# Item 1 : 생성자 대신 정적 팩토리 메소드를 고려하라

- public Constructor : 인스턴스를 얻기 위한 전통적인 방법은 public 생성자를 통해서
- public static factory method :  해당 클래스의 instance를 리턴하는 정적 함수

## 정적 팩토리 메소드의 장점

1. 이름을 가진다.

   생성자의 경우 return하는 클래스의 명만 유추 가능

   정적 메소드의 경우, 메소드 명을 잘 선택하면 읽고 쓰기 쉬움
   
    ex) BigInteger(int, int, Random) // BigInteger.probablePrime
    
2. 