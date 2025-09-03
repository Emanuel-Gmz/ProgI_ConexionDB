package org.example.dao;

import org.example.entities.Auto;
import org.example.entities.Seguro;
import org.example.interfaces.AdmConexion;
import org.example.interfaces.DAO;

import java.sql.Connection;
import java.util.List;

public class SeguroImpl implements DAO<Seguro,Integer>, AdmConexion {
  private Connection conn= null;

  /*private static final String SQL_INSERT=
      "INSERT INTO autos (patente,color,anio,kilometraje,marca,modelo) " +
          "VALUES            (      ?,        ?,    ?,   ?,        ?,      ?)";


  private static  final String  SQL_UPDATE= "UPDATE autos SET " +
      "patente = ? , color = ? , anio = ? , kilometraje = ? " +
      " , marca = ? , modelo = ? " +
      "  WHERE idAuto = ? " ;

  private static  final String  SQL_DELETE= "DELETE FROM autos  WHERE idAuto = ? " ;
  private static  final String  SQL_GETALL= "SELECT * FROM autos ORDER BY patente" ;
  private  static final String  SQL_GETBYID= "SELECT * FROM autos WHERE idAuto = ? " ;

   */

  @Override
  public List<Seguro> getAll() {
    List<Seguro> listaSeguros = new java.util.ArrayList<>();
    return listaSeguros;
  }

  @Override
  public void insert(Seguro objeto) {

  }

  @Override
  public void update(Seguro objeto) {

  }

  @Override
  public void delete(Integer id) {

  }

  @Override
  public Auto getById(Integer id) {
    return null;
  }

  @Override
  public boolean existsById(Integer id) {
    return false;
  }

  @Override
  public Connection obtenerConexion() {
    return AdmConexion.super.obtenerConexion();
  }
}
