import model.Bug;
import model.User;
import model.computer.Computer;
import model.computer.Laptop;
import model.computer.PC;

public class MainApp {

    public static void main(String[] args) {

        Computer officeComputer = new PC("Office computer", "HP", 500, 128, false);
        Computer gamingLaptop = new Laptop("XGames", "HP Games", 500, 256, 50);

        System.out.println("Current volume on " + officeComputer.getName() + " : " + officeComputer.getVolumeLevel());
        System.out.println(officeComputer.volumeUp(20));
        System.out.println(officeComputer.volumeUp(40));
        System.out.println(officeComputer.volumeUp(50));
        System.out.println(officeComputer.volumeUp(50));
        System.out.println(officeComputer.volumeDown(50));
        System.out.println(officeComputer.volumeDown(20));
        System.out.println(officeComputer.volumeDown(30));
        System.out.println(officeComputer.volumeDown(30));


        System.out.println("Current volume on " + gamingLaptop.getName() + " : " + gamingLaptop.getVolumeLevel());
        System.out.println(gamingLaptop.volumeUp());
        System.out.println(gamingLaptop.volumeUp());
        System.out.println(gamingLaptop.volumeDown());
        System.out.println(gamingLaptop.volumeDown());
        System.out.println(gamingLaptop.volumeDown());








    }


}

