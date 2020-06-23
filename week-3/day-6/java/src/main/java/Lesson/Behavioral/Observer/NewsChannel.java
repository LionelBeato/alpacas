package Lesson.Behavioral.Observer;

// this is an observer
// it has an update method that is implemented from an interface called Channel
// structuring the code like this assures all observers have this method
// note that the observer has its own "news" field
// note how the setter is called in the update method
public class NewsChannel implements Channel {
    private String news;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }
}
