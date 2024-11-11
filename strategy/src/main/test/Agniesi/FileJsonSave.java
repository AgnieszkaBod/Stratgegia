package main.test.Agniesi;

public class FileJsonSave implements FileSave{
    @Override
    public void saveFile(int a) {
        System.out.println("JsonFileSend: " + a);
    }
}
