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
package Entity;

import org.orm.*;
import java.io.Serializable;
public class EGruppo implements Serializable {
	public EGruppo() {
	}
	
	public boolean save() throws PersistentException {
		try {
			Entity.ServerPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			Entity.ServerPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			Entity.ServerPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			Entity.ServerPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	private int idGruppo;
	
	private String nome;
	
	private void setIdGruppo(int value) {
		this.idGruppo = value;
	}
	
	public int getIdGruppo() {
		return idGruppo;
	}
	
	public int getORMID() {
		return getIdGruppo();
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String toString() {
		return String.valueOf(getIdGruppo());
	}
	
}
