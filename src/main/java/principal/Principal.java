package principal;

import model.Barcos;
import model.Carros;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Principal {

    public static void main(String[] args) {

        Barcos b1 = new Barcos();

        b1.setCor(JOptionPane.showInputDialog("Insira a cor do barco: "));
        b1.setVelocidade(Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade do barco: ")));
        b1.setPeso(Integer.parseInt(JOptionPane.showInputDialog("Insira o peso do barco: ")));

        Carros c1 = new Carros();

        c1.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro: ")));
        c1.setCor(JOptionPane.showInputDialog("Insira a cor do carro: "));
        c1.setModelo(JOptionPane.showInputDialog("Insira o modelo do carro: "));

        JOptionPane.showMessageDialog(null, "Barco:" + "\nCor: " + b1.getCor() + "\nVelocidade: " + b1.getVelocidade() + "km/h" + "\nPeso: " + b1.getPeso() + "kg");

        JOptionPane.showMessageDialog(null, "Carro:" + "\nAno: " + c1.getAno() + "\nCor: " + c1.getCor() + "\nModelo: " + c1.getModelo());
    }

}
