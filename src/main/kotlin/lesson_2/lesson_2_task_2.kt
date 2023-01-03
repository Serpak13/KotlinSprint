package lesson_2

fun main() {
    //Вводные данные
    val workerConst = 50  // кол-во постоянных сотрудников
    val payCheckConst = 30000 // ЗП постоянных сотрудников
    val workerInterim = 30 // кол-во стажёров
    val payCheckInterim = 20000 // ЗП стажёров

    // Расчёты

    val expensesConst = workerConst * payCheckConst //Затраты на зп постоянных сотрудников
    val totalExpenditure = expensesConst + (workerInterim * payCheckInterim) //Общие затраты после прихода стажёров
    val arithmeticAfter = (totalExpenditure) / (workerConst + workerInterim) //средняя зп по всем работникам

    println("Расходы на выплату зарплаты постоянных сотрудников - $expensesConst у.е.")
    println("Общие расходы по зарплате после прихода сотрудников - $totalExpenditure у.е.")
    println("Средняя зарплата одного сотрудника после прихода стажёров - $arithmeticAfter у.е.")
}