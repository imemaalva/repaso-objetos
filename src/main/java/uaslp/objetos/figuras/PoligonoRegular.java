package uaslp.objetos.figuras;


public class PoligonoRegular {

    private double lados;
    private int numLados;
    private double area;
    private double ap;

    public PoligonoRegular(int numLados){
        this.numLados = numLados;
    }
    public PoligonoRegular(int numLados, double lados){
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
