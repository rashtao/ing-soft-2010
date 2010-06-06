/**
 * Licensee: ROOT
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListServerData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing EContatto...");
		Entity.EContatto[] entityEContattos = Entity.EContattoFactory.listEContattoByQuery(null, null);
		int length = Math.min(entityEContattos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityEContattos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EGruppo...");
		Entity.EGruppo[] entityEGruppos = Entity.EGruppoFactory.listEGruppoByQuery(null, null);
		length = Math.min(entityEGruppos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityEGruppos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing EContatto by Criteria...");
		Entity.EContattoCriteria eContattoCriteria = new Entity.EContattoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//eContattoCriteria.idContatto.eq();
		eContattoCriteria.setMaxResults(ROW_COUNT);
		Entity.EContatto[] entityEContattos = eContattoCriteria.listEContatto();
		int length =entityEContattos== null ? 0 : Math.min(entityEContattos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityEContattos[i]);
		}
		System.out.println(length + " EContatto record(s) retrieved."); 
		
		System.out.println("Listing EGruppo by Criteria...");
		Entity.EGruppoCriteria eGruppoCriteria = new Entity.EGruppoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//eGruppoCriteria.idGruppo.eq();
		eGruppoCriteria.setMaxResults(ROW_COUNT);
		Entity.EGruppo[] entityEGruppos = eGruppoCriteria.listEGruppo();
		length =entityEGruppos== null ? 0 : Math.min(entityEGruppos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityEGruppos[i]);
		}
		System.out.println(length + " EGruppo record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListServerData listServerData = new ListServerData();
			try {
				listServerData.listTestData();
				//listServerData.listByCriteria();
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
