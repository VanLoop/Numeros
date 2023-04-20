import javax.swing.*;

public class Ventana extends JFrame{
    private JTextField textField1;
    private JTextArea textArea1;
    private JRadioButton numerosParesRadioButton;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;
    private JButton button1;
    private JPanel panelP;

    public Ventana() {

        super("Cuestionario");
        setContentPane(panelP);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public void pares(int sup)
    {
        int[] lista;
        for(int i = 0; i != sup; i++){
            if( i%2 == 0){

            }
        }
    }
}


