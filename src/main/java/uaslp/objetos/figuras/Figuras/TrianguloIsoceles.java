package uaslp.objetos.figuras.Figuras;

public class TrianguloIsoceles extends Triangulo{
    private String description;

    public TrianguloIsoceles(){
        super("Triangulo Isoceles");
    }
    public String getDescription(){
        return "2 Lados iguales y 1 diferente";
    }
}
