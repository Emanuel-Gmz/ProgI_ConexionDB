package org.example.dao;

public class ClienteDAO {
  private int idCliente;
  private String nombre;
  private String apellido;
  private String telefono;

  public ClienteDAO() {}

  public ClienteDAO(int idCliente, String nombre, String apellido, String telefono) {
    this.idCliente = idCliente;
    this.nombre = nombre;
    this.apellido = apellido;
    this.telefono = telefono;
  }

  // Getters y Setters
  public int getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(int idCliente) {
    this.idCliente = idCliente;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  @Override
  public String toString() {
    return "Cliente{" +
        "idCliente=" + idCliente +
        ", nombre='" + nombre + '\'' +
        ", apellido='" + apellido + '\'' +
        ", telefono='" + telefono + '\'' +
        '}';
  }
}
