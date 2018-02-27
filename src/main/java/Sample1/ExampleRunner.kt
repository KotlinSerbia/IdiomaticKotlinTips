package Sample1

fun main(args: Array<String>) {
    val user = User("Pera", "Peric", "pera.peric@mail.com", 12)
    val user1 = UserBuilder().setName("Luke").setSurname("Cage").setAge(29).setEmail("luke.cage@mail.com").createUser()
    val kotlinUser = KotlinUser("Luke", " Cage")
    println(user.isAdult)
    println(kotlinUser.isAdult())
}

fun User.isAdult() = age >= 18
fun KotlinUser.isAdult() = age >= 18