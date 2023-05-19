package modelo;

public class OperacionesMatematicas {

    //estos son los atributos
    private int num1;
    private int num2;

    // este es el constructor
    public OperacionesMatematicas(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    //estos son los metodos
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getSuma() {return num1 + num2;}

    public int getResta() {return num1 - num2;}

    public int getMultiplicacion() {return num1 * num2;}

    public int getDivision() {return num1 / num2;}

}
