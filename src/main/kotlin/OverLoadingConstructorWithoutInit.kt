class OverLoadingConstructorWithoutInit {

    var name: String
    var address: String = ""
    var age: Int = 0

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, address: String, age: Int) {
        this.name = name
        this.address = address
        this.age = age
    }
}