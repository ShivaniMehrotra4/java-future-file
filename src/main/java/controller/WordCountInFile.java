package controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class WordCountInFile {

    public static Map<String, Integer> getWordCountOfDataFromFile(String filePath) {
        Map<String, Integer> resultMap = new HashMap<>();
        try (Stream<String> lines = Files.lines(Path.of(filePath))) {
            lines.forEach(line -> Arrays.stream(line.split(" "))
                    .forEach(str ->
                    {
                        int initialCount = 1;
                        if (resultMap.containsKey(str)) {
                            resultMap.replace(str, resultMap.get(str) + initialCount);
                        } else {
                            resultMap.put(str, initialCount);
                        }

                    }));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return resultMap;
    }
}

