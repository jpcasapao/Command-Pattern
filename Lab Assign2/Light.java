class Light extends Device {
    private int brightness = 0;
    @Override
    public void turnOn() { System.out.println("Light turned ON"); }
    @Override
    public void turnOff() { brightness = 0; System.out.println("Light turned OFF"); }
    public void setBrightness(int level) {
        brightness = level;
        System.out.println("Brightness set to " + level + "%");
    }
}