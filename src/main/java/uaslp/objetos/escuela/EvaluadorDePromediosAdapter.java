package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluadorDePromediosAdapter {

        private EvaluadorDePromedios evaluador;

        public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluador){
            this.evaluador = evaluador;
        }

        public double evalua(String listaDeCalificaciones) {
            List<String> calificaciones = Arrays.asList(listaDeCalificaciones.split(","));
            List<Double> calificacion = new ArrayList<>();

            for(String qualification:calificaciones){
                calificacion.add(Double.parseDouble(qualification));

            }
            return evaluador.evalua(calificacion);
    }

}
