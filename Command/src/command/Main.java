package command;

public class Main {
    public static void main(String[] args) {

        TextFileOperationalExecutor textFileOperationalExecutor = new TextFileOperationalExecutor();
        String s1 = textFileOperationalExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file.txt")));
        String s2 = textFileOperationalExecutor.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt")));
        String s3 = textFileOperationalExecutor.executeOperation(() -> "Opening file file3.txt");
        TextFile textFile4 = new TextFile("TextFile4");
        String s4 = textFileOperationalExecutor.executeOperation(textFile4::open);
        System.out.println(String.format("%s  %s  %s  %s", s1, s2, s3, s4));
    }
}
