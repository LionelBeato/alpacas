package Lesson.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

// this class is an observable
// it has a state that will change
// once that state changes, it'll ping its observers
// the "ping" is a simple call to an observer's update() method
public class NewsAgency {
    // this field represent the state will change
    // this state will be reflected in our observers
    private String news;

    public String getNews() {
        return news;
    }

    // a list of observers that we can use to dynamically add/remove observers
    private List<Channel> channelList = new ArrayList<>();

    // simple call to a list method to add an observer
    public void addObserver(Channel channel){
        this.channelList.add(channel);
    }

    // simple call to a list method to remove an observer
    public void removeObserver(Channel channel){
        this.channelList.remove(channel);
    }


    public void setNews(String news){
        this.news = news;

        // note the use of an enhanced for loop to iterate through all observers
        for (Channel channel : this.channelList){
            channel.update(this.news);
        }
    }
}
