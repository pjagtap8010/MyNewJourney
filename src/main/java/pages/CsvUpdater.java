package pages;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

    public class CsvUpdater {

        public static void main(String[] args) {
            String inputFile = "C:\\Users\\pratik\\IdeaProjects\\MyNewJourney\\TestData\\InputFile.xlsx";
            String outputFile = "C:\\Users\\pratik\\IdeaProjects\\MyNewJourney\\TestData\\OutputFile.xlsx";

            // Create replacement map
            Map<Character, Character> replacements = new HashMap<>();
            replacements.put('{', '0');
            replacements.put('A', '1');
            replacements.put('B', '2');
            replacements.put('C', '3');
            replacements.put('D', '4');
            replacements.put('E', '5');
            replacements.put('F', '6');
            replacements.put('G', '7');
            replacements.put('H', '8');
            replacements.put('I', '9');

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

                String line;

                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",", -1); // -1 to keep trailing empty fields

                    if (parts.length >= 3 && !parts[2].isEmpty()) {
                        char lastChar = parts[2].charAt(parts[2].length() - 1);

                        if (replacements.containsKey(lastChar)) {
                            parts[2] = parts[2].substring(0, parts[2].length() - 1) + replacements.get(lastChar);
                        }
                    }

                    writer.write(String.join(",", parts));
                    writer.newLine();
                }

                System.out.println("File processed successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

