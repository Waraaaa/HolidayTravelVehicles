public class NewVehicle {
    private int newVehicleID;
    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private float baseCost;
    private boolean isSold; 

    private Invoice invoice;

    public NewVehicle(int newVehicleID, String serialNumber, String name, String model,
                      int year, String manufacturer, float baseCost) {
        this.newVehicleID = newVehicleID;
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
        this.isSold = false;
        this.invoice = null;
    }

    public int getNewVehicleID() { return newVehicleID; }
    public void setNewVehicleID(int newVehicleID) { this.newVehicleID = newVehicleID; }

    public String getSerialNumber() { return serialNumber; }
    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public float getBaseCost() { return baseCost; }
    public void setBaseCost(float baseCost) { this.baseCost = baseCost; }

    public boolean isSold() { return isSold; }

    public Invoice getInvoice() { return invoice; }
    public void setInvoice(Invoice invoice) { this.invoice = invoice; }

    // Methods
    public void addNewVehicle() {
        System.out.println("New vehicle added: " + this);
    }

    public void updateVehicleInfo(String newModel, int newYear, float newBaseCost) {
        this.model = newModel;
        this.year = newYear;
        this.baseCost = newBaseCost;
        System.out.println("Vehicle \'" + this.name + "\' info updated -> model: " + this.model + ", year: " + this.year + ", baseCost: " + this.baseCost);
    }

    public void markAsSold(Invoice invoice) {
        this.isSold = true;
        this.invoice = invoice;
        System.out.println("Vehicle marked as SOLD: " + this.name + " (" + this.serialNumber + ")");
    }

    @Override
    public String toString() {
        return "NewVehicle { " +
                "newVehicleID: " + newVehicleID +
                ", serialNumber: " + serialNumber + 
                ", name: " + name +
                ", model: " + model +
                ", year: " + year +
                ", manufacturer: " + manufacturer +
                ", baseCost: " + baseCost +
                ", isSold: " + isSold +
                " }";
    }
}

