package es.cic.curso25;

public class Calculadora_Resultados {
    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void sumar(double valor){
        total= total + valor;
    }



}
