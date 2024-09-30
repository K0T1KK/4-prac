fun main()
{
   println("4.7")

        print("Введите строку:")
        val a = readLine() ?: ""
        println("Длина строки: ${a.length}")


        println("\n4.8")
        print("Введите тип пищи (мясо, рыба, овощи):")
        val b = readLine()
        when (b)
        {
            "мясо" -> println("Время приготовления: 60 минут")
            "рыба" -> println("Время приготовления: 20 минут")
            "овощи" -> println("Время приготовления: 10 минут")
            else -> println("Некорректный тип пищи")
        }




        println("\n4.10")
        print("Введите способ оплаты (наличные, карта, paypal):")
        val c= readLine()
        when (c)
        {
            "наличные" -> println("Вы выбрали наличные")
            "кредитная карта" -> println("Вы выбрали карту")
            "PayPal" -> println("Вы выбрали paypal")
            else -> println("Некорректный способ оплаты")
        }


        println("\n4.11")
        print("Введите группу крови (A, B, AB, O):")
        val d = readLine()
        when (d)
        {
            "A" -> println("Можно переливать A, O")
            "B" -> println("Можно переливать B, O")
            "AB" -> println("Можно переливать AB, A, B, O")
            "O" -> println("Можно переливать O")
            else -> println("Некорректная группа крови")
        }


        println("\n4.12")
        print("Введите страну (США, Россия, Япония, и т.д.):")
        val e = readLine()
        when (e)
        {
            "США" -> println("Американец")
            "Россия" -> println("Русский")
            "Япония" -> println("Японец")
            else -> println("Неизвестная страна")
        }


        println("\n4.13")
        println("Введите код ошибки (100, 200, 300):")
        val h = readLine()?.toInt()
        when (h)
        {
            100 -> println("Ошибка сети")
            200 -> println("Ошибка сервера")
            300 -> println("Ошибка клиента")
            else -> println("Неизвестный код ошибки")
        }


}