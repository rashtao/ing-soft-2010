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
	
	public boolean deleteAndDissociate() {
		try {
			if(geteGruppo() != null) {
				geteGruppo().eContatto.remove(this);
			}
			
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session) {
		try {
			if(geteGruppo() != null) {
				geteGruppo().eContatto.remove(this);
			}
			
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == entity.ORMConstants.KEY_ECONTATTO_EGRUPPO) {
			this.eGruppo = (entity.EGruppo) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idContatto;
	
	private String nome;
	
	private String cognome;
	
	private String telefono;
	
	private String email;
	
	private entity.EGruppo eGruppo;
	
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
	
	public void seteGruppo(entity.EGruppo value) {
		if (eGruppo != null) {
			eGruppo.eContatto.remove(this);
		}
		if (value != null) {
			value.eContatto.add(this);
		}
	}
	
	public entity.EGruppo geteGruppo() {
		return eGruppo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_EGruppo(entity.EGruppo value) {
		this.eGruppo = value;
	}
	
	private entity.EGruppo getORM_EGruppo() {
		return eGruppo;
	}
	
	public String toString() {
		return String.valueOf(getIdContatto());
	}
	
}
