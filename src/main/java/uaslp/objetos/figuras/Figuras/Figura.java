package uaslp.objetos.figuras.Figuras;

public class Figura extends DrawableItem {
    private String name;

    public Figura (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
