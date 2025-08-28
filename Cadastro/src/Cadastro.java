import javax.swing.JOptionPane;

public class Cadastro {
    public static void main (String[] args) {
        String nome = JOptionPane.showInputDialog("Qual seu nome? ");
        String sobreNome = JOptionPane.showInputDialog("Qual seu sobrenome? ");
        String nomeCompleto = nome + " " + sobreNome;

        JOptionPane.showMessageDialog(null, nomeCompleto);
    }
}
