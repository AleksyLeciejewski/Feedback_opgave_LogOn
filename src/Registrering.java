import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Registrering {

    static Map<String, String> brugerInfo = new HashMap<>();

    static void opretBruger() {
        Scanner login = new Scanner(System.in);
        Scanner kodeord = new Scanner(System.in);

        System.out.println("Velkommen! Opret dit brugernavn: ");
        String brugerLogin = login.next();

        if (brugerInfo.containsKey(brugerLogin)) {
            System.out.println("Der findes allerede en bruger med dette navn, angiv venligst et andet");
            return;
        }

    String password;
        while (true) { //Påsætter en betingelse inden kodeordet kan registreres
            System.out.println("Opret nu et kodeord: ");
            password = kodeord.next();

            if (password.length() < 5) { //Påsætter en betingelse under registreringen
                System.out.println("Kodeordet må ikke være kortere end 5 tegn, angiv venligst et andet kodeord.");
            } else {break;}
        }

    brugerInfo.put(brugerLogin, password);
    System.out.println("Registreringen er fuldført succesfuldt. Du er nu oprettet som burger!");


    }
}

