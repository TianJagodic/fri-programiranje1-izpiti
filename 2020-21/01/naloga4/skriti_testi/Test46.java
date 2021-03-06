
import java.util.*;

public class Test46 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 3), 44),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 4, 4), 40, 60),
            new Cetrta.Krog(new Cetrta.Barva(2, 3, 4), 1),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 4, 3), 91, 63),
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 2), 71),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 2, 4), 57),
            new Cetrta.Krog(new Cetrta.Barva(2, 4, 3), 22),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 2, 5), 74, 53),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 4), 8, 9),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 4, 1), 37),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 2, 1), 49, 77),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 5, 4), 32),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 4, 2), 26),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 3, 5), 49, 69),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 1, 3), 7, 73),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 2, 1), 76, 46),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 5, 4), 89, 41),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 1, 2), 95),
            new Cetrta.Krog(new Cetrta.Barva(1, 1, 1), 56),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 2, 4), 89),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 1, 2), 85, 41),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 3, 4), 24),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 5, 3), 33, 16),
            new Cetrta.Krog(new Cetrta.Barva(4, 1, 1), 73),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 5, 4), 9),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 2, 2), 37, 89),
            new Cetrta.Krog(new Cetrta.Barva(4, 1, 4), 88),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 1, 1), 38),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 2, 5), 90),
            new Cetrta.Krog(new Cetrta.Barva(1, 4, 1), 89),
            new Cetrta.Krog(new Cetrta.Barva(3, 5, 5), 58),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 2, 1), 5),
            new Cetrta.Krog(new Cetrta.Barva(3, 5, 3), 93),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 1, 4), 99, 37),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 1, 1), 39),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 3, 2), 13, 46),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 3, 4), 41),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 5, 4), 2, 21),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 1, 3), 77, 48),
            new Cetrta.Krog(new Cetrta.Barva(4, 1, 3), 81),
            new Cetrta.Krog(new Cetrta.Barva(2, 3, 5), 6),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 3, 2), 33),
            new Cetrta.Krog(new Cetrta.Barva(2, 3, 1), 81),
            new Cetrta.Krog(new Cetrta.Barva(5, 3, 1), 94),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 4, 1), 86, 85),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 5, 3), 72),
            new Cetrta.Pravokotnik(new Cetrta.Barva(1, 2, 4), 39, 74),
            new Cetrta.Krog(new Cetrta.Barva(5, 4, 5), 99),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 2), 63, 91),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 2, 4), 21, 26),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 2, 4), 63),
            new Cetrta.Krog(new Cetrta.Barva(2, 2, 5), 76),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 4, 2), 40),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 5, 3), 96, 70),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 5, 1), 57),
            new Cetrta.Krog(new Cetrta.Barva(4, 2, 2), 84),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 5, 5), 53, 96),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 3, 2), 50),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 5, 1), 40),
            new Cetrta.Kvadrat(new Cetrta.Barva(2, 1, 1), 2),
            new Cetrta.Krog(new Cetrta.Barva(3, 1, 3), 61),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 1, 5), 25, 20),
            new Cetrta.Krog(new Cetrta.Barva(1, 2, 4), 8),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 2, 2), 52, 1),
            new Cetrta.Krog(new Cetrta.Barva(4, 4, 5), 76),
            new Cetrta.Kvadrat(new Cetrta.Barva(1, 5, 4), 91),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 1, 4), 38),
            new Cetrta.Krog(new Cetrta.Barva(3, 4, 5), 49),
            new Cetrta.Krog(new Cetrta.Barva(5, 2, 4), 87),
            new Cetrta.Krog(new Cetrta.Barva(4, 5, 3), 12),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 3, 3), 46, 78),
            new Cetrta.Krog(new Cetrta.Barva(5, 4, 1), 92),
            new Cetrta.Krog(new Cetrta.Barva(4, 1, 5), 56),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 3, 1), 71),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 4, 5), 41, 73),
            new Cetrta.Kvadrat(new Cetrta.Barva(4, 5, 5), 70),
            new Cetrta.Krog(new Cetrta.Barva(1, 2, 5), 92),
            new Cetrta.Pravokotnik(new Cetrta.Barva(2, 3, 2), 9, 47),
            new Cetrta.Krog(new Cetrta.Barva(4, 4, 4), 50),
            new Cetrta.Krog(new Cetrta.Barva(3, 2, 5), 27),
            new Cetrta.Kvadrat(new Cetrta.Barva(5, 4, 4), 35),
            new Cetrta.Pravokotnik(new Cetrta.Barva(4, 4, 3), 64, 59),
            new Cetrta.Krog(new Cetrta.Barva(2, 5, 1), 96),
            new Cetrta.Krog(new Cetrta.Barva(3, 4, 2), 8),
            new Cetrta.Pravokotnik(new Cetrta.Barva(3, 5, 2), 34, 35),
            new Cetrta.Pravokotnik(new Cetrta.Barva(5, 5, 4), 1, 9),
            new Cetrta.Krog(new Cetrta.Barva(5, 3, 4), 81)
        ));

        Collection<Cetrta.Lik> urejena = Cetrta.poTipuInBarvi(liki);
        for (Cetrta.Lik lik: urejena) {
            System.out.println(lik);
        }
        System.out.println("----------");
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
