import java.time.LocalDate;

public class Transaction {
    private int transactionID;
    private LocalDate transactionDate;

    private Invoice invoice; 

    public Transaction(int transactionID, Invoice invoice) {
        this.transactionID = transactionID;
        this.invoice = invoice;
        this.transactionDate = LocalDate.now(); // default is today
    }

    public int getTransactionID() { return transactionID; }
    public LocalDate getTransactionDate() { return transactionDate; }
    public Invoice getInvoice() { return invoice; }
    public void setInvoice(Invoice invoice) { this.invoice = invoice; }

    // Methods
    public void recordTransaction() {
        System.out.println("Transaction recorded:");
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Date: " + transactionDate);
        System.out.println("Invoice ID: " + (invoice != null ? invoice.getInvoiceID() : "null"));
    }

    public void viewTransactionDetails() {
        if (invoice != null) {
            System.out.println("Transaction Details: ");
            System.out.println("Transaction ID: " + transactionID);
            System.out.println("Date: " + transactionDate);
            System.out.println("Invoice Info: " + invoice);
        } else {
            System.out.println("No invoice linked.");
        }
    }

    @Override
    public String toString() {
        return "Transaction { " +
                "transactionID: " + transactionID +
                ", transactionDate: " + transactionDate +
                ", invoiceID: " + (invoice != null ? invoice.getInvoiceID() : "null") +
                " }";
    }
}
