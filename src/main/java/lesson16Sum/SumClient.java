package lesson16Sum;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SumClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost", 1337);

        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

        Integer a = 1;
        Integer b = 11;

        outputStream.writeObject(a);
        outputStream.writeObject(b);
        System.out.println(inputStream.readObject());
    }

}
