import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException {
        final String path = "C:\\Users\\bi-lea\\IdeaProjects\\07b-deps-and-testing\\data\\stocks.csv";

        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(";");
            System.out.print(values[0] + ": " + values[1] + " (" + values[2] + ")   ");
        }
    }
}
