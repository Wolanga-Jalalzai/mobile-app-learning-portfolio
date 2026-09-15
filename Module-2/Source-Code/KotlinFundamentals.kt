fun main() {
    // Exercise 1: Movie tickets
    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = true

    println(
        "The movie ticket price for a person aged $child is " +
            "$${ticketPrice(child, isMonday)}."
    )
    println(
        "The movie ticket price for a person aged $adult is " +
            "$${ticketPrice(adult, isMonday)}."
    )
    println(
        "The movie ticket price for a person aged $senior is " +
            "$${ticketPrice(senior, isMonday)}."
    )
    println()

    // Exercise 2: Temperature conversion
    printFinalTemperature(
        27.0,
        "Celsius",
        "Fahrenheit"
    ) {
        9.0 / 5.0 * it + 32
    }

    printFinalTemperature(
        350.0,
        "Kelvin",
        "Celsius"
    ) {
        it - 273.15
    }

    printFinalTemperature(
        10.0,
        "Fahrenheit",
        "Kelvin"
    ) {
        (it - 32) * 5.0 / 9.0 + 273.15
    }
    println()

    // Exercise 3: Person
    val amanda = Person(
        "Amanda",
        33,
        "play tennis",
        null
    )

    val atiqah = Person(
        "Atiqah",
        28,
        "climb",
        amanda
    )

    amanda.showProfile()
    atiqah.showProfile()
    println()

    // Exercise 4: Phone
    val phone = Phone()

    phone.checkPhoneScreenLight()
    phone.switchOn()
    phone.checkPhoneScreenLight()
    phone.switchOff()
    phone.checkPhoneScreenLight()
    println()

    // Exercise 5: Auction
    val winningBid = Bid(
        5000,
        "Private Collector"
    )

    println(
        "Item A is sold at ${auctionPrice(winningBid, 2000)}."
    )
    println(
        "Item B is sold at ${auctionPrice(null, 3000)}."
    )
}

// Exercise 1
fun ticketPrice(
    age: Int,
    isMonday: Boolean
): Int {
    return when {
        age <= 12 -> 15
        age >= 65 -> 20
        isMonday -> 25
        else -> 30
    }
}

// Exercise 2
fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement =
        String.format(
            "%.2f",
            conversionFormula(initialMeasurement)
        )

    println(
        "$initialMeasurement degrees $initialUnit is " +
            "$finalMeasurement degrees $finalUnit."
    )
}

// Exercise 3
class Person(
    val name: String,
    val age: Int,
    val hobby: String?,
    val referrer: Person?
) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        println("Likes to $hobby.")

        if (referrer != null) {
            println(
                "Has a referrer named ${referrer.name}, " +
                    "who likes to ${referrer.hobby}."
            )
        } else {
            println("Doesn't have a referrer.")
        }
    }
}

// Exercise 4
class Phone(
    var isScreenLightOn: Boolean = false
) {
    fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight =
            if (isScreenLightOn) "on" else "off"

        println(
            "The phone screen's light is $phoneScreenLight."
        )
    }
}

// Exercise 5
class Bid(
    val amount: Int,
    val bidder: String
)

fun auctionPrice(
    bid: Bid?,
    minimumPrice: Int
): Int {
    return bid?.amount ?: minimumPrice
}
