package lessonSevenFilm;

public class Film {

    private  String title;
    private  String director;
    private  int lengthInMinutes;
    private  int yearOfProduction;

    public Film(String title, String director, int lengthInMinutes, int yearOfProduction) {
        this.title = title;
        this.director = director;
        this.lengthInMinutes = lengthInMinutes;
        this.yearOfProduction = yearOfProduction;
    }
}
