fun main (){
    try{
    print("Введите x:")
    var x = readLine()!!.toDouble()
    when
    {
        (x>1) -> println(1/(x+6))
        else -> println(0)
    }
} catch (e:Exception)
    {
println("Ошибка ввода")

    }}