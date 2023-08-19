package lesson15CinemaRoom;

import java.util.List;
import static lesson15CinemaRoom.RoomType.*;

public class Main {

    public static void main(String[] args) {
        List<CinemaRoom> cinema = List.of(
                new CinemaRoom("a", twoDimensions),
                new CinemaRoom("b", threeDimensions),
                new CinemaRoom("c", fourDimensions),
                new CinemaRoom("d", twoDimensions),
                new CinemaRoom("e", threeDimensions),
                new CinemaRoom("f", twoDimensions),
                new CinemaRoom("g", twoDimensions),
                new CinemaRoom("h", threeDimensions),
                new CinemaRoom("i", twoDimensions),
                new CinemaRoom("j", fourDimensions)
        );

        System.out.println("This Cinema has: "+cinema.stream().filter(x -> x.getType() == twoDimensions)
                .count()+" 2D rooms.");
        System.out.println("This Cinema has :"+cinema.stream().filter(x -> x.getType() == threeDimensions)
                .count()+" 3D rooms.");
        System.out.println("This Cinema has :"+cinema.stream().filter(x -> x.getType() == fourDimensions)
                .count()+" 4D rooms.");

    }

}
