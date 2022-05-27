package uaslp.objetos.dependencies;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }

    @Test
    public void algoritmoXAEqualsB(){
        //Given
        int a = 5;
        int b = 5;
        String c = "";
        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1,dependencia2,dependencia3);
        //When
        algoritmoX.algoritmoACubrir(a,b,c);
        //Then
        Mockito.verify(dependencia1).save(c);
        Mockito.verify(dependencia3).recover();
        Mockito.verifyNoMoreInteractions(dependencia1,dependencia2,dependencia3);
    }
    @Test
    public void AlgoritmoXBIsGreaterThanA(){
        //Given
        int a = 6;
        int b = 8;
        String c = "";

        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1,dependencia2,dependencia3);
        //When
        algoritmoX.algoritmoACubrir(a,b,c);
        //Then
        Mockito.verify(dependencia2).print(a, c);
        Mockito.verify(dependencia3).recover();
        Mockito.verifyNoMoreInteractions(dependencia1,dependencia2,dependencia3);
    }

    @Test
    public void AlgoritmoXAIsGreaterThanB(){
        //Given
        int a = 8;
        int b = 6;
        String c = "";

        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1,dependencia2,dependencia3);
        //When
        algoritmoX.algoritmoACubrir(a,b,c);
        //Then
        Mockito.verify(dependencia3).send(a,b);
        Mockito.verify(dependencia3).recover();
        Mockito.verifyNoMoreInteractions(dependencia1,dependencia2,dependencia3);
    }

}
