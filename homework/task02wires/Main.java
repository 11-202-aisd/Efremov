package homework.task02wires;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество вершин: ");
        int n = sc.nextInt();
        String garbage = sc.nextLine();
        int[] wires = new int[n];
        for (int i = 0; i < n; i++) {
            wires[i] = i + 1;
        }
        System.out.print("Введите количество связей: ");
        n = sc.nextInt();
        garbage = sc.nextLine();
        System.out.println("Ниже введите связанные проводами пары вершин: ");
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            int n1 = Integer.parseInt(str.split(" ")[0]);
            int n2 = Integer.parseInt(str.split(" ")[1]);
            for (int j = 0; j < n; j++) {
                if (wires[j] == wires[n1 - 1]) {
                    wires[j] = wires[n2 - 1];
                }
            }
        }

        System.out.println("Введите пару вершин для проверки соединения: ");
        String str = sc.nextLine();
        int n1 = Integer.parseInt(str.split(" ")[0]);
        int n2 = Integer.parseInt(str.split(" ")[1]);
        System.out.println(wires[n1 - 1] == wires[n2 - 1] ? "Вершины соединены":"Нужен провод между вершинами");

    }

}

//    Введите количество вершин: 3
//    Введите количество связей: 2
//    Ниже введите связанные проводами пары вершин:
//    1 2
//    2 3
//    Введите пару вершин для проверки соединения:
//    1 3
//    Вершины соединены