
import java.util.Arrays;

public class Test44 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'f', 'e', '-', '-', 'o', '-', '-', '-', 'l', '-', 'p', 'y', '-', 'u', 'm', 'p', 't', '-'},
            {'f', '-', 'j', 'r', 'y', 't', '-', 'n', 'g', '-', '-', 'g', 'g', 'n', '-', 'e', 'h', '-'},
            {'x', '-', 'z', 'r', 'z', 'e', 'c', 'm', '-', 's', '-', 'g', 'y', 'k', 't', 'p', '-', 'r'},
            {'e', 'c', 'x', 'l', 'k', 'j', 'v', 'b', 'j', '-', 'i', 'l', 'i', 'k', 's', 'k', 'u', 'c'},
            {'i', 'o', 'f', '-', 's', '-', '-', 'q', 'b', 'r', 'n', 'b', '-', 'j', '-', 'u', '-', 'x'},
            {'-', 'x', 'x', '-', '-', 'j', 'z', '-', 'y', 'v', 'p', 'u', 'f', 'o', 't', 'm', 'b', 'v'},
            {'i', 'd', 'l', '-', '-', '-', 'e', 'c', '-', 'o', 'u', 's', 'e', '-', 'n', 'y', 's', 'f'},
            {'o', 'h', 's', 'z', '-', 'u', 's', 'z', 'q', 'v', '-', 'e', '-', 'k', 'g', 'z', 'r', 'a'},
            {'o', 'e', 'g', 'j', 'n', 'y', 's', '-', 'c', 'f', 'l', 'c', '-', 'e', 'e', '-', 'v', '-'},
            {'x', 'x', 'q', 'r', 'h', 'o', 'f', 'b', 'b', 'j', '-', 'e', 'g', 't', 'u', 'l', 'u', 'c'},
            {'-', 'z', '-', 'x', 't', 't', 'q', 'm', 'v', 's', 's', 'h', 'h', 'c', 'd', '-', '-', 'v'},
            {'b', '-', 'e', 'b', 's', 'w', 'x', '-', 'v', '-', '-', 'm', 'a', 'q', '-', 'w', 'h', '-'},
            {'f', 'd', '-', 'v', 'b', 'u', 's', 'u', '-', 'n', 'a', 'l', '-', '-', '-', 'l', 'p', '-'},
            {'a', 'd', 's', 'i', '-', 'b', '-', 'z', 'e', '-', 't', 'w', 'm', '-', 'a', 't', 't', 'q'},
            {'r', 'v', 'x', 'e', 'd', '-', 'j', 'l', 'a', 'b', 'y', 'b', 'm', 's', 'z', '-', '-', '-'},
            {'m', '-', 'h', 'y', 't', 't', 'f', 'x', 'q', '-', 't', 'p', '-', 'c', 't', 'g', 'x', 'i'},
            {'-', 'n', '-', 'p', 'b', 'e', 'g', 'l', 'j', '-', '-', 'j', '-', 'a', 'x', '-', '-', 'h'},
            {'b', '-', 'c', 'p', 'l', 'g', 'e', 'g', '-', 'u', 'd', 'f', 'x', 'p', 'a', '-', 'n', '-'},
            {'u', 'n', '-', '-', 'd', 'd', 'i', 'e', 'o', 's', 'n', '-', 'y', 'f', '-', '-', 'r', 'x'},
            {'w', 'k', 't', '-', 't', 'v', 'g', 'i', 'm', 'a', 'p', 'i', 'i', 'v', 'm', 't', '-', 'l'},
            {'s', 'm', 's', 'l', 'b', 's', 'g', '-', 'p', 's', 'm', 'w', '-', 'p', '-', 'b', 'h', '-'},
            {'v', 'g', 'j', 'y', '-', 'u', 'l', 'o', 'r', 'c', 'w', 'i', '-', 'j', '-', 'e', 'y', '-'},
        };
        izpisi(krizanka, 1, 3);
        izpisi(krizanka, 9, 3);
        izpisi(krizanka, 5, 3);
        izpisi(krizanka, 3, 7);
        izpisi(krizanka, 6, 6);
    }

    private static void izpisi(char[][] krizanka, int stolpec, int k) {
        char[] beseda = Druga.ktaBeseda(krizanka, stolpec, k);
        if (beseda == null) {
            System.out.println("null");
        } else {
            System.out.println(Arrays.toString(beseda));
        }
    }
}
