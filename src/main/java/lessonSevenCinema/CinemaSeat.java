package lessonSevenCinema;

public class CinemaSeat {

    private final int number;

    private final int row;

    private boolean isAvailable = true;

    public CinemaSeat(int number, int row){
        this.number = number;
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public int getNumber() {
        return number;
    }

    public void changeStatus(){
        this.isAvailable = !this.isAvailable;
    }

}
