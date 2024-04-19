/**
 * 클래스 기본 생성자의 초기화 init 블럭
 * **/

class BasicClass(name: String, address: String, age: Int){
    var name: String = name
    var address: String
    var age: Int

    init {
        this.address = address
        this.age = age
    }
}

