package Control;

import Entity.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;

public class CContatto {

	private static CContatto instance;

	private CContatto() {
	}

	/**
	 *
	 * @return
	 */
	public static CContatto getInstance() {
           if (instance == null) {
              instance = new CContatto();
            }

            return instance;
	}

	/**
	 * 
	 * @param contatto
	 * @return 
	 */
	public synchronized boolean salvaContatto(EContatto contatto) {
            try {
                return contatto.save();
            } catch (PersistentException ex) {
                Logger.getLogger(CContatto.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }

	/**
	 *
	 * @param contatto
	 */
	public synchronized boolean eliminaContatto(EContatto contatto) throws PersistentException {
            return contatto.delete();
        }

	/**
	 *
	 * @param gruppo
	 */
	public Collection<EContatto> getByGroup(EGruppo gruppo) throws PersistentException {
            EContattoCriteria crit=new EContattoCriteria(ServerPersistentManager.instance().getSession());
            if (!gruppo.getNome().equals(null))
                crit.createEGruppoCriteria().nome.like("%"+gruppo.getNome()+"%");
            if (!(new Integer(gruppo.getIdGruppo())==null))
                crit.createEGruppoCriteria().idGruppo.eq(gruppo.getIdGruppo());
            EContatto[] array=crit.listEContatto();
            List<EContatto> list=new LinkedList<EContatto>();
            for (int i=0; i<array.length; i++)
                list.add(array[i]);
            return list;
        }

	/**
	 * 
	 * @return 
	 */
	public EContatto nuovoContatto() {
            return new EContatto();
        }

	/**
	 * 
	 * @param likeContatto
	 * @return 
	 */
	public Collection<EContatto> cercaContatto(EContatto likeContatto) throws PersistentException {
            EContattoCriteria crit=new EContattoCriteria(ServerPersistentManager.instance().getSession());
            if (!likeContatto.getNome().equals(null))
                crit.nome.like("%"+likeContatto.getNome()+"%");
            if (!likeContatto.getCognome().equals(null))
                crit.cognome.like("%"+likeContatto.getCognome()+"%");
            if (!likeContatto.getEmail().equals(null))
                crit.email.like("%"+likeContatto.getEmail()+"%");
            if (!likeContatto.getTelefono().equals(null))
                crit.telefono.like("%"+likeContatto.getTelefono()+"%");
            if (!likeContatto.geteGruppo().equals(null)){
                crit.createEGruppoCriteria().idGruppo.eq(likeContatto.geteGruppo().getIdGruppo());
                crit.createEGruppoCriteria().nome.eq(likeContatto.geteGruppo().getNome());
            }
            EContatto[] array=crit.listEContatto();
            List<EContatto> list=new LinkedList<EContatto>();
            for (int i=0; i<array.length; i++)
                list.add(array[i]);
            return list;
        }

}