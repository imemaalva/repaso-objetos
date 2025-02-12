package uaslp.objetos.figuras.Figuras;

import uaslp.objetos.figuras.Exception.LadoNoProvistoException;

public class Cuadrado extends Figura{

    private double lado;
    private double area;

    public Cuadrado(){
        super("Cuadrado");
    }

    public Cuadrado(double lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    public void setLado(double lado){

        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public double getArea() throws LadoNoProvistoException {
        if(lado == 0){
            throw new LadoNoProvistoException();
        }
        area = lado * lado;
        return area;
    }
}
