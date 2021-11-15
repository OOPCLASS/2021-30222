package head.base;

public class Laptop extends Appliances {
    private int usbPorts;
    private String videoCard;

    public int getUsbPorts() {
        return usbPorts;
    }

    public void setUsbPorts(int usbPorts) {
        this.usbPorts = usbPorts;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public Laptop(String name, int price, int memory, String memoryType, int display, int memoryRam, String operationSystem, int usbPorts, String videoCard) {
        super(name, price, memory, memoryType, display, memoryRam, operationSystem);
        this.usbPorts = usbPorts;
        this.videoCard = videoCard;
    }

    public Laptop() {

    }

}
