package dev.lpa;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Theatre {

    class Seat implements Comparable<Seat> {

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
            return this.seatNumber;
        }

        @Override
        public int compareTo(Seat o) {
            return seatNumber.compareTo(o.seatNumber);
        }
    }

    private String theatreName;
    private int seatsInRow;
    private NavigableSet<Seat> seats;

    public Theatre(String theatreName, int numberOfRows, int totalNumberOfSeats) {
        this.theatreName = theatreName;
        this.seatsInRow = totalNumberOfSeats / numberOfRows;
    }

    public static void printSeatMap(TreeSet<Seat> seats) {
        for (var seat : seats) {
            System.out.println(seat);
        }
    }


}

