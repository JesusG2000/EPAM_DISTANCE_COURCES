package by.etc.basic_oop.task_five_b.sweet;

public class CakeSweetMaker implements SweetMaker {
    @Override
    public Sweet createSweet() {
        return new Cake();
    }
}
