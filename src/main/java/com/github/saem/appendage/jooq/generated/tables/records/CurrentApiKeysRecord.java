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
public class CurrentApiKeysRecord extends org.jooq.impl.TableRecordImpl<com.github.saem.appendage.jooq.generated.tables.records.CurrentApiKeysRecord> implements org.jooq.Record4<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -2067624159;

	/**
	 * Setter for <code>public.current_api_keys.user_id</code>.
	 */
	public void setUserId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.current_api_keys.user_id</code>.
	 */
	public java.lang.Long getUserId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>public.current_api_keys.sequence</code>.
	 */
	public void setSequence(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.current_api_keys.sequence</code>.
	 */
	public java.lang.Long getSequence() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>public.current_api_keys.api_key</code>.
	 */
	public void setApiKey(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.current_api_keys.api_key</code>.
	 */
	public java.lang.String getApiKey() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.current_api_keys.secret</code>.
	 */
	public void setSecret(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.current_api_keys.secret</code>.
	 */
	public java.lang.String getSecret() {
		return (java.lang.String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.github.saem.appendage.jooq.generated.tables.CurrentApiKeys.CURRENT_API_KEYS.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return com.github.saem.appendage.jooq.generated.tables.CurrentApiKeys.CURRENT_API_KEYS.SEQUENCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.github.saem.appendage.jooq.generated.tables.CurrentApiKeys.CURRENT_API_KEYS.API_KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.github.saem.appendage.jooq.generated.tables.CurrentApiKeys.CURRENT_API_KEYS.SECRET;
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
	public CurrentApiKeysRecord value1(java.lang.Long value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentApiKeysRecord value2(java.lang.Long value) {
		setSequence(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentApiKeysRecord value3(java.lang.String value) {
		setApiKey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentApiKeysRecord value4(java.lang.String value) {
		setSecret(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentApiKeysRecord values(java.lang.Long value1, java.lang.Long value2, java.lang.String value3, java.lang.String value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CurrentApiKeysRecord
	 */
	public CurrentApiKeysRecord() {
		super(com.github.saem.appendage.jooq.generated.tables.CurrentApiKeys.CURRENT_API_KEYS);
	}

	/**
	 * Create a detached, initialised CurrentApiKeysRecord
	 */
	public CurrentApiKeysRecord(java.lang.Long userId, java.lang.Long sequence, java.lang.String apiKey, java.lang.String secret) {
		super(com.github.saem.appendage.jooq.generated.tables.CurrentApiKeys.CURRENT_API_KEYS);

		setValue(0, userId);
		setValue(1, sequence);
		setValue(2, apiKey);
		setValue(3, secret);
	}
}
