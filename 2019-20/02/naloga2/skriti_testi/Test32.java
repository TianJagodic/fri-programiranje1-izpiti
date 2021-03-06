
import java.util.Arrays;

public class Test32 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'q', 'y', 'b', 'k', 'o', '-', 'a', 'g', 'y', 'h', 'l', 'k', 'v', 't', 'm', '-', 'n', '-', 't', '-'},
            {'g', 'n', 'c', '-', 'y', 'l', 'h', '-', 'n', 's', '-', 'p', '-', 'w', 'c', 'j', 'p', '-', 'e', 'd'},
            {'o', 'k', 'k', '-', 't', 'z', '-', '-', 's', 't', 'm', 'u', 'c', 'r', 'k', 'm', '-', 'd', '-', 'h'},
            {'g', '-', 'z', 'j', 'm', 'h', '-', 'y', 'c', '-', 'y', '-', 's', 'e', 'n', 'j', 'g', 'f', 's', 'n'},
            {'u', 'm', 'l', 'h', 'c', 't', '-', 'z', 'r', '-', 'b', 'v', 'y', 'r', 'p', 'w', '-', 't', 'l', '-'},
            {'p', 'b', 'r', 'j', 's', 'r', 'q', 'i', 'i', 'a', 'p', 'e', 't', 'q', 'd', 'c', '-', 'b', 'o', 'b'},
            {'-', 'n', 'c', '-', '-', 'k', 'x', 'k', '-', 'y', '-', 'l', 'l', 'z', 't', '-', '-', 'g', 'x', 'n'},
            {'l', '-', 'l', 'z', 'r', 'y', 'm', 'r', 'u', 't', 'y', '-', 'i', 'q', 'g', 'z', '-', 'w', 'z', 'w'},
            {'d', '-', 'h', '-', 'b', 'a', '-', '-', 'y', 'a', '-', '-', '-', 's', '-', 'm', 'a', 'u', 'a', '-'},
            {'f', 'o', 'i', 's', 'z', 'd', 'n', '-', 'e', 'z', '-', 'u', 'f', 'i', '-', 'a', 'i', 'n', 'm', 't'},
            {'-', 'd', 't', 'i', '-', 'k', 'c', 'q', 'v', 'v', 'z', 'd', 'o', 'w', 'h', 'n', 'a', '-', 'b', '-'},
            {'q', 'l', 'l', '-', 'b', 'w', 'a', 'e', 'e', '-', 'f', '-', 'h', 'f', 'p', '-', '-', 't', 'e', 'q'},
            {'w', 'g', 'l', 't', 'm', 'p', 'e', 'x', 's', 'p', 'i', 'v', 'o', 'z', 'w', 'l', 'n', '-', '-', 'b'},
            {'-', 'm', 'e', 't', '-', 'k', 'r', 'f', '-', 'x', 'c', 'a', 'f', 'h', 'u', 'w', 's', 'x', 'z', 'p'},
            {'m', 'q', 'k', 'v', 'p', 'r', 'h', '-', '-', 'm', 'o', 'u', 'm', 'r', 'q', 'c', 'a', 'b', '-', 'h'},
            {'j', 'z', 'f', 'u', 'e', 'r', '-', 'l', '-', 't', 'd', 'e', 'c', '-', 'c', 'b', 'v', 'q', 'q', 'c'},
            {'d', 'l', '-', 'c', 'c', 'r', 'x', '-', 'b', 'j', 'g', 'b', '-', 'k', '-', 'e', 'l', 'e', '-', '-'},
            {'-', 'v', 'w', 'c', 'p', 'q', '-', 'o', 'z', 'p', 'g', 'p', 'u', 's', 's', 'v', 'a', '-', 'a', 'z'},
            {'x', 'q', 'h', 's', 's', '-', '-', 'j', 'n', 'w', 'r', 'o', 'z', 'r', '-', 'b', 'i', 'x', 'l', 'c'},
            {'-', '-', 't', 'v', 't', 'm', 'd', 'c', 'e', 'a', 'h', 'g', 'e', 's', '-', 'j', 'l', '-', 's', 'w'},
            {'t', 'k', 'n', 'd', 'f', '-', 'z', 's', 'b', 'x', '-', 'y', 'o', 'c', '-', '-', 'v', 'e', 'a', '-'},
            {'c', 'p', 'm', 'w', 't', 'h', 'z', 'w', 'b', 'd', 's', '-', 'y', 'v', '-', '-', 's', 'i', 'g', 'j'},
            {'s', 'z', '-', 'y', 'v', 'e', 'o', 'l', 'g', 's', 'k', 'y', 'y', 'g', 'h', 'g', 'j', 'c', '-', 'y'},
            {'m', '-', 'r', 'z', 'h', 's', 'f', 'a', 'p', '-', 'd', 'n', 'x', '-', '-', '-', 'e', 'z', 'w', 'b'},
            {'w', '-', '-', '-', '-', 'l', 'v', '-', 'e', 'r', 'k', 'n', '-', '-', '-', 'u', 'z', '-', 'r', '-'},
            {'g', '-', 'p', 'y', '-', 'h', 'x', 'f', 'n', 'n', 'a', 'b', '-', '-', 'v', 'i', 'g', '-', 'u', 'j'},
            {'u', 'p', 'h', 't', 'l', '-', 'p', 'a', 'w', 'g', '-', 'd', 'f', 'p', 'o', '-', 'a', '-', 's', 'v'},
            {'m', '-', 'e', 'm', 'g', 'n', 'd', 'd', 'e', '-', 'h', 'm', 'j', 'e', 'a', 'f', 'j', 'w', '-', 'r'},
            {'z', 'y', 'u', 'i', '-', 'h', 'o', '-', 'c', 'x', '-', 'e', 's', 'z', '-', 'b', '-', '-', 'a', 'j'},
            {'-', 'j', 'q', '-', 'l', '-', 'u', '-', 'j', 'j', 'k', 'v', 'i', '-', 'z', '-', 'z', 'b', 'f', 'm'},
            {'m', 'v', '-', 'd', 'h', 'd', 'j', 'e', 'g', '-', 'k', 'a', '-', '-', '-', 'z', 'b', 'z', 'k', 'y'},
            {'o', '-', 'e', '-', 'r', '-', '-', 'm', 't', '-', 'a', 'x', 'e', 'd', 'x', '-', 'q', 'b', 'z', 't'},
            {'x', 'k', '-', 'l', 'f', 'h', 'b', '-', 's', 'q', 'a', 'z', 'n', 'w', 'm', 'v', 'u', 'r', 'd', 'x'},
            {'y', 'm', 'x', 'l', '-', 'p', 'z', 'a', '-', 'x', 'l', 'x', 'p', 'u', 'h', 'f', 'i', 'b', 'm', 's'},
            {'-', 'u', 'l', 'r', 'x', 'z', 'l', 'd', 't', '-', 'y', 'h', 'n', 'f', 'h', 'k', 'u', 'v', 'm', 'a'},
            {'j', 'p', 'b', '-', 'i', '-', 'r', 'n', 'f', 'u', 'i', 'v', 'w', 'o', 'f', 'y', 'q', 'o', 's', 'c'},
            {'-', '-', 'l', 'w', '-', 'v', 'd', 'e', 'b', 'h', '-', 'i', 'y', 't', 'i', 'u', 't', 'z', 'b', 'q'},
            {'c', 'i', 'o', 'g', 'c', 'o', '-', 'm', 'r', '-', 's', 'q', '-', 'w', 'm', '-', 'r', 'y', 'u', 'a'},
            {'j', 'q', 'h', 'o', 'y', 'o', '-', 'c', 'y', 'i', 'u', 't', 'y', 'c', 'l', 'n', 'h', 't', 'o', 'd'},
            {'h', 'f', '-', 'w', 'o', '-', 'y', 'l', '-', 'k', 'i', 'w', 'y', '-', 'c', '-', 'm', 'a', 'a', '-'},
            {'-', 's', 'n', 'r', '-', 'n', 'p', 'w', 'w', 't', 'q', 'm', 'b', 'w', '-', 'j', 'f', 'z', 'g', 'e'},
            {'x', 'z', '-', '-', 'v', 'p', 'e', '-', 'l', 'r', 'a', 'f', '-', '-', 'u', 'f', 't', 'o', 'l', 'w'},
            {'-', 'w', 'v', 'u', 'p', 'k', 'x', 'n', 'y', 'y', 'x', 'a', 'o', 'v', 'j', 'g', '-', 'z', 'a', 'd'},
            {'-', 'y', 'h', 'j', 'm', 'v', '-', 'b', 'q', 'c', 'l', '-', 'w', 'h', '-', '-', '-', 'w', 'e', 'n'},
            {'u', '-', 'f', 'h', 'e', 'y', 'v', '-', 'l', '-', '-', '-', 'v', 'v', 'q', 'x', 'p', 'm', 'g', 'r'},
            {'-', '-', 'l', 'c', 'w', 'e', 'r', 'l', '-', 's', '-', 'i', '-', 'n', 'l', 'x', '-', 'r', 'q', '-'},
        };
        izpisi(krizanka, 12, 1);
        izpisi(krizanka, 18, 1);
        izpisi(krizanka, 7, 1);
        izpisi(krizanka, 16, 1);
        izpisi(krizanka, 0, 1);
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
