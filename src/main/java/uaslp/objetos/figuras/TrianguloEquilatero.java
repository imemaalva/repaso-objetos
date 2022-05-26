package uaslp.objetos.figuras;

public class TrianguloEquilatero extends Triangulo{
    private String description;

    public TrianguloEquilatero(){
        super("Triangulo Equilatero");
    }

    public String getDescription(){
        return "Lados iguales";
    }
}
