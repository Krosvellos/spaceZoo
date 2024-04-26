import java.util.UUID;

public class Main {
    public static void main(String[] args) {




        Zoo zooPrague = ZooService.createZoo("Space Zoo");
        //Zoo zooPrague = new Zoo("Prague");

        zooPrague.addPavilion(new Pavilion("African animals"));
        zooPrague.addPavilion(new Pavilion("American animals"));
        zooPrague.listPavilions();
        zooPrague.AddAnimalToPavilion("African animals", new Animal("Leopard",2));

        zooPrague.AddAnimalToPavilion("African animals", new Animal("Zebra",3));
        zooPrague.AddAnimalToPavilion("African animals", new Animal("Lion",2));
        zooPrague.AddAnimalToPavilion("American animals", new Animal("Bear",5));
        zooPrague.listAnimalsFromPavilion("American animals");
        zooPrague.listAnimalsFromPavilion("African animals");




            }

        }

