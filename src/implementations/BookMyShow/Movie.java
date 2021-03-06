package implementations.BookMyShow;

public class Movie {


//    private List<String> movies;
//    private Map<City.Cities,List<String>> movies;
    private MovieToWatch movieName;
    private Language[] languages;
    private Type[] typesAvailable;

    public Movie(MovieBuilder builder) {
//        movies = new HashMap<City.Cities,List<String>>();
        this.movieName = builder.movieName;
        this.languages = builder.languages;
        this.typesAvailable = builder.typesAvailable;
    }

    public MovieToWatch getMovieName() {
        return movieName;
    }


//    public void loadMovies(City.Cities city) {
//        switch (city) {
//            case MUMBAI: {
//                List<String> moviesList = new ArrayList<String>();
//                moviesList.add("Annihilation");
//                moviesList.add("Oceans8");
//                moviesList.add("Deadpool2");
//                movies.put(City.Cities.MUMBAI,moviesList);
//                break;
//            }
//            case CHENNAI: {
//                List<String> moviesList = new ArrayList<String>();
//                moviesList.add("Jurassic World: Fallen Kingdom");
//                moviesList.add("Rampage");
//                moviesList.add("A Wrinkle in Time");
//                movies.put(City.Cities.CHENNAI,moviesList);
//                break;
//            }
//            default:
//                break;
//        }
//    }

//    public List<String> getMovies(City.Cities city) {
//        return movies.get(city);
//    }

    public static class MovieBuilder {
        private MovieToWatch movieName;
        private Language[] languages;
        private Type[] typesAvailable;

        MovieBuilder(MovieToWatch movieName) {
            this.movieName = movieName;
        }

        public MovieBuilder setLanguages(Language[] languages) {
            this.languages = languages;
            return this;
        }

        public MovieBuilder setTypesAvailable(Type[] typesAvailable) {
            this.typesAvailable = typesAvailable;
            return this;
        }

        public Movie build() {
            return new Movie(this);
        }

    }

    enum Language {
        HINDI,ENGLISH,TAMIL,TELUGU,MARATHI
    }

    enum Type {
        TWOD, THREED, IMAX3D
    }
}
