package com.bolsadeideas.springboot.form.app.editors;

import java.beans.PropertyEditorSupport;

public class Editor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(text.toUpperCase().trim());
	}
}
