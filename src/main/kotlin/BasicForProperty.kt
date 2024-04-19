/**
 * 클래스의 프로퍼티와
 * override getter/setter
 * **/
class BasicForProperty(name: String, address: String, age: Int) {
    var name: String

    var address: String = ""
        get() = "$field 특별시"
        set(address) {
            field = "$address 특별시"
        }

    var age: Int

    init {
        this.name = name
        this.address = address
        this.age = age
    }
}