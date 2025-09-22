import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private String address;
    private String phoneNumber;
    private List<Invoice> purchaseHistory = new ArrayList<>();

    public Customer(int customerID, String name, String address, String phoneNumber) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerID() { return customerID; }
    public void setCustomerID(int customerID) { this.customerID = customerID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public List<Invoice> getPurchaseHistory() { return new ArrayList<>(purchaseHistory); }

    // Methods
    public void registerCustomer() {
        System.out.println("Customer registered: " + this.name + " (ID: " + this.customerID + ")");
    }

    public void updateCustomerInfo(String newAddress, String newPhoneNumber) {
        this.address = newAddress;
        this.phoneNumber = newPhoneNumber;
        System.out.println("Customer " + this.name + " info updated: [" + this.address + "]\nNew Tel: " + this.phoneNumber);
    }

    public void viewPurchaseHistory() {
        System.out.println(this.name + "'s Purchase History:");
        if (purchaseHistory.isEmpty()) {
            System.out.println("No purchases yet.");
        } else {
            for (Invoice purchase : purchaseHistory) {
                System.out.println(purchase);
            }
        }
    }

    public void addPurchase(Invoice invoice) {
      if (invoice != null) {
        purchaseHistory.add(invoice);
      }
    }

    @Override
    public String toString() {
        return "Customer { " +
                "customerID: " + customerID +
                ", name: " + name +
                ", address: \'" + address + "\'" +
                ", phoneNumber: " + phoneNumber + " }";
    }
}


