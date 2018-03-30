package ObserverPattern.ambulance;

import java.util.ArrayList;

public class OperatorAdam implements Operator {

    private ArrayList<Ambulance> ambulances = new ArrayList<>();
    private String incident;

    @Override
    public void registerAmbulance(Ambulance ambulance) {
        ambulances.add(ambulance);
    }

    @Override
    public void removeAmbulance(Ambulance ambulance) {
        ambulances.remove(ambulance);
    }

    @Override
    public void notifyObservers() {
        for (Ambulance ambulance : ambulances) {
            ambulance.update(incident);
        }
    }

    @Override
    public void getNotified(String incident) {
        this.incident = incident;
        accidentHappens();
    }

    private void accidentHappens() {
        notifyObservers();
    }

}
