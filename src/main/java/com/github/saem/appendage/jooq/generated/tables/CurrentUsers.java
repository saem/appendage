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
public class CurrentUsers extends org.jooq.impl.TableImpl<com.github.saem.appendage.jooq.generated.tables.records.CurrentUsersRecord> {

	private static final long serialVersionUID = 1506848116;

	/**
	 * The singleton instance of <code>public.current_users</code>
	 */
	public static final com.github.saem.appendage.jooq.generated.tables.CurrentUsers CURRENT_USERS = new com.github.saem.appendage.jooq.generated.tables.CurrentUsers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.github.saem.appendage.jooq.generated.tables.records.CurrentUsersRecord> getRecordType() {
		return com.github.saem.appendage.jooq.generated.tables.records.CurrentUsersRecord.class;
	}

	/**
	 * The column <code>public.current_users.user_id</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.CurrentUsersRecord, java.lang.Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.current_users.sequence</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.CurrentUsersRecord, java.lang.Long> SEQUENCE = createField("sequence", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.current_users.username</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.CurrentUsersRecord, java.lang.String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>public.current_users.email</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.CurrentUsersRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>public.current_users.password</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.CurrentUsersRecord, java.lang.String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "");

	/**
	 * The column <code>public.current_users.is_disabled</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.CurrentUsersRecord, java.lang.Boolean> IS_DISABLED = createField("is_disabled", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * Create a <code>public.current_users</code> table reference
	 */
	public CurrentUsers() {
		this("current_users", null);
	}

	/**
	 * Create an aliased <code>public.current_users</code> table reference
	 */
	public CurrentUsers(java.lang.String alias) {
		this(alias, com.github.saem.appendage.jooq.generated.tables.CurrentUsers.CURRENT_USERS);
	}

	private CurrentUsers(java.lang.String alias, org.jooq.Table<com.github.saem.appendage.jooq.generated.tables.records.CurrentUsersRecord> aliased) {
		this(alias, aliased, null);
	}

	private CurrentUsers(java.lang.String alias, org.jooq.Table<com.github.saem.appendage.jooq.generated.tables.records.CurrentUsersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.github.saem.appendage.jooq.generated.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.github.saem.appendage.jooq.generated.tables.CurrentUsers as(java.lang.String alias) {
		return new com.github.saem.appendage.jooq.generated.tables.CurrentUsers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.github.saem.appendage.jooq.generated.tables.CurrentUsers rename(java.lang.String name) {
		return new com.github.saem.appendage.jooq.generated.tables.CurrentUsers(name, null);
	}
}
