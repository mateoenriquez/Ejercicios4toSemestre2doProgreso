import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ventana {
    private JPanel Principal;
    private JTextField txtNombre;
    private JTextField txtNota;
    private JComboBox cboCarrera;
    private JButton btnAgregar;
    private JTextArea txtResultado;
    private JButton btnOrdenar;
    private Clase listaEstudiantes = new Clase();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ventana() {
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = txtNombre.getText();
                    float nota = Float.parseFloat(txtNota.getText());
                    String carrera = cboCarrera.getSelectedItem().toString();
                    listaEstudiantes.agregarEstudiante(new Estudiante(nombre, nota, carrera));
                    txtResultado.setText(listaEstudiantes.listar());
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Ingrese una nota valida");
                }
            }
        });

        btnOrdenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaEstudiantes.ordenarPorNota();
                txtResultado.setText(listaEstudiantes.listar());
            }
        });

    }
}
