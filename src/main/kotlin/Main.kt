import kotlin.math.roundToInt

fun main() {
    var amount = 0
    val transferAmount = 10000
    amount = (transferAmount * 0.0075).roundToInt()
    if (amount < 3500)
        amount = 3500
}