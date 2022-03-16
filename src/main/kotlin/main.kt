import kotlin.math.log10

fun numeral(likes:Int):String{
    return when{
        likes == 0 || log10(likes.toDouble()) % 1 == 0.0 && likes != 10 && likes != 100-> "человек"
        likes % 10.0 == 1.0 -> "человеку"
        likes % 10.0 in 2.0 .. 9.0 || likes % 10.0 == 0.0 -> "людям"
        else -> ""
    }
}

fun main(){
    val amount = 10000000
    val amount1 = 76121
    val amount2 = 174824
    val amount3 = 0
    val amount4 = 100

    println("Понравилось $amount ${numeral(amount)}")
    println("Понравилось $amount1 ${numeral(amount1)}")
    println("Понравилось $amount2 ${numeral(amount2)}")
    println("Понравилось $amount3 ${numeral(amount3)}")
    println("Понравилось $amount4 ${numeral(amount4)}")
}