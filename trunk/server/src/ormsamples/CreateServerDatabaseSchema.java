/**
 * Licensee: ROOT
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateServerDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(Entity.ServerPersistentManager.instance());
			Entity.ServerPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
