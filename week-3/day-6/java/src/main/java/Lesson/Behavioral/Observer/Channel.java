package Lesson.Behavioral.Observer;

// Java has a built in Observer interface but it is considered deprecated
// anything deprecated will have its name depicted with a strikethrough
public interface Channel {
    public void update(Object o);
}
