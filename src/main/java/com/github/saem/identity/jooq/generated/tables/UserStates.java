/**
 * This class is generated by jOOQ
 */
package com.github.saem.identity.jooq.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserStates extends org.jooq.impl.TableImpl<com.github.saem.identity.jooq.generated.tables.records.UserStatesRecord> {

	private static final long serialVersionUID = 896700586;

	/**
	 * The singleton instance of <code>public.user_states</code>
	 */
	public static final com.github.saem.identity.jooq.generated.tables.UserStates USER_STATES = new com.github.saem.identity.jooq.generated.tables.UserStates();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.github.saem.identity.jooq.generated.tables.records.UserStatesRecord> getRecordType() {
		return com.github.saem.identity.jooq.generated.tables.records.UserStatesRecord.class;
	}

	/**
	 * The column <code>public.user_states.user_state_id</code>.
	 */
	public final org.jooq.TableField<com.github.saem.identity.jooq.generated.tables.records.UserStatesRecord, java.lang.Long> USER_STATE_ID = createField("user_state_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.user_states.user_id</code>.
	 */
	public final org.jooq.TableField<com.github.saem.identity.jooq.generated.tables.records.UserStatesRecord, java.lang.Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.user_states.username</code>.
	 */
	public final org.jooq.TableField<com.github.saem.identity.jooq.generated.tables.records.UserStatesRecord, java.lang.String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>public.user_states.email</code>.
	 */
	public final org.jooq.TableField<com.github.saem.identity.jooq.generated.tables.records.UserStatesRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>public.user_states.password</code>.
	 */
	public final org.jooq.TableField<com.github.saem.identity.jooq.generated.tables.records.UserStatesRecord, java.lang.String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(60).nullable(false), this, "");

	/**
	 * Create a <code>public.user_states</code> table reference
	 */
	public UserStates() {
		this("user_states", null);
	}

	/**
	 * Create an aliased <code>public.user_states</code> table reference
	 */
	public UserStates(java.lang.String alias) {
		this(alias, com.github.saem.identity.jooq.generated.tables.UserStates.USER_STATES);
	}

	private UserStates(java.lang.String alias, org.jooq.Table<com.github.saem.identity.jooq.generated.tables.records.UserStatesRecord> aliased) {
		this(alias, aliased, null);
	}

	private UserStates(java.lang.String alias, org.jooq.Table<com.github.saem.identity.jooq.generated.tables.records.UserStatesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.github.saem.identity.jooq.generated.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.github.saem.identity.jooq.generated.tables.records.UserStatesRecord> getPrimaryKey() {
		return com.github.saem.identity.jooq.generated.Keys.PK_USERS_USER_STATES_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.github.saem.identity.jooq.generated.tables.records.UserStatesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.github.saem.identity.jooq.generated.tables.records.UserStatesRecord>>asList(com.github.saem.identity.jooq.generated.Keys.PK_USERS_USER_STATES_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.github.saem.identity.jooq.generated.tables.records.UserStatesRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.github.saem.identity.jooq.generated.tables.records.UserStatesRecord, ?>>asList(com.github.saem.identity.jooq.generated.Keys.USER_STATES__FK_USER_STATES_USERS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.github.saem.identity.jooq.generated.tables.UserStates as(java.lang.String alias) {
		return new com.github.saem.identity.jooq.generated.tables.UserStates(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.github.saem.identity.jooq.generated.tables.UserStates rename(java.lang.String name) {
		return new com.github.saem.identity.jooq.generated.tables.UserStates(name, null);
	}
}
