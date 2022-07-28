package dpofsingleton;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author lbs
 * @description 使用序列化破坏单例模式
 *
 */
public class SerializationDamage {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get("SingletonFile")));
        outputStream.writeObject(instance);
        ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(new File("SingletonFile").toPath()));
        HungrySingleton newInstance = (HungrySingleton) inputStream.readObject();
        System.out.println(instance == newInstance);
    }
}
