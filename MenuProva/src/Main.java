import java.util.List;
import java.util.Scanner;

class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcio = "";
        List usuaris = new java.util.ArrayList();

        while (!opcio.equals("0")) {
            System.out.println("Menu principal");
            System.out.println("Escolleix una opció");
            System.out.println("1. Gestió d'Usuaris");
            System.out.println("2. Veure estat del sistema");
            System.out.println("0. Sortir");

            opcio = sc.nextLine();

        switch (Integer.parseInt(opcio)) {
            case 0:
                System.out.println("Fins haviat");
                break;
                case 1:
                    submenu(sc, usuaris);
                        break;
                    case 2:
                        System.out.println("Estat: OK");
                        break;
                }
            }
    }
        public static void submenu (Scanner sc, List usuaris) {
            String opcios = "";
            while (!opcios.equals("0")) {

                System.out.println("submenu");
                System.out.println("Escolleix una opció");
                System.out.println("1. Llistar usuaris");
                System.out.println("2. Afegir nou usuari");
                System.out.println("0. Tornar al menú principal");

                opcios = sc.nextLine();

                switch (Integer.parseInt(opcios)) {
                    case 0:
                        break;
                    case 1:
                        System.out.println(usuaris);
                        break;
                    case 2:
                        usuaris.add(sc.nextLine());
                        break;
                }
            }
        }
    }