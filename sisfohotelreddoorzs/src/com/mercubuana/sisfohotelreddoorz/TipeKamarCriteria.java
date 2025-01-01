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

public class TipeKamarCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_kelas;
	public final StringExpression nama_kelas;
	public final BigDecimalExpression harga_per_malam;
	public final IntegerExpression kamarid_kamarId;
	public final AssociationExpression kamarid_kamar;
	public final IntegerExpression pemesanid_pemesanId;
	public final AssociationExpression pemesanid_pemesan;
	
	public TipeKamarCriteria(Criteria criteria) {
		super(criteria);
		id_kelas = new IntegerExpression("id_kelas", this);
		nama_kelas = new StringExpression("nama_kelas", this);
		harga_per_malam = new BigDecimalExpression("harga_per_malam", this);
		kamarid_kamarId = new IntegerExpression("kamarid_kamar.id_kamar", this);
		kamarid_kamar = new AssociationExpression("kamarid_kamar", this);
		pemesanid_pemesanId = new IntegerExpression("pemesanid_pemesan.id_pemesan", this);
		pemesanid_pemesan = new AssociationExpression("pemesanid_pemesan", this);
	}
	
	public TipeKamarCriteria(PersistentSession session) {
		this(session.createCriteria(TipeKamar.class));
	}
	
	public TipeKamarCriteria() throws PersistentException {
		this(SisteminformasihotelreddoorzPersistentManager.instance().getSession());
	}
	
	public KamarCriteria createKamarid_kamarCriteria() {
		return new KamarCriteria(createCriteria("kamarid_kamar"));
	}
	
	public PemesanCriteria createPemesanid_pemesanCriteria() {
		return new PemesanCriteria(createCriteria("pemesanid_pemesan"));
	}
	
	public TipeKamar uniqueTipeKamar() {
		return (TipeKamar) super.uniqueResult();
	}
	
	public TipeKamar[] listTipeKamar() {
		java.util.List list = super.list();
		return (TipeKamar[]) list.toArray(new TipeKamar[list.size()]);
	}
}

