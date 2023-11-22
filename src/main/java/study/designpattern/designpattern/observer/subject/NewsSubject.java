package study.designpattern.designpattern.observer.subject;

import study.designpattern.designpattern.observer.observer.Observer;

public interface NewsSubject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
