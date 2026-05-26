import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        
        Integer costVer[] = {2, 1, 3, 1, 4};
        Integer costHor[] = {4, 1, 2};

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int horizontalPieces = 1;
        int verticalPieces = 1;
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {

            if (costHor[h] >= costVer[v]) {
                cost += costHor[h] * verticalPieces;
                horizontalPieces++;
                h++;
            } else {
                cost += costVer[v] * horizontalPieces;
                verticalPieces++;
                v++;
            }
        }

        while (h < costHor.length) {
            cost += costHor[h] * verticalPieces;
            h++;
        }

        while (v < costVer.length) {
            cost += costVer[v] * horizontalPieces;
            v++;
        }

        System.out.println("Minimum cost to cut the board: " + cost);
    }
}