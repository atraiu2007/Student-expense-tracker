import java.io.*;
import java.util.*;

public class FileHandler {

    private static final String FILE_NAME = "data/expenses.txt";

    public static void saveExpenses(ArrayList<Expense> expenses) {

        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {

            for (Expense expense : expenses) {
                writer.println(expense);
            }

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    public static ArrayList<Expense> loadExpenses() {

        ArrayList<Expense> expenses = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                Category category = Category.valueOf(data[1]);
                String description = data[2];
                double amount = Double.parseDouble(data[3]);

                expenses.add(
                        new Expense(id, category, description, amount)
                );
            }

        } catch (IOException e) {
            System.out.println("No previous data found.");
        }

        return expenses;
    }
}
