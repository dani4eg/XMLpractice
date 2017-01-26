import javax.xml.bind.JAXBException;
import java.io.*;

/**
 * Created by dani4 on 26.01.2017.
 */

/*
       Создать небольшой xml-документ, например
 a.       Кореневой элемент class
 b.      2 дочерных узла student с атрибутом id и дочерными узлами name, mark
 2)      Написать программу, которая сделает вывод файла на экран
 3)      Самостоятельно: модифицировать файл (поменять информацию у одного из студентов). -->

 */
public class Main {

    public static void main(String[] args) throws IOException, JAXBException {
        BufferedReader reader = new BufferedReader(new FileReader("src/xmlka"));
        String line;
        while ((line = reader.readLine()) !=null) {
            System.out.println(line);
        }
        reader.close();

    }
}
