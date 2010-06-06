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
import org.hibernate.Query;
import java.util.List;

public class EGruppoFactory {
	public static EGruppo loadEGruppoByORMID(int idGruppo) throws PersistentException {
		try {
			PersistentSession session = Entity.ServerPersistentManager.instance().getSession();
			return loadEGruppoByORMID(session, idGruppo);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static EGruppo getEGruppoByORMID(int idGruppo) throws PersistentException {
		try {
			PersistentSession session = Entity.ServerPersistentManager.instance().getSession();
			return getEGruppoByORMID(session, idGruppo);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static EGruppo loadEGruppoByORMID(int idGruppo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Entity.ServerPersistentManager.instance().getSession();
			return loadEGruppoByORMID(session, idGruppo, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static EGruppo getEGruppoByORMID(int idGruppo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Entity.ServerPersistentManager.instance().getSession();
			return getEGruppoByORMID(session, idGruppo, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static EGruppo loadEGruppoByORMID(PersistentSession session, int idGruppo) throws PersistentException {
		try {
			return (EGruppo) session.load(Entity.EGruppo.class, new Integer(idGruppo));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static EGruppo getEGruppoByORMID(PersistentSession session, int idGruppo) throws PersistentException {
		try {
			return (EGruppo) session.get(Entity.EGruppo.class, new Integer(idGruppo));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static EGruppo loadEGruppoByORMID(PersistentSession session, int idGruppo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EGruppo) session.load(Entity.EGruppo.class, new Integer(idGruppo), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static EGruppo getEGruppoByORMID(PersistentSession session, int idGruppo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EGruppo) session.get(Entity.EGruppo.class, new Integer(idGruppo), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static EGruppo[] listEGruppoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Entity.ServerPersistentManager.instance().getSession();
			return listEGruppoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static EGruppo[] listEGruppoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Entity.ServerPersistentManager.instance().getSession();
			return listEGruppoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static EGruppo[] listEGruppoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.EGruppo as EGruppo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (EGruppo[]) list.toArray(new EGruppo[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static EGruppo[] listEGruppoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.EGruppo as EGruppo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (EGruppo[]) list.toArray(new EGruppo[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static EGruppo loadEGruppoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Entity.ServerPersistentManager.instance().getSession();
			return loadEGruppoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static EGruppo loadEGruppoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Entity.ServerPersistentManager.instance().getSession();
			return loadEGruppoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static EGruppo loadEGruppoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EGruppo[] eGruppos = listEGruppoByQuery(session, condition, orderBy);
		if (eGruppos != null && eGruppos.length > 0)
			return eGruppos[0];
		else
			return null;
	}
	
	public static EGruppo loadEGruppoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EGruppo[] eGruppos = listEGruppoByQuery(session, condition, orderBy, lockMode);
		if (eGruppos != null && eGruppos.length > 0)
			return eGruppos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEGruppoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Entity.ServerPersistentManager.instance().getSession();
			return iterateEGruppoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEGruppoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Entity.ServerPersistentManager.instance().getSession();
			return iterateEGruppoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEGruppoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.EGruppo as EGruppo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEGruppoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.EGruppo as EGruppo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static EGruppo createEGruppo() {
		return new Entity.EGruppo();
	}
	
	public static EGruppo loadEGruppoByCriteria(EGruppoCriteria eGruppoCriteria) {
		EGruppo[] eGruppos = listEGruppoByCriteria(eGruppoCriteria);
		if(eGruppos == null || eGruppos.length == 0) {
			return null;
		}
		return eGruppos[0];
	}
	
	public static EGruppo[] listEGruppoByCriteria(EGruppoCriteria eGruppoCriteria) {
		return eGruppoCriteria.listEGruppo();
	}
}
