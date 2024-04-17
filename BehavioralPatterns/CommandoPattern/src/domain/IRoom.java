package domain;

//* Invoker interface
public interface IRoom {
    void executeLightCommand(ICommand lightCommand);
    void executeWindowCommand(ICommand windowCommand);
    boolean isLightOn();
    boolean isWindowOpen();

}
