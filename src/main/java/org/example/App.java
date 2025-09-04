package org.example;

import org.example.configuracion.AdministradorConexiones;
import org.example.dao.AutoDAO;
import org.example.dao.AutoImpl;
import org.example.dao.ClienteImpl;
import org.example.dao.SeguroImpl;
import org.example.entities.Auto;
import org.example.entities.Cliente;
import org.example.entities.Marca;
import org.example.entities.Seguro;

import java.sql.Connection;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Cliente c=new Cliente(10,"Maria10","Perez","12345678");
      ClienteImpl clienteImpl=new ClienteImpl();
      clienteImpl.insert(c);

      System.out.println("----------AGREGANDO SEGURO CON DAO IMPL ----------------");
      Seguro s=new Seguro("Todo riesgo",123450,"El Norte");
      SeguroImpl seguroImpl=new SeguroImpl();
      seguroImpl.insert(s);

      System.out.println("Hello World!");
      Auto auto =
          new Auto("CCCCCC", "Blanco", 2025, 897
              , Marca.Honda, "Fit", c, s);

      System.out.println( auto.toString());

      AutoImpl autoImpl = new AutoImpl();
      autoImpl.insert(auto);



/*

    // guardo en la BD
    AutoDAO autoDAO = new AutoDAO();
    AutoImpl autoImpl = new AutoImpl();
    autoDAO.insertarAuto(auto);
      // recorro la lista de autos
    //List<Auto> miLista = autoDAO.findAll();
    List<Auto> miLista = autoImpl.getAll();
    if (!miLista.isEmpty()) {
      for (Auto auto1 : miLista) {
        System.out.println(auto1.toString());
      }
    }


    //modifica auto
    Auto autoAModificar =
        new Auto( "AABBCC", "Gis", 2024, 897555, Marca.Honda, "Fit",c);

    //autoDAO.update(autoAModificar);
    autoImpl.update(autoAModificar);
    //autoDAO.delete(14);

//    System.out.println("Auto encontrado: " + autoDAO.getById(25).toString());
    System.out.println("Auto encontrado: " + autoImpl.getById(25).toString());

    System.out.println("Lista de autos después de la modificación:");
    // recorro la lista de autos
    miLista = autoDAO.findAll();
    if (!miLista.isEmpty()) {
      for (Auto auto1 : miLista) {
        System.out.println(auto1.toString());
      }
    }
    System.out.println(" ----------AGREGANDO CON DAO IMPL ----------------");
    Auto autoTest=
    new Auto( "CCCCCC", "Blanco", 2025, 0
        , Marca.Toyota, "Corolla", c);
    autoImpl.insert(autoTest);




    System.out.println("----------AGREGANDO SEGURO CON DAO IMPL ----------------");
    Seguro s=new Seguro("Todo riesgo",123450,"Mapfre");
    SeguroImpl seguroImpl=new SeguroImpl();
    seguroImpl.insert(s);

    System.out.println("Lista de cliente después de insertar con DAO IMPL:");

*/
    }
}
