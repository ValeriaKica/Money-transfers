fun main() {
    val amount = 5_000 // сумма перевода
    val feeDeduction = amount * 0.0075 //

    val commission = if (feeDeduction > 35.0) feeDeduction else 35.0

    println("Размер комисси: $commission рублей")
}