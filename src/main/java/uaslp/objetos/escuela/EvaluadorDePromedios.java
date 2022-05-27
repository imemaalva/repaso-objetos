package uaslp.objetos.escuela;

import java.util.List;

public class EvaluadorDePromedios {
    private double prom;
    private double suma;

    public double evalua(List<Double> calificaciones){
        suma = calificaciones.stream().reduce(0.0, Double::sum);
        prom = suma/calificaciones.size();
        return prom;
    }
}
