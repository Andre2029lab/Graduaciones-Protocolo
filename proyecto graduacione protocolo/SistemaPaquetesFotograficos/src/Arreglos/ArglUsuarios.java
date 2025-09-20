package Arreglos;

import java.util.ArrayList;

import Clases.Usuario;

public class ArglUsuarios {
	private ArrayList<Usuario>usua;
	public ArglUsuarios() {
		usua= new ArrayList<Usuario>();
		Adicionar(new Usuario(98236787,"sebas12@gmail.com", "Sebas", "236422"));
		Adicionar(91278428,"gabi290@gmail.com","Gabi","891212");
}
	public void Adicionar(Usuario u) {
		usua.add(u);
	}
	public void Adicionar(int doc, String email, String nombre,String contr) {
		Usuario nuevo=new Usuario(doc, email, nombre, contr);
		usua.add(nuevo);
	}
	public int Tamaño() {
		return usua.size();
	}
	public Usuario Obtener(int o) {
		return usua.get(o);
	}
	public Usuario Buscar(int doc) {
		for (int i= 0;i < Tamaño(); i++) {
			if(Obtener(i).getDoc()==doc) return Obtener(i);
	}
		return null;
	}
public void Eliminar(Usuario u) {
	usua.remove(u);
}

}
