package bai_tap_them.big_bank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Queue<Customer> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        loop:
        do {
            String input = scanner.nextLine();
            AnalystInput analystInput = new AnalystInput(input);
            String k = "";
            String p = "";
            String action = analystInput.getAction();
            if (!action.equals("2") && !action.equals("3")) {
                if (input.length() > 1) {
                    k += analystInput.getK();
                    p += analystInput.getP();
                }
            }
            switch (action) {
                case "0":
                    break loop;
                case "1":
                    if (k.equals("") || p.equals("")) {
                        break;
                    }
                    customerQueue.add(new Customer(Integer.parseInt(k), Integer.parseInt(p)));
                    break;
                case "2":
                    if (customerQueue.isEmpty()) {
                        System.out.println(0);
                    } else {
                        HandlingQueue maxQueue = new HandlingQueue(customerQueue);
                        System.out.println(maxQueue.getMax());

                    }
                    break;
                case "3":
                    if (customerQueue.isEmpty()) {
                        System.out.println(0);
                    } else {
                        HandlingQueue minQueue = new HandlingQueue(customerQueue);
                        System.out.println(minQueue.getMin());
                    }
                    break;
            }
        } while (true);

    }
}
