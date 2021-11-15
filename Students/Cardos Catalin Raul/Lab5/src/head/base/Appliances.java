package head.base;

import head.Products;

import java.sql.SQLOutput;

public class Appliances extends Products {
    private int memory;
    private String memoryType;
    private int display;
    private int memoryRam;
    private String operationSystem;

    public Appliances() {

    }

    public void printSpecifications() {
        System.out.println(this.memory + " " + this.memoryType + " " + this.display + " " + this.memoryRam + " "
                + this.operationSystem);
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public int getDisplay() {
        return display;
    }

    public void setDisplay(int display) {
        this.display = display;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }

    public Appliances(String name, int price, int memory, String memoryType, int display, int memoryRam, String operationSystem) {
        super(name, price);
        this.memory = memory;
        this.memoryType = memoryType;
        this.display = display;
        this.memoryRam = memoryRam;
        this.operationSystem = operationSystem;
    }

    public void searchingForMemory(int memory) {
        if (memory == this.memory) {
            System.out.println("DA");
        } else {
            System.out.println("NU");
        }
    }

    public void searchingForMemory(int memory, int memoryRam) {
        if (memory == this.memory && memoryRam == this.memoryRam) {
            System.out.println("DA");
        } else {
            System.out.println("NU");
        }
    }
}
