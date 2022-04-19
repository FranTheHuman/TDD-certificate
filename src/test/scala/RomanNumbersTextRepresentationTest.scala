import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._

class RomanNumbersTextRepresentationTest extends AnyFlatSpec with should.Matchers {

  "test000" should "successfully pass" in {
    val romanNumbers: RomanNumberTextRepresentation = new RomanNumberTextRepresentation()
    assert(
      intercept[RuntimeException] {
        romanNumbers.of(0)
      }.getMessage == romanNumbers.ZERO_ERROR
    )
  }

  "test001" should "successfully pass" in {
    "I" shouldEqual new RomanNumberTextRepresentation().of(1)
  }

  "test002" should "successfully pass" in {
    "II" shouldEqual new RomanNumberTextRepresentation().of(2)
  }

  "test003" should "successfully pass" in {
    "III" shouldEqual new RomanNumberTextRepresentation().of(3)
  }

  "test004" should "successfully pass" in {
    "IV" shouldEqual new RomanNumberTextRepresentation().of(4)
  }

  "test005" should "successfully pass" in {
    "V" shouldEqual new RomanNumberTextRepresentation().of(5)
  }

  "test006" should "successfully pass" in {
    "VI" shouldEqual new RomanNumberTextRepresentation().of(6)
  }

  "test007" should "successfully pass" in {
    "VII" shouldEqual new RomanNumberTextRepresentation().of(7)
  }

  "test008" should "successfully pass" in {
    "VIII" shouldEqual new RomanNumberTextRepresentation().of(8)
  }

  "test009" should "successfully pass" in {
    "IX" shouldEqual new RomanNumberTextRepresentation().of(9)
  }

  "test010" should "successfully pass" in {
    "X" shouldEqual new RomanNumberTextRepresentation().of(10)
  }

  "test011" should "successfully pass" in {
    "XI" shouldEqual new RomanNumberTextRepresentation().of(11)
  }

  "test012" should "successfully pass" in {
    "XII" shouldEqual new RomanNumberTextRepresentation().of(12)
  }

  "test013" should "successfully pass" in {
    "XIII" shouldEqual new RomanNumberTextRepresentation().of(13)
  }

  "test014" should "successfully pass" in {
    "XIV" shouldEqual new RomanNumberTextRepresentation().of(14)
  }

  "test015To018" should "successfully pass" in {
    "XV" shouldEqual new RomanNumberTextRepresentation().of(15)
    "XVI" shouldEqual new RomanNumberTextRepresentation().of(16)
    "XVII" shouldEqual new RomanNumberTextRepresentation().of(17)
    "XVIII" shouldEqual new RomanNumberTextRepresentation().of(18)
  }

  "test019" should "successfully pass" in {
    "XIX" shouldEqual new RomanNumberTextRepresentation().of(19)
  }

  "test020To029" should "successfully pass" in {
    "XX" shouldEqual new RomanNumberTextRepresentation().of(20)
    "XXII" shouldEqual new RomanNumberTextRepresentation().of(22)
    "XXIV" shouldEqual new RomanNumberTextRepresentation().of(24)
    "XXVII" shouldEqual new RomanNumberTextRepresentation().of(27)
    "XXIX" shouldEqual new RomanNumberTextRepresentation().of(29)
  }

  "test030To039" should "successfully pass" in {
    "XXX" shouldEqual new RomanNumberTextRepresentation().of(30)
    "XXXII" shouldEqual new RomanNumberTextRepresentation().of(32)
    "XXXIV" shouldEqual new RomanNumberTextRepresentation().of(34)
    "XXXVII" shouldEqual new RomanNumberTextRepresentation().of(37)
    "XXXIX" shouldEqual new RomanNumberTextRepresentation().of(39)
  }

  "test040To049" should "successfully pass" in {
    "XL" shouldEqual new RomanNumberTextRepresentation().of(40)
    "XLII" shouldEqual new RomanNumberTextRepresentation().of(42)
    "XLIV" shouldEqual new RomanNumberTextRepresentation().of(44)
    "XLVII" shouldEqual new RomanNumberTextRepresentation().of(47)
    "XLIX" shouldEqual new RomanNumberTextRepresentation().of(49)
  }

  "test050To089" should "successfully pass" in {
    "L" shouldEqual new RomanNumberTextRepresentation().of(50)
    "LIV" shouldEqual new RomanNumberTextRepresentation().of(54)
    "LIX" shouldEqual new RomanNumberTextRepresentation().of(59)
    "LX" shouldEqual new RomanNumberTextRepresentation().of(60)
    "LXIX" shouldEqual new RomanNumberTextRepresentation().of(69)
    "LXX" shouldEqual new RomanNumberTextRepresentation().of(70)
    "LXXX" shouldEqual new RomanNumberTextRepresentation().of(80)
    "LXXXIX" shouldEqual new RomanNumberTextRepresentation().of(89)
  }

  "test090To099" should "successfully pass" in {
    "XC" shouldEqual new RomanNumberTextRepresentation().of(90)
    "XCIV" shouldEqual new RomanNumberTextRepresentation().of(94)
    "XCIX" shouldEqual new RomanNumberTextRepresentation().of(99)
  }

  "test100To999" should "successfully pass" in {
    "C" shouldEqual new RomanNumberTextRepresentation().of(100)
    "D" shouldEqual new RomanNumberTextRepresentation().of(500)
    "CMXCIX" shouldEqual new RomanNumberTextRepresentation().of(999)
  }
}