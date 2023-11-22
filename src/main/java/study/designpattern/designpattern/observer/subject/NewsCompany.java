package study.designpattern.designpattern.observer.subject;

import lombok.Getter;
import lombok.Setter;
import study.designpattern.designpattern.observer.News;
import study.designpattern.designpattern.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class NewsCompany implements NewsSubject {

    private List<Observer> observers = new ArrayList<>();
    private News news;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
