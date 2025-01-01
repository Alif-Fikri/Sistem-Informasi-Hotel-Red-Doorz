/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateSisteminformasihotelreddoorzData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = com.mercubuana.sisfohotelreddoorz.SisteminformasihotelreddoorzPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mercubuana.sisfohotelreddoorz.Kamar lcommercubuanasisfohotelreddoorzKamar = com.mercubuana.sisfohotelreddoorz.KamarDAO.createKamar();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tipeKamar, pemesan, kapasitas, sisa_kamar, nomor_kamar
			com.mercubuana.sisfohotelreddoorz.KamarDAO.save(lcommercubuanasisfohotelreddoorzKamar);
			com.mercubuana.sisfohotelreddoorz.Pemesan lcommercubuanasisfohotelreddoorzPemesan = com.mercubuana.sisfohotelreddoorz.PemesanDAO.createPemesan();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tipeKamar, kamarid_kamar, tipe_kamar, tanggal_pemesanan, nama_pemesan
			com.mercubuana.sisfohotelreddoorz.PemesanDAO.save(lcommercubuanasisfohotelreddoorzPemesan);
			com.mercubuana.sisfohotelreddoorz.TipeKamar lcommercubuanasisfohotelreddoorzTipeKamar = com.mercubuana.sisfohotelreddoorz.TipeKamarDAO.createTipeKamar();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : pemesanid_pemesan, kamarid_kamar, harga_per_malam, nama_kelas
			com.mercubuana.sisfohotelreddoorz.TipeKamarDAO.save(lcommercubuanasisfohotelreddoorzTipeKamar);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateSisteminformasihotelreddoorzData createSisteminformasihotelreddoorzData = new CreateSisteminformasihotelreddoorzData();
			try {
				createSisteminformasihotelreddoorzData.createTestData();
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
