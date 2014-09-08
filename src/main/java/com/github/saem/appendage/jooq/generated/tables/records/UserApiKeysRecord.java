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
public class UserApiKeysRecord extends org.jooq.impl.UpdatableRecordImpl<com.github.saem.appendage.jooq.generated.tables.records.UserApiKeysRecord> implements org.jooq.Record5<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean> {

	private static final long serialVersionUID = 1367164821;

	/**
	 * Setter for <code>public.user_api_keys.sequence</code>.
	 */
	public void setSequence(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.user_api_keys.sequence</code>.
	 */
	public java.lang.Long getSequence() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>public.user_api_keys.user_id</code>.
	 */
	public void setUserId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.user_api_keys.user_id</code>.
	 */
	public java.lang.Long getUserId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>public.user_api_keys.api_key</code>.
	 */
	public void setApiKey(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.user_api_keys.api_key</code>.
	 */
	public java.lang.String getApiKey() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.user_api_keys.secret</code>.
	 */
	public void setSecret(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.user_api_keys.secret</code>.
	 */
	public java.lang.String getSecret() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.user_api_keys.revoked</code>.
	 */
	public void setRevoked(java.lang.Boolean value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.user_api_keys.revoked</code>.
	 */
	public java.lang.Boolean getRevoked() {
		return (java.lang.Boolean) getValue(4);
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
	public org.jooq.Row5<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.github.saem.appendage.jooq.generated.tables.UserApiKeys.USER_API_KEYS.SEQUENCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return com.github.saem.appendage.jooq.generated.tables.UserApiKeys.USER_API_KEYS.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.github.saem.appendage.jooq.generated.tables.UserApiKeys.USER_API_KEYS.API_KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.github.saem.appendage.jooq.generated.tables.UserApiKeys.USER_API_KEYS.SECRET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field5() {
		return com.github.saem.appendage.jooq.generated.tables.UserApiKeys.USER_API_KEYS.REVOKED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getSequence();
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
		return getApiKey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getSecret();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value5() {
		return getRevoked();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserApiKeysRecord value1(java.lang.Long value) {
		setSequence(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserApiKeysRecord value2(java.lang.Long value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserApiKeysRecord value3(java.lang.String value) {
		setApiKey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserApiKeysRecord value4(java.lang.String value) {
		setSecret(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserApiKeysRecord value5(java.lang.Boolean value) {
		setRevoked(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserApiKeysRecord values(java.lang.Long value1, java.lang.Long value2, java.lang.String value3, java.lang.String value4, java.lang.Boolean value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserApiKeysRecord
	 */
	public UserApiKeysRecord() {
		super(com.github.saem.appendage.jooq.generated.tables.UserApiKeys.USER_API_KEYS);
	}

	/**
	 * Create a detached, initialised UserApiKeysRecord
	 */
	public UserApiKeysRecord(java.lang.Long sequence, java.lang.Long userId, java.lang.String apiKey, java.lang.String secret, java.lang.Boolean revoked) {
		super(com.github.saem.appendage.jooq.generated.tables.UserApiKeys.USER_API_KEYS);

		setValue(0, sequence);
		setValue(1, userId);
		setValue(2, apiKey);
		setValue(3, secret);
		setValue(4, revoked);
	}
}
