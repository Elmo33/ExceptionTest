fun main() {

    print("შეიყვანეთ რიცხვი (1-100) : ")
    val num = readLine()

    try {
        if (num != null) {
            validateName(num.toInt())
        }
    }
    catch (e : InvalidNumberException){
        println(e.printStackTrace())
        println("a")
    }
    catch (e : Exception){
        println(e.printStackTrace())
    }

}

class InvalidNumberException(message: String) : Exception(message)

fun validateName(num : Int){
    if(num > 100) {
        throw InvalidNumberException("რიცხვი აღემატება 100-ს")
    }
    if(num < 1) {
        throw InvalidNumberException("რიცხვი ნაკლებია 1 ზე")
    }
}
