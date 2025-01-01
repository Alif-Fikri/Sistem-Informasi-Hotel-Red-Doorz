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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class KamarCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_kamar;
	public final StringExpression nomor_kamar;
	public final IntegerExpression sisa_kamar;
	public final IntegerExpression kapasitas;
	public final CharacterExpression tipe_kamar;
	public final CollectionExpression pemesan;
	public final CollectionExpression tipeKamar;
	
	public KamarCriteria(Criteria criteria) {
		super(criteria);
		id_kamar = new IntegerExpression("id_kamar", this);
		nomor_kamar = new StringExpression("nomor_kamar", this);
		sisa_kamar = new IntegerExpression("sisa_kamar", this);
		kapasitas = new IntegerExpression("kapasitas", this);
		tipe_kamar = new CharacterExpression("tipe_kamar", this);
		pemesan = new CollectionExpression("ORM_Pemesan", this);
		tipeKamar = new CollectionExpression("ORM_TipeKamar", this);
	}
	
	public KamarCriteria(PersistentSession session) {
		this(session.createCriteria(Kamar.class));
	}
	
	public KamarCriteria() throws PersistentException {
		this(SisteminformasihotelreddoorzPersistentManager.instance().getSession());
	}
	
	public PemesanCriteria createPemesanCriteria() {
		return new PemesanCriteria(createCriteria("ORM_Pemesan"));
	}
	
	public TipeKamarCriteria createTipeKamarCriteria() {
		return new TipeKamarCriteria(createCriteria("ORM_TipeKamar"));
	}
	
	public Kamar uniqueKamar() {
		return (Kamar) super.uniqueResult();
	}
	
	public Kamar[] listKamar() {
		java.util.List list = super.list();
		return (Kamar[]) list.toArray(new Kamar[list.size()]);
	}
}

