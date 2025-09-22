public class DealerInstalledOption {
    private String optionCode;
    private String description;
    private float price;

    private Invoice invoice;

    public DealerInstalledOption(String optionCode, String description, float price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
        this.invoice = null;
    }

    public String getOptionCode() { return optionCode; }
    public void setOptionCode(String optionCode) { this.optionCode = optionCode; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public float getPrice() { return price; }
    public void setPrice(float price) { this.price = price; }

    public Invoice getInvoice() { return invoice; }
    public void setInvoice(Invoice invoice) { this.invoice = invoice; }

    // Methods
    public void addOption() {
        System.out.println("Option added: " + this.description + " (" + this.optionCode + "), Price: " + this.price);
    }

    public void updateOption(String newDescription, float newPrice) {
        this.description = newDescription;
        this.price = newPrice;
        System.out.println("Option updated: " + this.description + " (" + this.optionCode + "), Price: " + this.price);
    }

    @Override
    public String toString() {
        return "DealerInstalledOption{" +
                "optionCode: " + optionCode +
                ", description: " + description +
                ", price: " + price +
                '}';
    }
}

