public abstract class Component {
    protected String path;

    public Component(String path){
        this.path = path;
    }

    public void add(Component child){
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public void remove(Component child){
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public abstract void display();
}