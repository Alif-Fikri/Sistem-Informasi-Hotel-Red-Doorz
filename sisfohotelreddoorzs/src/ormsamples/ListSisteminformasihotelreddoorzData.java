/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListSisteminformasihotelreddoorzData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Kamar...");
		com.mercubuana.sisfohotelreddoorz.Kamar[] commercubuanasisfohotelreddoorzKamars = com.mercubuana.sisfohotelreddoorz.KamarDAO.listKamarByQuery(null, null);
		int length = Math.min(commercubuanasisfohotelreddoorzKamars.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commercubuanasisfohotelreddoorzKamars[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pemesan...");
		com.mercubuana.sisfohotelreddoorz.Pemesan[] commercubuanasisfohotelreddoorzPemesans = com.mercubuana.sisfohotelreddoorz.PemesanDAO.listPemesanByQuery(null, null);
		length = Math.min(commercubuanasisfohotelreddoorzPemesans.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commercubuanasisfohotelreddoorzPemesans[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing TipeKamar...");
		com.mercubuana.sisfohotelreddoorz.TipeKamar[] commercubuanasisfohotelreddoorzTipeKamars = com.mercubuana.sisfohotelreddoorz.TipeKamarDAO.listTipeKamarByQuery(null, null);
		length = Math.min(commercubuanasisfohotelreddoorzTipeKamars.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commercubuanasisfohotelreddoorzTipeKamars[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Kamar by Criteria...");
		com.mercubuana.sisfohotelreddoorz.KamarCriteria lcommercubuanasisfohotelreddoorzKamarCriteria = new com.mercubuana.sisfohotelreddoorz.KamarCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommercubuanasisfohotelreddoorzKamarCriteria.id_kamar.eq();
		lcommercubuanasisfohotelreddoorzKamarCriteria.setMaxResults(ROW_COUNT);
		com.mercubuana.sisfohotelreddoorz.Kamar[] commercubuanasisfohotelreddoorzKamars = lcommercubuanasisfohotelreddoorzKamarCriteria.listKamar();
		int length =commercubuanasisfohotelreddoorzKamars== null ? 0 : Math.min(commercubuanasisfohotelreddoorzKamars.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commercubuanasisfohotelreddoorzKamars[i]);
		}
		System.out.println(length + " Kamar record(s) retrieved."); 
		
		System.out.println("Listing Pemesan by Criteria...");
		com.mercubuana.sisfohotelreddoorz.PemesanCriteria lcommercubuanasisfohotelreddoorzPemesanCriteria = new com.mercubuana.sisfohotelreddoorz.PemesanCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommercubuanasisfohotelreddoorzPemesanCriteria.id_pemesan.eq();
		lcommercubuanasisfohotelreddoorzPemesanCriteria.setMaxResults(ROW_COUNT);
		com.mercubuana.sisfohotelreddoorz.Pemesan[] commercubuanasisfohotelreddoorzPemesans = lcommercubuanasisfohotelreddoorzPemesanCriteria.listPemesan();
		length =commercubuanasisfohotelreddoorzPemesans== null ? 0 : Math.min(commercubuanasisfohotelreddoorzPemesans.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commercubuanasisfohotelreddoorzPemesans[i]);
		}
		System.out.println(length + " Pemesan record(s) retrieved."); 
		
		System.out.println("Listing TipeKamar by Criteria...");
		com.mercubuana.sisfohotelreddoorz.TipeKamarCriteria lcommercubuanasisfohotelreddoorzTipeKamarCriteria = new com.mercubuana.sisfohotelreddoorz.TipeKamarCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommercubuanasisfohotelreddoorzTipeKamarCriteria.id_kelas.eq();
		lcommercubuanasisfohotelreddoorzTipeKamarCriteria.setMaxResults(ROW_COUNT);
		com.mercubuana.sisfohotelreddoorz.TipeKamar[] commercubuanasisfohotelreddoorzTipeKamars = lcommercubuanasisfohotelreddoorzTipeKamarCriteria.listTipeKamar();
		length =commercubuanasisfohotelreddoorzTipeKamars== null ? 0 : Math.min(commercubuanasisfohotelreddoorzTipeKamars.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commercubuanasisfohotelreddoorzTipeKamars[i]);
		}
		System.out.println(length + " TipeKamar record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListSisteminformasihotelreddoorzData listSisteminformasihotelreddoorzData = new ListSisteminformasihotelreddoorzData();
			try {
				listSisteminformasihotelreddoorzData.listTestData();
				//listSisteminformasihotelreddoorzData.listByCriteria();
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
