package utils;

/**
 * 
 * @author hector.morales.carnice@est.fib.upc.edu
 * @author eric.casanovas@est.fib.upc.edu
 * @author adria.manero@est.fib.upc.edu
 *
 */
public class ExceptionManager {
	
	static private String[] titles;
	
	/*!!!IMPORTANT!!!
	 * 1 - 	ABANS DE COMENÇAR A AFEGIR TITOLS, I PER TANT, MODIFICAR EL FITXER,
	 * 		PREGUNTEU SI ALGÚ L'ESTÀ MODIFICANT I ESPEREU A QUE EN FACI EL COMMIT
	 * 		DEFINITIU AL GIT. LLAVORS, DESCARREGUEU EL NOU FITXER I PODREU PROCEDIR.
	 * 
	 * 2 - 	SI US CAL UN RANG D'EXCEPCIONS MÉS GRAN DEL QUE TENIU ASSIGNAT
	 * 		COMENTEU-HO PEL GRUP DE PROP I DISCUTIREM SOBRE NOUS RANGS
	 * 		(SENSE MODIFICAR ELS QUE JA ESTAN ASSIGNATS).*/
	
	/**
	 * Inicialitza, si cal, l'array d'strings: titles.
	 * Altrament no fa res.
	 */
	static private void ExceptionManagerInitializer() {
		if(titles == null) {
			titles = new String[500]; //Mes val que en sobrin, que no que en faltin equisdé
			
			//DECLARACIONS GENERALS 0:9 :
			titles[0] = "NO_ERROR";
			titles[1] = "MODIFICACIÓ_INUTIL";
			//titles[2] = "INT_NEGATIU";
					
			//PLA ESTUDIS 10:29 :
			titles[10] = "Ja existeix un Pla d'Estudis amb el mateix nom";
			titles[11] = "Dia incorrecte 0 <= dia <= 6";
			titles[12] = "Franja incorrecta";
			titles[13] = "Ja existeix una assignatura amb el mateix nom";
			titles[14] = "No existeix l'assignatura";
			titles[15] = "El dia no te franjas";
			titles[16] = "Rang incorrecte";
			titles[17] = "Valor no pot ser null";
			titles[18] = "Nom no pot ser null";
			
			
			//ASSIGNATURA 30:49 :
			titles[30] = "Nom no pot ser null";
			titles[31] = "PlaEst no pot ser null";
			titles[32] = "Ja existeix una assignatura amb aquest nom";
			titles[33] = "Les hores de teoria no poden ser negatives";
			titles[34] = "Les hores de laboratori no poden ser negatives";
			titles[35] = "Franja no pot ser nul";
			titles[36] = "Ja existeix un grup amb el mateix numero";
			titles[37] = "La capacitat d'un grup no pot ser negativa";
			titles[38] = "El tipus de sessio no pot ser nul";
			titles[39] = "Ja existeix una sessioG igual";
			titles[40] = "Assignatura no pot ser null";
			titles[41] = "Ja existeix una SessioSG";
			titles[42] = "Hi ha un cicle de requisits";
			titles[43] = "L'Assignatura no forma part dels requisits";
			
			//GRUP 50: 69:
			titles[50] = "Identificació negativa o igual a 0.";
			titles[51] = "El número de Grup ja existeix en aquesta Assignatura.";
			titles[52] = "Grup amb capacitat negativa o igual a 0.";
			titles[53] = "Grup amb menys places que places sumen els seus SubGrups.";
			titles[54] = "Franja incorrecte.";
			titles[55] = "El grup ha de formar part d'una Assignatura.";
			titles[56] = "Nombre negatiu de places.";
			titles[57] = "No hi ha proutes places per tancar.";
			titles[58] = "El subGrup ja existeix en aquest Grup.";
			titles[59] = "Subgrup amb més places que el Grup.";
			titles[60] = "Subgrup amb capacitat negativa.";
			titles[61] = "No hi ha proutes places al Grup";
			titles[62] = "El grup ja conté una sessió amb el mateix tipus i hores";
			titles[63] = "L'assignatura a la qual pertany el grup no te cap sessio de Grup del tipus indicat.";
			titles[64] = "El grup ja conté aquesta sessió.";
			titles[65] = "La sessió no és del Grup corresponent.";
			titles[66] = "La sessió i el grup són d'assignatures diferents.";
			titles[67] = "El grup ja conté una sessió amb el mateix tipus i hores.";
			titles[68] = "La sessió no és del Grup corresponent.";
			titles[69] = "La sessió no és de la mateixa assignatura que el grup.";
			
			//SUBGRUP 70:89 :
			titles[70] = "El número de subGrup ja existeix al Grup.";
			titles[71] = "Nombre negatiu o igual a 0 de places.";
			titles[72] = "Subgrup amb més places que el Grup.";
			titles[73] = "El subGrup ha de formar part d'un Grup";
			titles[74] = "No hi ha proutes places al grup";
			titles[75] = "No hi ha proutes places per tancar.";
			titles[76] = "El subGrup ja conté una sessió amb el mateix tipus i hores";
			titles[77] = "L'assignatura del grup al qual pertany el subGrup no te cap sessio de subGrup del tipus indicat.";
			titles[78] = "El subGrup ja conté aquesta sessió.";
			titles[79] = "La sessió no és del SubGrup corresponent.";
			titles[80] = "La sessió no és del Grup del SubGrup corresponent.";
			titles[81] = "La sessió i el grup del subGrup són d'assignatures diferents.";
			titles[82] = "El subGrup ja conté una sessió amb el mateix tipus i hores.";
			titles[83] = "La sessió a esborrar no és de la mateixa assignatura que el subGrup.";
			
			//SESSIO 90:109 :
			titles[90] = "L'assignatura no pot ser nula.";
			titles[91] = "L'hora no pot ser negativa ni 0.";
			titles[92] = "Tipus no pot ser un string null o buit.";
			titles[93] = "Tipus ha de contindre únicament lletres.";
			titles[95] = "El nombre de sessions ha de ser més gran que 0.";
			titles[97] = "No podem desassignar una sessió assignada si la seva sessió de grup i grup pertanyen a assignatures diferents.";
			titles[98] = "No podem afegir una sessió assignada que ja esta assignada.";
			titles[99] = "No podem afegir una sessió assignada si la seva sessió de grup i grup pertanyen a assignatures diferents.";
			titles[100] = "No podem eliminar una sessió assignada si la seva sessió de grup i grup pertanyen a assignatures diferents.";
			titles[103] = "No podem desassignar una sessió assignada si la seva sessió de subGrup i subGrup pertanyen a assignatures diferents.";
			titles[104] = "No podem afegir una sessió assignada si la seva sessió de subgrup i subgrup pertanyen a assignatures diferents.";
			titles[105] = "No podem eliminar una sessió assignada si la seva sessió de subgrup i subgrup pertanyen a assignatures diferents.";
			titles[106] = "No podem afegir un material que ja es necessari per la sessió.";
			titles[107] = "No podem eliminar un material que no existeix a la sessió.";
			titles[108] = "Equip no pot ser null o buit.";
			
			//SESSIO ASSIGNADA 110:129 :
			titles[110] = "El paràmetre grup no pot ser null.";
			titles[111] = "El paràmetre sessió grup no pot ser null.";
			titles[112] = "El paràmetre subgrup no pot ser null.";
			titles[113] = "El paràmetre sessió subgrup no pot ser null.";
			titles[114] = ".";
			titles[115] = ".";
			titles[116] = ".";
			titles[117] = ".";
			titles[118] = ".";
			titles[119] = ".";
			titles[120] = ".";
			titles[121] = ".";
			titles[122] = ".";
			titles[123] = ".";
			titles[124] = ".";
			titles[125] = ".";
			titles[126] = ".";
			titles[127] = ".";
			titles[128] = ".";
			titles[129] = ".";	
			
			//CAMPUS 130:149 :
			titles[130] = "El nom del campus no pot ser null."; 
			titles[131] = "El nom de l'aula no pot ser null." ;
			titles[132] = "El campus ja conté aquesta aula.";
			
			
			//AULA 150:169 :
			titles[150] = "Campus no pot ser null.";
			titles[151] = "El campus ja conté una aula amb la mateixa identificació";
			titles[152] = "El nom no pot ser null.";
			titles[153] = "Capacitat negativa o igual a 0.";
			titles[154] = "L'equip no pot ser null.";
			titles[155] = "L'equip ja existeix en aquesta aula.";
			
			//HORARI 170:189 :
			
			///////////////////////////////////////////////////////////////////////////////
			///////////////////////////////// RESTRICCIONS ////////////////////////////////
			
			// NoSolapar 190:199 :
			titles[190] = "No podem afegir el solapament perque ja existeix."; 
			titles[191] = "No podem eliminar un solapament que no existeix." ;
			titles[192] = "Les assignatures passades com a paràmetre no poden ser nules.";
			titles[193] = "Les assignatures passades com a paràmetre no poden ser iguals.";
			
			// NoSolaparAssignatura 200:209 : 
			titles[200] = "No podem afegir un no solapar si ja existeix."; 
			titles[201] = "No podem eliminar un no solapar que no existeix." ;
			titles[202] = "L'assignatura passada com a paràmetre no pot ser nula.";
			titles[203] = "L'assignatura ja te un no solapar.";
			
			//HoresSenseClasseGrup 210:219 :
			titles[210] = "EL grup no pot ser null.";
			titles[211] = "No hi ha cap grup associat.";
			titles[212] = "no s'ha entrat hores a prohibir.";
			titles[213] = "El dia ha d'estar entre 0 i 6; ambdos inclosos.";
			titles[214] = "Alguna de le hores estrandes és inferior a 0, o superior a 23.";
			titles[215] = "Alguna de les hores viola la franja del pla d'estudis.";
			
			//Data 220:229 :
			titles[220] = "Dia ha de ser més gran o igual a 0 i més petit o igual a 7.";
			titles[221] = "Hora ha de ser més gran o igual a 0 i més petit o igual a 23.";
			
			//Element 230:249 :
			titles[230] = "El paràmetre data no pot ser nul.";
			titles[231] = "El paràmetre sessioGAssignada no pot ser nul.";
			titles[232] = "El paràmetre sessioSGAssignada no pot ser nul.";
			titles[233] = "El paràmetre campus no pot ser nul.";
			titles[234] = "El paràmetre horari no pot ser nul.";
			titles[235] = ".";
			titles[236] = ".";
			titles[237] = ".";
			titles[238] = ".";
			titles[239] = ".";
			titles[240] = ".";		
			}
		
			//EquipamentNecessari 260:269 :
			titles[260] = "El paràmetre element no pot ser nul.";
	}
	
	/**
	 * Retorna el significat d'un codi d'excepció
	 * @param index Codi d'excepció
	 * @return Retorna un String que identifica el codi d'excepció.
	 */
	static public String getException(int index) {
		ExceptionManagerInitializer();
		return titles[index%titles.length]; // "%titles.length" és necessari per evitar cridar posicions fora de rang.
	}
	
	/**
	 * Llança l'excepció resultant a la decodificació del index (codi d'excepció) entrat.
	 * @param index Identifica l'excepció; n'és el codi.
	 * @throws Exception
	 */
	static public void thrower(int index) throws Exception {
		ExceptionManagerInitializer();
		if(index != 0) throw new Exception(getException(index));
	}
}