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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EGruppoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idGruppo;
	public final StringExpression nome;
	
	public EGruppoCriteria(Criteria criteria) {
		super(criteria);
		idGruppo = new IntegerExpression("idGruppo", this);
		nome = new StringExpression("nome", this);
	}
	
	public EGruppoCriteria(PersistentSession session) {
		this(session.createCriteria(EGruppo.class));
	}
	
	public EGruppoCriteria() throws PersistentException {
		this(entity.ServerPersistentManager.instance().getSession());
	}
	
	public EGruppo uniqueEGruppo() {
		return (EGruppo) super.uniqueResult();
	}
	
	public EGruppo[] listEGruppo() {
		java.util.List list = super.list();
		return (EGruppo[]) list.toArray(new EGruppo[list.size()]);
	}
}

