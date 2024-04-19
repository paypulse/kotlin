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
    val nameLength = name3?.length
    println(nameLength);

    //null 이면,  NullPointerException 발생
    //val nameLength2 = name2!!.length
    //println(nameLength2)

    //타입 캐스팅dl 불가능한 경우 예외를 발생 시키지 않고 null
    val age1: Int?= name as? Int?

    val msgType: Int?= null
    var msg1 = if(msgType == 1) "안녕" else "잘가"

    //위의 내용을 더 간단하게
    fun getMsg(msgType: Int) = if (msgType ==1 ) "안녕" else "잘가"
    println("short function 1  : " + getMsg(2))

    /**
     * when 표현식
     * */
    val inputType =2
    val msgType1 ="2"
    fun checkType(type: Int) = if (type == 1) 1 else -1
    println("checkType : " + checkType(1));

    when (inputType) {
        1 -> println("1")
        2,3 -> println("2 or 3")
        else -> println("not")
    }

    when (inputType) {
        checkType(inputType) -> println("OK")
        else -> println("NOT OK")
    }

    //조건에 범위 연산자 사용도 가능 하다.
    // 1~100에 포함 된다면
    val result = when (inputType) {
        in 1..100 -> "1..100 ok"
        else -> "NOT OK"
    }

    val inputString: String?= "4"
    when {
        inputString == "4" -> println("4 ok")
        msgType1 == "2" -> println("msgType1 = 2")
    }

















}