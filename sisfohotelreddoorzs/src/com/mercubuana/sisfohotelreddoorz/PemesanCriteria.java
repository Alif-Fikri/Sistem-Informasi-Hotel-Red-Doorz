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

public class PemesanCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_pemesan;
	public final StringExpression nama_pemesan;
	public final DateExpression tanggal_pemesanan;
	public final StringExpression tipe_kamar;
	public final IntegerExpression kamarid_kamarId;
	public final AssociationExpression kamarid_kamar;
	public final CollectionExpression tipeKamar;
	
	public PemesanCriteria(Criteria criteria) {
		super(criteria);
		id_pemesan = new IntegerExpression("id_pemesan", this);
		nama_pemesan = new StringExpression("nama_pemesan", this);
		tanggal_pemesanan = new DateExpression("tanggal_pemesanan", this);
		tipe_kamar = new StringExpression("tipe_kamar", this);
		kamarid_kamarId = new IntegerExpression("kamarid_kamar.id_kamar", this);
		kamarid_kamar = new AssociationExpression("kamarid_kamar", this);
		tipeKamar = new CollectionExpression("ORM_TipeKamar", this);
	}
	
	public PemesanCriteria(PersistentSession session) {
		this(session.createCriteria(Pemesan.class));
	}
	
	public PemesanCriteria() throws PersistentException {
		this(SisteminformasihotelreddoorzPersistentManager.instance().getSession());
	}
	
	public KamarCriteria createKamarid_kamarCriteria() {
		return new KamarCriteria(createCriteria("kamarid_kamar"));
	}
	
	public TipeKamarCriteria createTipeKamarCriteria() {
		return new TipeKamarCriteria(createCriteria("ORM_TipeKamar"));
	}
	
	public Pemesan uniquePemesan() {
		return (Pemesan) super.uniqueResult();
	}
	
	public Pemesan[] listPemesan() {
		java.util.List list = super.list();
		return (Pemesan[]) list.toArray(new Pemesan[list.size()]);
	}
}

