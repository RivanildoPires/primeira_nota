package br.edu.fescfafic.cinema.Model;
public class Compra {
    Ingressos ingressos = new Ingressos(25);
    Bomboniere bomboniere = new Bomboniere(12, 8,6);
    public double meia = 0.50;
    public void descontoAplicado(double estudante, double contador){
        double inteiro = ((contador - estudante) * ingressos.ingressoInteiro);
        System.out.printf("O valor dos ingressos inteiros sera de: " +inteiro+ "0R$" +'\n');
        double desconto = (estudante * ingressos.ingressoInteiro)*meia;
        System.out.printf("O desconto sera de: " + desconto +"0R$"+ '\n');
        System.out.println("O valor total sera de: "+ (desconto+inteiro)+"0R$"+ '\n');

    }
    public void pipocaValor(int valor){
        double pipoca = valor * bomboniere.pipoca;
        System.out.printf("Foram "+valor+" pipocas, no total deu: "+pipoca+"0R$"+'\n');
    }
    public  void refrigeranteValor(int valor){
        double refri = valor * bomboniere.refigerante;
        System.out.printf("Foram "+valor+" refrigetantes, no total deu: "+refri+"0R$"+'\n');
    }
    public  void chocolateValor(int valor){
        double chocolate = valor * bomboniere.chocolate;
        System.out.printf("Foram "+valor+" refrigetantes, no total deu: "+chocolate+"0R$"+'\n');
    }
}
