package club.ouka.pattern.singleton.lazy;

import java.io.*;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-05
 * Time: 21:20
 */
public class SerializableSingleton {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LazySingleton s1 = LazySingleton.getInstance();
        FileOutputStream fileOutputStream = new FileOutputStream("SerializableSingleton.obj");
        ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
        os.writeObject(s1);
        os.flush();
        os.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("SerializableSingleton.obj");
        ObjectInputStream is = new ObjectInputStream(fileInputStream);
        LazySingleton s2 = (LazySingleton) is.readObject();
        is.close();
        fileInputStream.close();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
