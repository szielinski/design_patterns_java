public class MeatDecorator extends SandwichDecorator{
    public MeatDecorator(Sandwich sandwich){
        super(sandwich);
    }

    public String make(){
        return sandwich.make() + addMeat();
    }

    public String addMeat(){
        return " + turkey";
    }
}