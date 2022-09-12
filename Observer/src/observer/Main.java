package observer;

public class Main {

    public static void main(String[] args) {

        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsChannel observer = new PCLNewsChannel();

        observable.addPropertyChangeListener(observer);
        observable.setNews("news");
        System.out.println(observer.getNews());

        observable.removePropertyChangeListener(observer);
        observable.setNews("empty news");
        System.out.println(observer.getNews());
    }
}
