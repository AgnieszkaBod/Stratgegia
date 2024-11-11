package main;

import main.strategia.CsvFileWritingStrategy;
import main.strategia.JsonFileWritingStrategy;
import main.strategia.XmlFileWritingStrategy;
import main.test.Agniesi.FileJsonSave;
import main.test.Agniesi.FileSave;
import main.test.Agniesi.FileTxtSave;

import java.io.IOException;
import java.util.List;

public class Klinet {

    public static void main(String[] args) {
        List<UserDto> users = List.of(
                new UserDto("John", "Doe", 30),
                new UserDto("Jane", "Smith", 25),
                new UserDto("Alice", "Johnson", 35)
        );

        FileWriterContext context = new FileWriterContext();

        // Ustawienie strategii zapisu do pliku CSV
        context.setStrategy(new CsvFileWritingStrategy()); // typ może przyjść zewnątrz
        try {
            context.executeStrategy(users);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ustawienie strategii zapisu do pliku JSON
        context.setStrategy(new JsonFileWritingStrategy());
        try {
            context.executeStrategy(users);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ustawienie strategii zapisu do pliku XML
        context.setStrategy(new XmlFileWritingStrategy());
        try {
            context.executeStrategy(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        A czego nie tak? Po co ten Context? Chyba po to, że jakby to przychodziło z np. RESTa,
//        to wpierdzielasz do kontekstu parametr i odpala się metoda, a tu to ifach trzeba przypisywać
//        w zależności co przyjdzie tworzyc obiekt
        int a = 1;
        FileSave fileSave = new FileJsonSave();
        fileSave.saveFile(a);
        fileSave = new FileTxtSave();
        a = 2;
        fileSave.saveFile(a);
    }

}
