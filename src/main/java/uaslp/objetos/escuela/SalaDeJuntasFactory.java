package uaslp.objetos.escuela;

public class SalaDeJuntasFactory{

    public static SalaDeJuntas get(String tipo){
        return switch(tipo){
           case "Sala A" -> salaDeJuntasA.getInstance();
            case "Sala B" ->salaDeJuntasB.getInstance();
            case "Sala C" ->salaDeJuntasC.getInstance();
            default -> null;
        };
    }

}
