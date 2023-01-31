fun main(){
    try{
        print("Введите возраст человека: ")
        var age = readLine()!!.toInt()
        when (age)
        {
            in 0..2 -> println("Младенец")
            in 3..5 -> println("Дошкольник")
            in 6..12 -> println("Школьник")
            in 13..19 -> println("Юноша")
            in 20..30 -> println("Ранняя зрелость")
            in 31..60 -> println("Средняя зрелость")
            in 61..100 -> println("Зрелость")
            else -> {println("Неккоректный ввод возраста!")}
        }
    } catch (e:Exception){
        println("Неккоректный ввод!")
    }}