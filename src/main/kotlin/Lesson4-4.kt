fun main() {
    val numTrainingDay = 6
    val isEvenTrainingDay = if ((numTrainingDay % 2) == 0) {
        true
    } else {
        false
    }
    println(
        """
        Упражнения для рук: ${!isEvenTrainingDay}
        Упражнения для ног: ${isEvenTrainingDay}
        Упражнения для спины: ${isEvenTrainingDay}
        Упражнения для пресса:${!isEvenTrainingDay}
    """.trimIndent()
    )
}