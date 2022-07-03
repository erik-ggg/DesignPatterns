package bridge;

public class TV implements Device {
    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public void setVolume(int percentage) {

    }

    @Override
    public int getChannel() {
        return 0;
    }

    @Override
    public void setChannel(int channel) {

    }
}
