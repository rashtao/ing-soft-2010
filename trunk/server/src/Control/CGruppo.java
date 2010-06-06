package Control;

import Entity.*;

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
	 */
	public boolean creaGruppo(EGruppo gruppo) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param gruppo
	 */
	public synchronized boolean modificaGruppo(EGruppo gruppo) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param gruppo
	 */
	public synchronized boolean eliminaGruppo(EGruppo gruppo) {
		throw new UnsupportedOperationException();
	}

}