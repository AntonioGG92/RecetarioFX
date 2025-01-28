package org.example.recetariofx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class HelloController {
    @FXML
    private TextField nombreField;

    @FXML
    private TextArea ingredientesArea;

    @FXML
    private TextArea instruccionesArea;

    @FXML
    private Button agregarButton;

    @FXML
    private ListView<String> recetaListView;

    private ObservableList<String> recetas = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        recetaListView.setItems(recetas);
    }

    @FXML
    private void agregarReceta() {
        String nombre = nombreField.getText();
        String ingredientes = ingredientesArea.getText();
        String instrucciones = instruccionesArea.getText();

        if (!nombre.isEmpty() && !ingredientes.isEmpty() && !instrucciones.isEmpty()) {
            String receta = "🍽 " + nombre + " - Ingredientes: " + ingredientes + " | Instrucciones: " + instrucciones;
            recetas.add(receta);

            // Limpiar los campos después de agregar la receta
            nombreField.clear();
            ingredientesArea.clear();
            instruccionesArea.clear();
        }
    }
}
