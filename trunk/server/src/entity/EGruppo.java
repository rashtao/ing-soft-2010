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
public class EGruppo implements Serializable {
	public EGruppo() {
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
			entity.EContatto[] leContattos = eContatto.toArray();
			for(int i = 0; i < leContattos.length; i++) {
				leContattos[i].seteGruppo(null);
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
			entity.EContatto[] leContattos = eContatto.toArray();
			for(int i = 0; i < leContattos.length; i++) {
				leContattos[i].seteGruppo(null);
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
	
	private java.util.Set this_getSet (int key) {
		if (key == entity.ORMConstants.KEY_EGRUPPO_ECONTATTO) {
			return ORM_eContatto;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idGruppo;
	
	private String nome;
	
	private java.util.Set ORM_eContatto = new java.util.HashSet();
	
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
	
	private void setORM_eContatto(java.util.Set value) {
		this.ORM_eContatto = value;
	}
	
	private java.util.Set getORM_eContatto() {
		return ORM_eContatto;
	}
	
	public final entity.EContattoSetCollection eContatto = new entity.EContattoSetCollection(this, _ormAdapter, entity.ORMConstants.KEY_EGRUPPO_ECONTATTO, entity.ORMConstants.KEY_ECONTATTO_EGRUPPO, entity.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdGruppo());
	}
	
}
