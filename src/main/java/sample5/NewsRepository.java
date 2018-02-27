package sample5;

import java.util.List;

public interface NewsRepository {
    List<KotlinNews> getAllNews();

    KotlinNews getNewsBy(int newsId);
}
