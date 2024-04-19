/**
 * 생성자 오버로딩 (여러개의 생성자)
 * lazyinit
 * 멤버 프로퍼티의 값 초기화를 지연하는 키워드 이다.
 * var(mutable) 프로퍼티만 사용 가능
 * non-null 프로퍼티만 사용가능
 * 커스텀 getter/setter 가 없는 프로퍼티만 사용가능
 * primitive type 프로퍼티는 사용 불가능
 * 클래스 생성자에서 사용 불가능
 * 로컬 변수로 사용 불가능
 * **/
class OverLoadingConstructor(name: String) {
    var name: String

    lateinit var address: String
    var age: Int =0

    init {
        this.name = name
    }

    constructor(name: String,address: String,age: Int) : this(name) {
        this.name = name
        this.address = address
        this.age = age
    }
    
}
