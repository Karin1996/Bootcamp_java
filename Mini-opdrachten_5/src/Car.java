import java.util.*;

public class Car {
     String[] carParts = {"motor", "carDoor", "frontWindow", "exhaust"};
     Boolean[] brokenParts = new Boolean[4];

    Car() {
        Random random = new Random();
        for(int i = 0; i < carParts.length; i++) {
            brokenParts[i] = random.nextBoolean();
        }
    }
}
