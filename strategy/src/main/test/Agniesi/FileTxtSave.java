package main.test.Agniesi;

public class FileTxtSave implements FileSave{
    @Override
    public void saveFile(int a) {
        System.out.println("txt save: " + a);
    }
}
