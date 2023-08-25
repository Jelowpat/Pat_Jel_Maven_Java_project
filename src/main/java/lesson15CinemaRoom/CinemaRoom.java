package lesson15CinemaRoom;

public class CinemaRoom {

    private final String name;
    private final RoomType type;

    public CinemaRoom(String name, RoomType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public RoomType getType() {
        return type;
    }
}
