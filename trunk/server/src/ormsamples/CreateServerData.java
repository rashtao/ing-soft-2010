/**
 * Licensee: ROOT
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateServerData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = Entity.ServerPersistentManager.instance().getSession().beginTransaction();
		try {
			Entity.EContatto entityEContatto = Entity.EContattoFactory.createEContatto();
                        entityEContatto.setNome("pippo");
                        entityEContatto.setEmail("sdjklfagsl@asda");
			// Initialize the properties of the persistent object here
			entityEContatto.save();
			Entity.EGruppo entityEGruppo = Entity.EGruppoFactory.createEGruppo();
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
				Entity.ServerPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
