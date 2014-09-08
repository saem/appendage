/**
 * This class is generated by jOOQ
 */
package com.github.saem.appendage.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatabasechangeloglockRecord extends org.jooq.impl.UpdatableRecordImpl<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangeloglockRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.Boolean, java.sql.Timestamp, java.lang.String> {

	private static final long serialVersionUID = 1996128902;

	/**
	 * Setter for <code>public.databasechangeloglock.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.databasechangeloglock.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.databasechangeloglock.locked</code>.
	 */
	public void setLocked(java.lang.Boolean value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.databasechangeloglock.locked</code>.
	 */
	public java.lang.Boolean getLocked() {
		return (java.lang.Boolean) getValue(1);
	}

	/**
	 * Setter for <code>public.databasechangeloglock.lockgranted</code>.
	 */
	public void setLockgranted(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.databasechangeloglock.lockgranted</code>.
	 */
	public java.sql.Timestamp getLockgranted() {
		return (java.sql.Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>public.databasechangeloglock.lockedby</code>.
	 */
	public void setLockedby(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.databasechangeloglock.lockedby</code>.
	 */
	public java.lang.String getLockedby() {
		return (java.lang.String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Boolean, java.sql.Timestamp, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Boolean, java.sql.Timestamp, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.github.saem.appendage.jooq.generated.tables.Databasechangeloglock.DATABASECHANGELOGLOCK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field2() {
		return com.github.saem.appendage.jooq.generated.tables.Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return com.github.saem.appendage.jooq.generated.tables.Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKGRANTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.github.saem.appendage.jooq.generated.tables.Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKEDBY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value2() {
		return getLocked();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getLockgranted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getLockedby();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatabasechangeloglockRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatabasechangeloglockRecord value2(java.lang.Boolean value) {
		setLocked(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatabasechangeloglockRecord value3(java.sql.Timestamp value) {
		setLockgranted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatabasechangeloglockRecord value4(java.lang.String value) {
		setLockedby(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatabasechangeloglockRecord values(java.lang.Integer value1, java.lang.Boolean value2, java.sql.Timestamp value3, java.lang.String value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DatabasechangeloglockRecord
	 */
	public DatabasechangeloglockRecord() {
		super(com.github.saem.appendage.jooq.generated.tables.Databasechangeloglock.DATABASECHANGELOGLOCK);
	}

	/**
	 * Create a detached, initialised DatabasechangeloglockRecord
	 */
	public DatabasechangeloglockRecord(java.lang.Integer id, java.lang.Boolean locked, java.sql.Timestamp lockgranted, java.lang.String lockedby) {
		super(com.github.saem.appendage.jooq.generated.tables.Databasechangeloglock.DATABASECHANGELOGLOCK);

		setValue(0, id);
		setValue(1, locked);
		setValue(2, lockgranted);
		setValue(3, lockedby);
	}
}
