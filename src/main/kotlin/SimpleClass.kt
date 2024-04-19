/***
 * kotlin class
 * 멤버 프로퍼티(변수)와 생성자를 동시에 선언
 * kotlin 클래스의 기본 생성자는 클래스명 바로 옆 () 구문이다.
 * 기본 생성자의 매개 변수 선언을 val name:String  하면 멤버 프로퍼티(변수) 선언과
 * 기본 생성자 매개변수 선언을 동시에 한것이다.
 * **/
class SimpleClass(val name:String, var address:String, var age:Int=41)
