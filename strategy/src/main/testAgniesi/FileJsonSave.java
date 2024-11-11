package main.testAgniesi;

public class FileJsonSave implements FileSave{
    @Override
    public void saveFile(int a) {
        System.out.println("JsonFileSend: " + a);
    }
}
