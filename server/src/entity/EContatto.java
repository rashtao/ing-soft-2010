/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: ROOT
 * License Type: Purchased
 */
package entity;

import java.io.Serializable;
public class EContatto implements Serializable {
	public EContatto() {
	}
	
	public boolean save() {
		try {
			entity.ServerPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public boolean delete() {
		try {
			entity.ServerPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public boolean refresh() {
		try {
			entity.ServerPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public boolean evict() {
		try {
			entity.ServerPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	private int idContatto;
	
	private String nome;
	
	private String cognome;
	
	private String telefono;
	
	private String email;
	
	private entity.EGruppo IdGruppo;
	
	private void setIdContatto(int value) {
		this.idContatto = value;
	}
	
	public int getIdContatto() {
		return idContatto;
	}
	
	public int getORMID() {
		return getIdContatto();
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCognome(String value) {
		this.cognome = value;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setTelefono(String value) {
		this.telefono = value;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setIdGruppo(entity.EGruppo value) {
		this.IdGruppo = value;
	}
	
	public entity.EGruppo getIdGruppo() {
		return IdGruppo;
	}
	
	public String toString() {
		return String.valueOf(getIdContatto());
	}
	
}
