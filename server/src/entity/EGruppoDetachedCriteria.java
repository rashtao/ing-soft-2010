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

public class EGruppoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idGruppo;
	public final StringExpression nome;
	
	public EGruppoDetachedCriteria() {
		super(entity.EGruppo.class, entity.EGruppoCriteria.class);
		idGruppo = new IntegerExpression("idGruppo", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
	}
	
	public EGruppoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entity.EGruppoCriteria.class);
		idGruppo = new IntegerExpression("idGruppo", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
	}
	
	public EGruppo uniqueEGruppo(PersistentSession session) {
		return (EGruppo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EGruppo[] listEGruppo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EGruppo[]) list.toArray(new EGruppo[list.size()]);
	}
}

