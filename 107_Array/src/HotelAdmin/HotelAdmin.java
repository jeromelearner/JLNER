package HotelAdmin;

import java.util.Scanner;

//查看酒店所有房间状态；预定房间；退房；退出系统

/**
 * {101,102,...
 * 201,202
 */
public class HotelAdmin {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Create Rooms
        Room[][] rooms = createRoom();
        System.out.println("=== Hotel Admin System ===");
        System.out.println("1. Check Room Status");
        System.out.println("2. Check In");
        System.out.println("3. Check Out");
        System.out.println("4. Quit");

        //Select Function
        while(true) {
            System.out.print("Please enter the number of functions:");
            int choice = sc.nextInt();
            if (choice == 1) {
                checkStatus(rooms);
            }
            if (choice == 2) {
                hotelCheckIn(rooms);
            }
            if (choice == 3) {
                hotelCheckOut(rooms);
            }
            if (choice == 4) {
                break;
            }
        }
    }

    private static Room[][] createRoom(){
        System.out.print("How many floors in this hotel:");
        int hotelFloors = sc.nextInt();
        System.out.print("How many rooms in each floor:");
        int roomsinFloor = sc.nextInt();
        Room[][] rooms = new Room[hotelFloors][roomsinFloor];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j] = new Room();
                rooms[i][j].roomNumber = (i+1) < 10 ? (i + 1) * 1000 + j + 1 : (i + 1) * 100 + j + 1;
                rooms[i][j].roomType = Room.matchRoomType(i+1);
                rooms[i][j].roomStatus = "Avl";
            }
        }
        return rooms;
    }

    private static void checkStatus(Room[][] rooms){
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("<Floor " + (i+1) + ">");
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(" ▛" + rooms[i][j].roomNumber + " " + rooms[i][j].roomType + " " + rooms[i][j].roomStatus + "▟ ");
            }
            System.out.println("");
        }
    }

    private static void hotelCheckIn(Room[][] rooms) {
        System.out.print("People Number:");
        int pplNum = sc.nextInt();
        switch (pplNum) {
            case 1:
                for (int i = 0; i < rooms.length; i++) {
                    if (i+1 % 3 == 1) {
                        for (int j = 0; j < rooms[i].length; j++) {
                            if (rooms[i][j].roomStatus.equals("Avl") && rooms[i][j].roomType.equals("Sin")) {
                                rooms[i][j] = checkIn(rooms[i][j]);
                                break;
                            }
                        }
                    }
                }
            case 2:
                System.out.print("Twin(1) or Double(2):");
                int twoBedOpt = sc.nextInt();
                for (int i = 0; i < rooms.length; i++) {
                    if (i+1 % 3 == 2) {
                        for (int j = 0; j < rooms[i].length; j++) {
                            if (rooms[i][j].roomStatus.equals("Avl") && rooms[i][j].roomType.equals("Twi")) {
                                rooms[i][j] = checkIn(rooms[i][j]);
                                break;
                            }
                        }
                    }
                    if (i+1 % 3 == 0) {
                        for (int j = 0; j < rooms[i].length; j++) {
                            if (rooms[i][j].roomStatus.equals("Avl") && rooms[i][j].roomType.equals("Dbl")) {
                                rooms[i][j] = checkIn(rooms[i][j]);
                            }
                        }
                    }
                }
        }
    }
    private static void hotelCheckOut(Room[][] rooms) {
        while(true) {
            System.out.print("Room Number:");
            int roomNum = sc.nextInt();
            try {

                Room targetRoom = rooms[roomNum < 1100 ? roomNum/1000 : roomNum/100][roomNum%1000-1];
                if (targetRoom.roomStatus.equals("Ocp")) {
                    targetRoom = checkOut(targetRoom);
                    break;
                } else {
                    System.out.println("Room is not occupied!");
                    continue;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Room Number is not valid!");
                continue;
            }
        }

    }
    private static Room checkIn(Room room){
        room.roomStatus = "Ocp";
        return room;
    }

    private static Room checkOut(Room room){
        room.roomStatus = "Avl";
        return room;
    }

}

class Room {
    int roomNumber;
    String roomType;
    String roomStatus;
    static String matchRoomType(int roomFloor) {
        String roomType = "N/D";
        switch (roomFloor % 3) {
            case 1:
                roomType = "Sin";
                break;
            case 2:
                roomType = "Twi";
                break;
            case 0:
                roomType = "Dbl";
                break;
        }
        return roomType;
    }
}
