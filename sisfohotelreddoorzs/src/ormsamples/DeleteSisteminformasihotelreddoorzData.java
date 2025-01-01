/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteSisteminformasihotelreddoorzData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = com.mercubuana.sisfohotelreddoorz.SisteminformasihotelreddoorzPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mercubuana.sisfohotelreddoorz.Kamar lcommercubuanasisfohotelreddoorzKamar = com.mercubuana.sisfohotelreddoorz.KamarDAO.loadKamarByQuery(null, null);
			// Delete the persistent object
			com.mercubuana.sisfohotelreddoorz.KamarDAO.delete(lcommercubuanasisfohotelreddoorzKamar);
			com.mercubuana.sisfohotelreddoorz.Pemesan lcommercubuanasisfohotelreddoorzPemesan = com.mercubuana.sisfohotelreddoorz.PemesanDAO.loadPemesanByQuery(null, null);
			// Delete the persistent object
			com.mercubuana.sisfohotelreddoorz.PemesanDAO.delete(lcommercubuanasisfohotelreddoorzPemesan);
			com.mercubuana.sisfohotelreddoorz.TipeKamar lcommercubuanasisfohotelreddoorzTipeKamar = com.mercubuana.sisfohotelreddoorz.TipeKamarDAO.loadTipeKamarByQuery(null, null);
			// Delete the persistent object
			com.mercubuana.sisfohotelreddoorz.TipeKamarDAO.delete(lcommercubuanasisfohotelreddoorzTipeKamar);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteSisteminformasihotelreddoorzData deleteSisteminformasihotelreddoorzData = new DeleteSisteminformasihotelreddoorzData();
			try {
				deleteSisteminformasihotelreddoorzData.deleteTestData();
			}
			finally {
				com.mercubuana.sisfohotelreddoorz.SisteminformasihotelreddoorzPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
