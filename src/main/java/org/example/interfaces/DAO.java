package org.example.interfaces;

import org.example.entities.Auto;

import java.util.List;

public interface DAO <O,K>{
    //O objeto K key clave primaria

    public List<O> getAll();
    public void insert(O objeto);
    public void update(O objeto);
    public void delete(K id);
    public Auto getById(K id);
    public boolean existsById(K id);

}
