package ObserverPattern.ambulance;

public interface Operator {
    void registerAmbulance(Ambulance ambulance);
    void removeAmbulance(Ambulance ambulance);
    void notifyObservers();
    void getNotified(String incident);
}
