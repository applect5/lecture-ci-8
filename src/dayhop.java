import java.util.Random;
import java.util.Scanner;

public class dayhop {
    public static void main(String[] args) {
        int playerx, playery, box1x, box1y, box2x, box2y;
        int des1x, des1y, des2x, des2y;
        int i, j;
        boolean boxinwall,win;

        Random random = new Random();
        playerx = random.nextInt(10);
        playery = random.nextInt(10);
        do {
            box1x = random.nextInt(8) + 1;
            box1y = random.nextInt(8) + 1;
        } while (box1x == playerx || box1y == playery);
        do {
            box2x = random.nextInt(8) + 1;
            box2y = random.nextInt(8) + 1;
        } while (box2x == box1x && box2x == playerx || box2y == box1y && box2y == playery);
        do {
            des1x = random.nextInt(10);
            des1y = random.nextInt(10);
        } while (des1x == playerx || des1x == box1x || des1x == box2x);
        do {
            des2x = random.nextInt(10);
            des2y = random.nextInt(10);
        } while (des2y == playery || des2y == box1y || des2y == box2y || des2y == des1y);


        String[][] map = {
                {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
        };
        while (true) {
            for (i = 0; i < map.length; i++) {
                for (j = 0; j < map[i].length; j++) {
                    System.out.print(map[j][i] + " ");
                }
                System.out.println();
            }
            System.out.println("Nhap ky tu ban phim: ");
            Scanner scanner = new Scanner(System.in);
            String key = scanner.next();
            map[playerx][playery] = "*";
            map[box1x][box1y] = "*";
            map[box2x][box2y] = "*";
            map[des1x][des1y] = "*";
            map[des2x][des2y] = "*";
            int dx = 0;
            int dy = 0;
            switch (key) {
                case "w":
                    dy = -1;
                    break;
                case "s":
                    dy = 1;
                    break;
                case "a":
                    dx = -1;
                    break;
                case "d":
                    dx = 1;
            }
            boxinwall = true;
            if (playerx + dx > -1 && playerx + dx < 10 && -1 < playery + dy && playery + dy < 10) {
                {
                    if (playerx + dx == box1x && playery + dy == box1y) {
                        if (box1x + dx < 0 || box1x + dx > 9 || 0 > box1y + dy || box1y + dy > 9 || box1x + dx == box2x && box1y + dy == box2y) {
                            boxinwall = false;
                        }
                        if (boxinwall) {
                            box1x += dx;
                            box1y += dy;
                        }
                    }
                }
                {
                    if (playerx + dx == box2x && playery + dy == box2y) {
                        if (box2x + dx < 0 || box2x + dx > 9 || 0 > box2y + dy || box2y + dy > 9 || box2x + dx == box1x && box2y + dy == box1y) {
                            boxinwall = false;
                        }
                        if (boxinwall) {
                            box2x += dx;
                            box2y += dy;
                        }
                    }
                }
                if (boxinwall) {
                    playerx += dx;
                    playery += dy;
                }
            }

            map[des1x][des1y] = "D";
            map[des2x][des2y] = "D";
            map[playerx][playery] = "P";
            map[box1x][box1y] = "B";
            map[box2x][box2y] = "B";
            if (box1x == des1x && box1y == des1y) {
                if (box2x == des2x && box2y == des2y) {
                    System.out.println("You win");
                    return;
                }
            }
            if (box2x == des1x && box2y == des1y) {
                if (box1x == des2x && box1y == des2y) {
                    System.out.println("You win");
                    return;
                }
            }
        }
    }
}

