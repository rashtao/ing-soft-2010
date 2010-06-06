package Control;

import Entity.*;
import java.util.*;

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
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param contatto
	 */
	public synchronized boolean eliminaContatto(EContatto contatto) {
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param gruppo
	 */
	public Collection<EContatto> getByGroup(EGruppo gruppo) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public EContatto nuovoContatto() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param likeContatto
	 * @return 
	 */
	public Collection<EContatto> cercaContatto(EContatto likeContatto) {
		throw new UnsupportedOperationException();
	}

}