package sample5

typealias NewsId = Int

class KotlinNewsRepository(private val dataStore: NewsDataStore) : NewsRepository by dataStore
data class KotlinNews(val id: Int, val author: String, val newsText: String)

fun main(args: Array<String>) {
    val news = listOf(KotlinNews(1, "Elon Musk", "Tesla is awesome."),
            KotlinNews(2, "Peter", "Black Panter is one of the best movies so far."),
            KotlinNews(3, "Google", "Kotlin is official language for Android development.")
    )
    val repository = KotlinNewsRepository(object : NewsDataStore {
        override fun getAllNews(): List<KotlinNews> {
            return news
        }

        override fun getNewsBy(newsId: Int): KotlinNews {
            return news.find { it.id == newsId }!!
        }

    })

    println(repository.allNews)
    println(repository.getNewsBy(2))
}