fun main() {
    val numTrainingDay = 6
    val isEvenTrainingDay = (numTrainingDay % 2) == 0
    println(
        """
        Упражнения для рук: ${!isEvenTrainingDay}
        Упражнения для ног: ${isEvenTrainingDay}
        Упражнения для спины: ${isEvenTrainingDay}
        Упражнения для пресса:${!isEvenTrainingDay}
    """.trimIndent()
    )
}