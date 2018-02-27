package sample3

/***
 * DEFINE CONTACT IN THE DSL STYLE
 */

data class KContact(
        var name: String? = null,
        var surname: String? = null,
        var email: String? = null,
        var phone: String? = null,
        var address: KAddress? = null
)

data class KAddress(
        var street: String? = null,
        var number: Int = 0
)

fun contact(function: KContact.() -> Unit): KContact {
    return KContact().apply { function() }
}

fun KContact.address(init: KAddress.() -> Unit) {
    address = KAddress().apply { init() }
}

fun main(args: Array<String>) {
    contact {
        name = "Pera"
        surname = "Peric"
        email = "pera.peric@gmail.com"
        phone = "+381641234566"
        address {
            this.street = "Mike Antica"
            this.number = 2
        }
    }.print()
}

private fun KContact.print() {
    println(this)
}
