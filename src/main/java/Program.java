import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException {
        final String path = "C:\\Users\\lars-\\source\\hiof\\06B Testing og avhengigheter 02\\data\\stocks.csv";

        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(";");
            System.out.print(values[0] + ": " + values[1] + " (" + values[2] + ")   ");
        }
    }
}
