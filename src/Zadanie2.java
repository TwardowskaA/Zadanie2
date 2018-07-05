public class Zadanie2 {

    public static void main(String[] args) {

        //Konsola Nintendo Wii U


        Konsola konsola1 = new Konsola();
        konsola1.name = "Nintendo Wii U";
        konsola1.producer = "Nintendo";
        konsola1.realiseDate = 2012;

            System.out.println("nazwa:" + " "  + konsola1.name);
            System.out.println("producent:" + " " + konsola1.producer);
            System.out.println("data wydania:" + " " + konsola1.realiseDate);


        //Konsola Nintendo Switch


        Konsola konsola2 = new Konsola();
        konsola2.name = "Nintendo Switch";
        konsola2.producer = "Nintendo";
        konsola2.realiseDate = 2017;

             System.out.println("nazwa:" + " " + konsola2.name);
             System.out.println("producent:" + " " + konsola2.producer);
             System.out.println("data wydania:" + " " + konsola2.realiseDate);
    }

}
