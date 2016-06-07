package RyC.dbHIB;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class key_palabras_usuario implements Serializable{
	private String palabra;
	private int tipo_palabra;
	private int id_usuario;
	
	public key_palabras_usuario(){
		
	}
	public key_palabras_usuario(String palabra,int tipo_palabra,int id){
		this.palabra=palabra;
		this.tipo_palabra=tipo_palabra;
		this.id_usuario=id;
	}
	
	public int getId() {
		return id_usuario;
	}
	public void setId(int id) {
		this.id_usuario = id;
	}
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	public int getTipo_palabra() {
		return tipo_palabra;
	}
	public void setTipo_palabra(int tipo_palabra) {
		this.tipo_palabra = tipo_palabra;
	}
	
	
}
