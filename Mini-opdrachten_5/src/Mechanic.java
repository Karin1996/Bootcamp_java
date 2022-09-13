public class Mechanic {
    static int reparationCost = 25;

    //Mechanic only repairs cars
    String repairCar(Car car){
        String repairedParts = "I have repaired the following parts: ";
        int totalCost = 0;

        for(int i = 0; i < car.carParts.length; i++){
            if(car.brokenParts[i]){
                repairedParts += car.carParts[i] +", ";
                totalCost += reparationCost;
            }
        }

       return repairedParts + "for a total price of: " + totalCost;
    }
}
