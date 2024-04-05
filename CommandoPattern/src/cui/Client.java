package cui;

import domain.*;
import domain.ICommand;
import domain.SwitchLightCommand;
import domain.TurnWindowCommand;

public class Client {
    public static void main(String[] args) {
        new Client().run();
    }

    private void run() {
        // Room 1: Living room
        ILight livingRoomLight = new RoofLight();
        IWindow livingRoomDoorWindow = new DoorWindow();
        IRoom livingRoom = new LivingRoom(livingRoomLight,livingRoomDoorWindow);
        ICommand livingRoomSwitchICommand = new SwitchLightCommand(livingRoomLight);
        ICommand livingRoomSwitchWindowCommand = new TurnWindowCommand(livingRoomDoorWindow);
        // Execute command in living room
        livingRoom.executeLightCommand(livingRoomSwitchICommand);
        livingRoom.executeWindowCommand(livingRoomSwitchWindowCommand);

        // Check light status
        if (livingRoom.isLightOn()) {
            System.out.println("The living room light is on.");
        } else {
            System.out.println("The living room light is off.");
        }

        // Room 2: Bathroom
        ILight bathroomLight = new RoofLight();
        IWindow bathroomWindow = new DoorWindow();
        IRoom bathroom = new BathRoom(bathroomLight);
        ICommand bathroomSwitchICommand = new SwitchLightCommand(bathroomLight);
        ICommand bathroomWindowCommand = new TurnWindowCommand(bathroomWindow);
        // Execute command in bathroom
        bathroom.executeLightCommand(bathroomSwitchICommand);
        bathroom.executeWindowCommand(bathroomWindowCommand);

        // Check bathroom ligliving room ht status
        if (bathroom.isLightOn()) {
            System.out.println("The bathroom light is on.");
        } else {
            System.out.println("The bathroom light is off.");
        }
    }
}
