package Control;

import Entity.*;
import java.util.*;

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
	public synchronized boolean salvaGruppo(EGruppo gruppo) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param gruppo
	 */
	public synchronized boolean eliminaGruppo(EGruppo gruppo) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public EGruppo nuovoGruppo() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param likeGruppo
	 * @return 
	 */
	public Collection<EGruppo> cercaGruppo(EGruppo likeGruppo) {
		throw new UnsupportedOperationException();
	}

}