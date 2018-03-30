package ObserverPattern.ambulance;

public class Demo {
    public static void main(String[] args) {

        Operator operatorAdam = new OperatorAdam();

        Ambulance ambulance1 = new Ambulance1(operatorAdam, "Amb001");
        Ambulance ambulance2 = new Ambulance1(operatorAdam, "Amb002");
        Ambulance ambulance3 = new Ambulance1(operatorAdam, "Amb003");
        Ambulance ambulance4 = new Ambulance1(operatorAdam, "Amb004");
        Ambulance ambulance5 = new Ambulance1(operatorAdam, "Amb005");

        operatorAdam.getNotified("Broken leg");

        operatorAdam.removeAmbulance(ambulance2);

        operatorAdam.getNotified("Broken wings");
    }
}
