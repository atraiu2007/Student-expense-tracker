public class Expense implements Printable {

    private int id;
    private Category category;
    private String description;
    private double amount;

    public Expense(int id, Category category, String description, double amount) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public void printDetails() {
        System.out.println(id + " | " + category + " | " + description + " | ₹" + amount);
    }

    @Override
    public String toString() {
        return id + "," + category + "," + description + "," + amount;
    }
}
