package main;

import main.strategia.FileWritingStrategy;

import java.io.IOException;
import java.util.List;

public class FileWriterContext {
    private FileWritingStrategy strategy;

    public void setStrategy(FileWritingStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(List<UserDto> users) throws IOException {
        strategy.writeToFile(users);
    }
}
