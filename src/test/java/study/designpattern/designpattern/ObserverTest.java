package study.designpattern.designpattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import study.designpattern.designpattern.observer.News;
import study.designpattern.designpattern.observer.observer.ACompany;
import study.designpattern.designpattern.observer.observer.BSchool;
import study.designpattern.designpattern.observer.observer.Observer;
import study.designpattern.designpattern.observer.subject.NewsCompany;

import java.util.List;

public class ObserverTest {

    @Test
    void observer_pattern_test() {
        NewsCompany newsCompany = new NewsCompany();
        ACompany aCompany = new ACompany(newsCompany);
        BSchool bSchool = new BSchool(newsCompany);

        newsCompany.setNews(new News("hello!", "everyone!"));
        newsCompany.notifyObservers();

        List<Observer> observers = newsCompany.getObservers();
        String ACompanyNewsTitle = aCompany.getNews().getTitle();

        Assertions.assertEquals(2, observers.size());
        Assertions.assertEquals("hello!", ACompanyNewsTitle);
    }
}
