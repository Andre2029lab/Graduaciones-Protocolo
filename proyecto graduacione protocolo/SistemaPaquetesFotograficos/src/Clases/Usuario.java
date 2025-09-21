package Clases;

public class Usuario {
    int doc;
    String correo, nom, contr;

    public Usuario(int doc, String correo, String nom, String contr) {
        super();
        this.doc = doc;
        this.correo = correo;
        this.nom = nom;
        this.contr = contr;
    }

    public Usuario(String correo, String contr) {
        this.correo = correo;
        this.contr = contr;
    }

    public int getDoc() {
        return doc;
    }
    public void setDoc(int doc) {
        this.doc = doc;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getContr() {
        return contr;
    }
    public void setContr(String contr) {
        this.contr = contr;
    }

    public void registrarUsuario(String correo, String contr) {
        try {
            if (correo == null || contr == null) {
                throw new IllegalArgumentException("Correo y contraseña no pueden ser nulos");
            }
            this.correo = correo;
            this.contr = contr;
            System.out.println("Usuario registrado con correo y contraseña ✅");
        } catch (Exception e) {
            System.out.println("Error en registrarUsuario(String, String): " + e.getMessage());
        }
    }

    public void registrarUsuario(int doc, String nom) {
        try {
            if (nom == null) {
                throw new IllegalArgumentException("El nombre no puede ser nulo");
            }
            this.doc = doc;
            this.nom = nom;
            System.out.println("Usuario registrado con doc y nombre ✅");
        } catch (Exception e) {
            System.out.println("Error en registrarUsuario(int, String): " + e.getMessage());
        }
    }

    public void registrarUsuario(String correo, String contr, int doc, String nom) {
        try {
            if (correo == null || contr == null || nom == null) {
                throw new IllegalArgumentException("Ningún dato puede ser nulo");
            }
            this.correo = correo;
            this.contr = contr;
            this.doc = doc;
            this.nom = nom;
            System.out.println("Usuario registrado con todos los datos ✅");
        } catch (Exception e) {
            System.out.println("Error en registrarUsuario(String, String, int, String): " + e.getMessage());
        }
    }
}
