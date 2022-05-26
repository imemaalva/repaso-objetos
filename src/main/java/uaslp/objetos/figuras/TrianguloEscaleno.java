package uaslp.objetos.figuras;

public class TrianguloEscaleno extends Triangulo {
    private String description;

    public TrianguloEscaleno(){
        super("Triangulo Escaleno");
    }

    public String getDescription(){
        return "Lados diferentes";
    }
}
