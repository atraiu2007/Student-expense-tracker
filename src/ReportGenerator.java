import java.util.ArrayList;

public class ReportGenerator {

    public static void generateReport(ArrayList<Expense> expenses) {

        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        System.out.println("\n===== REPORT =====");
        System.out.println("Total Expenses: ₹" + total);
        System.out.println("Number of Records: " + expenses.size());
    }
}
