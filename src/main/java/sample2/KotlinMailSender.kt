package sample2


fun main(args: Array<String>) {
    val client = KotlinClient(KotlinPersonalInfo("kotlinserbia@gmail.com"))
    val message = "Yay. first Kotlin meetup of the year"

    KotlinMessageSender().sendMessageToClient(client, message)
}

class KotlinMessageSender {
    fun sendMessageToClient(
            client: KotlinClient?,
            message: String?,
            mailer: KotlinMailer = KotlinMailer()
    ) {
        if (message == null) return

        client?.personalInfo?.email?.let {
            mailer.sendMessage(it, message)
        }
    }
}

class KotlinMailer {
    fun sendMessage(email: String, message: String) {
        print("""Email sent to: $email
        Message: $message""")
    }
}

class KotlinClient(val personalInfo: KotlinPersonalInfo?)

class KotlinPersonalInfo(val email: String?)