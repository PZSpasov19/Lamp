public class Main {
    public static void main(String[] args)
    {
        Lamp lamp = new Lamp();
        lamp.voltage = 100;
        lamp.setVoltage(100);
        System.out.println(lamp.getVoltage());
    }
}
