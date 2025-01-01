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

public class TipeKamarDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_kelas;
	public final StringExpression nama_kelas;
	public final BigDecimalExpression harga_per_malam;
	public final IntegerExpression kamarid_kamarId;
	public final AssociationExpression kamarid_kamar;
	public final IntegerExpression pemesanid_pemesanId;
	public final AssociationExpression pemesanid_pemesan;
	
	public TipeKamarDetachedCriteria() {
		super(com.mercubuana.sisfohotelreddoorz.TipeKamar.class, com.mercubuana.sisfohotelreddoorz.TipeKamarCriteria.class);
		id_kelas = new IntegerExpression("id_kelas", this.getDetachedCriteria());
		nama_kelas = new StringExpression("nama_kelas", this.getDetachedCriteria());
		harga_per_malam = new BigDecimalExpression("harga_per_malam", this.getDetachedCriteria());
		kamarid_kamarId = new IntegerExpression("kamarid_kamar.id_kamar", this.getDetachedCriteria());
		kamarid_kamar = new AssociationExpression("kamarid_kamar", this.getDetachedCriteria());
		pemesanid_pemesanId = new IntegerExpression("pemesanid_pemesan.id_pemesan", this.getDetachedCriteria());
		pemesanid_pemesan = new AssociationExpression("pemesanid_pemesan", this.getDetachedCriteria());
	}
	
	public TipeKamarDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mercubuana.sisfohotelreddoorz.TipeKamarCriteria.class);
		id_kelas = new IntegerExpression("id_kelas", this.getDetachedCriteria());
		nama_kelas = new StringExpression("nama_kelas", this.getDetachedCriteria());
		harga_per_malam = new BigDecimalExpression("harga_per_malam", this.getDetachedCriteria());
		kamarid_kamarId = new IntegerExpression("kamarid_kamar.id_kamar", this.getDetachedCriteria());
		kamarid_kamar = new AssociationExpression("kamarid_kamar", this.getDetachedCriteria());
		pemesanid_pemesanId = new IntegerExpression("pemesanid_pemesan.id_pemesan", this.getDetachedCriteria());
		pemesanid_pemesan = new AssociationExpression("pemesanid_pemesan", this.getDetachedCriteria());
	}
	
	public KamarDetachedCriteria createKamarid_kamarCriteria() {
		return new KamarDetachedCriteria(createCriteria("kamarid_kamar"));
	}
	
	public PemesanDetachedCriteria createPemesanid_pemesanCriteria() {
		return new PemesanDetachedCriteria(createCriteria("pemesanid_pemesan"));
	}
	
	public TipeKamar uniqueTipeKamar(PersistentSession session) {
		return (TipeKamar) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public TipeKamar[] listTipeKamar(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (TipeKamar[]) list.toArray(new TipeKamar[list.size()]);
	}
}

