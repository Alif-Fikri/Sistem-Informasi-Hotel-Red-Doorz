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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class KamarDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_kamar;
	public final BigDecimalExpression nomor_kamar;
	public final BigDecimalExpression sisa_kamar;
	public final BigDecimalExpression kapasitas;
	public final CollectionExpression pemesan;
	public final CollectionExpression tipeKamar;
	
	public KamarDetachedCriteria() {
		super(com.mercubuana.sisfohotelreddoorz.Kamar.class, com.mercubuana.sisfohotelreddoorz.KamarCriteria.class);
		id_kamar = new IntegerExpression("id_kamar", this.getDetachedCriteria());
		nomor_kamar = new BigDecimalExpression("nomor_kamar", this.getDetachedCriteria());
		sisa_kamar = new BigDecimalExpression("sisa_kamar", this.getDetachedCriteria());
		kapasitas = new BigDecimalExpression("kapasitas", this.getDetachedCriteria());
		pemesan = new CollectionExpression("ORM_Pemesan", this.getDetachedCriteria());
		tipeKamar = new CollectionExpression("ORM_TipeKamar", this.getDetachedCriteria());
	}
	
	public KamarDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mercubuana.sisfohotelreddoorz.KamarCriteria.class);
		id_kamar = new IntegerExpression("id_kamar", this.getDetachedCriteria());
		nomor_kamar = new BigDecimalExpression("nomor_kamar", this.getDetachedCriteria());
		sisa_kamar = new BigDecimalExpression("sisa_kamar", this.getDetachedCriteria());
		kapasitas = new BigDecimalExpression("kapasitas", this.getDetachedCriteria());
		pemesan = new CollectionExpression("ORM_Pemesan", this.getDetachedCriteria());
		tipeKamar = new CollectionExpression("ORM_TipeKamar", this.getDetachedCriteria());
	}
	
	public PemesanDetachedCriteria createPemesanCriteria() {
		return new PemesanDetachedCriteria(createCriteria("ORM_Pemesan"));
	}
	
	public TipeKamarDetachedCriteria createTipeKamarCriteria() {
		return new TipeKamarDetachedCriteria(createCriteria("ORM_TipeKamar"));
	}
	
	public Kamar uniqueKamar(PersistentSession session) {
		return (Kamar) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Kamar[] listKamar(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Kamar[]) list.toArray(new Kamar[list.size()]);
	}
}

