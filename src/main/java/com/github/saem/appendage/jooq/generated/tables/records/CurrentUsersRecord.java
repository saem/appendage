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
public class CurrentUsersRecord extends org.jooq.impl.TableRecordImpl<com.github.saem.appendage.jooq.generated.tables.records.CurrentUsersRecord> implements org.jooq.Record6<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean> {

	private static final long serialVersionUID = -321578999;

	/**
	 * Setter for <code>public.current_users.user_id</code>.
	 */
	public void setUserId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.current_users.user_id</code>.
	 */
	public java.lang.Long getUserId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>public.current_users.sequence</code>.
	 */
	public void setSequence(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.current_users.sequence</code>.
	 */
	public java.lang.Long getSequence() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>public.current_users.username</code>.
	 */
	public void setUsername(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.current_users.username</code>.
	 */
	public java.lang.String getUsername() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.current_users.email</code>.
	 */
	public void setEmail(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.current_users.email</code>.
	 */
	public java.lang.String getEmail() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.current_users.password</code>.
	 */
	public void setPassword(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.current_users.password</code>.
	 */
	public java.lang.String getPassword() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>public.current_users.is_disabled</code>.
	 */
	public void setIsDisabled(java.lang.Boolean value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.current_users.is_disabled</code>.
	 */
	public java.lang.Boolean getIsDisabled() {
		return (java.lang.Boolean) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.github.saem.appendage.jooq.generated.tables.CurrentUsers.CURRENT_USERS.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return com.github.saem.appendage.jooq.generated.tables.CurrentUsers.CURRENT_USERS.SEQUENCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.github.saem.appendage.jooq.generated.tables.CurrentUsers.CURRENT_USERS.USERNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.github.saem.appendage.jooq.generated.tables.CurrentUsers.CURRENT_USERS.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.github.saem.appendage.jooq.generated.tables.CurrentUsers.CURRENT_USERS.PASSWORD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field6() {
		return com.github.saem.appendage.jooq.generated.tables.CurrentUsers.CURRENT_USERS.IS_DISABLED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getSequence();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getUsername();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getPassword();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value6() {
		return getIsDisabled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentUsersRecord value1(java.lang.Long value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentUsersRecord value2(java.lang.Long value) {
		setSequence(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentUsersRecord value3(java.lang.String value) {
		setUsername(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentUsersRecord value4(java.lang.String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentUsersRecord value5(java.lang.String value) {
		setPassword(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentUsersRecord value6(java.lang.Boolean value) {
		setIsDisabled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentUsersRecord values(java.lang.Long value1, java.lang.Long value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.Boolean value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CurrentUsersRecord
	 */
	public CurrentUsersRecord() {
		super(com.github.saem.appendage.jooq.generated.tables.CurrentUsers.CURRENT_USERS);
	}

	/**
	 * Create a detached, initialised CurrentUsersRecord
	 */
	public CurrentUsersRecord(java.lang.Long userId, java.lang.Long sequence, java.lang.String username, java.lang.String email, java.lang.String password, java.lang.Boolean isDisabled) {
		super(com.github.saem.appendage.jooq.generated.tables.CurrentUsers.CURRENT_USERS);

		setValue(0, userId);
		setValue(1, sequence);
		setValue(2, username);
		setValue(3, email);
		setValue(4, password);
		setValue(5, isDisabled);
	}
}
