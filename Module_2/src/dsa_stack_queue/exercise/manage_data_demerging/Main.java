package dsa_stack_queue.exercise.manage_data_demerging;

class Main {
    public static void main(String[] args){
        Human human1 = new Human("man","15/12/1997");
        Human human2 = new Human("women","15/2/1997");
        Human human3 = new Human("man","15/1/1997");

        Demeging<Human> humanQueue = new Demeging<>();

        humanQueue.manageDemeging(human1, human1.getGender());
        humanQueue.manageDemeging(human2, human3.getGender());
        humanQueue.manageDemeging(human3, human2.getGender());
        humanQueue.printQueue();
    }
}
