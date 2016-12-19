public class AppRunner{
    public static void main(String[] args){
        Folder root = new Folder("");
        for(String s : new String[]{ "/bin", "/cdrom", "/etc", "/boot", "/dev", "/home" }){
            Folder f = new Folder(s);
            for(int i=0; i<5; i++){
                f.add(new File("/"+i));
            }
            f.add(new Folder("/tmp"));
            root.add(f);
        }
        root.display();
    }
}