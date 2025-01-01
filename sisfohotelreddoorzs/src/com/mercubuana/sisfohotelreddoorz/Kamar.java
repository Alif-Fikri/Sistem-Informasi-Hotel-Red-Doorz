package com.mercubuana.sisfohotelreddoorz;

import java.util.HashSet;
import java.util.Set;

public class Kamar {

    private int id_kamar;
    private String nomor_kamar; // Changed to String
    private Integer sisa_kamar; // Changed to Integer
    private Integer kapasitas; // Changed to Integer
    private Character tipe_kamar; // Added as Character

    private Set<Pemesan> ORM_pemesan = new HashSet<>();
    private Set<TipeKamar> ORM_tipeKamar = new HashSet<>();

    

    // ORM Adapter
    org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
        public Set getSet(int key) {
            return this_getSet(key);
        }
    };

    private Set this_getSet(int key) {
        if (key == ORMConstants.KEY_KAMAR_PEMESAN) {
            return ORM_pemesan;
        } else if (key == ORMConstants.KEY_KAMAR_TIPEKAMAR) {
            return ORM_tipeKamar;
        }
        return null;
    }

    // Getters and Setters
    public int getId_kamar() {
        return id_kamar;
    }

    private void setId_kamar(int value) {
        this.id_kamar = value;
    }

    public String getNomor_kamar() {
        return nomor_kamar;
    }

    public void setNomor_kamar(String value) {
        this.nomor_kamar = value;
    }

    public Integer getSisa_kamar() {
        return sisa_kamar;
    }

    public void setSisa_kamar(Integer value) {
        this.sisa_kamar = value;
    }

    public Integer getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(Integer value) {
        this.kapasitas = value;
    }

    public Character getTipe_kamar() {
        return tipe_kamar;
    }

    public void setTipe_kamar(Character value) {
        this.tipe_kamar = value;
    }

    // ORM-related methods
    private Set<Pemesan> getORM_Pemesan() {
        return ORM_pemesan;
    }

    private void setORM_Pemesan(Set<Pemesan> value) {
        this.ORM_pemesan = value;
    }

    public final com.mercubuana.sisfohotelreddoorz.PemesanSetCollection pemesan =
            new com.mercubuana.sisfohotelreddoorz.PemesanSetCollection(this, _ormAdapter, ORMConstants.KEY_KAMAR_PEMESAN, ORMConstants.KEY_PEMESAN_KAMARID_KAMAR, ORMConstants.KEY_MUL_ONE_TO_MANY);

    private Set<TipeKamar> getORM_TipeKamar() {
        return ORM_tipeKamar;
    }

    private void setORM_TipeKamar(Set<TipeKamar> value) {
        this.ORM_tipeKamar = value;
    }

    public final com.mercubuana.sisfohotelreddoorz.TipeKamarSetCollection tipeKamar =
            new com.mercubuana.sisfohotelreddoorz.TipeKamarSetCollection(this, _ormAdapter, ORMConstants.KEY_KAMAR_TIPEKAMAR, ORMConstants.KEY_TIPEKAMAR_KAMARID_KAMAR, ORMConstants.KEY_MUL_ONE_TO_MANY);

    public void addPemesan(Pemesan pemesan) {
        if (!ORM_pemesan.contains(pemesan)) {
            ORM_pemesan.add(pemesan);
            pemesan.setKamarid_kamar(this);
        }
    }

    public void removePemesan(Pemesan pemesan) {
        if (ORM_pemesan.contains(pemesan)) {
            ORM_pemesan.remove(pemesan);
            pemesan.setKamarid_kamar(null);
        }
    }
    
    // Constructor
    public Kamar() {
    }

	public void setSisaTempat(Integer value) {
		// TODO Auto-generated method stub
		
	}
}
