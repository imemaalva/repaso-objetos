package uaslp.objetos.figuras;

public class Cuadrado {

    private double lado;
    private double area;
    public Cuadrado(){

    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public double getArea(){
        area = lado * lado;
        return area;
    }
}
