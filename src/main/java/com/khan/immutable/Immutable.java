package com.khan.immutable;

public final class Immutable {
	private final String field;

	public Immutable(String field) {
		this.field = field;
	}

	public String getField() {
		return field;
	}
}
