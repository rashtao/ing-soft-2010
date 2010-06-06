/**
 * Licensee: ROOT
 * License Type: Purchased
 */
package ormsamples;

import Entity.EContatto;
import Entity.EContattoCriteria;
import Entity.ServerPersistentManager;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.engine.TypedValue;
import org.orm.*;
import org.orm.criteria.StringExpression;
public class DeleteServerData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = Entity.ServerPersistentManager.instance().getSession().beginTransaction();
		try {
			EContattoCriteria contCrit=new EContattoCriteria(ServerPersistentManager.instance().getSession());
                        contCrit.createEGruppoCriteria().nome.like("pl%");
                        EContatto e[]=contCrit.listEContatto();
                       // entity.EContatto entityEContatto = entity.EContattoFactory.loadEContattoByQuery(null, null);
		//	entityEContatto.delete();
                        for (int i=0;i<e.length; i++)
                            e[i].delete();

			//Entity.EGruppo entityEGruppo = Entity.EGruppoFactory.loadEGruppoByQuery(null, null);
			//entityEGruppo.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteServerData deleteServerData = new DeleteServerData();
			try {
				deleteServerData.deleteTestData();
			}
			finally {
				Entity.ServerPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
