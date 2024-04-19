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

    val inputString: String= "4"
    when {
        inputString == "4" -> println("4 ok")
        msgType1 == "2" -> println("msgType1 = 2")
    }

    /**
     * For 반복문
     * **/
    val item = arrayOf(1,2,3)
    var list = listOf(1,2,3)

    for(index in item.indices){
        println("get out of item : " + index)
    }

    for(index in list.indices){
        println("index : " + index)
    }

    /** 1부터 100까지 반복  **/
    for(i in 1..100){
        //println("$i")
    }

    /**  1부터 99까지 반복 **/
    for(i in 1 until 100){
        println("$i")
    }

    /** 2 부터 10까지 반복, 2씩 증가  **/
    for(i in 2..10 step 2){
        print("$i")
    }

    /** 10 부터 1까지 감소  **/
    for (i in 10 downTo 1){
        print("$i")
    }

    /**
     * while 반복문
     * **/
    val arrayForItem = Array(5) { v -> v+1}
    var index1 = 0

    while (index1 <arrayForItem.size){
        println(":: arrayForItem :: " + arrayForItem[index1])
        index1++
    }

    /**
     * 함수
     * */
    //기본적인 방식
    fun basicFunc(name: String): Int {
        return name.toInt()
    }

    //한줄에 선언하는 방식
    fun simpleFunc(name: String)=name.toInt()

    //ex1
    fun doPostUserFindUserIdCode(
        baseReq: Int,
        req: String,
    ): String = name.toString()

    /**
     * 기본 매개변수
     * **/
    fun simpleFunc(name: String="김찬정", age: Int): String {
        return name
    }

    /**
     * 명명된 매개변수
     * */
    fun simpeFunc2(name: String, age: Int =10) = name3

    var name5 = simpeFunc2("test",10)
    var name6 = simpeFunc2(name="test2", age= 40)
    var name7 = simpeFunc2(age=10, name="test3")

    /**
     * 함수 호출 시 가변인자.
     * vararg 는 kotlin에서 가변 인자를 나타내는 키워드 입니다.
     * 매서드나 함수의 매개변수로 사용 될때, 해당 매개 변수에 여러개의 인자를 전달 할 수 있습니다.
     * 문자열을 여러개 받을 수 있습니다.
     * **/


































}