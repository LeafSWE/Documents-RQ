package com.leaf.clips.model.navigator.algorithm;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che espone i metodi per calcolare un percorso di navigazione
*/ 
public interface PathFinder { 

/**
* Metodo che calcola un percorso tra due RegionOfInterest viste come vertici di un grafo MapGraph. Il grafo, il punto di partenza e il punto di arrivo sono i parametri richiesti in input dal metodo.
* @param graph Grafo sul quale calcolare il percorso.
* @param startRoi Punto di partenza del percorso.
* @param endRoi Punto di arrivo del percorso.
* @return  List<EnrichedEdge>
*/
 List<EnrichedEdge> calculatePath(MapGraph graph, RegionOfInterest startRoi, RegionOfInterest endRoi);

}
