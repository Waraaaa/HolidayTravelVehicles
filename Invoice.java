import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private int invoiceID;
    private int customerID;
    private int newVehicleID;
    private int tradeInID; // can be 0 (optional)
    private float finalPrice;
    private float tax;
    private float licenseFee;
    private String customerSignature;

    private NewVehicle purchasedVehicle;
    private TradeInVehicle tradeInVehicle; // can be null
    private Salesperson createdBy;
    private List<DealerInstalledOption> options = new ArrayList<>();

    public Invoice(int invoiceID, Customer customer, NewVehicle purchasedVehicle, Salesperson createdBy) {
        this.invoiceID = invoiceID;
        this.customerID = customer.getCustomerID();
        this.newVehicleID = purchasedVehicle.getNewVehicleID();
        this.purchasedVehicle = purchasedVehicle;
        this.createdBy = createdBy;
        this.finalPrice = 0;
        this.tax = 0;
        this.licenseFee = 0;
    }

    // Methods
    public void createInvoice() {
        System.out.println("Invoice created: ID -> " + invoiceID);
    }

    public void calculateFinalPrice() {
        float basePrice = purchasedVehicle.getBaseCost();
        float optionsPrice = 0;
        for (DealerInstalledOption option : options) {
            optionsPrice += option.getPrice();
        }
        finalPrice = basePrice + optionsPrice + tax + licenseFee;
        System.out.println("Final price calculated: " + finalPrice);
    }

    public void addOptionToInvoice(DealerInstalledOption option) {
        if (option != null) {
            options.add(option);
            System.out.println("Option added: " + option.getDescription());
        }
    }

    public void signInvoice(String signature) {
        this.customerSignature = signature;
        System.out.println("Invoice signed by customer: " + signature);
    }

    public int getInvoiceID() { return invoiceID; }
    public float getFinalPrice() { return finalPrice; }
    public void setTax(float tax) { this.tax = tax; }
    public void setLicenseFee(float licenseFee) { this.licenseFee = licenseFee; }

    public List<DealerInstalledOption> getOptions() {
        return new ArrayList<>(options);
    }

    @Override
    public String toString() {
        return "Invoice { " +
                "invoiceID: " + invoiceID +
                ", customerID: " + customerID +
                ", newVehicleID:" + newVehicleID +
                ", tradeInID: " + tradeInID +
                ", finalPrice: " + finalPrice +
                ", tax: " + tax +
                ", licenseFee: " + licenseFee +
                ", customerSignature: \'" + customerSignature + "\'" +
                ", purchasedVehicle: " + purchasedVehicle +
                ", tradeInVehicle: " + tradeInVehicle +
                ", createdBy: " + createdBy +
                ", options: " + options +
                " }";
    }
}

