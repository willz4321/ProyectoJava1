package grupos.modelos;

import autores.modelos.Autor;

import java.util.Objects;

public class MiembroEnGrupo {
    private Autor autor;
    private Grupo grupo;
    private Rol rol;

    public MiembroEnGrupo(Autor autor, Grupo grupo, Rol rol) {
        this.autor = autor;
        this.rol = rol;
        this.grupo = grupo;
    }
    
    public MiembroEnGrupo(Grupo grupo, Rol rol) {
        this.rol = rol;
        this.grupo = grupo;
    }
    
    public MiembroEnGrupo(Autor autor, Rol rol) {
        this.autor = autor;
        this.rol = rol;
    }

    public Rol verRol() {
        return rol;
    }

    public void asignarRol(Rol rol) {
        this.rol = rol;
    }
    
     public Autor verAutor() {
        return autor;
    }

    public void asignarAutor(Autor autor) {
        this.autor = autor;
    }

    public Grupo verGrupo() {
        return grupo;
    }

    public void asignarGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.autor);
        return hash;
    }

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
        final MiembroEnGrupo other = (MiembroEnGrupo) obj;
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }
    
    public boolean equalsGrupo(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MiembroEnGrupo other = (MiembroEnGrupo) obj;
        if (!Objects.equals(this.grupo, other.grupo)) {
            return false;
        }
        return true;
    }
}
