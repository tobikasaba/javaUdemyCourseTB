public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell",
                "240");

        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, "2540 x 1440");

        Motherboard theMotherboard = new Motherboard("BJ200", "Asus",
                4,6,"v2.44");


        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                theCase, theMonitor, theMotherboard);

//        Personal object class has a method of type Monitor which was inherited
//        from the Product class and
//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();

    }
}