/*
* generated by Xtext
*/
package de.emueller.xtext.recordmapper;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RecordMapperStandaloneSetup extends RecordMapperStandaloneSetupGenerated{

	public static void doSetup() {
		new RecordMapperStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
