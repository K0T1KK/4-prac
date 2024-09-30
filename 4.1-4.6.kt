fun main() {
    println("4.1")
    print("Введите цифру дня:")
    val b = readLine()!!.toInt()
    val a = when (b) {
        1 -> "Понедельник"
        2 -> "Вторник"
        3 -> "Среда"
        4 -> "Четверг"
        5 -> "Пятница"
        6 -> "Суббота"
        7 -> "Воскресенье"
        else -> "Некорректный номер дня"
    }
    println(a)

    println("\n 4.2")
    println("Введите длины сторон треугольника:")
    val c = readLine()?.toDouble() ?: return
    val d = readLine()?.toDouble() ?: return
    val e = readLine()?.toDouble() ?: return
    when {
        c == d && d == e -> println("Равносторонний треугольник")
        c == d || d == e || c == e -> println("Равнобедренный треугольник")
        else -> println("Разносторонний треугольник")
    }

    println("\n 4.3")
    print("Введите оценку (0-100):")
    val h = readLine()?.toInt()
    when (h) {
        in 91..100 -> println("оценка 5")
        in 76..90 -> println("оценка 4")
        in 61..75 -> println("оценка 3")
        in 0..60 -> println("оценка 2")
        else -> println("Некорректная оценка")
    }

    println("\n 4.4")
    print("Введите время (часы):")
    val r = readLine()?.toInt()
    when (r) {
        in 0..5 -> println("это Ночь")
        in 6..11 -> println("это Утро")
        in 12..17 -> println("это День")
        in 18..23 -> println("это Вечер")
        else -> println("Некорректное время")
    }

    println("\n 4.5")
    print("Введите число:")
    val m = readLine()?.toDouble()
    when {
        m == null -> println("Некорректный ввод")
        m > 0 -> println("Положительное число")
        m < 0 -> println("Отрицательное число")
        else -> println("Ноль")
    }
}


