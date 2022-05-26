package uaslp.objetos.figuras.Figuras;

import uaslp.objetos.figuras.Exception.AlturaNoProvistaException;
import uaslp.objetos.figuras.Exception.BaseNoProvistaException;

public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double area;
    private String description;

    public Triangulo(){
        super("Triangulo");
    }

    public Triangulo(double base, double altura){
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(String name) {
        super(name);
    }


    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }


    public double getArea() throws BaseNoProvistaException, AlturaNoProvistaException {
        if(base == 0){
            throw new BaseNoProvistaException();
        }
        if(altura == 0){
            throw new AlturaNoProvistaException();
        }
        area = (base * altura)/2;
        return area;
    }

    public String getDescription(){
        return "Cualquier triangulo";
    }
}
