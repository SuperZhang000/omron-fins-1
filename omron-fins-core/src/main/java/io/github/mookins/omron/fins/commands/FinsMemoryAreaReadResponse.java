package io.github.mookins.omron.fins.commands;

import java.util.Collections;
import java.util.List;

import io.github.mookins.omron.fins.FinsCommandCode;
import io.github.mookins.omron.fins.FinsEndCode;

public abstract class FinsMemoryAreaReadResponse<T> extends SimpleFinsResponse {

	private final List<T> items;

	public FinsMemoryAreaReadResponse(final FinsEndCode errorCode, final List<T> items) {
		super(FinsCommandCode.MEMORY_AREA_READ, errorCode);
		this.items = items;
	}

	public List<T> getItems() {
		return Collections.unmodifiableList(this.items);
	}
	
}
