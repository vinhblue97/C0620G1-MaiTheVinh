package dsa_stack_queue.exercise.manage_data_demerging;

class Main {
    public static void main(String[] args) {
        Demeging check1 = new Demeging();
        check1.addData("Vinh", "male", "23/05/2005");
        check1.addData( "Thăng", "male", "18/01/2000");
        check1.addData("Thanh", "female", "01/03/1997");
        check1.addData("Hạnh", "female", "09/01/1997");
        check1.addData("Tú", "female", "10/01/1996");

        check1.manageDemeging();
        check1.printQueue();
    }
}
