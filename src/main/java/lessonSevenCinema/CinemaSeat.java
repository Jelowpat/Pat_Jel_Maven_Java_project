package lessonSevenCinema;

import java.util.Objects;

public class CinemaSeat {

    private final int number;

    private final int row;

    private Status status = Status.Free;

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
    public Status getStatus() {
        return status;
    }

    public void changeStatus(){
        if (Objects.equals(this.status, Status.Occupied)){
            this.status = Status.Free;
        }
        else this.status = Status.Occupied;
    }
}
