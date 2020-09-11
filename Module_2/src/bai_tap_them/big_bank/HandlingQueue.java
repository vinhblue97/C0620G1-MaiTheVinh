package bai_tap_them.big_bank;

import java.util.Queue;

class HandlingQueue {
    Queue<Customer> customerQueue;
    private int max;

    public HandlingQueue(Queue<Customer> customerQueue) {
        this.customerQueue = customerQueue;
    }

    public int getMax() {
        max = customerQueue.peek().getCustomerP();
        int temp = customerQueue.peek().getCustomerK();
        for (Customer customer : customerQueue) {
            if (customer.getCustomerP() > max) {
                max = customer.getCustomerP();
                temp = customer.getCustomerK();
            }
        }
        for (Customer customer : customerQueue) {
            if (customer.getCustomerP() == max) {
                customerQueue.remove(customer);
            }
        }
        return temp;
    }

    public int getMin() {
        int min = customerQueue.peek().getCustomerP();
        int temp = customerQueue.peek().getCustomerK();
        for (Customer customer : customerQueue) {
            if (customer.getCustomerP() < min) {
                min = customer.getCustomerP();
                temp = customer.getCustomerK();
            }
        }
        for (Customer customer : customerQueue) {
            if (customer.getCustomerP() == min) {
                customerQueue.remove(customer);
            }
        }
        return temp;
    }
}
