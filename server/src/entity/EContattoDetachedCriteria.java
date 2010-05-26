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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EContattoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idContatto;
	public final StringExpression nome;
	public final StringExpression cognome;
	public final StringExpression telefono;
	public final StringExpression email;
	
	public EContattoDetachedCriteria() {
		super(entity.EContatto.class, entity.EContattoCriteria.class);
		idContatto = new IntegerExpression("idContatto", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
	}
	
	public EContattoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entity.EContattoCriteria.class);
		idContatto = new IntegerExpression("idContatto", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
	}
	
	public EGruppoDetachedCriteria createIdGruppoCriteria() {
		return new EGruppoDetachedCriteria(createCriteria("IdGruppo"));
	}
	
	public EContatto uniqueEContatto(PersistentSession session) {
		return (EContatto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EContatto[] listEContatto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EContatto[]) list.toArray(new EContatto[list.size()]);
	}
}

