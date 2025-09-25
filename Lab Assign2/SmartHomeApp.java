public class SmartHomeApp {
    public static void main(String[] args) {
        Hub hub = new Hub(10);

        Light light = new Light();
        MusicPlayer music = new MusicPlayer();
        Thermostat thermostat = new Thermostat();

        // Assigning commands to buttons
        hub.setCommand(0, new TurnOnCommand(light));
        hub.setCommand(1, new TurnOffCommand(light));
        hub.setCommand(2, new SetBrightnessCommand(light, 80));

        hub.setCommand(3, new TurnOnCommand(music));
        hub.setCommand(4, new PlayPlaylistCommand(music, "Jazz"));
        hub.setCommand(5, new SetVolumeCommand(music, 30));

        hub.setCommand(6, new TurnOnCommand(thermostat));
        hub.setCommand(7, new IncreaseTempCommand(thermostat));
        hub.setCommand(8, new DecreaseTempCommand(thermostat));

        // Simulate pressing buttons
        hub.pressButton(0); // Light ON
        hub.pressButton(2); // Brightness 80%
        hub.pressButton(3); // MusicPlayer ON
        hub.pressButton(4); // Play Jazz
        hub.pressButton(5); // Volume 30%
        hub.pressButton(6); // Thermostat ON
        hub.pressButton(7); // Temp Up
        hub.pressButton(8); // Temp Down
    }
}