package lessonSevenCinema;

import java.util.Objects;

public class CinemaSeat {

    private final int NUMBER;

    private final int ROW;

    private String status = "free";

    public CinemaSeat(int number, int row){
        this.NUMBER = number;
        this.ROW = row;
    }

    public int getRow() {
        return ROW;
    }
    public int getNumber() {
        return NUMBER;
    }
    public String getStatus() {
        return status;
    }

    public void changeStatus(){
        if (Objects.equals(this.status, "free")){
            this.status = "occupied";
        }
        else this.status = "occupied";
    }
}
