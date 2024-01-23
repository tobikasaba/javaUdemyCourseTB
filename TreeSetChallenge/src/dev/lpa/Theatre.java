package dev.lpa;

import java.util.TreeSet;

public class Theatre {


    private String theatreName;
    private int seatsInRow;
    private TreeSet<Seat> seat;

    public Theatre(String theatreName, int numberOfRows, int totalNumberOfSeats) {
        this.theatreName = theatreName;
        this.seatsInRow = totalNumberOfSeats / numberOfRows;
    }

    public static void printSeatMap(TreeSet<Seat> seats) {
        for (var seat : seats) {
            System.out.println(seat);
        }
    }

    public class Seat {

        private String row;
        private String seatNumber;
        private boolean reserved;

        public Seat(String row, int number) {
            this.row = row;
            int length = String.valueOf(number).length();
            if (length == 1) {
                this.seatNumber = "00" + number;
            } else if (length == 2) {
                this.seatNumber = "0" + number;
            } else {
                this.seatNumber = String.valueOf(number);
            }
        }

        @Override
        public String toString() {
            return "Your Seat Number is: " + this.row.toUpperCase() + this.seatNumber + " this seat is " + reserved;
        }
    }
}

