package homework.PartMain.task02_03ConnectivityProblem;

import java.util.HashMap;


public class QuickFindConnector {
    private HashMap<String, Integer> map = new HashMap<>();
    private int[] arr;
    public QuickFindConnector() {
        // задаем начальные значения массива
        arr = new int[10]; // 10 - количество элементов в массиве
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }
    public void add(String ip1, String ip2) {
        // добавляем новые элементы в хэшмап
        if (!map.containsKey(ip1)) {
            int newIndex = map.size();
            map.put(ip1, newIndex);
        }
        if (!map.containsKey(ip2)) {
            int newIndex = map.size();
            map.put(ip2, newIndex);
        }
    }
    public boolean connected(String ip1, String ip2) {
        // проверяем, связаны ли элементы
        Integer index1 = map.get(ip1);
        Integer index2 = map.get(ip2);
        if (index1 == null || index2 == null) {
            return false;
        }
        return arr[index1] == arr[index2];
    }
    public void union(String ip1, String ip2) {
        // связываем элементы
        Integer index1 = map.get(ip1);
        Integer index2 = map.get(ip2);
        if (index1 == null || index2 == null || index1 == index2) {
            return;
        }
        int oldVal = arr[index2];
        int newVal = arr[index1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldVal) {
                arr[i] = newVal;
            }
        }
    }

    public static void main(String[] args) {
        String[][] input = {
                {"255.255.0.3", "255.255.0.4"},
                {"255.255.0.4", "255.255.0.9"},
                {"255.255.0.8", "255.255.0.0"},
                {"255.255.0.2", "255.255.0.3"},
                {"255.255.0.5", "255.255.0.6"},
                {"255.255.0.2", "255.255.0.9"},
                {"255.255.0.5", "255.255.0.9"},
                {"255.255.0.7", "255.255.0.3"},
                {"255.255.0.4", "255.255.0.8"},
                {"255.255.0.5", "255.255.0.6"},
                {"255.255.0.0", "255.255.0.2"},
                {"255.255.0.6", "255.255.0.1"}};
        QuickFindConnector quickFindConnector = new QuickFindConnector();
        for (String[] pair : input) {
            // Эти два IP-адреса должны быть связаны
            String ip1 = pair[0];
            String ip2 = pair[1];
            quickFindConnector.add(ip1, ip2);
            // Если данные не связаны - связываем их
            if (quickFindConnector.connected(ip1, ip2)) {
                continue;
            } else {
                quickFindConnector.union(ip1, ip2);
            }
            // Теперь мы можем что-то сделать с IP-адресами, установить соединение к примеру
            System.out.println(ip1 + " | " + ip2 + " - connection established!");
        }
    }
}