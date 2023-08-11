package lesson14PhoneBook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class PhoneBook {

    private Map<String, PhoneBookPosition> phoneBook = new HashMap<>();

    public void addPosition(PhoneBookPosition position){
        phoneBook.put(position.getName()+" "+position.getSurname(), position);
    }

    public void addPositionsFromFile(Path path) throws IOException {
        List<String> positionList = Files.readAllLines(path);
        for (String position : positionList){
            List<String> personData = Arrays.asList(position.split(","));
            if(personData.size() == 3){
                addPosition(new PhoneBookPosition(personData.get(0), personData.get(1),
                        personData.get(2)));
            } else{
                addPosition(new PhoneBookPosition(personData.get(0), personData.get(1),
                        personData.get(2),Integer.valueOf(personData.get(3))));
            }
        }
    }

    public PhoneBookPosition getPosition(String key){
        return phoneBook.get(key);
    }

    public Map<String, PhoneBookPosition> getPhoneBook() {
        return phoneBook;
    }
}
