public class MotorCycle implements Vehicle{

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int faster) {
        speed = speed + faster;

    }

    @Override
    public void applyBrakes(int breaking) {
        speed = speed - breaking;
    }

    public void printSpeedAndGear(){
        System.out.println("Speed = " + speed + " gear = " + gear);
    }
}
