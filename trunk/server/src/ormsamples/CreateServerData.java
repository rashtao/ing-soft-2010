/**
 * Licensee: ROOT
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateServerData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = entity.ServerPersistentManager.instance().getSession().beginTransaction();
		try {
			entity.EContatto entityEContatto = entity.EContattoFactory.createEContatto();
                        entityEContatto.setNome("pippo");
			// Initialize the properties of the persistent object here
			entityEContatto.save();
			entity.EGruppo entityEGruppo = entity.EGruppoFactory.createEGruppo();
                        entityEGruppo.setNome("pluto");
			// Initialize the properties of the persistent object here
			entityEGruppo.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateServerData createServerData = new CreateServerData();
			try {
				createServerData.createTestData();
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
