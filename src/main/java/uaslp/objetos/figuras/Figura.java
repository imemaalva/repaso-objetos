package uaslp.objetos.figuras;

public class Figura extends DrawableItem {
    private String name;

    public Figura (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
