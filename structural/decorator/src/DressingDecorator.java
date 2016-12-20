public class DressingDecorator extends SandwichDecorator{
    public DressingDecorator(Sandwich sandwich){
        super(sandwich);
    }

    public String make(){
        return sandwich.make() + addDressing();
    }

    public String addDressing(){
        return " + mustard";
    }
}