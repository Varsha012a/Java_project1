public class Room{
private int RoomNo;
private int RoomArea;
private String ACmachine;

public Room(){
RoomNo=105;
RoomArea=40;
ACmachine="Ogeneral";
}

public void setRoomNo(int No){
RoomNo=No;
}

public void setRoomArea(int a){
RoomArea=a;
}

public void setACmachine(String Am){
ACmachine=Am;
}

public static void main(String[]args){
Room myObj = new Room();

System.out.println(myObj.RoomNo);
System.out.println(myObj.RoomArea);
System.out.println(myObj.ACmachine);
}
}