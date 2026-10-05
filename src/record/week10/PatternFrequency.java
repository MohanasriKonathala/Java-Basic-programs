import java.io.*;

public class PatternFrequency {
    public static void main(String[] args) {

        String text = """
                Peter Piper picked a peck of pickled peppers
                A peck of pickled peppers Peter Piper picked
                If Peter Piper picked a peck of pickled peppers
                Where’s the peck of pickled peppers Peter Piper picked?
                """;

        // Write text into sample.txt
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write(text);
            writer.close();

            // Read the file
            BufferedReader reader =
                    new BufferedReader(new FileReader("sample.txt"));

            StringBuilder data = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                data.append(line).append("\n");
            }
            reader.close();

            String content = data.toString().toLowerCase();

            // Count patterns
            int peCount = 0;
            int piCount = 0;

            for (int i = 0; i < content.length() - 1; i++) {
                String pattern = content.substring(i, i + 2);

                if (pattern.equals("pe"))
                    peCount++;

                if (pattern.equals("pi"))
                    piCount++;
            }

            System.out.println("'pe' - no of occurrences - " + peCount);
            System.out.println("'pi' - no of occurrences - " + piCount);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
