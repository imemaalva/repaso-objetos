package uaslp.objetos.figuras;


public class PoligonoRegular extends Figura{

    private double lados;
    private int numLados;
    private double area;

    public PoligonoRegular(){
        super("Poligono Regular");
    }

    public PoligonoRegular(int numLados){
        super("Poligono Regular");
        this.numLados = numLados;
    }
    public PoligonoRegular(int numLados, double lados){
        super("Poligono Regular");
        this.numLados = numLados;
        this.lados = lados;
    }

    public void setLado(double lados){
        this.lados = lados;
    }

    public double getLado (){
        return lados;
    }

    public double getArea(){
        double angle = Math.toRadians(180/numLados);
        angle = Math.tan(angle);

        area = (lados * lados * numLados)/(4 * angle);
        return area;
    }
}
