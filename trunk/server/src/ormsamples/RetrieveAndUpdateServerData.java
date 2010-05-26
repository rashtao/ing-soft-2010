/**
 * Licensee: ROOT
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateServerData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = entity.ServerPersistentManager.instance().getSession().beginTransaction();
		try {
			entity.EContatto entityEContatto = entity.EContattoFactory.loadEContattoByQuery(null, null);
			// Update the properties of the persistent object
			entityEContatto.save();
			entity.EGruppo entityEGruppo = entity.EGruppoFactory.loadEGruppoByQuery(null, null);
			// Update the properties of the persistent object
			entityEGruppo.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving EContatto by EContattoCriteria");
		entity.EContattoCriteria eContattoCriteria = new entity.EContattoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//eContattoCriteria.idContatto.eq();
		System.out.println(eContattoCriteria.uniqueEContatto());
		
		System.out.println("Retrieving EGruppo by EGruppoCriteria");
		entity.EGruppoCriteria eGruppoCriteria = new entity.EGruppoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//eGruppoCriteria.idGruppo.eq();
		System.out.println(eGruppoCriteria.uniqueEGruppo());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateServerData retrieveAndUpdateServerData = new RetrieveAndUpdateServerData();
			try {
				retrieveAndUpdateServerData.retrieveAndUpdateTestData();
				//retrieveAndUpdateServerData.retrieveByCriteria();
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
