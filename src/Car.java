public class Car {
    String carName;
    int wheel = 4;
    int seats;
    public Car(){

    }

    public Car(String carName, int seats){
        this.carName = carName;
        this.seats = seats;
    }

    public void accelerate(){
        System.out.println("car is accelerating");
    }
    public void playRadio(){
        System.out.println("playing radio");
    }
    public void applyBreaks(){
        System.out.println("Applying breaks");
    }
    public void changeGear(int gearNumber){
        System.out.println("Changing gear of car to "+ gearNumber);
    }
}
