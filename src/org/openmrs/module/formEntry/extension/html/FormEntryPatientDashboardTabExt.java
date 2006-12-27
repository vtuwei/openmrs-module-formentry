package org.openmrs.module.formEntry.extension.html;

import org.openmrs.module.Extension;
import org.openmrs.module.web.extension.PatientDashboardTabExt;

public class FormEntryPatientDashboardTabExt extends PatientDashboardTabExt {

	public Extension.MEDIA_TYPE getMediaType() {
		return Extension.MEDIA_TYPE.html;
	}
	
	@Override
	public String getPortletUrl() {
		return "patientForms";
	}

	@Override
	public String getRequiredPrivilege() {
		return "Patient Dashboard - View Forms Section";
	}

	@Override
	public String getTabId() {
		return "patientForms";
	}

	@Override
	public String getTabName() {
		return "formEntry.patientDashboard.forms";
	}
	
}