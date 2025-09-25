class MusicPlayer extends Device {
    private int volume = 50;
    @Override
    public void turnOn() { System.out.println("MusicPlayer ON"); }
    @Override
    public void turnOff() { System.out.println("MusicPlayer OFF"); }
    public void setVolume(int level) {
        volume = level;
        System.out.println("Volume set to " + volume + "%");
    }
    public void play(String playlist) {
        System.out.println("Playing playlist: " + playlist);
    }
}