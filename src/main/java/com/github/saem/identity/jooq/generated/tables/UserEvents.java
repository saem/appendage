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
public class UserEvents extends org.jooq.impl.TableImpl<com.github.saem.identity.jooq.generated.tables.records.UserEventsRecord> {

	private static final long serialVersionUID = 249729619;

	/**
	 * The singleton instance of <code>public.user_events</code>
	 */
	public static final com.github.saem.identity.jooq.generated.tables.UserEvents USER_EVENTS = new com.github.saem.identity.jooq.generated.tables.UserEvents();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.github.saem.identity.jooq.generated.tables.records.UserEventsRecord> getRecordType() {
		return com.github.saem.identity.jooq.generated.tables.records.UserEventsRecord.class;
	}

	/**
	 * The column <code>public.user_events.sequence</code>.
	 */
	public final org.jooq.TableField<com.github.saem.identity.jooq.generated.tables.records.UserEventsRecord, java.lang.Long> SEQUENCE = createField("sequence", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.user_events.user_id</code>.
	 */
	public final org.jooq.TableField<com.github.saem.identity.jooq.generated.tables.records.UserEventsRecord, java.lang.Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.user_events.user_state_id</code>.
	 */
	public final org.jooq.TableField<com.github.saem.identity.jooq.generated.tables.records.UserEventsRecord, java.lang.Long> USER_STATE_ID = createField("user_state_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>public.user_events</code> table reference
	 */
	public UserEvents() {
		this("user_events", null);
	}

	/**
	 * Create an aliased <code>public.user_events</code> table reference
	 */
	public UserEvents(java.lang.String alias) {
		this(alias, com.github.saem.identity.jooq.generated.tables.UserEvents.USER_EVENTS);
	}

	private UserEvents(java.lang.String alias, org.jooq.Table<com.github.saem.identity.jooq.generated.tables.records.UserEventsRecord> aliased) {
		this(alias, aliased, null);
	}

	private UserEvents(java.lang.String alias, org.jooq.Table<com.github.saem.identity.jooq.generated.tables.records.UserEventsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.github.saem.identity.jooq.generated.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.github.saem.identity.jooq.generated.tables.records.UserEventsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.github.saem.identity.jooq.generated.tables.records.UserEventsRecord, ?>>asList(com.github.saem.identity.jooq.generated.Keys.USER_EVENTS__FK_USER_EVENTS_EVENTS, com.github.saem.identity.jooq.generated.Keys.USER_EVENTS__FK_USER_EVENTS_USERS, com.github.saem.identity.jooq.generated.Keys.USER_EVENTS__FK_USER_EVENTS_USER_STATES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.github.saem.identity.jooq.generated.tables.UserEvents as(java.lang.String alias) {
		return new com.github.saem.identity.jooq.generated.tables.UserEvents(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.github.saem.identity.jooq.generated.tables.UserEvents rename(java.lang.String name) {
		return new com.github.saem.identity.jooq.generated.tables.UserEvents(name, null);
	}
}
