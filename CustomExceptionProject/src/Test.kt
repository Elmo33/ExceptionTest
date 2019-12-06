fun main(args: Array<String>) {

    print("შეიყვანეთ რიცხვი (1-100) : ")
    val num = readLine()

    try {
        if (num != null) {
            validateName(num.toInt())
        }
    } catch (e : InvalidNumberException){
        println(e.message)
    } catch (e : Exception){
        println(e.message)
    }

}

fun validateName(num : Int){
    if(num > 100) {
        throw InvalidNumberException("რიცხვი აღემატება 100-ს")
    }
}