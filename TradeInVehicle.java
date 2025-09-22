public class TradeInVehicle {
    private int tradeInID;
    private String serialNumber;
    private String make;
    private String model;
    private int year;

    private Invoice invoice; 

    public TradeInVehicle(int tradeInID, String serialNumber, String make, String model, int year) {
        this.tradeInID = tradeInID;
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.invoice = null;
    }

    public int getTradeInID() { return tradeInID; }
    public String getSerialNumber() { return serialNumber; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public void setInvoice(Invoice invoice) { this.invoice = invoice; }
    public Invoice getInvoice() { return invoice; }
    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }

    // Methods
    public void registerTradeIn() {
        System.out.println("Trade-in vehicle registered: " + this);
    }

    public void updateTradeInInfo(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println("Trade-in vehicle updated: " + this);
    }

    @Override
    public String toString() {
        return "TradeInVehicle { " +
                "tradeInID: " + tradeInID +
                ", serialNumber: " + serialNumber +
                ", make: " + make + 
                ", model: " + model + 
                ", year: " + year +
                ", invoiceID: " + (invoice != null ? invoice.getInvoiceID() : "null") +
                " }";
    }
}
