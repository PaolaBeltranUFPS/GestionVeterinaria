import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ControllerGestion {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnMostrar;

    @FXML
    private Button btnSalir;

    @FXML
    private TextArea txaMascotas;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtEspecie;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtRaza;
    
    private Gestion gestion;
    private Mascota mascota;
    
    @FXML
    void agregarMascota(ActionEvent event) {
        String nombre = this.txtNombre.getText();
        String especie = this.txtEspecie.getText();
        String edad = this.txtEdad.getText();
        String raza = this.txtRaza.getText();

        Mascota mascota = new Mascota();

        mascota.setNombre(nombre);
        mascota.setEspecie(especie);
        mascota.setEdad(edad);
        mascota.setRaza(raza);
        
        gestion.agregarMascota(mascota);
        JOptionPane.showMessageDialog(null, "Mascota agregada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    @FXML
    void limpiar(ActionEvent event) {
        txtNombre.setText("");
        txtEspecie.setText("");
        txtEdad.setText("");
        txtRaza.setText("");
        txaMascotas.setText("");
    }

    @FXML
    void mostrarMascotas(ActionEvent event) {
        ArrayList<Mascota> mascotas = gestion.getMascotas();
        txaMascotas.setText("");
        if (mascotas.isEmpty()) {
            txaMascotas.setText("No hay mascotas registradas.\n");
        } else {
            for (Mascota mascota : mascotas) {
                txaMascotas.setText(mascota.mostrarInfoMascota());
            }
        }
    }

    @FXML
    void salir(ActionEvent event) {
        System.exit(0);
    }

    private void actualizarGUI(){
        txtNombre.setText(String.valueOf(mascota.getNombre()));
        txtEspecie.setText(String.valueOf(mascota.getEspecie()));
        txtEdad.setText(String.valueOf(mascota.getEdad()));
        txtRaza.setText(String.valueOf(mascota.getRaza()));
    }
    
    @FXML
    void initialize() {
        assert btnAgregar != null : "fx:id=\"btnAgregar\" was not injected: check your FXML file 'gestionVeterinaria.fxml'.";
        assert btnLimpiar != null : "fx:id=\"btnLimpiar\" was not injected: check your FXML file 'gestionVeterinaria.fxml'.";
        assert btnMostrar != null : "fx:id=\"btnMostrar\" was not injected: check your FXML file 'gestionVeterinaria.fxml'.";
        assert btnSalir != null : "fx:id=\"btnSalir\" was not injected: check your FXML file 'gestionVeterinaria.fxml'.";
        assert txaMascotas != null : "fx:id=\"txaMascotas\" was not injected: check your FXML file 'gestionVeterinaria.fxml'.";
        assert txtEdad != null : "fx:id=\"txtEdad\" was not injected: check your FXML file 'gestionVeterinaria.fxml'.";
        assert txtEspecie != null : "fx:id=\"txtEspecie\" was not injected: check your FXML file 'gestionVeterinaria.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'gestionVeterinaria.fxml'.";
        assert txtRaza != null : "fx:id=\"txtRaza\" was not injected: check your FXML file 'gestionVeterinaria.fxml'.";

        gestion = new Gestion();
        mascota = new Mascota();
        actualizarGUI();
    }
}