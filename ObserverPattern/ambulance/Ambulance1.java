package ObserverPattern.ambulance;

import java.util.Random;

public class Ambulance1 implements Ambulance {

    private String ambulanceID;

    private String incident;

    Ambulance1(Operator operator, String ambulanceID) {
        this.ambulanceID = ambulanceID;
        operator.registerAmbulance(this);
    }

    @Override
    public void update(String incident) {
        this.incident = incident;
        sendInfoBack();
    }

    private void sendInfoBack() {
        Random rand = new Random();
        if (rand.nextInt(100)>50) {
            System.out.println(ambulanceID + " goes to " + incident);
        } else {
            System.out.println(ambulanceID + " nie doesn't go to " + incident);
        }
    }
}
