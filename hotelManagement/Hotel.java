package hotelManagement;

public class Hotel {
    private int availableRoom;
    private String customerName;
    private int acRoomQuantity = 5;
    private int nonAcRoomQuantity = 5;

    public int getAcRoomQuantity() {
        return acRoomQuantity;
    }

    public void setAcRoomQuantity(int acRoomQuantity) {
        this.acRoomQuantity = acRoomQuantity;
    }

    public int getNonAcRoomQuantity() {
        return nonAcRoomQuantity;
    }

    public void setNonAcRoomQuantity(int nonAcRoomQuantity) {
        this.nonAcRoomQuantity = nonAcRoomQuantity;
    }

    private int customerAge;
    private int roomQuantity;
    private int acRoom = 800;

    public Hotel(int availableRoom, String customerName, int customerAge, int roomQuantity, int acRoom, int nonAcRoom,
            int bookedRoom) {
        this.availableRoom = availableRoom;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.roomQuantity = roomQuantity;
        this.acRoom = acRoom;
        this.nonAcRoom = nonAcRoom;
        this.bookedRoom = bookedRoom;
    }

    public Hotel() {
    }

    private int nonAcRoom = 400;

    public int getAvailableRoom() {
        return availableRoom;
    }

    public void setAvailableRoom(int availableRoom) {
        this.availableRoom = availableRoom;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public int getRoomQuantity() {
        return roomQuantity;
    }

    public void setRoomQuantity(int roomQuantity) {
        this.roomQuantity = roomQuantity;
    }

    public int getAcRoom() {
        return acRoom;
    }

    public void setAcRoom(int acRoom) {
        this.acRoom = acRoom;
    }

    public int getNonAcRoom() {
        return nonAcRoom;
    }

    public void setNonAcRoom(int nonAcRoom) {
        this.nonAcRoom = nonAcRoom;
    }

    public int getBookedRoom() {
        return bookedRoom;
    }

    public void setBookedRoom(int bookedRoom) {
        this.bookedRoom = bookedRoom;
    }

    private int bookedRoom;
}
