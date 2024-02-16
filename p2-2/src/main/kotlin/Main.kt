fun main(args: Array<String>)
{
    val likes = 11

    if (likes % 10 != 1 || likes == 11)
        println("Понравилось " + likes + " людям.")
    else
        println("Понравилось " + likes + " человеку.")
}