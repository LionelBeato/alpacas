package Lesson.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

// this class is an observable
// it has a state that will change
// once that state changes, it'll ping its observers


public class NewsAgency {
    private String news;

    public String getNews() {
        return news;
    }

    private List<Channel> channelList = new ArrayList<>();

    public void addObserver(Channel channel){
        this.channelList.add(channel);
    }

    public void removeObserver(Channel channel){
        this.channelList.remove(channel);
    }


    public void setNews(String news){
        this.news = news;
        for (Channel channel : this.channelList){
            channel.update(this.news);
        }
    }
}
