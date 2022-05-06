package day05_Concatenation;

public class FlightTicket {

    public static void main(String[] args){

      String from = "Stockholm",
              to = "Barcelona";
      double ticketPrice = 125.5;

      String flightTicket = "From " + from + " to " + to + " is €" + ticketPrice;
        System.out.println(flightTicket);




    }
}

/*
2.create a class named FlightTicket, and declare the following variables:
                1. from
                2. to
                3. ticketPrice

    use concatenation to display the full info of the ticket

    ex:
            From Las Vegas to McLean is $425.5
 */