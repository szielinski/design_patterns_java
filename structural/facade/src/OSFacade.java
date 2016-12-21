public class OSFacade {
    private DisplaySubsystem display;
    private MemorySubsystem memory;
    private StorageSubsystem storage;

    public OSFacade(){
        display = new DisplaySubsystem();
        memory = new MemorySubsystem();
        storage = new StorageSubsystem();
    }

    public void showFile(){
        Object file = storage.loadFile("/sampleLocation");
        memory.store(file);
        display.show(file);
    }
}