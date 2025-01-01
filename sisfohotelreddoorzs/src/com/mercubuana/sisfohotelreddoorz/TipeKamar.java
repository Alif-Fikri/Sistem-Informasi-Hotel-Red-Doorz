/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package com.mercubuana.sisfohotelreddoorz;

public class TipeKamar {
	public TipeKamar() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TIPEKAMAR_KAMARID_KAMAR) {
			this.kamarid_kamar = (com.mercubuana.sisfohotelreddoorz.Kamar) owner;
		}
		
		else if (key == ORMConstants.KEY_TIPEKAMAR_PEMESANID_PEMESAN) {
			this.pemesanid_pemesan = (com.mercubuana.sisfohotelreddoorz.Pemesan) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id_kelas;
	
	private String nama_kelas;
	
	private java.math.BigDecimal harga_per_malam;
	
	private com.mercubuana.sisfohotelreddoorz.Kamar kamarid_kamar;
	
	private com.mercubuana.sisfohotelreddoorz.Pemesan pemesanid_pemesan;
	
	private void setId_kelas(int value) {
		this.id_kelas = value;
	}
	
	public int getId_kelas() {
		return id_kelas;
	}
	
	public int getORMID() {
		return getId_kelas();
	}
	
	public void setNama_kelas(String value) {
		this.nama_kelas = value;
	}
	
	public String getNama_kelas() {
		return nama_kelas;
	}
	
	public void setHarga_per_malam(java.math.BigDecimal value) {
		this.harga_per_malam = value;
	}
	
	public java.math.BigDecimal getHarga_per_malam() {
		return harga_per_malam;
	}
	
	public void setKamarid_kamar(com.mercubuana.sisfohotelreddoorz.Kamar value) {
		if (kamarid_kamar != null) {
			kamarid_kamar.tipeKamar.remove(this);
		}
		if (value != null) {
			value.tipeKamar.add(this);
		}
	}
	
	public com.mercubuana.sisfohotelreddoorz.Kamar getKamarid_kamar() {
		return kamarid_kamar;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Kamarid_kamar(com.mercubuana.sisfohotelreddoorz.Kamar value) {
		this.kamarid_kamar = value;
	}
	
	private com.mercubuana.sisfohotelreddoorz.Kamar getORM_Kamarid_kamar() {
		return kamarid_kamar;
	}
	
	public void setPemesanid_pemesan(com.mercubuana.sisfohotelreddoorz.Pemesan value) {
		if (pemesanid_pemesan != null) {
			pemesanid_pemesan.tipeKamar.remove(this);
		}
		if (value != null) {
			value.tipeKamar.add(this);
		}
	}
	
	public com.mercubuana.sisfohotelreddoorz.Pemesan getPemesanid_pemesan() {
		return pemesanid_pemesan;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pemesanid_pemesan(com.mercubuana.sisfohotelreddoorz.Pemesan value) {
		this.pemesanid_pemesan = value;
	}
	
	private com.mercubuana.sisfohotelreddoorz.Pemesan getORM_Pemesanid_pemesan() {
		return pemesanid_pemesan;
	}
	
	public String toString() {
		return String.valueOf(getId_kelas());
	}
	
}
