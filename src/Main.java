import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ExpenseManager manager = new ExpenseManager();

        while (true) {

            Menu.showMenu();

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.println("Select Category:");
                    System.out.println("FOOD");
                    System.out.println("TRAVEL");
                    System.out.println("EDUCATION");
                    System.out.println("ENTERTAINMENT");
                    System.out.println("OTHER");

                    Category category =
                            Category.valueOf(sc.next().toUpperCase());

                    sc.nextLine();

                    System.out.print("Description: ");
                    String description = sc.nextLine();

                    System.out.print("Amount: ");
                    double amount = sc.nextDouble();

                    if (InputValidator.isValidAmount(amount)) {

                        manager.addExpense(
                                new Expense(
                                        id,
                                        category,
                                        description,
                                        amount
                                )
                        );

                        System.out.println("Expense added.");
                    }

                    break;

                case 2:
                    manager.viewExpenses();
                    break;

                case 3:
                    ReportGenerator.generateReport(
                            manager.getExpenses()
                    );
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
