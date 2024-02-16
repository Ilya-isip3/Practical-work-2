fun main(args: Array<String>)
{
    var amount : Int = 5000
    var amountTotal : Double = amount * 0.9925

    if (amount - amountTotal < 35)
        amountTotal = amount - 35.0

    println(amountTotal)
}