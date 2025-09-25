class Thermostat extends Device {
    private int temperature = 22;
    @Override
    public void turnOn() { System.out.println("Thermostat ON"); }
    @Override
    public void turnOff() { System.out.println("Thermostat OFF"); }
    public void increaseTemperature() {
        temperature++;
        System.out.println("Temperature increased to " + temperature + "°C");
    }
    public void decreaseTemperature() {
        temperature--;
        System.out.println("Temperature decreased to " + temperature + "°C");
    }
}