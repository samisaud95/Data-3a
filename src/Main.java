//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia

import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime oggi = data.plusYears(1).minusMonths(1).plusDays(7);
        String dataStringOggi = oggi.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN));
        System.out.println(" Data String Oggi : " + " " + dataStringOggi);

    }
}