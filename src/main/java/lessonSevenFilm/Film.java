package lessonSevenFilm;

public class Film {

    private final String title;
    private final String director;
    private final int lengthInMinutes;
    private final int yearOfProduction;

    public Film(String title, String director, int lengthInMinutes, int yearOfProduction) {
        this.title = title;
        this.director = director;
        this.lengthInMinutes = lengthInMinutes;
        this.yearOfProduction = yearOfProduction;
    }

}
