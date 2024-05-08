package hotelManagement;

import java.util.Scanner;

public class HotelManagement {
    static Scanner scanner = new Scanner(System.in);
    static Hotel hotel = new Hotel();

    public static void main(String[] args) {
        hotel.setAvailableRoom(hotel.getNonAcRoomQuantity() + hotel.getAcRoomQuantity());
        System.out.println("Welcome To Kotak Hotel");
        int inputFromUserToCheckAvailableRoom = scanner.nextInt();
        if (inputFromUserToCheckAvailableRoom <= hotel.getAvailableRoom() || hotel.getAvailableRoom() != 0) {
            System.out.println("Toal Available Room: " + hotel.getAvailableRoom());
            System.out.println(
                    "Non Ac Room: " + hotel.getNonAcRoomQuantity() + "\n" + "AC Room: " + hotel.getAcRoomQuantity());
            categorization();
        } else {
            System.out.println("Sorry! room not availble");
        }
    }

    private static void categorization() {
        System.out.println("\nSelect Your Room Category\n1.Ac Room \n2.Non-Ac Room");
        int inputFromUser = scanner.nextInt();
        switch (inputFromUser) {
            case 1:
                acRoomRservation();
                break;
            case 2:
                nonAcRoomReservation();
                break;

            default:
                System.out.println("Sorry! Please select an option");
                break;
        }
    }

    private static void nonAcRoomReservation() {
        if (hotel.getAcRoomQuantity() != 0) {
            System.out.println("Non-Ac Room Price: " + hotel.getNonAcRoom());
            System.out.println("Book Room \n1.Yes \n2.No");
            int inputFromUser = scanner.nextInt();
            switch (inputFromUser) {
                case 1:
                    System.out.println("Please Enter Your Name");
                    hotel.setCustomerName(scanner.next());
                    System.out.println("Enter Your Age");
                    hotel.setCustomerAge(scanner.nextInt());
                    System.out.println("Pay Room Rent: " + hotel.getNonAcRoom());
                    hotel.setBookedRoom(hotel.getNonAcRoom());
                    System.out.println("Your Room Booked Successfully");
                    hotel.setNonAcRoomQuantity(hotel.getNonAcRoomQuantity() - 1);
                    main(null);
                    break;
                case 2:
                    main(null);
                    break;

                default:
                    System.out.println("Please Enter an option");
                    break;
            }

        }
    }

    private static void acRoomRservation() {
        if (hotel.getAcRoomQuantity() != 0) {
            System.out.println("Ac Room Price: " + hotel.getAcRoom());
            System.out.println("Book Room \n1.Yes \n2.No");
            int inputFromUser = scanner.nextInt();
            switch (inputFromUser) {
                case 1:
                    System.out.println("Please Enter Your Name");
                    hotel.setCustomerName(scanner.next());
                    System.out.println("Enter Your Age");
                    hotel.setCustomerAge(scanner.nextInt());
                    System.out.println("Pay Room Rent: " + hotel.getAcRoom());
                    hotel.setBookedRoom(hotel.getAcRoom());
                    System.out.println("Your Room Booked Successfully");
                    hotel.setAcRoomQuantity(hotel.getNonAcRoomQuantity() - 1);
                    main(null);
                    break;
                case 2:
                    main(null);
                    break;

                default:
                    System.out.println("Please Enter an option");
                    break;
            }

        }
    }
}
