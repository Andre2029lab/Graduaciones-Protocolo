package Clases;
import java.util.ArrayList;

public class Clientes {
private int doc, nroTelefono;
private String nombreComp,correo,direccion;
public Clientes(int doc, int nroTelefono, String nombreComp, String correo, String direccion) {
	super();
	this.doc = doc;
	this.nroTelefono = nroTelefono;
	this.nombreComp = nombreComp;
	this.correo = correo;
	this.direccion = direccion;
}
public int getDoc() {
	return doc;
}
public void setDoc(int doc) {
	this.doc = doc;
}
public int getNroTelefono() {
	return nroTelefono;
}
public void setNroTelefono(int nroTelefono) {
	this.nroTelefono = nroTelefono;
}
public String getNombreComp() {
	return nombreComp;
}
public void setNombreComp(String nombreComp) {
	this.nombreComp = nombreComp;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}

}
