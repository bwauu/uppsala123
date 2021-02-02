package InledandeJavaProgrammeringKurs.Assignments;

import javax.swing.*;

public class Assignment2 {

    public static void main(String[] args) {

        while (true) /* whileloop1
        1. Kommer alltid köras eftersom "while" conditonet kommer alltid vara true
        (Tills det givna break statementet ) */ {

            /* 2. "JOptionPane.showInputDialog()"
            är en Java metod som kommer visa upp min givna String "Skriv in en mening tack!" för användaren */
            String sentence = JOptionPane.showInputDialog("Skriv in en mening tack!");

            /* 3. Om Stringen "sentence" är lika med null så kommer programmet att avsluta while loopen för användaren */
            if (sentence == null) {
                break;
            }

            /* 4. Om Stringen "sentence" är tom så kommer min givna showMessageDialog() metod
             visa ett dialogmeddelande/felmeddelande för användaren som säger "Meningen får inte vara tom!" */
            if (sentence.isEmpty())  {
                JOptionPane.showMessageDialog(null, "Meningen får inte vara tom!");

                /* 5. continue är en del av en min första whileloop
                 där programmet låter loopen börja om ifall ifsatsen är true */
                continue;
            }

            // Intitierar en variabel vid namn "symbol"
            String symbol;
            while (true) /* whileloop2 */ {

                // 7. Visar en input dialog där användaren ska skriva in ett tecken.
                symbol = JOptionPane.showInputDialog("Skriv in ett tecken tack! :)");

                // 8. Om användaren kryssar rutan (null), så avslutas programmet genom break; statementet.
                if (symbol == null) {
                    break;
                }

                // 9. Om användaren inte skrivit in något tecken så visas felmeddelande och visar input dialogen på nytt.
                if (symbol.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "En symbol måste anges!");
                    continue;
                }

                /* 10. Om användaren har skrivit in fler än ett tecken så vill vi också visa
                ett felmdeelande och visa input dialogen på nytt. */
                if (symbol.length() > 1) {
                    JOptionPane.showMessageDialog(null, "Endast en symbol får anges!");
                    continue;
                }
                break;
            }
            /* 11. Om användaren kryssar rutan så avslutas programmet  */
            if (symbol == null) {
                break;
            }

            // 12. Om användaren har skrivit in korrekt mängd tecken så vill vi fortsätta programmet.
            char c = symbol.charAt(0);
            int first = sentence.indexOf(c, 0);
            int symbolCounter = 0; // min int "symbolCounter" kommer vara programmets tecken räknare (initieras med 0)

            /* 13. Forloop som kollar ifall varje substring i sentence är lika med det givna tecknet.
            Ifall detta if satsen = true så inkrementerar vi variablen symbolCounter med 1. */
            for (int i = 0; i < sentence.length(); i++) {
                String letter = sentence.substring(i, i + 1).toLowerCase();
                if (symbol.contains(letter)) {
                    symbolCounter++;
                }
            }
            /* RESULTAT!!!!!!!!!!!! */
            String message = "Meningen har totalt " + sentence.length() +
                    " tecken. Ditt valda tecken '" + symbol + "' förekom " + symbolCounter + " gånger. ";

            /* 14. Ifall variablen "symbol" förekom fler än 0 gånger i sentence så lägg till det som
            finns i kodblocket nedan på Stringen "message"*/
            if (symbolCounter > 0) {
                message += "Första gången på indexplatsen " + first + " och sista på indexplatsen " + sentence.lastIndexOf(c, c);
            }
            JOptionPane.showMessageDialog(null, message);
            break; /* Program avslutat! */
        }

    }

}