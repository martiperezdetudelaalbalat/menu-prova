import java.util.Scanner;

public class Menu {
    Scanner sc;
    String opcio;
    public void menu (){
        while (opcio.equals("0")) {
            System.out.println("Menu principal");
            System.out.println("Escolleix una opció");
            System.out.println("1. Gestió d'Usuaris ");
            System.out.println("2. Veure estat del sistema");
            System.out.println("0. Sortir");

            opcio = sc.nextLine();

            switch (Integer.parseInt(opcio)){
                case 0:
                    System.out.println("Fins haviat");
                case 1:
                    submenu();
                case 2:
                    System.out.println("Estat: OK");
            }
        }
    }
    public void submenu(){

    }
}
