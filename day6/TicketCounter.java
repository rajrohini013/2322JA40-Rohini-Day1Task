package day6;

class TicketCounter {
    int seats = 5;

    synchronized void bookTicket(int seatsRequested) {
        String user = Thread.currentThread().getName();
        System.out.println(user + " trying to book " + seatsRequested + " seat(s)");

        try {
            Thread.sleep(500); 
        } catch (Exception e) {}

        if (seatsRequested <= seats) {
            seats -= seatsRequested;
            System.out.println(user + " successfully booked " + seatsRequested + " seat(s)");
        } else {
            System.out.println("Not enough seats for " + user);
        }

        System.out.println("Remaining seats: " + seats);
        System.out.println();
    }
}

class TicketCounter+ extends Thread {
    TicketCounter counter;
    int seatsRequested;

    User(TicketCounter counter, int seatsRequested, String name) {
        super(name);
        this.counter = counter;
        this.seatsRequested = seatsRequested;
    }

    public void run() {
        counter.bookTicket(seatsRequested);
    }
}

public class Main {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        new User(counter, 2, "User1").start();
        new User(counter, 2, "User2").start();
        new User(counter, 2, "User3").start();
    }
}
