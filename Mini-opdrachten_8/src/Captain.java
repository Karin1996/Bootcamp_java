public class Captain {

    void sail(Boat boat){
        boat.startMotor();

        if(boat instanceof SpeedBoat){
            System.out.println("Ik zet even mijn pet af");
        }
    }
}
