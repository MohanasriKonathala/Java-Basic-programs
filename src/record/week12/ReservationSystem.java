class Reservation {

    private int availableSeats = 10;

    synchronized void reserve(String personName, int requestedSeats) {

        System.out.println(personName + " entered.");
        System.out.println("Available seats: " + availableSeats
                + " Requested seats: " + requestedSeats);

        if (requestedSeats <= availableSeats) {

            System.out.println("Seat Available. Reserve now :-)");
            availableSeats = availableSeats - requestedSeats;

            System.out.println(requestedSeats + " seats reserved.");

        } else {
            System.out.println("Requested seats not available :-)");
        }

        System.out.println(personName + " leaving.");
        System.out.println("----------------------------------------------");
    }
}

class Person extends Thread {

    Reservation reservation;
    String personName;
    int requestedSeats;

    Person(Reservation reservation, String personName, int requestedSeats) {
        this.reservation = reservation;
        this.personName = personName;
        this.requestedSeats = requestedSeats;
    }

    public void run() {
        reservation.reserve(personName, requestedSeats);
    }
}

public class ReservationSystem {

    public static void main(String[] args) {

        Reservation reservation = new Reservation();

        Person p1 = new Person(reservation, "Person-1", 5);
        Person p2 = new Person(reservation, "Person-2", 2);
        Person p3 = new Person(reservation, "Person-3", 4);

        p1.start();

        try {
            p1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        p2.start();

        try {
            p2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        p3.start();
    }
}
