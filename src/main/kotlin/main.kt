fun main() {
    println("Hello World!");
    /**
     * 번수
     * var ,val 의 차이
     * var :  가변 (mutable) 변수 , 타입 생략도 가능
     * val :  불변 (immutable) 변수
     * */
    var x=5
    println("change var : "+ x);
    x=10;
    println("chagne var : "+ x);

    val y= 20;
    println("change val :" + y );
    //y=50;

    val name:String ="김찬정"  //  값을 바꿀 수 없는 불변
    var age:String = "20"
    var adress = "서울"

    /**
     * Null 허용 변수와 Null 허용하지 않는 변수 선언
     * **/
    var name2: String?= null
    ///var age2: Int  =null   ->  NULL을 허용하지 않는 경우 , Null을 대입해서 사용 할 수 없다.

    val name3:String?= null
    //name3이 null이 아니면 length를 반환
    val nameLength = name3?.length;












}