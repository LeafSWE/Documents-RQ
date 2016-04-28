package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta un DAO per la tabella “ROIPOI" del database locale
*/ 
public class SQLiteRoiPoiDao implements RoiPoiDao { 

/**
* Costruttore della classe SQLiteRoiPoiDao
* @param database Il database locale
*/
public SQLiteRoiPoiDao(SQLiteDatabase database);

/**
* Metodo che viene utilizzato per convertire il risultato della query sulla tabella "ROIPOI" del database locale in un oggetto RoiPoiTable
* @param cursor Risultato della query sulla tabella "ROIPOI" del database locale
* @return  RoiPoiTable
*/
@Override 
public RoiPoiTable cursorToType(Cursor cursor);

/**
* Metodo che permette la rimozione delle associazioni tra un ROI e i POI ad esso associato dalla tabella "ROIPOI" del database locale 
* @param poi Identificativo del POI di cui rimuovere le associazioni con i ROI dal database locale
* @return  void
*/
@Override 
public void deleteRoiPoisWherePoi(int poi);

/**
* Metodo che permette la rimozione delle associazioni tra un POI e i ROI ad esso associato dalla tabella "ROIPOI" del database locale 
* @param roi Identificativo del ROI di cui rimuovere le associazioni con i POI dal database locale
* @return  void
*/
@Override 
public void deleteRoiPoisWhereRoi(int roi);

/**
* Metodo per recuperare tutti gli identificativi dei POI associati ad un ROI 
* @param roi Identificativo del ROI di cui recuperare gli identificativi di tutti i POI associati
* @return  int[]
*/
@Override 
public int[] findAllPointsWithRoi(int roi);

/**
* Metodo per recuperare tutti gli identificativi dei ROI associati ad un POI 
* @param poi Identificativo del POI di cui recuperare gli identificativi di tutti i ROI associati
* @return  int[]
*/
@Override 
public int[] findAllRegionsWithPoi(int poi);

/**
* Metodo che permette l'inserimento tra ROI ed POI nel database locale utilizzando un oggetto RoiPoiTable
* @param toInsert Oggetto di tipo RoiPoiTable che contiene le associazioni tra ROI e POI
* @return  int
*/
@Override 
public int insertRoiPoi(RoiPoiTable toInsert);

/**
* Metodo per aggiornare le associazioni tra POI e ROI
* @param poi Identificativo del POI di cui aggiungere una associazione con un ROI
* @param roi Identificativo del ROI di cui aggiungere una associazione con un POI
* @param toUpdate Oggetto che contiene le associazioni tra ROI e POI
* @return  boolean
*/
@Override 
public boolean updateRoiPoi(int poi, int roi, RoiPoiTable toUpdate);

}

