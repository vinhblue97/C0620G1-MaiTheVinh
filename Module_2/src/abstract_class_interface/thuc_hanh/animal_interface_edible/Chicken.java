package abstract_class_interface.thuc_hanh.animal_interface_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "cluck - cluck";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
