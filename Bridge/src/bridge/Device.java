package bridge;

public interface Device {

    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(final int percentage);

    int getChannel();

    void setChannel(final int channel);
}
