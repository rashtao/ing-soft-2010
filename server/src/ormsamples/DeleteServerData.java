/**
 * Licensee: ROOT
 * License Type: Purchased
 */
package ormsamples;

import entity.EContatto;
import entity.EContattoCriteria;
import entity.ServerPersistentManager;
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
		PersistentTransaction t = entity.ServerPersistentManager.instance().getSession().beginTransaction();
		try {
			EContattoCriteria contCrit=new EContattoCriteria(ServerPersistentManager.instance().getSession());
                        StringExpression ert=new StringExpression("pippo", contCrit);
                        contCrit.nome.like("pipp%");
                        EContatto e[]=contCrit.listEContatto();
                       // entity.EContatto entityEContatto = entity.EContattoFactory.loadEContattoByQuery(null, null);
		//	entityEContatto.delete();
                        for (int i=0;i<e.length; i++)
                            e[i].delete();

			entity.EGruppo entityEGruppo = entity.EGruppoFactory.loadEGruppoByQuery(null, null);
			entityEGruppo.delete();
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
				entity.ServerPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
