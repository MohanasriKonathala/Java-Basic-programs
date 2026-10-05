// Customer class
class Customer
{
    // Data members
    String name;
    String location;

    // Constructor of Customer
    Customer(String name, String location)
    {
        this.name = name;
        this.location = location;
    }

    // Method to send an order
    void sendOrder()
    {
        System.out.println(name + " sends the order.");
    }

    // Method to receive an order
    void receiveOrder()
    {
        System.out.println(name + " receives the order.");
    }
}


// Order class inherits Customer
class Order extends Customer
{
    // Data members of Order
    String date;
    int number;

    // Constructor of Order
    Order(String name, String location, String date, int number)
    {
        super(name, location);
        this.date = date;
        this.number = number;
    }

    // Method to confirm order
    void confirm()
    {
        System.out.println("Order " + number + " is confirmed.");
    }

    // Method to close order
    void close()
    {
        System.out.println("Order " + number + " is closed.");
    }
}


// SpecialOrder inherits Order
class SpecialOrder extends Order
{
    // Constructor of SpecialOrder
    SpecialOrder(String name, String location, String date, int number)
    {
        super(name, location, date, number);
    }

    // Method to dispatch special order
    void dispatch()
    {
        System.out.println("Special order " + number + " is dispatched.");
    }
}


// NormalOrder inherits Order
class NormalOrder extends Order
{
    // Constructor of NormalOrder
    NormalOrder(String name, String location, String date, int number)
    {
        super(name, location, date, number);
    }

    // Method to dispatch normal order
    void dispatch()
    {
        System.out.println("Normal order " + number + " is dispatched.");
    }

    // Method to receive normal order
    void receive()
    {
        System.out.println("Normal order " + number + " is received.");
    }
}


// Main class
class CustomerOrder
{
    public static void main(String args[])
    {
        // Creating SpecialOrder object
        SpecialOrder s = new SpecialOrder(
                "Mohana", "Hyderabad", "26-08-2026", 101);

        System.out.println("----- SPECIAL ORDER -----");

        // Calling methods inherited from Customer
        s.sendOrder();

        // Calling methods inherited from Order
        s.confirm();
        s.close();

        // Calling method of SpecialOrder
        s.dispatch();


        System.out.println();


        // Creating NormalOrder object
        NormalOrder n = new NormalOrder(
                "Rahul", "Warangal", "26-08-2026", 102);

        System.out.println("----- NORMAL ORDER -----");

        // Calling methods inherited from Customer
        n.sendOrder();

        // Calling methods inherited from Order
        n.confirm();
        n.close();

        // Calling methods of NormalOrder
        n.dispatch();
        n.receive();
    }
}
