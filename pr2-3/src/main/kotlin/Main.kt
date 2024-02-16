fun main(args: Array<String>)
{
    val sum = 10001
    val promotion : Double
    val SuperBuyer = true
    val invoiceToBePaid : Double

    if(sum >= 1001 && sum <= 10_000)
        promotion = 100.00
    else
        promotion = sum * 0.05

    if (!SuperBuyer)
        invoiceToBePaid = sum - promotion
    else
        invoiceToBePaid = (sum - promotion) * 0.99

    println("Переведите на наш счет: " + invoiceToBePaid + " ₽")
}