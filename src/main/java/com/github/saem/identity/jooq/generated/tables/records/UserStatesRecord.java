/**
 * This class is generated by jOOQ
 */
package com.github.saem.identity.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserStatesRecord extends org.jooq.impl.UpdatableRecordImpl<com.github.saem.identity.jooq.generated.tables.records.UserStatesRecord> implements org.jooq.Record5<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1588416177;

	/**
	 * Setter for <code>public.user_states.user_state_id</code>.
	 */
	public void setUserStateId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.user_states.user_state_id</code>.
	 */
	public java.lang.Long getUserStateId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>public.user_states.user_id</code>.
	 */
	public void setUserId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.user_states.user_id</code>.
	 */
	public java.lang.Long getUserId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>public.user_states.username</code>.
	 */
	public void setUsername(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.user_states.username</code>.
	 */
	public java.lang.String getUsername() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.user_states.email</code>.
	 */
	public void setEmail(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.user_states.email</code>.
	 */
	public java.lang.String getEmail() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.user_states.password</code>.
	 */
	public void setPassword(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.user_states.password</code>.
	 */
	public java.lang.String getPassword() {
		return (java.lang.String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.github.saem.identity.jooq.generated.tables.UserStates.USER_STATES.USER_STATE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return com.github.saem.identity.jooq.generated.tables.UserStates.USER_STATES.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.github.saem.identity.jooq.generated.tables.UserStates.USER_STATES.USERNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.github.saem.identity.jooq.generated.tables.UserStates.USER_STATES.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.github.saem.identity.jooq.generated.tables.UserStates.USER_STATES.PASSWORD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getUserStateId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getUserId();
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
	public UserStatesRecord value1(java.lang.Long value) {
		setUserStateId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserStatesRecord value2(java.lang.Long value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserStatesRecord value3(java.lang.String value) {
		setUsername(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserStatesRecord value4(java.lang.String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserStatesRecord value5(java.lang.String value) {
		setPassword(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserStatesRecord values(java.lang.Long value1, java.lang.Long value2, java.lang.String value3, java.lang.String value4, java.lang.String value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserStatesRecord
	 */
	public UserStatesRecord() {
		super(com.github.saem.identity.jooq.generated.tables.UserStates.USER_STATES);
	}

	/**
	 * Create a detached, initialised UserStatesRecord
	 */
	public UserStatesRecord(java.lang.Long userStateId, java.lang.Long userId, java.lang.String username, java.lang.String email, java.lang.String password) {
		super(com.github.saem.identity.jooq.generated.tables.UserStates.USER_STATES);

		setValue(0, userStateId);
		setValue(1, userId);
		setValue(2, username);
		setValue(3, email);
		setValue(4, password);
	}
}