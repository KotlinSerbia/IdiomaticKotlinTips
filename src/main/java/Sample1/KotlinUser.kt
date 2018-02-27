package Sample1


data class KotlinUser(
        var name: String? = "DefaultName",
        var surname: String? = "DefaultSurname",
        var email: String? = "default@mail.com",
        var age: Int = 18
)