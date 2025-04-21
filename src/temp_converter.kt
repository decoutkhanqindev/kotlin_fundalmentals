fun main() {
  val degree1 = 27.0
  val degree2 = 350.0
  val degree3 = 10.0

  printFinalTemperature(
    initialMeasurement = degree1,
    initialUnit = Unit.Celsius.toString(),
    finalUnit = Unit.Fahrenheit.toString(),
    conversionFormula = { it: Double -> cToF(it) }
  )

  printFinalTemperature(
    initialMeasurement = degree2,
    initialUnit = Unit.Kelvin.toString(),
    finalUnit = Unit.Celsius.toString(),
    conversionFormula = { it: Double -> kToC(it) }
  )

  printFinalTemperature(
    initialMeasurement = degree3,
    initialUnit = Unit.Fahrenheit.toString(),
    finalUnit = Unit.Kelvin.toString(),
    conversionFormula = { it: Double -> fToK(it) }
  )
}

fun printFinalTemperature(
  initialMeasurement: Double,
  initialUnit: String,
  finalUnit: String,
  conversionFormula: (Double) -> Double
) {
  val finalMeasurement = String.format(
    "%.2f", conversionFormula(initialMeasurement)
  ) // two decimal places
  println(
    "$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit."
  )
}

enum class Unit {
  Celsius, Fahrenheit, Kelvin
}

fun cToF(c: Double): Double = 9.0 / 5.0 * c + 32
fun kToC(k: Double): Double = k - 273.15
fun fToK(f: Double): Double = 5.0 / 9.0 * (f - 32) + 273.15