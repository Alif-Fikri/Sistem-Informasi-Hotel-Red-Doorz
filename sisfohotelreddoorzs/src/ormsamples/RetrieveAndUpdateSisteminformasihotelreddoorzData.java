/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateSisteminformasihotelreddoorzData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = com.mercubuana.sisfohotelreddoorz.SisteminformasihotelreddoorzPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mercubuana.sisfohotelreddoorz.Kamar lcommercubuanasisfohotelreddoorzKamar = com.mercubuana.sisfohotelreddoorz.KamarDAO.loadKamarByQuery(null, null);
			// Update the properties of the persistent object
			com.mercubuana.sisfohotelreddoorz.KamarDAO.save(lcommercubuanasisfohotelreddoorzKamar);
			com.mercubuana.sisfohotelreddoorz.Pemesan lcommercubuanasisfohotelreddoorzPemesan = com.mercubuana.sisfohotelreddoorz.PemesanDAO.loadPemesanByQuery(null, null);
			// Update the properties of the persistent object
			com.mercubuana.sisfohotelreddoorz.PemesanDAO.save(lcommercubuanasisfohotelreddoorzPemesan);
			com.mercubuana.sisfohotelreddoorz.TipeKamar lcommercubuanasisfohotelreddoorzTipeKamar = com.mercubuana.sisfohotelreddoorz.TipeKamarDAO.loadTipeKamarByQuery(null, null);
			// Update the properties of the persistent object
			com.mercubuana.sisfohotelreddoorz.TipeKamarDAO.save(lcommercubuanasisfohotelreddoorzTipeKamar);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Kamar by KamarCriteria");
		com.mercubuana.sisfohotelreddoorz.KamarCriteria lcommercubuanasisfohotelreddoorzKamarCriteria = new com.mercubuana.sisfohotelreddoorz.KamarCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommercubuanasisfohotelreddoorzKamarCriteria.id_kamar.eq();
		System.out.println(lcommercubuanasisfohotelreddoorzKamarCriteria.uniqueKamar());
		
		System.out.println("Retrieving Pemesan by PemesanCriteria");
		com.mercubuana.sisfohotelreddoorz.PemesanCriteria lcommercubuanasisfohotelreddoorzPemesanCriteria = new com.mercubuana.sisfohotelreddoorz.PemesanCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommercubuanasisfohotelreddoorzPemesanCriteria.id_pemesan.eq();
		System.out.println(lcommercubuanasisfohotelreddoorzPemesanCriteria.uniquePemesan());
		
		System.out.println("Retrieving TipeKamar by TipeKamarCriteria");
		com.mercubuana.sisfohotelreddoorz.TipeKamarCriteria lcommercubuanasisfohotelreddoorzTipeKamarCriteria = new com.mercubuana.sisfohotelreddoorz.TipeKamarCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommercubuanasisfohotelreddoorzTipeKamarCriteria.id_kelas.eq();
		System.out.println(lcommercubuanasisfohotelreddoorzTipeKamarCriteria.uniqueTipeKamar());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateSisteminformasihotelreddoorzData retrieveAndUpdateSisteminformasihotelreddoorzData = new RetrieveAndUpdateSisteminformasihotelreddoorzData();
			try {
				retrieveAndUpdateSisteminformasihotelreddoorzData.retrieveAndUpdateTestData();
				//retrieveAndUpdateSisteminformasihotelreddoorzData.retrieveByCriteria();
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
