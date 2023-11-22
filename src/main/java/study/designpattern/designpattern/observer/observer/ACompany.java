package study.designpattern.designpattern.observer.observer;

import lombok.Getter;
import lombok.Setter;
import study.designpattern.designpattern.observer.News;
import study.designpattern.designpattern.observer.subject.NewsCompany;

@Setter
@Getter
public class ACompany implements Observer {

    private NewsCompany newsCompany;
    private News news;

    public ACompany(NewsCompany newsCompany) {
        this.newsCompany = newsCompany;
        newsCompany.addObserver(this);
    }

    @Override
    public void update() {
        News updatedNews = newsCompany.getNews();
        setNews(updatedNews);
    }
}
