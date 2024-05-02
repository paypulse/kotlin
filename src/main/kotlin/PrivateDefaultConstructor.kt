class PrivateDefaultConstructor  {

    lateinit var name: String

    // companion object 키워드로 인하여 of 메소드는
    // static으로 생성 된다.
    companion object {
        var address = "서울"
        fun of(name: String): PrivateDefaultConstructor {
            val instance = PrivateDefaultConstructor()
            instance.name = name
            return instance
        }

    }
}




