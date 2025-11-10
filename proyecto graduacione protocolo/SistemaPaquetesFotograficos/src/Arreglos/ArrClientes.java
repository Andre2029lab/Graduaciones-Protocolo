package Arreglos; 

import java.util.ArrayList;

import Clases.Clientes;
import Clases.Usuario;

public class ArrClientes {
 private ArrayList<Clientes>cli;
  public ArrClientes() {
	  cli = new ArrayList<Clientes>();
	  Adicionar(new Clientes(9999, 944683847, "juan", "juan@gmail.com", "yarusa"));
  }
  public void Adicionar(Clientes c) {
	  cli.add(c);
  }
  public void Adiccionar() {
	  
  }
  public int Tamaño() {
		return cli.size();
	}
  public Clientes Obtener(int o) {
		return cli.get(o);
	}
  public Clientes Buscar(int doc) {
		for (int i= 0;i < Tamaño(); i++) {
			if(Obtener(i).getDoc()==doc) return Obtener(i);
	}
		return null;
	}
  public void Eliminar(Clientes c) {
		cli.remove(c);
	}
 
}
