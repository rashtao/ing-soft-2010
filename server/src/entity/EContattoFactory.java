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

import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class EContattoFactory {
	public static EContatto loadEContattoByORMID(int idContatto) {
		try {
			PersistentSession session = entity.ServerPersistentManager.instance().getSession();
			return loadEContattoByORMID(session, idContatto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static EContatto getEContattoByORMID(int idContatto) {
		try {
			PersistentSession session = entity.ServerPersistentManager.instance().getSession();
			return getEContattoByORMID(session, idContatto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static EContatto loadEContattoByORMID(int idContatto, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = entity.ServerPersistentManager.instance().getSession();
			return loadEContattoByORMID(session, idContatto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static EContatto getEContattoByORMID(int idContatto, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = entity.ServerPersistentManager.instance().getSession();
			return getEContattoByORMID(session, idContatto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static EContatto loadEContattoByORMID(PersistentSession session, int idContatto) {
		try {
			return (EContatto) session.load(entity.EContatto.class, new Integer(idContatto));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static EContatto getEContattoByORMID(PersistentSession session, int idContatto) {
		try {
			return (EContatto) session.get(entity.EContatto.class, new Integer(idContatto));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static EContatto loadEContattoByORMID(PersistentSession session, int idContatto, org.hibernate.LockMode lockMode) {
		try {
			return (EContatto) session.load(entity.EContatto.class, new Integer(idContatto), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static EContatto getEContattoByORMID(PersistentSession session, int idContatto, org.hibernate.LockMode lockMode) {
		try {
			return (EContatto) session.get(entity.EContatto.class, new Integer(idContatto), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static EContatto[] listEContattoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = entity.ServerPersistentManager.instance().getSession();
			return listEContattoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static EContatto[] listEContattoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = entity.ServerPersistentManager.instance().getSession();
			return listEContattoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static EContatto[] listEContattoByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From entity.EContatto as EContatto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (EContatto[]) list.toArray(new EContatto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static EContatto[] listEContattoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From entity.EContatto as EContatto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (EContatto[]) list.toArray(new EContatto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static EContatto loadEContattoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = entity.ServerPersistentManager.instance().getSession();
			return loadEContattoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static EContatto loadEContattoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = entity.ServerPersistentManager.instance().getSession();
			return loadEContattoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static EContatto loadEContattoByQuery(PersistentSession session, String condition, String orderBy) {
		EContatto[] eContattos = listEContattoByQuery(session, condition, orderBy);
		if (eContattos != null && eContattos.length > 0)
			return eContattos[0];
		else
			return null;
	}
	
	public static EContatto loadEContattoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		EContatto[] eContattos = listEContattoByQuery(session, condition, orderBy, lockMode);
		if (eContattos != null && eContattos.length > 0)
			return eContattos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEContattoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = entity.ServerPersistentManager.instance().getSession();
			return iterateEContattoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateEContattoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = entity.ServerPersistentManager.instance().getSession();
			return iterateEContattoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateEContattoByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From entity.EContatto as EContatto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateEContattoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From entity.EContatto as EContatto");
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
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static EContatto createEContatto() {
		return new entity.EContatto();
	}
	
	public static EContatto loadEContattoByCriteria(EContattoCriteria eContattoCriteria) {
		EContatto[] eContattos = listEContattoByCriteria(eContattoCriteria);
		if(eContattos == null || eContattos.length == 0) {
			return null;
		}
		return eContattos[0];
	}
	
	public static EContatto[] listEContattoByCriteria(EContattoCriteria eContattoCriteria) {
		return eContattoCriteria.listEContatto();
	}
}
