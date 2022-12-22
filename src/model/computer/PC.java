package model.computer;

public class PC extends Computer{

    private boolean powerSupply;

    public PC(String name, String type, int hdd, int ram, boolean powerSupply) {
        super(name, type, hdd, ram);
        this.powerSupply = powerSupply;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (powerSupply) {
            super.switchOn();
        } else {
            System.out.println("No power supply!");
        }
    }

    public int volumeUp() {
        return volumeLevel += 1;
    }

    @Override
    public int volumeUp(int volumeChange) {
        volumeLevel = volumeLevel + volumeChange;
        if (volumeLevel >= 100){
            volumeLevel = 100;
            return 100;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0){
            volumeLevel = 0;
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int volumeChange) {
        volumeLevel = volumeLevel - volumeChange;
        if (volumeLevel <= 0){
            volumeLevel = 0;
            return 0;
        } else {
            return volumeLevel;
        }
    }
}