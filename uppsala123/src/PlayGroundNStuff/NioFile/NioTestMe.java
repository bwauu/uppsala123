package PlayGroundNStuff.NioFile;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NioTestMe {
    public static void main(String[] args) {
        Path currentDir = Paths.get(".");
        Path fullPath = currentDir.toAbsolutePath();
        Path one = currentDir.resolve("file.txt");
        Path fileName = one.getFileName();
        System.out.println(fileName);

    }
}
