// SCALA > JAVA :Cpica:

class RomanNumberTextRepresentation {

  val ZERO_ERROR = "No Zeroes"


  def of(number: Int): String = isZeroException(number) match {
    case Some(error: RuntimeException) => throw error
    case None => convertNumber(number)
  }

  // TODO: REFACTOR FP
  private def convertNumber(number: Int): String =
    convertDigitUsingStringBuilder(
      (number % 10),
      convertDigitUsingStringBuilder(
        (number / 10) % 10,
        convertDigitUsingStringBuilder(
          (number / 100) % 10,
          "",
          "C",
          "D",
          "M"
        ),
        "X",
        "L",
        "C"
      ),
      "I",
      "V",
      "X"
    )

  private def isZeroException(number: Int): Option[RuntimeException] = number match {
    case n if n == 0 => Some(new RuntimeException(ZERO_ERROR))
    case _ => None
  }

  // TODO: REFACTOR FP
  private def convertDigitUsingStringBuilder(
   aDigit: Int,
   stringBuilder: String,
   asOne: String,
   asFive:String,
   asTen: String
  ): String = aDigit match {
    case digit if digit >= 1 && digit <= 3 =>
      var localStringBuilder = stringBuilder
      for (_ <- 1 to digit) { localStringBuilder += asOne }
      localStringBuilder

    case digit if digit == 4 =>
      var localStringBuilder = stringBuilder
      localStringBuilder += asOne + asFive
      localStringBuilder

    case digit if digit >= 5 && digit <= 8 =>
      var localStringBuilder = stringBuilder
      localStringBuilder += asFive
      for (_ <- 6 to digit) { localStringBuilder += asOne }
      localStringBuilder

    case digit if digit == 9 =>
      var localStringBuilder = stringBuilder
      localStringBuilder += asOne + asTen
      localStringBuilder

    case _ => stringBuilder
  }

}
