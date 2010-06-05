/**
 * Licensee: ROOT
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteServerData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = entity.ServerPersistentManager.instance().getSession().beginTransaction();
		try {
			entity.EContatto entityEContatto = entity.EContattoFactory.loadEContattoByQuery("Nome= 'pippo'", null);
			entityEContatto.delete();
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
