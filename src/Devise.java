public abstract class Devise implements Printable{
    public void setDeviceNumber(int deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    private int deviceNumber;

   private String deviceName;

   private State state;

    public State getState(State on) {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getDeviceNumber() {
        return deviceNumber;
    }


    @Override
    public String toString() {
        return "Devise{" +
                "deviceNumber=" + deviceNumber +
                ", deviceName='" + deviceName + '\'' +
                ", state=" + state +
                '}';
    }
}
