package features_17;

public final class TejaImmutableClass {

	private final String name = "Teja";
	private final String gender = "Male";
	private final int age = 24;
	private final String martialStatus = "Not-Married";
	private final long mobile = 8523099868l;

	final String getName() {

		return this.name;
	}

	final String getGender() {

		return this.gender;
	}

	final int getAge() {

		return this.age;
	}

	final String getMartialStatus() {

		return this.martialStatus;
	}

	final long getMobile() {

		return this.mobile;
	}
}
