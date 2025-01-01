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

public class KamarDAO {
	public static Kamar loadKamarByORMID(int id_kamar) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return loadKamarByORMID(session, id_kamar);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar getKamarByORMID(int id_kamar) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return getKamarByORMID(session, id_kamar);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar loadKamarByORMID(int id_kamar, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return loadKamarByORMID(session, id_kamar, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar getKamarByORMID(int id_kamar, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return getKamarByORMID(session, id_kamar, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar loadKamarByORMID(PersistentSession session, int id_kamar) throws PersistentException {
		try {
			return (Kamar) session.load(com.mercubuana.sisfohotelreddoorz.Kamar.class, Integer.valueOf(id_kamar));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar getKamarByORMID(PersistentSession session, int id_kamar) throws PersistentException {
		try {
			return (Kamar) session.get(com.mercubuana.sisfohotelreddoorz.Kamar.class, Integer.valueOf(id_kamar));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar loadKamarByORMID(PersistentSession session, int id_kamar, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Kamar) session.load(com.mercubuana.sisfohotelreddoorz.Kamar.class, Integer.valueOf(id_kamar), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar getKamarByORMID(PersistentSession session, int id_kamar, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Kamar) session.get(com.mercubuana.sisfohotelreddoorz.Kamar.class, Integer.valueOf(id_kamar), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryKamar(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return queryKamar(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryKamar(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return queryKamar(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar[] listKamarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return listKamarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar[] listKamarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return listKamarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryKamar(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfohotelreddoorz.Kamar as Kamar");
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
	
	public static List queryKamar(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfohotelreddoorz.Kamar as Kamar");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Kamar", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar[] listKamarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryKamar(session, condition, orderBy);
			return (Kamar[]) list.toArray(new Kamar[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar[] listKamarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryKamar(session, condition, orderBy, lockMode);
			return (Kamar[]) list.toArray(new Kamar[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar loadKamarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return loadKamarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar loadKamarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return loadKamarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar loadKamarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Kamar[] kamars = listKamarByQuery(session, condition, orderBy);
		if (kamars != null && kamars.length > 0)
			return kamars[0];
		else
			return null;
	}
	
	public static Kamar loadKamarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Kamar[] kamars = listKamarByQuery(session, condition, orderBy, lockMode);
		if (kamars != null && kamars.length > 0)
			return kamars[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateKamarByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return iterateKamarByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateKamarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = SisteminformasihotelreddoorzPersistentManager.instance().getSession();
			return iterateKamarByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateKamarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfohotelreddoorz.Kamar as Kamar");
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
	
	public static java.util.Iterator iterateKamarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mercubuana.sisfohotelreddoorz.Kamar as Kamar");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Kamar", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar createKamar() {
		return new com.mercubuana.sisfohotelreddoorz.Kamar();
	}
	
	public static boolean save(com.mercubuana.sisfohotelreddoorz.Kamar kamar) throws PersistentException {
		try {
			SisteminformasihotelreddoorzPersistentManager.instance().saveObject(kamar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mercubuana.sisfohotelreddoorz.Kamar kamar) throws PersistentException {
		try {
			SisteminformasihotelreddoorzPersistentManager.instance().deleteObject(kamar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mercubuana.sisfohotelreddoorz.Kamar kamar)throws PersistentException {
		try {
			com.mercubuana.sisfohotelreddoorz.Pemesan[] lPemesans = kamar.pemesan.toArray();
			for(int i = 0; i < lPemesans.length; i++) {
				lPemesans[i].setKamarid_kamar(null);
			}
			com.mercubuana.sisfohotelreddoorz.TipeKamar[] lTipeKamars = kamar.tipeKamar.toArray();
			for(int i = 0; i < lTipeKamars.length; i++) {
				lTipeKamars[i].setKamarid_kamar(null);
			}
			return delete(kamar);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mercubuana.sisfohotelreddoorz.Kamar kamar, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.mercubuana.sisfohotelreddoorz.Pemesan[] lPemesans = kamar.pemesan.toArray();
			for(int i = 0; i < lPemesans.length; i++) {
				lPemesans[i].setKamarid_kamar(null);
			}
			com.mercubuana.sisfohotelreddoorz.TipeKamar[] lTipeKamars = kamar.tipeKamar.toArray();
			for(int i = 0; i < lTipeKamars.length; i++) {
				lTipeKamars[i].setKamarid_kamar(null);
			}
			try {
				session.delete(kamar);
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
	
	public static boolean refresh(com.mercubuana.sisfohotelreddoorz.Kamar kamar) throws PersistentException {
		try {
			SisteminformasihotelreddoorzPersistentManager.instance().getSession().refresh(kamar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mercubuana.sisfohotelreddoorz.Kamar kamar) throws PersistentException {
		try {
			SisteminformasihotelreddoorzPersistentManager.instance().getSession().evict(kamar);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kamar loadKamarByCriteria(KamarCriteria kamarCriteria) {
		Kamar[] kamars = listKamarByCriteria(kamarCriteria);
		if(kamars == null || kamars.length == 0) {
			return null;
		}
		return kamars[0];
	}
	
	public static Kamar[] listKamarByCriteria(KamarCriteria kamarCriteria) {
		return kamarCriteria.listKamar();
	}
}
