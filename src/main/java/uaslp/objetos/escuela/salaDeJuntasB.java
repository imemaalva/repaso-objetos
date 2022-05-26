package uaslp.objetos.escuela;

public class salaDeJuntasB implements SalaDeJuntas {

        private static uaslp.objetos.escuela.salaDeJuntasB instance;

        @Override
        public String getNombre() {
            return ("Sala B");
        }

        public static uaslp.objetos.escuela.salaDeJuntasB getInstance(){
            if(instance == null){
                instance = new salaDeJuntasB();
            }
            return instance;
        }




}
