import java.util.ArrayList;

public class ExpenseManager {

    private ArrayList<Expense> expenses;

    public ExpenseManager() {
        expenses = FileHandler.loadExpenses();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
        FileHandler.saveExpenses(expenses);
    }

    public void viewExpenses() {

        if (expenses.isEmpty()) {
            System.out.println("No expenses available.");
            return;
        }

        for (Expense expense : expenses) {
            expense.printDetails();
        }
    }

    public ArrayList<Expense> getExpenses() {
        return expenses;
    }
}
