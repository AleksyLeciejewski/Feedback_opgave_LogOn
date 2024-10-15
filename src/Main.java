import java.lang.runtime.SwitchBootstraps;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {

Scanner valg = new Scanner(System.in);
boolean run = true;

while(run){   //Hashmap gemmer kun brugerinformationen fra registreringen, så længe, programmet kører.
    //Nødvendigt at implementere løkkken for at kunne registrere og logge ind under samme run
    System.out.println("");

    System.out.println("Velkommen, er du ny eller eksisterende bruger?");

    System.out.println("Tryk 1 for at oprette en ny bruger");

    System.out.println("Tryk 2 for at log in på en eksisterende bruger");

    System.out.println("Tryk 3 for at afslutte programmet");

int brugervalg = valg.nextInt();

switch(brugervalg) {        //Switch ikke nødvendig, da valgmulighederne er så få, at der ikke forekommer ressourcelekage ved udregningen
    // men gav en langt renere kodestruktur.
    case 1:
        Registrering.opretBruger();
        break;
    case 2:
    LogOn.LogIn();
        break;
    case 3:
        run = false;
        break;
    default:   System.out.println("Ugyldigt input, prøv igen");
        }
    }
}
}