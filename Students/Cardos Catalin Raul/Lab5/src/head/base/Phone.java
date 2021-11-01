package head.base;

import head.Products;

public class Phone extends Appliances {
    private int frontalCamera;
    private int backCamera;

    public int getFrontalCamera() {
        return frontalCamera;
    }

    public void setFrontalCamera(int frontalCamera) {
        this.frontalCamera = frontalCamera;
    }

    public int getBackCamera() {
        return backCamera;
    }

    public void setBackCamera(int backCamera) {
        this.backCamera = backCamera;
    }

    public Phone() {

    }

    public Phone(String name, int price, int memory, String memoryType, int display, int memoryRam, String operationSystem, int frontalCamera, int backCamera) {
        super(name, price, memory, memoryType, display, memoryRam, operationSystem);
        this.frontalCamera = frontalCamera;
        this.backCamera = backCamera;
    }

    public void printSpecifications() {
        System.out.println(this.frontalCamera + " " + this.backCamera);
    }


}
