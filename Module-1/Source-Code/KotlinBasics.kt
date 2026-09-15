fun main() {
    // 1. Fix the quotation error
    println("New chat message from a friend")
    println()

    // 2. Discount offer
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"

    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
    println()

    // 3. Calculate the total party size
    val numberOfAdults = 20
    val numberOfKids = 30
    val totalPartySize = numberOfAdults + numberOfKids

    println("The total party size is: $totalPartySize")
    println()

    // 4. Calculate the total salary
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount

    println(
        "Congratulations for your bonus! You will receive a total of " +
            "$totalSalary (additional bonus)."
    )
    println()

    // 5. Add two numbers
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber

    println("$firstNumber + $secondNumber = $result")
    println()

    // 6. Display an alert message
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
    println()

    // 7. Display messages using default and named arguments
    val firstUserEmailId = "user_one@gmail.com"
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"
    println(
        displayAlertMessage(
            secondUserOperatingSystem,
            secondUserEmailId
        )
    )
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"
    println(
        displayAlertMessage(
            thirdUserOperatingSystem,
            thirdUserEmailId
        )
    )
    println()

    // 8. Steps converted to calories
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps)

    println("Walking $steps steps burns $caloriesBurned calories")
    println()

    // 9. Weather information
    printWeatherInformation("Ankara", 27, 31, 82)
    printWeatherInformation("Tokyo", 32, 36, 10)
    printWeatherInformation("Cape Town", 59, 64, 2)
    printWeatherInformation("Guatemala City", 50, 55, 7)
}

fun displayAlertMessage(
    operatingSystem: String = "Unknown OS",
    emailId: String
): String {
    return "There's a new sign-in request on $operatingSystem " +
        "for your Google Account $emailId."
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    return numberOfSteps * caloriesBurnedForEachStep
}

fun printWeatherInformation(
    city: String,
    lowTemperature: Int,
    highTemperature: Int,
    chanceOfRain: Int
) {
    println("City: $city")
    println(
        "Low temperature: $lowTemperature, " +
            "High temperature: $highTemperature"
    )
    println("Chance of rain: $chanceOfRain%")
    println()
}
