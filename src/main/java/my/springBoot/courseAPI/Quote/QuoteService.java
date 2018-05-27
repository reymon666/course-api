package my.springBoot.courseAPI.Quote;

public interface QuoteService {

    String CATEGORY_INSPIRATIONAL = "inspire";

    Quote getDaily(String category);

}