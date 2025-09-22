public class Main {
    public static void main(String[] args) {
        NewVehicle nVehicle = new NewVehicle(1, "TH9999", "Civic", "Sedan", 2024, "Honda", 990000);
        nVehicle.addNewVehicle();
        nVehicle.updateVehicleInfo("Hatchback", 2025, 975000);

        Customer customer = new Customer(101, "Pattareeya", "123 Salaya", "089-123-4567");
        customer.registerCustomer();

        Salesperson salesperson = new Salesperson(201, "Bob", "089-987-9999");

        Invoice invoice = new Invoice(1, customer, nVehicle, salesperson);
        invoice.createInvoice();
        invoice.setTax(0.07f * nVehicle.getBaseCost());
        invoice.setLicenseFee(15000);
        invoice.calculateFinalPrice();
        invoice.signInvoice(customer.getName());
        
        nVehicle.markAsSold(invoice);
    }
}
