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

import java.sql.Date;

public class Pemesan {
	public Pemesan() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PEMESAN_TIPEKAMAR) {
			return ORM_tipeKamar;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PEMESAN_KAMARID_KAMAR) {
			this.kamarid_kamar = (com.mercubuana.sisfohotelreddoorz.Kamar) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id_pemesan;
	
	private String nama_pemesan;
	
	private java.util.Date tanggal_pemesanan;
	
	private Character tipe_kamar;
	
	private String nomor_kamar;
	
	private com.mercubuana.sisfohotelreddoorz.Kamar kamarid_kamar;
	
	private java.util.Set ORM_tipeKamar = new java.util.HashSet();
	
	private void setId_pemesan(int value) {
		this.id_pemesan = value;
	}
	
	public int getId_pemesan() {
		return id_pemesan;
	}
	
	public int getORMID() {
		return getId_pemesan();
	}
	
	public void setNama_pemesan(String value) {
		this.nama_pemesan = value;
	}
	
	public String getNama_pemesan() {
		return nama_pemesan;
	}
	
	public void setTanggal_pemesanan(java.util.Date value) {
		this.tanggal_pemesanan = value;
	}
	
	public java.util.Date getTanggal_pemesanan() {
		return tanggal_pemesanan;
	}
	
	public void setTipe_kamar(Character value) {
		this.tipe_kamar = value;
	}
	
	public Character getTipe_kamar() {
		return tipe_kamar;
	}
	
	public void setNomor_kamar(String value) {
		this.nomor_kamar = value;
	}
	
	public String getNomor_kamar() {
		return nomor_kamar;
	}
	
	public void setKamarid_kamar(com.mercubuana.sisfohotelreddoorz.Kamar value) {
	    if (kamarid_kamar != null) {
	        kamarid_kamar.pemesan.remove(this);
	    }
	    if (value != null) {
	        value.pemesan.add(this);
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
	
	private void setORM_TipeKamar(java.util.Set value) {
		this.ORM_tipeKamar = value;
	}
	
	private java.util.Set getORM_TipeKamar() {
		return ORM_tipeKamar;
	}
	
	public final com.mercubuana.sisfohotelreddoorz.TipeKamarSetCollection tipeKamar = new com.mercubuana.sisfohotelreddoorz.TipeKamarSetCollection(this, _ormAdapter, ORMConstants.KEY_PEMESAN_TIPEKAMAR, ORMConstants.KEY_TIPEKAMAR_PEMESANID_PEMESAN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_pemesan());
	}
	
}
