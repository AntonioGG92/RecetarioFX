package org.example.recetariofx.models;

public class Receta {
    private String nombre;
    private String ingredientes;
    private String instrucciones;

    public Receta(String nombre, String ingredientes, String instrucciones) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.instrucciones = instrucciones;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getIngredientes() { return ingredientes; }
    public void setIngredientes(String ingredientes) { this.ingredientes = ingredientes; }

    public String getInstrucciones() { return instrucciones; }
    public void setInstrucciones(String instrucciones) { this.instrucciones = instrucciones; }

    @Override
    public String toString() {
        return nombre + " - " + ingredientes;
    }
}
