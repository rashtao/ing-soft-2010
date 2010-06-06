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
	 */
	public boolean creaContatto(EContatto contatto) {
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param contatto
	 */
	public synchronized boolean modificaContatto(EContatto contatto) {
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

}