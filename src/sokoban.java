import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class sokoban {
    public static void main(String[] args) {
        String[][] map = {
                {"*", "*", "*", "*"},
                {"*", "P", "*", "*"},
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"}
        };
        int playerX = 1;
        int playerY = 1;
        Random random = new Random();
        int enemyX, enemyY, enemyX1, enemyY1, giftX, giftY;
        do{
            enemyX = random.nextInt(4);
        } while (enemyX == playerX);
        do{
            enemyY = random.nextInt(4);
        } while (enemyY == playerY);

        do{
            enemyX1 = random.nextInt(4);
        } while (enemyX1 == enemyX || enemyX1 == playerX);

        do{
            enemyY1 = random.nextInt(4);
        } while (enemyY1 == enemyY || enemyY1 == playerY);

        do{
            giftX = random.nextInt(4);
        } while (giftX == playerX || giftX == enemyX1);
        do{
            giftY = random.nextInt(4);
        } while (giftY == playerY || giftY == enemyY);

        while (true) {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    System.out.print(map[j][i] + " ");
                }
                System.out.println();
            }

            System.out.println("Nhap ky tu ban phim: ");
            Scanner scanner = new Scanner(System.in);
            String key = scanner.next();

            map[playerX][playerY] = "*";
            map[enemyX][enemyY] = "*";
            map[enemyX1][enemyY1] = "*";
            map[giftX][giftY] = "G";
            switch (key) {
                case "w":
                    playerY -= 1;
                    enemyY +=1;
                    enemyX1 +=1;
                    break;
                case "s":
                    playerY += 1;
                    enemyY +=1;
                    enemyX1 +=1;
                    break;
                case "a":
                    playerX -= 1;
                    enemyY +=1;
                    enemyX1 +=1;
                    break;
                case "d":
                    playerX += 1;
                    enemyY +=1;
                    enemyX1 +=1;
                    break;
            }
            if (playerX == enemyX && playerY == enemyY || playerX == enemyX1 && playerY == enemyY1){
                System.out.println("You lose");
                return;
            }
            if (playerX == giftX && playerY == giftY){
                System.out.println("You win");
                return;
            }
            if (playerY == -1) playerY = map.length - 1;
            if (playerY == map.length) playerY = 0;
            if (playerX == -1) playerX = map.length - 1;
            if (playerX == map.length)  playerX = 0;
            if (enemyY == map.length) enemyY = 0;
            if (enemyX1 == map.length) enemyX1 = 0;

            map[playerX][playerY] = "P";
            map[enemyX][enemyY] = "E";
            map[enemyX1][enemyY1] = "E1";
        }
    }
}