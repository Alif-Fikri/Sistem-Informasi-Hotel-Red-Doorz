/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateSisteminformasihotelreddoorzDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(com.mercubuana.sisfohotelreddoorz.SisteminformasihotelreddoorzPersistentManager.instance());
			com.mercubuana.sisfohotelreddoorz.SisteminformasihotelreddoorzPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
