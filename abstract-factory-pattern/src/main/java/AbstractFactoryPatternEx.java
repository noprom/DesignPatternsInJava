/**
 * AbstractFactoryPatternEx
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/15/16 4:15 PM.
 */

interface ITollywoodMovie {
    String movieName();
}

interface IBollywoodMovie {
    String movieName();
}

interface IMovieFactory {
    ITollywoodMovie getTollywoodMovie();

    IBollywoodMovie getBollywoodMovie();
}

class TollywoodActionMovie implements ITollywoodMovie {

    public String movieName() {
        return "Kranti is a Tollywood Action Movie";
    }
}

class TollywoodComedyMovie implements ITollywoodMovie {

    public String movieName() {
        return "BasantaBilap is a Tollywood Comedy Movie";
    }
}

class BollywoodActionMovie implements IBollywoodMovie {

    public String movieName() {
        return "Bang Bang is a Bollywood Action Movie";
    }
}

class BollywoodComedyMovie implements IBollywoodMovie {

    public String movieName() {
        return "Munna Bhai MBBS is a Bollywood Comedy Movie";
    }
}

class ActionMovieFactory implements IMovieFactory {

    public ITollywoodMovie getTollywoodMovie() {
        return new TollywoodActionMovie();
    }

    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}

class ComedyMovieFactory implements IMovieFactory {
    public ITollywoodMovie getTollywoodMovie() {
        return new TollywoodComedyMovie();
    }

    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}

public class AbstractFactoryPatternEx {

    public static void main(String[] args) {
        System.out.println("***Abstract Factory Pattern Demo***");
        ActionMovieFactory actionMovies = new ActionMovieFactory();
        ITollywoodMovie tAction = actionMovies.getTollywoodMovie();
        IBollywoodMovie bAction = actionMovies.getBollywoodMovie();
        System.out.println("\nAction movies are:");
        System.out.println(tAction.movieName());
        System.out.println(bAction.movieName());
        ComedyMovieFactory comedyMovies = new ComedyMovieFactory();
        ITollywoodMovie tComedy = comedyMovies.getTollywoodMovie();
        IBollywoodMovie bComedy = comedyMovies.getBollywoodMovie();
        System.out.println("\nComedy movies are:");
        System.out.println(tComedy.movieName());
        System.out.println(bComedy.movieName());
    }
}
