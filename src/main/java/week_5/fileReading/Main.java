package week_5.fileReading;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/students.txt"; // Path to the input file
        ArrayList<Double> scores = new ArrayList<>();
        double totalScore = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    // Process each line
                    String[] parts = line.split(",");
                    if (parts.length != 2) {
                        throw new InvalidScoreException("Invalid entry format: " + line);
                    }

                    String name = parts[0].trim();
                    String scoreStr = parts[1].trim();

                    // Parse and validate the score
                    double score = parseAndValidateScore(scoreStr);
                    scores.add(score);
                    totalScore += score;

                    System.out.println("Processed: " + name + " with score " + score);

                } catch (InvalidScoreException e) {
                    System.err.println("Error processing line: " + e.getMessage());
                }
            }

            // Calculate and display the average score
            if (!scores.isEmpty()) {
                double averageScore = totalScore / scores.size();
                System.out.println("\nAverage Score: " + averageScore);
            } else {
                System.out.println("\nNo valid scores to calculate the average.");
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } finally {
            System.out.println("File processing completed.");
        }
    }

    // Method to parse and validate score
    private static double parseAndValidateScore(String scoreStr) throws InvalidScoreException {
        try {
            double score = Double.parseDouble(scoreStr);
            if (score < 0 || score > 100) {
                throw new InvalidScoreException("Score out of range (0-100): " + scoreStr);
            }
            return score;
        } catch (NumberFormatException e) {
            throw new InvalidScoreException("Non-numeric score: " + scoreStr);
        }
    }
}

