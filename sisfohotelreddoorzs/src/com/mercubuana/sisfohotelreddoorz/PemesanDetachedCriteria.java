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

public class PemesanDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_pemesan;
	public final StringExpression nama_pemesan;
	public final DateExpression tanggal_pemesanan;
	public final StringExpression tipe_kamar;
	public final IntegerExpression kamarid_kamarId;
	public final AssociationExpression kamarid_kamar;
	public final CollectionExpression tipeKamar;
	
	public PemesanDetachedCriteria() {
		super(com.mercubuana.sisfohotelreddoorz.Pemesan.class, com.mercubuana.sisfohotelreddoorz.PemesanCriteria.class);
		id_pemesan = new IntegerExpression("id_pemesan", this.getDetachedCriteria());
		nama_pemesan = new StringExpression("nama_pemesan", this.getDetachedCriteria());
		tanggal_pemesanan = new DateExpression("tanggal_pemesanan", this.getDetachedCriteria());
		tipe_kamar = new StringExpression("tipe_kamar", this.getDetachedCriteria());
		kamarid_kamarId = new IntegerExpression("kamarid_kamar.id_kamar", this.getDetachedCriteria());
		kamarid_kamar = new AssociationExpression("kamarid_kamar", this.getDetachedCriteria());
		tipeKamar = new CollectionExpression("ORM_TipeKamar", this.getDetachedCriteria());
	}
	
	public PemesanDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mercubuana.sisfohotelreddoorz.PemesanCriteria.class);
		id_pemesan = new IntegerExpression("id_pemesan", this.getDetachedCriteria());
		nama_pemesan = new StringExpression("nama_pemesan", this.getDetachedCriteria());
		tanggal_pemesanan = new DateExpression("tanggal_pemesanan", this.getDetachedCriteria());
		tipe_kamar = new StringExpression("tipe_kamar", this.getDetachedCriteria());
		kamarid_kamarId = new IntegerExpression("kamarid_kamar.id_kamar", this.getDetachedCriteria());
		kamarid_kamar = new AssociationExpression("kamarid_kamar", this.getDetachedCriteria());
		tipeKamar = new CollectionExpression("ORM_TipeKamar", this.getDetachedCriteria());
	}
	
	public KamarDetachedCriteria createKamarid_kamarCriteria() {
		return new KamarDetachedCriteria(createCriteria("kamarid_kamar"));
	}
	
	public TipeKamarDetachedCriteria createTipeKamarCriteria() {
		return new TipeKamarDetachedCriteria(createCriteria("ORM_TipeKamar"));
	}
	
	public Pemesan uniquePemesan(PersistentSession session) {
		return (Pemesan) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Pemesan[] listPemesan(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Pemesan[]) list.toArray(new Pemesan[list.size()]);
	}
}

