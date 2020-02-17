public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        System.out.println("Galaxy" + " says " + ringToneInfo() + "!");
    }
    @Override
    public String unlock() {
        System.out.println("Unlocking" + " via fingerprint");
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy" + getversionInfo() + "from" + carrierInfo());           
    }
}
