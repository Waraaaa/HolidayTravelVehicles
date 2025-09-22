import java.util.ArrayList;
import java.util.List;

public class Salesperson {
    private int salespersonID;
    private String name;
    private String phoneNumber;

    private List<Invoice> salesHistory = new ArrayList<>();

    public Salesperson(int salespersonID, String name, String phoneNumber) {
        this.salespersonID = salespersonID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getters & Setters
    public int getSalespersonID() { return salespersonID; }
    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }

    // UML Methods
    public void createInvoice(Invoice invoice) {
        if (invoice != null) {
            salesHistory.add(invoice);
            System.out.println("Invoice " + invoice.getInvoiceID() + " created by " + name);
        }
    }

    public void viewSalesHistory() {
        System.out.println("Sales history for " + name + ":");
        if (salesHistory.isEmpty()) {
            System.out.println("No invoices created yet.");
        } else {
            for (Invoice invoice : salesHistory) {
                System.out.println(invoice);
            }
        }
    }

    @Override
    public String toString() {
        return "Salesperson{" +
                "salespersonID=" + salespersonID +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

