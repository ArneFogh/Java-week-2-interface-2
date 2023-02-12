public class main {
    public static void main(String[] args) {
        MotorCycle MotorCycle1 = new MotorCycle();
        MotorCycle MotorCycle2 = new MotorCycle();


        MotorCycle1.changeGear(5);
        MotorCycle1.speedUp(144);
        MotorCycle1.applyBrakes(32);

        MotorCycle1.printSpeedAndGear();

        MotorCycle2.changeGear(3);
        MotorCycle2.applyBrakes(14);
        MotorCycle2.speedUp(117);

        MotorCycle2.printSpeedAndGear();
    }
}
