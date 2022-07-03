package bridge;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    private void togglePower() {
        if (device.isEnabled())
            device.disable();
        else
            device.enable();
    }

    private void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }


    private void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }


    private void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    private void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }
}
