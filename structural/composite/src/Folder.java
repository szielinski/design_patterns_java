import java.util.Collection;
import java.util.HashSet;

public class Folder extends Component {
    private Collection<Component> children = new HashSet<>();

    public Folder(String path){
        super(path);
    }

    public void add(Component child){
        children.add(child);
    }

    public void remove(Component subComponent){
        if(!children.contains(subComponent)){
            for(Component child : children){
                child.remove(subComponent);
            }
        } else {
            children.remove(subComponent);
        }
    }
    
    public void display(){
        System.out.print(path + "\n");
        for(Component child : children){
            System.out.print(path);
            child.display();
        }
    }
}