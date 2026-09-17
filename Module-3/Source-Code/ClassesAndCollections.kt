// Unit 3: More Kotlin Fundamentals

enum class Difficulty {
    EASY,
    MEDIUM,
    HARD
}

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz : ProgressPrintable {
    val question1 = Question(
        "Quoth the raven ___",
        "nevermore",
        Difficulty.MEDIUM
    )

    val question2 = Question(
        "The sky is green. True or false",
        false,
        Difficulty.EASY
    )

    val question3 = Question(
        "How many days are there between full moons?",
        28,
        Difficulty.HARD
    )

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }

    override val progressText: String
        get() = "$answered of $total answered."

    override fun printProgressBar() {
        repeat(answered) {
            print("▓")
        }

        repeat(total - answered) {
            print("▒")
        }

        println()
        println(progressText)
    }

    fun printQuiz() {
        question1.let {
            println("Question: ${it.questionText}")
            println("Answer: ${it.answer}")
            println("Difficulty: ${it.difficulty}")
        }
        println()

        question2.let {
            println("Question: ${it.questionText}")
            println("Answer: ${it.answer}")
            println("Difficulty: ${it.difficulty}")
        }
        println()

        question3.let {
            println("Question: ${it.questionText}")
            println("Answer: ${it.answer}")
            println("Difficulty: ${it.difficulty}")
        }
    }
}

enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int
)

val Event.durationOfEvent: String
    get() = if (durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }

fun main() {
    println("UNIT 3: GENERICS, OBJECTS AND EXTENSIONS")
    println()

    Quiz().apply {
        printQuiz()
        println()
        printProgressBar()
    }

    println()
    println("COLLECTIONS PRACTICE")
    println()

    val event1 = Event(
        title = "Wake up",
        description = "Time to get up",
        daypart = Daypart.MORNING,
        durationInMinutes = 0
    )

    val event2 = Event(
        title = "Eat breakfast",
        daypart = Daypart.MORNING,
        durationInMinutes = 15
    )

    val event3 = Event(
        title = "Learn about Kotlin",
        daypart = Daypart.AFTERNOON,
        durationInMinutes = 30
    )

    val event4 = Event(
        title = "Practice Compose",
        daypart = Daypart.AFTERNOON,
        durationInMinutes = 60
    )

    val event5 = Event(
        title = "Watch latest DevBytes video",
        daypart = Daypart.AFTERNOON,
        durationInMinutes = 10
    )

    val event6 = Event(
        title = "Check out latest Android Jetpack library",
        daypart = Daypart.EVENING,
        durationInMinutes = 45
    )

    val events = mutableListOf(
        event1,
        event2,
        event3,
        event4,
        event5,
        event6
    )

    println("Total number of events: ${events.size}")
    println()

    val shortEvents = events.filter {
        it.durationInMinutes < 60
    }

    println("You have ${shortEvents.size} short events.")
    println()

    val groupedEvents = events.groupBy {
        it.daypart
    }

    groupedEvents.forEach { (daypart, eventList) ->
        println("$daypart: ${eventList.size} events")
    }

    println()
    println("Last event of the day: ${events.last().title}")

    println(
        "Duration of first event of the day: " +
            events[0].durationOfEvent
    )
}
