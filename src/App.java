import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    try (Scanner scanner = new Scanner(System.in)) {

        String[] rum = {
            "Du står framför ett läskigt hus, tryck ENTER för att gå in i huset",
            "Du går in i köket, tryck ENTER för att gå vidare",
            "Du går in i vardagsrummet, tryck ENTER för att fortsätta",
            "Du går in i sovrummet och ser trappan till källaren, tryck ENTER för att gå ner",
            "Du är i källaren något känns skumt här"
        };

        int steg = 0;

        while (steg < rum.length) {
            System.out.println(rum[steg]);
            String input = scanner.nextLine();

            if (input.equals("")) {
                steg = steg+1;

                if (steg == rum.length ) {
                    System.out.println("Det känns läskigt här nere i källaren");
                }
            }
        }

        System.out.println("Din telefon ringer och du dör av en hjärtattack");
    }
}
}
