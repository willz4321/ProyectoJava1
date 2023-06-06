package principal.controladores;
import autores.modelos.Alumno;
import autores.modelos.Autor;
import autores.modelos.Cargo;
import autores.modelos.GestorAutores;
import autores.modelos.Profesor;
import grupos.modelos.GestorGrupos;
import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import idiomas.modelos.GestorIdiomas;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lugares.modelos.GestorLugares;
import palabrasclaves.modelos.GestorPalabrasClaves;
import palabrasclaves.modelos.PalabraClave;
import publicaciones.modelos.GestorPublicaciones;
import publicaciones.modelos.Publicacion;
import tipos.modelos.GestorTipos;

//<editor-fold defaultstate="collapsed" desc="Trabajo Práctico N° 4">
//TP N° 4
//package principal.controladores;
//
//import autores.modelos.Cargo;
//import autores.modelos.GestorAutores;
//import grupos.modelos.GestorGrupos;
//import idiomas.modelos.GestorIdiomas;
//import lugares.modelos.GestorLugares;
//import palabrasclaves.modelos.GestorPalabrasClaves;
//import tipos.modelos.GestorTipos;
//

//public class ControladorPrincipal {
//    public static void main(String[] args) {
//    
//    //<editor-fold defaultstate="collapsed" desc="Sin intefaz gráfica"> 
//        ArrayList<Grupo> grupos = new ArrayList<>();
//        ArrayList<Autor> autores = new ArrayList<>();
//        ArrayList<Tipo> tipos = new ArrayList<>();
//        ArrayList<Lugar> lugares = new ArrayList<>();
//        ArrayList<Idioma> idiomas = new ArrayList<>();
//        ArrayList<PalabraClave> palabrasClaves = new ArrayList<>();
//        ArrayList<Publicacion> publicaciones = new ArrayList<>();
//        
//        System.out.println("------------------GRUPOS------------------");
//        
//        Grupo grupo1 = new Grupo("Grupo 1", "Descripción 1");
//        Grupo grupo2 = new Grupo("Grupo 2", "Descripción 2");
//        Grupo grupo3 = new Grupo("Grupo 3", "Descripción 3");
//        Grupo grupo4 = new Grupo("Grupo 4", "Descripción 4");
//        Grupo grupo5 = new Grupo("Grupo 5", "Descripción 5");
//        Grupo grupo6 = new Grupo("Grupo 1", "Descripción 5"); //nombre repetido
//        
//        if (!grupos.contains(grupo1))
//            grupos.add(grupo1);
//        if (!grupos.contains(grupo2))
//            grupos.add(grupo2);
//        if (!grupos.contains(grupo3))
//            grupos.add(grupo3);
//        if (!grupos.contains(grupo4))
//            grupos.add(grupo4);
//        if (!grupos.contains(grupo5))
//            grupos.add(grupo5);
//        if (!grupos.contains(grupo6))
//            grupos.add(grupo6);
//        
//        for(Grupo g : grupos){
//            g.mostrar();
//            System.out.println("\n");
//        }
//        
//        System.out.println("\n\n------------------AUTORES------------------");
//        Autor alumno1 = new Alumno(1, "Apellido1", "Nombre1", "Clave1", "1");
//        Autor alumno2 = new Alumno(2, "Apellido2", "Nombre2", "Clave2", "2");
//        Autor alumno3 = new Alumno(3, "Apellido3", "Nombre3", "Clave3", "3");
//        Autor alumno4 = new Alumno(4, "Apellido4", "Nombre4", "Clave4", "4");
//        Autor alumno5 = new Alumno(5, "Apellido5", "Nombre5", "Clave5", "5");
//        Autor alumno6 = new Alumno(1, "Apellido6", "Nombre6", "Clave6", "6");
//        //dni repetido con un alumno
//        
//        if (!autores.contains(alumno1))
//            autores.add(alumno1);
//        if (!autores.contains(alumno2))
//            autores.add(alumno2);
//        if (!autores.contains(alumno3))
//            autores.add(alumno3);
//        if (!autores.contains(alumno4))
//            autores.add(alumno4);
//        if (!autores.contains(alumno5))
//            autores.add(alumno5);
//        if (!autores.contains(alumno6))
//            autores.add(alumno6);
//        
//        Autor profesor1 = new Profesor(10, "Apellido10", "Nombre10", "Clave10", Cargo.TITULAR);
//        Autor profesor2 = new Profesor(20, "Apellido20", "Nombre20", "Clave20", Cargo.ASOCIADO);
//        Autor profesor3 = new Profesor(30, "Apellido30", "Nombre30", "Clave30", Cargo.ADJUNTO);
//        Autor profesor4 = new Profesor(40, "Apellido40", "Nombre40", "Clave40", Cargo.JTP);
//        Autor profesor5 = new Profesor(50, "Apellido50", "Nombre50", "Clave50", Cargo.ADG);
//        Autor profesor6 = new Profesor(10, "Apellido60", "Nombre60", "Clave60", Cargo.ADG); 
//        //dni repetido con otro profesor
//        Autor profesor7 = new Profesor(1, "Apellido70", "Nombre70", "Clave70", Cargo.ADG); 
//        //dni repetido con otro alumno
//        Autor alumno7 = new Alumno(50, "Apellido7", "Nombre7", "Clave7", "7");
//        //dni repetido con un profesor
//        Autor alumno8 = new Alumno(8, "Apellido8", "Nombre8", "Clave8", "5");
//        //cx repetido con un alumno
//        
//        if (!autores.contains(profesor1))
//            autores.add(profesor1);
//        if (!autores.contains(profesor2))
//            autores.add(profesor2);
//        if (!autores.contains(profesor3))
//            autores.add(profesor3);
//        if (!autores.contains(profesor4))
//            autores.add(profesor4);
//        if (!autores.contains(profesor5))
//            autores.add(profesor5);
//        if (!autores.contains(profesor6))
//            autores.add(profesor6);
//        
//        if (!autores.contains(profesor7))
//            autores.add(profesor7);
//        if (!autores.contains(alumno7))
//            autores.add(alumno7);
//        if (!autores.contains(alumno8))
//            autores.add(alumno8);
//        
//        
//        for(Autor a : autores)
//            a.mostrar();
//      
//        System.out.println("\n\n------------------METODOS VARIOS------------------");
//        /*Main parte 3*/
//        /*Luego de crear grupos y autores, tomar 1 grupo y agregarle 2 autores 
//        como miembros. Mostrar el grupo verificando que tenga los miembros 
//        asignados. Verificar también que no se pueda agregar 
//        un mismo autor más de una vez, por más que sean en roles distintos.*/
//        System.out.println("\n\n-----AGREGAR MIEMBRO-----");
//        grupo1.agregarMiembro(profesor1, Rol.ADMINISTRADOR);
//        grupo1.agregarMiembro(profesor1, Rol.COLABORADOR); //autor repetido
//        grupo1.agregarMiembro(alumno1, Rol.COLABORADOR);
//        grupo1.mostrar();
//        
//        /*Tomar 1 de los 2 autores que se asignó al grupo anterior y 
//        agregarlo a otro grupo distinto. 
//        Mostrar los 2 autores verificando que pertenezcan a los grupos
//        a los que fueron asignados. 
//        Verificar también que no se pueda agregarle a un autor 
//        un mismo grupo más de una vez, por más que sean roles distintos.*/
//
//        System.out.println("\n\n-----AGREGAR GRUPO-----");
//        profesor1.agregarGrupo(grupo2, Rol.COLABORADOR);
//        profesor1.agregarGrupo(grupo2, Rol.ADMINISTRADOR); //grupo repetido
//        profesor1.mostrar();
//        profesor2.mostrar();
//        
//        /*
//        Tomar el grupo al que se le agregaron los 2 autores como miembros, 
//        quitarle 1 y mostrarlo, verificando que el autor 
//        ya no es miembro del grupo.
//        */
//        System.out.println("\n\n-----QUITAR MIEMBRO-----");
//        grupo1.quitarMiembro(profesor1);
//        grupo1.mostrar();
//
//        /*
//        Crear un nuevo grupo para los super administradores. 
//        Este grupo DEBE llevar por nombre "Super Administradores". 
//        Intentar asignarle como miembro un autor cualquiera
//        con el rol de colaborador, verificando que se lo
//        agrega pero con el rol de administrador.
//        */
//        System.out.println("\n\n-----SUPER ADMINISTRADORES-----");
//        Grupo grupo7 = new Grupo("Super Administradores", "Grupo para los super administradores"); //grupo para los super administradores
//        if (!grupos.contains(grupo7))
//            grupos.add(grupo7);
//        grupo7.agregarMiembro(profesor1, Rol.COLABORADOR);
//        grupo7.mostrar();
//
//        /*
//        Verificar que el último grupo creado es de super administradores
//        y cualquiera de los otros grupos no 
//        (usar el método esSuperAdministradores() definido en la clase Grupo).
//        */
//        System.out.println("\n\n-----VERIFICA GRUPO SUPER ADMINISTRADORES-----");
//        System.out.println(grupo7.esSuperAdministradores());
//        System.out.println(grupo1.esSuperAdministradores());
//        
//        /*Tomar el autor que se agregó al grupo de super administradores, 
//        verificar que el mismo es super administrador 
//        y los otros autores no (usar el método esSuperAdministrador() 
//        definido en la clase Autor).*/
//        System.out.println("\n\n-----VERIFICA MIEMBROS SUPER ADMINISTRADORES-----");
//        System.out.println(profesor1.esSuperAdministrador());
//        System.out.println(alumno1.esSuperAdministrador());
//
//        /*Main parte 3*/
//        System.out.println("------------------TIPOS------------------");
//        Tipo tipo1 = new Tipo("Tipo 1");
//        Tipo tipo2 = new Tipo("Tipo 2");
//        Tipo tipo3 = new Tipo("Tipo 3");
//        Tipo tipo4 = new Tipo("Tipo 4");
//        Tipo tipo5 = new Tipo("Tipo 5");
//        Tipo tipo6 = new Tipo("Tipo 1"); //nombre repetido
//        
//        if (!tipos.contains(tipo1))
//            tipos.add(tipo1);
//        if (!tipos.contains(tipo2))
//            tipos.add(tipo2);
//        if (!tipos.contains(tipo3))
//            tipos.add(tipo3);
//        if (!tipos.contains(tipo4))
//            tipos.add(tipo4);
//        if (!tipos.contains(tipo5))
//            tipos.add(tipo5);
//        if (!tipos.contains(tipo6))
//            tipos.add(tipo6);
//        
//        for(Tipo t : tipos)
//            System.out.println(t);
//        
//        System.out.println("------------------LUGARES------------------");
//        Lugar lugar1 = new Lugar("Lugar 1");
//        Lugar lugar2 = new Lugar("Lugar 2");
//        Lugar lugar3 = new Lugar("Lugar 3");
//        Lugar lugar4 = new Lugar("Lugar 4");
//        Lugar lugar5 = new Lugar("Lugar 5");
//        Lugar lugar6 = new Lugar("Lugar 1"); //nombre repetido
//        
//        if (!lugares.contains(lugar1))
//            lugares.add(lugar1);
//        if (!lugares.contains(lugar2))
//            lugares.add(lugar2);
//        if (!lugares.contains(lugar3))
//            lugares.add(lugar3);
//        if (!lugares.contains(lugar4))
//            lugares.add(lugar4);
//        if (!lugares.contains(lugar5))
//            lugares.add(lugar5);
//        if (!lugares.contains(lugar6))
//            lugares.add(lugar6);
//        
//        for(Lugar l : lugares)
//            System.out.println(l);
//        
//        System.out.println("------------------IDIOMAS------------------");
//        Idioma idioma1 = new Idioma("Idioma 1");
//        Idioma idioma2 = new Idioma("Idioma 2");
//        Idioma idioma3 = new Idioma("Idioma 3");
//        Idioma idioma4 = new Idioma("Idioma 4");
//        Idioma idioma5 = new Idioma("Idioma 5");
//        Idioma idioma6 = new Idioma("Idioma 1"); //nombre repetido
//        
//        if (!idiomas.contains(idioma1))
//            idiomas.add(idioma1);
//        if (!idiomas.contains(idioma2))
//            idiomas.add(idioma2);
//        if (!idiomas.contains(idioma3))
//            idiomas.add(idioma3);
//        if (!idiomas.contains(idioma4))
//            idiomas.add(idioma4);
//        if (!idiomas.contains(idioma5))
//            idiomas.add(idioma5);
//        if (!idiomas.contains(idioma6))
//            idiomas.add(idioma6);
//        
//        for(Idioma i : idiomas)
//            System.out.println(i);        
//       
//        System.out.println("------------------PALABRAS CLAVE------------------");
//        PalabraClave palabraClave1 = new PalabraClave("PalabraClave1");
//        PalabraClave palabraClave2 = new PalabraClave("PalabraClave2");
//        PalabraClave palabraClave3 = new PalabraClave("PalabraClave3");
//        PalabraClave palabraClave4 = new PalabraClave("PalabraClave4");
//        PalabraClave palabraClave5 = new PalabraClave("PalabraClave5");
//        PalabraClave palabraClave6 = new PalabraClave("PalabraClave1"); //nombre repetido
//        
//        if (!palabrasClaves.contains(palabraClave1))
//            palabrasClaves.add(palabraClave1);
//        if (!palabrasClaves.contains(palabraClave2))
//            palabrasClaves.add(palabraClave2);
//        if (!palabrasClaves.contains(palabraClave3))
//            palabrasClaves.add(palabraClave3);
//        if (!palabrasClaves.contains(palabraClave4))
//            palabrasClaves.add(palabraClave4);
//        if (!palabrasClaves.contains(palabraClave5))
//            palabrasClaves.add(palabraClave5);
//        if (!palabrasClaves.contains(palabraClave6))
//            palabrasClaves.add(palabraClave6);
//        
//        for(PalabraClave pc : palabrasClaves)
//            System.out.println(pc);  
//        
//        System.out.println("------------------PUBLICACIONES------------------");
//          //PUBLICACION 1
//        MiembroEnGrupo mg1=new MiembroEnGrupo(autores.get(0), grupos.get(0), Rol.ADMINISTRADOR);
//        LocalDate fecha1= LocalDate.of(2020, 06, 24);
//        ArrayList<PalabraClave> palabras1 =new ArrayList<>();
//        palabras1.add(palabraClave1);
//        palabras1.add(palabraClave2);
//        palabras1.add(palabraClave3);
//        Publicacion publicacion1 = new Publicacion("Título 1",mg1, fecha1, tipos.get(0), idiomas.get(0), lugares.get(0), palabras1, "Enlace 1", "Resumen 1");
//        //PUBLICACION 1
//        
//        //PUBLICACION 2
//        MiembroEnGrupo mg2=new MiembroEnGrupo(autores.get(1), grupos.get(0), Rol.ADMINISTRADOR);
//        LocalDate fecha2= LocalDate.of(2020, 06, 24);
//        ArrayList<PalabraClave> palabras2=new ArrayList<>();
//        palabras2.add(palabraClave4);
//        palabras2.add(palabraClave5);
//        palabras2.add(palabraClave1);
//             
//        Publicacion publicacion2 = new Publicacion("Título 2", mg2, fecha2, tipos.get(1), idiomas.get(1), lugares.get(1), palabras2, "Enlace 2", "Resumen 2");
//        //PUBLICACION 2
//
//        //PUBLICACION 3
//        MiembroEnGrupo mg3 = new MiembroEnGrupo(autores.get(2), grupo2, Rol.COLABORADOR);
//        LocalDate fecha3= LocalDate.of(2020, 06, 24);
//        PalabraClave [] listaPalabras3 =new PalabraClave []{palabrasClaves.get(1), palabrasClaves.get(3), palabrasClaves.get(4)};
//        ArrayList<PalabraClave> palabras3=new ArrayList<>();
//        palabras3.add(palabrasClaves.get(1));
//        palabras3.add(palabrasClaves.get(3));
//        palabras3.add(palabrasClaves.get(4));
//        
//        Publicacion publicacion3 = new Publicacion("Título 3",mg3, fecha3 , tipos.get(0), idiomas.get(1), lugares.get(1), palabras3, "Enlace 3", "Resumen 3");
//        //PUBLICACION 3
//        
//        //PUBLICACION 4
//        MiembroEnGrupo mg4 = new MiembroEnGrupo(autores.get(3), grupos.get(3), Rol.COLABORADOR);
//        LocalDate fecha4= LocalDate.of(2020, 03, 15);
//        ArrayList<PalabraClave> palabras4=new ArrayList<>();
//        palabras4.add(palabrasClaves.get(1));
//        
//        Publicacion publicacion4 = new Publicacion("Título 4", mg4, fecha4, tipos.get(4), idiomas.get(2), lugares.get(4),palabras4, "Enlace 4", "Resumen 4");
//        //PUBLICACION 4
//        //PUBLICACION 5
//        MiembroEnGrupo mg5 = new MiembroEnGrupo(autores.get(5), grupos.get(4), Rol.COLABORADOR);
//        LocalDate fecha5= LocalDate.of(2020, 8, 15);
//        ArrayList<PalabraClave> palabras5=new ArrayList<>();
//        palabras5.add(palabrasClaves.get(2));
//        palabras5.add(palabrasClaves.get(3));
//        palabras5.add(palabrasClaves.get(4));
//                
//        Publicacion publicacion5 = new Publicacion("Título 5", mg5, fecha5, tipos.get(4), idiomas.get(2), lugares.get(4), palabras5, "Enlace 5", "Resumen 5");
//        //PUBLICACION 5
//        //PUBLICACION 6
//        MiembroEnGrupo mg6 = new MiembroEnGrupo(autores.get(5), grupos.get(4), Rol.COLABORADOR);
//        LocalDate fecha6= LocalDate.of(2020, 8, 18);
//        ArrayList<PalabraClave> palabras6=new ArrayList<>();
//        palabras6.add(palabrasClaves.get(2));
//        palabras6.add(palabrasClaves.get(4));
//                
//        Publicacion publicacion6 = new Publicacion("Título 1", mg6, fecha6, tipos.get(4), idiomas.get(3), lugares.get(3), palabras6, "Enlace 5", "Resumen 5"); //título repetido
//        //PUBLICACION 6
//        
//        if (!publicaciones.contains(publicacion1))
//            publicaciones.add(publicacion1);
//        if (!publicaciones.contains(publicacion2))
//            publicaciones.add(publicacion2);
//        if (!publicaciones.contains(publicacion3))
//            publicaciones.add(publicacion3);
//        if (!publicaciones.contains(publicacion4))
//            publicaciones.add(publicacion4);
//        if (!publicaciones.contains(publicacion5))
//            publicaciones.add(publicacion5);
//        if (!publicaciones.contains(publicacion6))
//            publicaciones.add(publicacion6);
//      
//        for(Publicacion p : publicaciones) {
//            p.mostrar();
//            System.out.println();
//        }
//
//      //</editor-fold>   
//        
//    //     //<editor-fold defaultstate="collapsed" desc="Intefaz gráfica"> 
////         VentanaAMGrupo ventanaGrupo = new VentanaAMGrupo(null); //se instancia la ventana
/////*
//////        ventanaGrupo.setLocationRelativeTo(null); //se centra la ventana
//////        ventanaGrupo.setVisible(true); //se hace visible la ventana
////        
//////        VentanaAMAlumno ventanaAlumno = new VentanaAMAlumno(null); //se instancia la ventana
//////        ventanaAlumno.setLocationRelativeTo(null); //se centra la ventana
//////        ventanaAlumno.setVisible(true); //se hace visible la ventana
////*/        
////        VentanaAMProfesor ventanaProfesor = new VentanaAMProfesor(null); //se instancia la ventana
////        ventanaProfesor.setLocationRelativeTo(null); //se centra la ventana
////        ventanaProfesor.setVisible(true); //se hace visible la ventana        
/////*        
//////        VentanaAIdioma ventanaIdioma = new VentanaAIdioma(null); //se instancia la ventana
//////        ventanaIdioma.setLocationRelativeTo(null); //se centra la ventana
//////        ventanaIdioma.setVisible(true); //se hace visible la ventana                
////        
//////        VentanaALugar ventanaLugar = new VentanaALugar(null); //se instancia la ventana
//////        ventanaLugar.setLocationRelativeTo(null); //se centra la ventana
//////        ventanaLugar.setVisible(true); //se hace visible la ventana                        
////        
//////        VentanaAPalabraClave ventanaPalabraClave = new VentanaAPalabraClave(null); //se instancia la ventana
//////        ventanaPalabraClave.setLocationRelativeTo(null); //se centra la ventana
//////        ventanaPalabraClave.setVisible(true); //se hace visible la ventana                                
////        
//////        VentanaATipo ventanaTipo = new VentanaATipo(null); //se instancia la ventana
//////        ventanaTipo.setLocationRelativeTo(null); //se centra la ventana
//////        ventanaTipo.setVisible(true); //se hace visible la ventana   
////*/
////
////     //</editor-fold>
//    }
//}
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Trabajo Práctico N°5">
//TP N° 5
//public class ControladorPrincipal {
//    public static void main (String[] args) {
//        System.out.println("-----Tipos-----");
//        
//        GestorTipos gt1 = GestorTipos.crear();
//        GestorTipos gt2 = GestorTipos.crear();
//        
//        System.out.println(gt1.nuevoTipo("Tipo 1"));
//        System.out.println(gt1.nuevoTipo("Tipo 1"));//Repetido
//        System.out.println(gt1.nuevoTipo("Tipo 2"));
//        System.out.println(gt1.nuevoTipo(""));//En blanco
//        System.out.println(gt1.nuevoTipo(null));//Null
//        System.out.println(gt1.verTipos());//Muestra todos los tipos
//        System.out.println(gt1.verTipo("Tipo 1"));//Busca un tipo
//        System.out.println(gt1.verTipo("Tipo 3"));//Busca un tipo inexistente
//        System.out.println("\n\n");
//        
//        System.out.println("-----Palabras Claves-----");
//        
//        GestorPalabrasClaves gpc1 = GestorPalabrasClaves.crear();
//        GestorPalabrasClaves gpc2 = GestorPalabrasClaves.crear();
//        
//        System.out.println(gpc1.nuevaPalabraClave("Palabra Clave 1"));
//        System.out.println(gpc1.nuevaPalabraClave("Palabra Clave 1"));//Repetido
//        System.out.println(gpc1.nuevaPalabraClave("Palabra Clave 2"));
//        System.out.println(gpc1.nuevaPalabraClave(""));//En blanco
//        System.out.println(gpc1.nuevaPalabraClave(null));//Null
//        System.out.println(gpc1.verPalabrasClaves());//Muestra todos los tipos
//        System.out.println(gpc1.verPalabraClave("Palabra Clave 1"));//Busca un tipo
//        System.out.println(gpc1.verPalabraClave("Palabra Clave 3"));//Busca un tipo inexistente
//        System.out.println("\n\n");
//        
//        System.out.println("-----Grupos-----");
//        
//        GestorGrupos gg1 = GestorGrupos.crear();
//        GestorGrupos gg2 = GestorGrupos.crear();
//        
//        System.out.println(gg1.nuevoGrupo("Grupo 1", "Descripción 1"));
//        System.out.println(gg1.nuevoGrupo("Grupo 1", "Descripción 1"));//Repetido
//        System.out.println(gg1.nuevoGrupo("", "Descripción 1"));//Vacio
//        System.out.println(gg1.nuevoGrupo(null, "Descripción 1"));//null
//        System.out.println(gg1.nuevoGrupo("Grupo 2", "Descripción 1"));
//        System.out.println(gg1.modificarGrupo(gg1.verGrupo("Grupo 2"), "Descripción 2"));//Modifico
//        System.out.println(gg1.verGrupos());//Muestra todos los grupos
//        System.out.println(gg1.verGrupo("Grupo 2"));//Muestra un grupo
//        System.out.println(gg1.verGrupo("Grupo 3"));//Muestra un grupo inexistente
//        System.out.println(gg1.existeEsteGrupo(gg1.verGrupo("Grupo 1")));//Busca un grupo
//        System.out.println(gg1.existeEsteGrupo(gg1.verGrupo("Grupo 3")));//Busca un grupo inexistente
//        System.out.println("\n\n");
//        
//        System.out.println("-----Autores-----");
//        
//        GestorAutores ga1 = GestorAutores.crear();
//        GestorAutores ga2 = GestorAutores.crear();
//        System.out.println("\n");
//        
//        System.out.println("-----Profesores-----");
//        System.out.println(ga1.nuevoAutor(10, "Apellido 10", "Nombre 10", Cargo.ADG, "123", "123"));
//        System.out.println(ga1.nuevoAutor(10, null, "Nombre 10", Cargo.ADG, "123", "123"));//null
//        System.out.println(ga1.nuevoAutor(10, "Apellido 10", "Nombre 10", Cargo.ADG, "123", "1234"));//Claves distintas
//        System.out.println(ga1.nuevoAutor(10, "Apellido 10", "Nombre 10", Cargo.ADG, "123", "123"));//existente
//        System.out.println(ga1.nuevoAutor(10, "Apellido 10", "", Cargo.ADG, "123", "123"));//en blanco
//        System.out.println(ga1.nuevoAutor(20, "Apellido 20", "Nombre 20", Cargo.ADJUNTO, "123", "123"));
//        System.out.println("\n");
//        
//        System.out.println("-----Alumnos-----");
//        System.out.println(ga1.nuevoAutor(1, "Apellido 1", "Nombre 1", "1-1", "123", "123"));
//        System.out.println(ga1.nuevoAutor(1, null, "Nombre 1", "1-1", "123", "123"));//null
//        System.out.println(ga1.nuevoAutor(1, "Apellido 1", "Nombre 1", "1-1", "123", "1234"));//Claves distintas
//        System.out.println(ga1.nuevoAutor(1, "Apellido 1", "Nombre 1", "1-1", "123", "123"));//existente
//        System.out.println(ga1.nuevoAutor(1, "Apellido 1", "", "1-1", "123", "123"));//en blanco
//        System.out.println(ga1.nuevoAutor(2, "Apellido 2", "Nombre 2", "2-2", "123", "123"));
//        System.out.println("\n");
//        
//        System.out.println("-----Mostrar-----");
//        System.out.println(ga1.verAutores());
//        System.out.println(ga1.verProfesores());
//        System.out.println(ga1.verAlumnos());
//        System.out.println(ga1.verAutor(1));
//        System.out.println(ga1.verAutor(2));
//        System.out.println(ga1.verAutor(10));
//        System.out.println(ga1.verAutor(20));
//        System.out.println(ga1.existeEsteAutor(ga1.verAutor(1)));
//        System.out.println(ga1.existeEsteAutor(ga1.verAutor(5)));//Ver inexistente
//        System.out.println("\n");
//        
//        System.out.println("-----Modificar-----");
//        System.out.println(ga1.modificarAutor(ga1.verAutor(10), "Ape 10", "Nom 10", Cargo.ADG, "123", "123"));//Modifico profesor
//        System.out.println(ga1.modificarAutor(ga1.verAutor(50), "Ape 10", "Nom 10", Cargo.ADG, "123", "123"));//Modifico profesor inexistente
//        System.out.println(ga1.modificarAutor(ga1.verAutor(1), "Ape 1", "Nom 1", "1-1", "123", "123"));//Modifico alumno
//        System.out.println(ga1.modificarAutor(ga1.verAutor(5), "Ape 1", "Nom 1", "1-1", "123", "123"));//Modifico alumno inexistente
//        System.out.println(ga1.verAutores());
//        System.out.println(ga1.verProfesores());
//        System.out.println(ga1.verAlumnos());
//        System.out.println("\n\n");
//        
//        System.out.println("-----Idiomas-----");
//        
//        GestorIdiomas gi1 = GestorIdiomas.crear();
//        GestorIdiomas gi2 = GestorIdiomas.crear();
//        
//        System.out.println(gi1.nuevoIdioma("Español"));
//        System.out.println(gi1.nuevoIdioma("Español"));;//Repetido
//        System.out.println(gi1.nuevoIdioma("Ingles"));
//        System.out.println(gi1.nuevoIdioma(""));//En blanco
//        System.out.println(gi1.nuevoIdioma(null));//Null
//        System.out.println(gi1.verIdiomas());//Muestra todos los idiomas
//        System.out.println(gi1.verIdioma("Ingles"));//Busca un idioma
//        System.out.println(gi1.verIdioma("Aleman"));//Busca un idioma inexistente
//        System.out.println("\n\n");
//        
//        System.out.println("-----Lugares-----");
//        
//        GestorLugares gl1 = GestorLugares.crear();
//        GestorLugares gl2 = GestorLugares.crear();
//        
//        System.out.println(gl1.nuevoLugar("Lugar 1"));
//        System.out.println(gl1.nuevoLugar("Lugar 1"));;//Repetido
//        System.out.println(gl1.nuevoLugar("Lugar 2"));
//        System.out.println(gl1.nuevoLugar(""));//En blanco
//        System.out.println(gl1.nuevoLugar(null));//Null
//        System.out.println(gl1.verLugares());//Muestra todos los lugares
//        System.out.println(gl1.verLugar("Lugar 1"));//Busca un lugar
//        System.out.println(gl1.verLugar("Lugar 3"));//Busca un lugar inexistente
//        System.out.println("\n\n");
//        
//    }
//}
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Parcial N° 1">
//Parcial N° 1
//package principal.controladores;
//
//import autores.controladores.ControladorAutores;
//import interfaces.IControladorPrincipal;
//import java.awt.event.ActionEvent;
//import principal.vistas.VentanaPrincipal;
//import principal.vistas.VentanaSalir;
//
//public class ControladorPrincipal implements IControladorPrincipal{
//    
//    private VentanaPrincipal ventana;
//    
//    public ControladorPrincipal() {
//        this.ventana = new VentanaPrincipal(this);
//        this.ventana.setLocationRelativeTo(null);
//        this.ventana.setVisible(true);
//    }
//    
//    @Override
//    public void btnAutoresClic(ActionEvent evt) {
//        ControladorAutores autores = new ControladorAutores();
//    }
//
//    @Override
//    public void btnSalirClic(ActionEvent evt) {
//        ControladorSalir salir = new ControladorSalir();
//    }
//}
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Trabajo Práctico N° 6">
//TP N° 6
//public class ControladorPrincipal {
//    public static void main (String[] args) {
//        System.out.println("-----Tipos-----");
//        
//        GestorTipos gt1 = GestorTipos.crear();
//        GestorTipos gt2 = GestorTipos.crear();
//        
//        System.out.println(gt1.nuevoTipo("Tipo 2"));//Exito
//        System.out.println(gt2.nuevoTipo("Tipo 5"));//Exito
//        System.out.println(gt1.nuevoTipo("Tipo 1"));//Exito
//        System.out.println(gt2.nuevoTipo("Tipo 4"));//Exito
//        System.out.println(gt1.nuevoTipo("Tipo 3"));//Exito
//        
//        System.out.println(gt2.nuevoTipo("Tipo 2"));//Repetido
//        System.out.println(gt2.nuevoTipo(""));//Invalido
//        System.out.println(gt1.nuevoTipo(null));//Invalido
//        System.out.println(gt2.verTipos());//Muestra todos los tipos alfabéticamente
//        System.out.println(gt1.verTipo("Tipo 1"));//Busca un tipo
//        System.out.println(gt2.verTipo("Tipo 6"));//Busca un tipo inexistente
//        System.out.println(gt1.borrarTipo(gt1.verTipo("Tipo 1")));//Borra Tipo1
//        System.out.println(gt2.verTipos());//Muestra todos los tipos alfabéticamente
//        System.out.println(gt1.borrarTipo(gt1.verTipo("Tipo 1")));//Borra inexistente
//        System.out.println(gt2.verTipos());//Muestra todos los tipos alfabéticamente
//        System.out.println(gt2.buscarTipos("4"));//Busca un tipo
//        System.out.println(gt1.existeEsteTipo(gt1.verTipo("Tipo 1")));//No existe
//        System.out.println(gt2.existeEsteTipo(gt2.verTipo("Tipo 2")));//Existe
//        System.out.println("\n\n");
//        
//        
//        
//        System.out.println("-----Palabras Claves-----");
//        
//        GestorPalabrasClaves gpc1 = GestorPalabrasClaves.crear();
//        GestorPalabrasClaves gpc2 = GestorPalabrasClaves.crear();
//        
//        System.out.println(gpc1.nuevaPalabraClave("PC 5"));//Exito
//        System.out.println(gpc2.nuevaPalabraClave("PC 2"));//Exito
//        System.out.println(gpc1.nuevaPalabraClave("PC 4"));//Exito
//        System.out.println(gpc2.nuevaPalabraClave("PC 1"));//Exito
//        System.out.println(gpc1.nuevaPalabraClave("PC 3"));//Exito
//        
//        System.out.println(gpc1.nuevaPalabraClave("PC 2"));//Repetido
//        System.out.println(gpc1.nuevaPalabraClave(""));//Invalido
//        System.out.println(gpc1.nuevaPalabraClave(null));//Invalido
//        System.out.println(gpc1.verPalabrasClaves());//Muestra todas las palabras claves alfabéticamente
//        System.out.println(gpc1.verPalabraClave("PC 1"));//Busca una palabra clave
//        System.out.println(gpc1.verPalabraClave("PC 6"));//Busca una palabra clave inexistente
//        System.out.println(gpc1.borrarPalabraClave(gpc1.verPalabraClave("PC 1")));//Borra PC 1
//        System.out.println(gpc1.verPalabrasClaves());//Muestra todas las palabras claves alfabéticamente
//        System.out.println(gpc1.borrarPalabraClave(gpc1.verPalabraClave("PC 1")));//Borra inexistente
//        System.out.println(gpc1.verPalabrasClaves());//Muestra todas las palabras claves alfabéticamente
//        System.out.println(gpc1.buscarPalabrasClaves("4"));//Busca una palabra clave
//        System.out.println(gpc1.existeEstaPalabraClave(gpc1.verPalabraClave("PC 1")));//No existe
//        System.out.println(gpc1.existeEstaPalabraClave(gpc2.verPalabraClave("PC 2")));//Existe
//        System.out.println("\n\n");
//        
//        
//        
//        System.out.println("-----Lugares-----");
//        
//        GestorLugares gl1 = GestorLugares.crear();
//        GestorLugares gl2 = GestorLugares.crear();
//        
//        System.out.println(gl1.nuevoLugar("Lugar 2"));//Exito
//        System.out.println(gl2.nuevoLugar("Lugar 4"));//Exito
//        System.out.println(gl1.nuevoLugar("Lugar 3"));//Exito
//        System.out.println(gl2.nuevoLugar("Lugar 5"));//Exito
//        System.out.println(gl1.nuevoLugar("Lugar 1"));//Exito
//        
//        System.out.println(gl1.nuevoLugar("Lugar 2"));//Repetido
//        System.out.println(gl1.nuevoLugar(""));//Invalido
//        System.out.println(gl1.nuevoLugar(null));//Invalido
//        System.out.println(gl1.verLugares());//Muestra todos los lugares alfabéticamente
//        System.out.println(gl1.verLugar("Lugar 1"));//Busca un lugar
//        System.out.println(gl1.verLugar("Lugar 6"));//Busca un lugar inexistente
//        System.out.println(gl1.borrarLugar(gl1.verLugar("Lugar 1")));//Borra lugar 1
//        System.out.println(gl1.verLugares());//Muestra todos los lugares alfabéticamente
//        System.out.println(gl1.borrarLugar(gl1.verLugar("Lugar 1")));//Borra inexistente
//        System.out.println(gl1.verLugares());//Muestra todos los lugares alfabéticamente
//        System.out.println(gl1.buscarLugares("4"));//Busca un lugar
//        System.out.println(gl1.existeEsteLugar(gl1.verLugar("Lugar 1")));//No existe
//        System.out.println(gl1.existeEsteLugar(gl1.verLugar("Lugar 2")));//Existe
//        System.out.println("\n\n");
//        
//        
//        
//        System.out.println("-----Idiomas-----");
//        
//        GestorIdiomas gi1 = GestorIdiomas.crear();
//        GestorIdiomas gi2 = GestorIdiomas.crear();
//        
//        System.out.println(gi1.nuevoIdioma("Idioma 5"));//Exito
//        System.out.println(gi2.nuevoIdioma("Idioma 2"));//Exito
//        System.out.println(gi1.nuevoIdioma("Idioma 4"));//Exito
//        System.out.println(gi2.nuevoIdioma("Idioma 1"));//Exito
//        System.out.println(gi1.nuevoIdioma("Idioma 3"));//Exito
//        
//        System.out.println(gi1.nuevoIdioma("Idioma 2"));//Repetido
//        System.out.println(gi1.nuevoIdioma(""));//Invalido
//        System.out.println(gi1.nuevoIdioma(null));//Invalido
//        System.out.println(gi1.verIdiomas());//Muestra todos los idiomas alfabéticamente
//        System.out.println(gi1.verIdioma("Idioma 1"));//Busca un idioma
//        System.out.println(gi1.verIdioma("Idioma 6"));//Busca un idioma inexistente
//        System.out.println(gi1.borrarIdioma(gi1.verIdioma("Idioma 1")));//Borra idioma 1
//        System.out.println(gi1.verIdiomas());//Muestra todos los idiomas alfabéticamente
//        System.out.println(gi1.borrarIdioma(gi1.verIdioma("Idioma 1")));//Borra inexistente
//        System.out.println(gi1.verIdiomas());//Muestra todos los idiomas alfabéticamente
//        System.out.println(gi1.buscarIdiomas("4"));//Busca un idioma
//        System.out.println(gi1.existeEsteIdioma(gi1.verIdioma("Idioma 1")));//No existe
//        System.out.println(gi1.existeEsteIdioma(gi1.verIdioma("Idioma 2")));//Existe
//        System.out.println("\n\n");
//        
//        
//        
//        System.out.println("-----Grupos-----");
//        
//        GestorGrupos gg1 = GestorGrupos.crear();
//        GestorGrupos gg2 = GestorGrupos.crear();
//        
//        System.out.println(gg1.nuevoGrupo("Grupo 3", "Descripcion 3"));//Exito
//        System.out.println(gg2.nuevoGrupo("Grupo 5", "Descripcion 5"));//Exito
//        System.out.println(gg1.nuevoGrupo("Grupo 1", "Descripcion 1"));//Exito
//        System.out.println(gg2.nuevoGrupo("Grupo 2", "Descripcion 2"));//Exito
//        System.out.println(gg1.nuevoGrupo("Grupo 4", "Descripcion 4"));//Exito
//        
//        System.out.println(gg1.nuevoGrupo("Grupo 2", "Descripcion 5"));//Repetido
//        System.out.println(gg1.nuevoGrupo("", "Descripcion 2"));//Invalido
//        System.out.println(gg1.nuevoGrupo(null, "Descripcion h"));//Invalido
//        for(Grupo g : gg1.verGrupos()){//Muestra todos los grupos alfabéticamente
//            g.mostrar();
//        }
//        gg1.verGrupo("Grupo 1").mostrar();//Busca un grupo
//        System.out.println(gg1.verGrupo("Grupo 6"));//Busca un grupo inexistente
//        System.out.println(gg1.borrarGrupo(gg1.verGrupo("Grupo 1")));//Borra grupo 1
//        for(Grupo g : gg1.verGrupos()){//Muestra todos los grupos alfabéticamente
//            g.mostrar();
//        }
//        System.out.println(gg1.borrarGrupo(gg1.verGrupo("Grupo 1")));//Borra inexistente
//        for(Grupo g : gg1.verGrupos()){//Muestra todos los grupos alfabéticamente
//            g.mostrar();
//        }
//        for(Grupo g : gg1.buscarGrupos("4")){//Muestra todos los grupos alfabéticamente
//            g.mostrar();
//        }
//        System.out.println(gg1.existeEsteGrupo(gg1.verGrupo("Grupo 1")));//No existe
//        System.out.println(gg1.existeEsteGrupo(gg1.verGrupo("Grupo 2")));//Existe
//        System.out.println("\n\n");
//        
//        
//        
//        System.out.println("-----Gestor Autores-----");
//        
//        GestorAutores ga1 = GestorAutores.crear();
//        GestorAutores ga2 = GestorAutores.crear();
//        System.out.println("\n");
//        
//        System.out.println("-----Profesores-----");
//        System.out.println(ga1.nuevoAutor(20, "Apellido 20", "Nombre h", Cargo.ADG, "123", "123"));//Éxito
//        System.out.println(ga1.nuevoAutor(10, "Apellido 10", "Nombre w", Cargo.ASOCIADO, "123", "123"));//Éxito
//        System.out.println(ga1.nuevoAutor(30, "Apellido 30", "Nombre j", Cargo.ADJUNTO, "123", "123"));//Éxito
//        System.out.println(ga1.nuevoAutor(40, "Apellido 10", "Nombre m", Cargo.JTP, "123", "123"));//Éxito
//        System.out.println(ga1.nuevoAutor(50, "Apellido 30", "Nombre d", Cargo.TITULAR, "123", "123"));//Éxito
//        System.out.println(ga1.nuevoAutor(60, "Apellido 20", "Nombre o", Cargo.ADJUNTO, "123", "123"));//Éxito
//        System.out.println(ga1.nuevoAutor(70, "Apellido 30", "Nombre z", Cargo.TITULAR, "123", "123"));//Éxito
//        System.out.println(ga1.nuevoAutor(80, "Apellido 20", "Nombre g", Cargo.ADG, "123", "123"));//Éxito
//        System.out.println(ga1.nuevoAutor(90, "Apellido 10", "Nombre o", Cargo.ASOCIADO, "123", "123"));//Éxito
//        System.out.println(ga1.nuevoAutor(10, null, "Nombre 10", Cargo.ADG, "123", "123"));//null
//        System.out.println(ga1.nuevoAutor(10, "Apellido 10", "Nombre 10", Cargo.ADG, "123", "1234"));//Claves distintas
//        System.out.println(ga1.nuevoAutor(10, "Apellido 10", "Nombre 10", Cargo.ADG, "123", "123"));//existente
//        System.out.println(ga1.nuevoAutor(10, "Apellido 10", "", Cargo.ADG, "123", "123"));//en blanco
//        
//        for (Profesor p : ga1.verProfesores()){
//            p.mostrar();
//        }
//
//        System.out.println(ga1.borrarAutor(ga1.verAutor(60)));
//        
//        for (Profesor p : ga1.verProfesores()){
//            p.mostrar();
//        }
//        
//        for (Profesor p : ga1.buscarProfesores("2")){
//            p.mostrar();
//        }
//        
//        System.out.println("\n");
//        
//        
//        
//        System.out.println("-----Alumnos-----");
//        System.out.println(ga2.nuevoAutor(2, "Apellido 2", "Nombre h", "2-2", "123", "123"));//Éxito
//        System.out.println(ga2.nuevoAutor(1, "Apellido 1", "Nombre w", "1-1", "123", "123"));//Éxito
//        System.out.println(ga2.nuevoAutor(3, "Apellido 3", "Nombre j", "3-3", "123", "123"));//Éxito
//        System.out.println(ga2.nuevoAutor(4, "Apellido 1", "Nombre m", "4-4", "123", "123"));//Éxito
//        System.out.println(ga2.nuevoAutor(5, "Apellido 3", "Nombre d", "5-5", "123", "123"));//Éxito
//        System.out.println(ga2.nuevoAutor(6, "Apellido 2", "Nombre o", "6-6", "123", "123"));//Éxito
//        System.out.println(ga2.nuevoAutor(7, "Apellido 3", "Nombre z", "7-7", "123", "123"));//Éxito
//        System.out.println(ga2.nuevoAutor(8, "Apellido 2", "Nombre g", "8-8", "123", "123"));//Éxito
//        System.out.println(ga2.nuevoAutor(9, "Apellido 1", "Nombre o", "9-9", "123", "123"));//Éxito
//        System.out.println(ga2.nuevoAutor(1, null, "Nombre 1", "2-2", "123", "123"));//null
//        System.out.println(ga2.nuevoAutor(1, "Apellido 1", "Nombre 10", "2-2", "123", "1234"));//Claves distintas
//        System.out.println(ga2.nuevoAutor(1, "Apellido 1", "Nombre 10", "2-2", "123", "123"));//existente
//        System.out.println(ga2.nuevoAutor(100, "Apellido 1", "", "1-8", "123", "123"));//en blanco
//        
//        for (Alumno a : ga1.verAlumnos()){
//            a.mostrar();
//        }
//
//        System.out.println(ga1.borrarAutor(ga1.verAutor(6)));
//        
//        for (Alumno a : ga1.verAlumnos()){
//            a.mostrar();
//        }
//        
//        for (Alumno a : ga1.buscarAlumnos("2")){
//            a.mostrar();
//        }
//        
//        System.out.println("\n");
//        
//        
//        
//        System.out.println("-----Autores-----");
//        for(Autor a : ga1.verAutores()){
//            a.mostrar();
//        }
//        for (Profesor p : ga1.verProfesores()){
//            p.mostrar();
//        }
//        for (Alumno a : ga1.verAlumnos()){
//            a.mostrar();
//        }
//        ga1.verAutor(1).mostrar();
//        ga1.verAutor(2).mostrar();
//        ga1.verAutor(10).mostrar();
//        ga1.verAutor(20).mostrar();
//        System.out.println(ga1.existeEsteAutor(ga1.verAutor(1)));
//        System.out.println(ga1.existeEsteAutor(ga1.verAutor(55)));//Ver inexistente
//        System.out.println("\n");
//        
//        System.out.println("-----Modificar-----");
//        System.out.println(ga1.modificarAutor(ga1.verAutor(10), "Ape 10", "Nom 10", Cargo.ADG, "123", "123"));//Modifico profesor
//        System.out.println(ga1.modificarAutor(ga1.verAutor(55), "Ape 10", "Nom 10", Cargo.ADG, "123", "123"));//Modifico profesor inexistente
//        System.out.println(ga1.modificarAutor(ga1.verAutor(1), "Ape 1", "Nom 1", "1-1", "123", "123"));//Modifico alumno
//        System.out.println(ga1.modificarAutor(ga1.verAutor(55), "Ape 1", "Nom 1", "1-1", "123", "123"));//Modifico alumno inexistente
//        for(Autor a : ga1.verAutores()){
//            a.mostrar();
//        }
//        System.out.println("\n\n"); 
//        
//        
//        
//        System.out.println("-----Publicaciones-----");
//        GestorPublicaciones gp1 = GestorPublicaciones.crear();
//        GestorPublicaciones gp2 = GestorPublicaciones.crear();
//        
//        MiembroEnGrupo mg1=new MiembroEnGrupo(ga1.verAutores().get(2), gg1.verGrupos().get(2), Rol.COLABORADOR);
//        MiembroEnGrupo mg2=new MiembroEnGrupo(ga1.verAutores().get(1), gg1.verGrupos().get(1), Rol.COLABORADOR);
//        LocalDate fecha1= LocalDate.of(2020, 06, 24);
//        LocalDate fecha2= LocalDate.of(2020, 03, 20);
//
//
////        //PUBLICACION 1
//        
//        //HACER UN GESTOR DE MIEMBRO EN GRUPO
//        List <PalabraClave> palabrasclaves1 = new ArrayList <>();
//        palabrasclaves1.add(gpc1.verPalabraClave("PC 2"));
//        palabrasclaves1.add(gpc1.verPalabraClave("PC 5"));
//        System.out.println(gp1.nuevaPublicacion("Publicacion 1", mg1, fecha1, gt1.verTipo("Tipo 3"), gi1.verIdioma("Idioma 2"), gl1.verLugar("Lugar 3"), palabrasclaves1, "www.google/publicacion1", "Publicacion 1"));
//        System.out.println(gp1.nuevaPublicacion("Publicacion 2", mg2, fecha2, gt1.verTipo("Tipo 2"), gi1.verIdioma("Idioma 3"), gl1.verLugar("Lugar 2"), gpc1.verPalabrasClaves(), "www.google/publicacion2", "Publicacion 2"));
//
//        for (Publicacion p : gp1.verPublicaciones()){
//            p.mostrar();
//        }
//        
//        gp1.modificarPublicacion(gp1.verPublicacion("Publicacion 1"), mg1, fecha2, gt1.verTipo("Tipo 2"), gi1.verIdioma("Idioma 3"), gl1.verLugar("Lugar 2"), palabrasclaves1, "www.google/publicacion1modificado", "Publicacion 1");
//        System.out.println("-----Publicaciones----- MODIFICADO");
//         for (Publicacion p : gp1.verPublicaciones()){
//            p.mostrar();
//        }
//        
//        System.out.println("-----Publicaciones----- BUSCAR");
//        for (Publicacion p : gp1.buscarPublicaciones("Publicacion 2")){
//            p.mostrar();
//        }
//        
//    }
        
//</editor-fold>
//}
//<editor-fold defaultstate="collapsed" desc="Traajo Práctico N° 7">
//Parcial N° 1
//package principal.controladores;

import autores.controladores.ControladorAutores;
import idiomas.controladores.ControladorIdiomas;
import interfaces.IControladorPrincipal;
import java.awt.event.ActionEvent;
import principal.vistas.VentanaPrincipal;
import principal.vistas.VentanaSalir;

public class ControladorPrincipal implements IControladorPrincipal{
    
    private VentanaPrincipal ventana;
    
    public ControladorPrincipal() {
        this.ventana = new VentanaPrincipal(this);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setVisible(true);
    }
    
    @Override
    public void btnAutoresClic(ActionEvent evt) {
        ControladorAutores autores = new ControladorAutores(this.ventana, true);
    }

    @Override
    public void btnSalirClic(ActionEvent evt) {
        ControladorSalir salir = new ControladorSalir(this.ventana, true);
    }

    @Override
    public void btnIdiomasClic(ActionEvent evt) {
        ControladorIdiomas idiomas = new ControladorIdiomas(this.ventana, true);
    }
}
//</editor-fold>