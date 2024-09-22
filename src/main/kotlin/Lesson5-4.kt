const val USER_IN_DB = "Zaphod"
const val PASSWORD_IN_DB = "PanGalactic"


fun main() {
    println("Пожалуйста, вводите свое имя пользователя")
    val userName = readln()

    if (userName != USER_IN_DB) {
        println("Нет пользователя с таким именем. Вы можете зарегистрироваться")
    } else {
        println("Введите пароль")
        if (readln() == PASSWORD_IN_DB) println("Пользователь ${userName}, вам разрешено входить на борт корабля")
        else println("Пароль неверный")
    }

}