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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class TipeKamarDAO {
	public static TipeKamar loadTipeKamarByORMID(int id_kelas) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return loadTipeKamarByORMID(session, id_kelas);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipeKamar getTipeKamarByORMID(int id_kelas) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return getTipeKamarByORMID(session, id_kelas);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipeKamar loadTipeKamarByORMID(int id_kelas, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return loadTipeKamarByORMID(session, id_kelas, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipeKamar getTipeKamarByORMID(int id_kelas, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return getTipeKamarByORMID(session, id_kelas, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipeKamar loadTipeKamarByORMID(PersistentSession session, int id_kelas) throws PersistentException {
		try {
			return (TipeKamar) session.load(com.mercubuana.sisfohotelreddoorz.TipeKamar.class, Integer.valueOf(id_kelas));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipeKamar getTipeKamarByORMID(PersistentSession session, int id_kelas) throws PersistentException {
		try {
			return (TipeKamar) session.get(com.mercubuana.sisfohotelreddoorz.TipeKamar.class, Integer.valueOf(id_kelas));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipeKamar loadTipeKamarByORMID(PersistentSession session, int id_kelas, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TipeKamar) session.load(com.mercubuana.sisfohotelreddoorz.TipeKamar.class, Integer.valueOf(id_kelas), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipeKamar getTipeKamarByORMID(PersistentSession session, int id_kelas, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TipeKamar) session.get(com.mercubuana.sisfohotelreddoorz.TipeKamar.class, Integer.valueOf(id_kelas), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipeKamar(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return queryTipeKamar(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipeKamar(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return queryTipeKamar(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipeKamar[] listTipeKamarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return listTipeKamarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipeKamar[] listTipeKamarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return listTipeKamarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipeKamar(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfohotelreddoorz.TipeKamar as TipeKamar");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipeKamar(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfohotelreddoorz.TipeKamar as TipeKamar");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TipeKamar", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipeKamar[] listTipeKamarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTipeKamar(session, condition, orderBy);
			return (TipeKamar[]) list.toArray(new TipeKamar[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipeKamar[] listTipeKamarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTipeKamar(session, condition, orderBy, lockMode);
			return (TipeKamar[]) list.toArray(new TipeKamar[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipeKamar loadTipeKamarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return loadTipeKamarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipeKamar loadTipeKamarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return loadTipeKamarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipeKamar loadTipeKamarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		TipeKamar[] tipeKamars = listTipeKamarByQuery(session, condition, orderBy);
		if (tipeKamars != null && tipeKamars.length > 0)
			return tipeKamars[0];
		else
			return null;
	}
	
	public static TipeKamar loadTipeKamarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		TipeKamar[] tipeKamars = listTipeKamarByQuery(session, condition, orderBy, lockMode);
		if (tipeKamars != null && tipeKamars.length > 0)
			return tipeKamars[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTipeKamarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return iterateTipeKamarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipeKamarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return iterateTipeKamarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipeKamarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfohotelreddoorz.TipeKamar as TipeKamar");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipeKamarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfohotelreddoorz.TipeKamar as TipeKamar");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TipeKamar", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipeKamar createTipeKamar() {
		return new com.mercubuana.sisfohotelreddoorz.TipeKamar();
	}
	
	public static boolean save(com.mercubuana.sisfohotelreddoorz.TipeKamar tipeKamar) throws PersistentException {
		try {
			SisteminformasihotelreddoorzPersistentManager.instance().saveObject(tipeKamar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mercubuana.sisfohotelreddoorz.TipeKamar tipeKamar) throws PersistentException {
		try {
			SisteminformasihotelreddoorzPersistentManager.instance().deleteObject(tipeKamar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mercubuana.sisfohotelreddoorz.TipeKamar tipeKamar)throws PersistentException {
		try {
			if (tipeKamar.getKamarid_kamar() != null) {
				tipeKamar.getKamarid_kamar().tipeKamar.remove(tipeKamar);
			}
			
			if (tipeKamar.getPemesanid_pemesan() != null) {
				tipeKamar.getPemesanid_pemesan().tipeKamar.remove(tipeKamar);
			}
			
			return delete(tipeKamar);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mercubuana.sisfohotelreddoorz.TipeKamar tipeKamar, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (tipeKamar.getKamarid_kamar() != null) {
				tipeKamar.getKamarid_kamar().tipeKamar.remove(tipeKamar);
			}
			
			if (tipeKamar.getPemesanid_pemesan() != null) {
				tipeKamar.getPemesanid_pemesan().tipeKamar.remove(tipeKamar);
			}
			
			try {
				session.delete(tipeKamar);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(com.mercubuana.sisfohotelreddoorz.TipeKamar tipeKamar) throws PersistentException {
		try {
			SisteminformasihotelreddoorzPersistentManager.instance().getSession().refresh(tipeKamar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mercubuana.sisfohotelreddoorz.TipeKamar tipeKamar) throws PersistentException {
		try {
			SisteminformasihotelreddoorzPersistentManager.instance().getSession().evict(tipeKamar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipeKamar loadTipeKamarByCriteria(TipeKamarCriteria tipeKamarCriteria) {
		TipeKamar[] tipeKamars = listTipeKamarByCriteria(tipeKamarCriteria);
		if(tipeKamars == null || tipeKamars.length == 0) {
			return null;
		}
		return tipeKamars[0];
	}
	
	public static TipeKamar[] listTipeKamarByCriteria(TipeKamarCriteria tipeKamarCriteria) {
		return tipeKamarCriteria.listTipeKamar();
	}
}
