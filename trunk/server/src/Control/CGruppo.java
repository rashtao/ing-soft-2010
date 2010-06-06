package Control;

import Entity.*;
import Entity.EGruppoCriteria;
import java.util.*;
import org.orm.PersistentException;

public class CGruppo {

	private static CGruppo instance;

	private CGruppo() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public static CGruppo getInstance() {
          if (instance == null) {
              instance = new CGruppo();
            }

            return instance;
	}

	/**
	 * 
	 * @param gruppo
	 * @return 
	 */
	public synchronized boolean salvaGruppo(EGruppo gruppo) throws PersistentException {
            return gruppo.save();
        }

	/**
	 * 
	 * @param gruppo
	 */
	public synchronized boolean eliminaGruppo(EGruppo gruppo) throws PersistentException {
            return gruppo.delete();
        }

	/**
	 * 
	 * @return 
	 */
	public EGruppo nuovoGruppo() {
            return new EGruppo();
        }

	/**
	 * 
	 * @param likeGruppo
	 * @return 
	 */
	public Collection<EGruppo> cercaGruppo(EGruppo likeGruppo) throws PersistentException {
            EGruppoCriteria crit=new EGruppoCriteria(ServerPersistentManager.instance().getSession());
            if (!likeGruppo.getNome().equals(null))
                crit.nome.like("%"+likeGruppo.getNome()+"%");
            if (!(new Integer(likeGruppo.getIdGruppo())==null))
                crit.idGruppo.eq(likeGruppo.getIdGruppo());
            EGruppo[] array=crit.listEGruppo();
            List<EGruppo> list=new LinkedList<EGruppo>();
            for (int i=0; i<array.length; i++)
                list.add(array[i]);
            return list;
        }

}