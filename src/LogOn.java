import java.util.Scanner;

class LogOn { //Både klasserne og metoderne er hverken private eller public.
   //Mikkels krav om sikkerhedspraksis, hvor brugerinformationen ikke er offentliggjort.
   //For at dataet kunne tilgås af de andre klasser fjernes private/public.

static void LogIn(){
   Scanner login = new Scanner(System.in);
   Scanner kodeord = new Scanner(System.in);

       System.out.println("Velkommen, indtast venligst dit brugernavn");

   String brugernavn =  login.next();

   if(Registrering.brugerInfo.containsKey(brugernavn)){
      System.out.println("Indtast nu dit kodeord");

   String password = kodeord.next();

   if(Registrering.brugerInfo.containsKey(password)){ //Kontrollerer for, om kodeordet findes som en registreret bruger
      System.out.println("Velkommen. Vent et øjeblik mens vi starter alt op for dig.");
   } else {
      System.out.println("Dit kodeord er forkert");
   }
   } else {
      System.out.println("Det indtastede brugernavn findes ikke. Prøv venligst igen");
   }
 }
}
