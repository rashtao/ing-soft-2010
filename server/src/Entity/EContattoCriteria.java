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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EContattoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idContatto;
	public final StringExpression nome;
	public final StringExpression cognome;
	public final StringExpression telefono;
	public final StringExpression email;
	
	public EContattoCriteria(Criteria criteria) {
		super(criteria);
		idContatto = new IntegerExpression("idContatto", this);
		nome = new StringExpression("nome", this);
		cognome = new StringExpression("cognome", this);
		telefono = new StringExpression("telefono", this);
		email = new StringExpression("email", this);
	}
	
	public EContattoCriteria(PersistentSession session) {
		this(session.createCriteria(EContatto.class));
	}
	
	public EContattoCriteria() throws PersistentException {
		this(Entity.ServerPersistentManager.instance().getSession());
	}
	
	public EGruppoCriteria createEGruppoCriteria() {
		return new EGruppoCriteria(createCriteria("eGruppo"));
	}
	
	public EContatto uniqueEContatto() {
		return (EContatto) super.uniqueResult();
	}
	
	public EContatto[] listEContatto() {
		java.util.List list = super.list();
		return (EContatto[]) list.toArray(new EContatto[list.size()]);
	}
}

