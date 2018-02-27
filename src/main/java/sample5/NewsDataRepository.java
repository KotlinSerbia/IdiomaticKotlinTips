package sample5;

import java.util.List;

public class NewsDataRepository implements NewsRepository {

    private final NewsDataStore newsDataStore;

    NewsDataRepository(NewsDataStore newsDataStore) {
        this.newsDataStore = newsDataStore;
    }

    @Override
    public List<KotlinNews> getAllNews() {
        return newsDataStore.getAllNews();
    }

    @Override
    public KotlinNews getNewsBy(int newsId) {
        return newsDataStore.getNewsBy(newsId);
    }
}
