package Command_Pattern;

public class TestClass {
    public static void main(String[] args){
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOn = new TurnOnLightCommand(light);
        Command setTemp = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.setCommand("light", lightOn);
        remote.setCommand("thermo", setTemp);

        remote.pressButton("light");
        remote.pressButton("thermo");

        System.out.println("Undo last command");
        remote.undoButton();
    }
}
