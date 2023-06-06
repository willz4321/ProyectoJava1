/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Autor;
import java.util.ArrayList;
import java.util.Objects;

public class Grupo implements Comparable<Grupo> {
    private String nombre;
    private String descripcion;
    private ArrayList<MiembroEnGrupo> miembrosEnGrupo = new ArrayList<>();

    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public Grupo(String nombre, String descripcion, ArrayList<MiembroEnGrupo> miembrosEnGrupo) {
        this(nombre, descripcion);
        this.miembrosEnGrupo = miembrosEnGrupo;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 17 * hash + Objects.hashCode(this.nombre);
//        return hash;
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Grupo other = (Grupo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        return hash;
    }
    
    public void agregarMiembro (Autor autor, Rol rol) {
        for (MiembroEnGrupo meg : miembrosEnGrupo) {
            if(meg.verAutor().equals(autor)){
                return;
            }
        }
        miembrosEnGrupo.add(new MiembroEnGrupo(autor, this, rol));
        autor.agregarGrupo(this, rol);
    }
    
    public void quitarMiembro (Autor miembro) {
        for (MiembroEnGrupo meg : miembrosEnGrupo) {
            if(meg.verAutor().equals(miembro)){
                miembrosEnGrupo.remove(meg);
                miembro.quitarGrupo(this);
            }
        }
    }
    
    public void verMiembros () {
        System.out.println("Miembros:");
        for (MiembroEnGrupo meg : miembrosEnGrupo) {
            System.out.println(meg.verAutor().verApellidos() + ", " + meg.verAutor().verNombres());
            System.out.println(meg.verRol());
        }
    }
    
    public boolean esSuperAdministradores() {
        if (this.nombre.equals("Super Administradores")) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean tieneMiembros() {
        if (this.miembrosEnGrupo.isEmpty()) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public void mostrar () {
        System.out.println("Grupo: " + this.verNombre());
        System.out.println("Descripción " + this.verDescripcion());
        this.verMiembros();
        System.out.println("\n");
    }

    @Override
    public int compareTo(Grupo g) {
       return this.verNombre().compareTo(g.verNombre());
    }
}
