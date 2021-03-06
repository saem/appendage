/**
 * This class is generated by jOOQ
 */
package com.github.saem.appendage.jooq.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CurrentApiKeys extends org.jooq.impl.TableImpl<com.github.saem.appendage.jooq.generated.tables.records.CurrentApiKeysRecord> {

	private static final long serialVersionUID = -791787621;

	/**
	 * The singleton instance of <code>public.current_api_keys</code>
	 */
	public static final com.github.saem.appendage.jooq.generated.tables.CurrentApiKeys CURRENT_API_KEYS = new com.github.saem.appendage.jooq.generated.tables.CurrentApiKeys();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.github.saem.appendage.jooq.generated.tables.records.CurrentApiKeysRecord> getRecordType() {
		return com.github.saem.appendage.jooq.generated.tables.records.CurrentApiKeysRecord.class;
	}

	/**
	 * The column <code>public.current_api_keys.user_id</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.CurrentApiKeysRecord, java.lang.Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.current_api_keys.sequence</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.CurrentApiKeysRecord, java.lang.Long> SEQUENCE = createField("sequence", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.current_api_keys.api_key</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.CurrentApiKeysRecord, java.lang.String> API_KEY = createField("api_key", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>public.current_api_keys.secret</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.CurrentApiKeysRecord, java.lang.String> SECRET = createField("secret", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * Create a <code>public.current_api_keys</code> table reference
	 */
	public CurrentApiKeys() {
		this("current_api_keys", null);
	}

	/**
	 * Create an aliased <code>public.current_api_keys</code> table reference
	 */
	public CurrentApiKeys(java.lang.String alias) {
		this(alias, com.github.saem.appendage.jooq.generated.tables.CurrentApiKeys.CURRENT_API_KEYS);
	}

	private CurrentApiKeys(java.lang.String alias, org.jooq.Table<com.github.saem.appendage.jooq.generated.tables.records.CurrentApiKeysRecord> aliased) {
		this(alias, aliased, null);
	}

	private CurrentApiKeys(java.lang.String alias, org.jooq.Table<com.github.saem.appendage.jooq.generated.tables.records.CurrentApiKeysRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.github.saem.appendage.jooq.generated.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.github.saem.appendage.jooq.generated.tables.CurrentApiKeys as(java.lang.String alias) {
		return new com.github.saem.appendage.jooq.generated.tables.CurrentApiKeys(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.github.saem.appendage.jooq.generated.tables.CurrentApiKeys rename(java.lang.String name) {
		return new com.github.saem.appendage.jooq.generated.tables.CurrentApiKeys(name, null);
	}
}
