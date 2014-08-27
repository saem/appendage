/**
 * This class is generated by jOOQ
 */
package com.github.saem.appendage.jooq.generated;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<com.github.saem.appendage.jooq.generated.tables.records.EventsRecord, java.lang.Long> IDENTITY_EVENTS = Identities0.IDENTITY_EVENTS;
	public static final org.jooq.Identity<com.github.saem.appendage.jooq.generated.tables.records.UsersRecord, java.lang.Long> IDENTITY_USERS = Identities0.IDENTITY_USERS;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangeloglockRecord> PK_DATABASECHANGELOGLOCK = UniqueKeys0.PK_DATABASECHANGELOGLOCK;
	public static final org.jooq.UniqueKey<com.github.saem.appendage.jooq.generated.tables.records.EventsRecord> PK_EVENTS_SEQUENCE = UniqueKeys0.PK_EVENTS_SEQUENCE;
	public static final org.jooq.UniqueKey<com.github.saem.appendage.jooq.generated.tables.records.UsersRecord> PK_USERS_USER_ID = UniqueKeys0.PK_USERS_USER_ID;
	public static final org.jooq.UniqueKey<com.github.saem.appendage.jooq.generated.tables.records.UserStatesRecord> PK_USERS_USER_STATES_ID = UniqueKeys0.PK_USERS_USER_STATES_ID;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<com.github.saem.appendage.jooq.generated.tables.records.EventsRecord, com.github.saem.appendage.jooq.generated.tables.records.UsersRecord> EVENTS__FK_EVENTS_USERS = ForeignKeys0.EVENTS__FK_EVENTS_USERS;
	public static final org.jooq.ForeignKey<com.github.saem.appendage.jooq.generated.tables.records.UserEventsRecord, com.github.saem.appendage.jooq.generated.tables.records.EventsRecord> USER_EVENTS__FK_USER_EVENTS_EVENTS = ForeignKeys0.USER_EVENTS__FK_USER_EVENTS_EVENTS;
	public static final org.jooq.ForeignKey<com.github.saem.appendage.jooq.generated.tables.records.UserEventsRecord, com.github.saem.appendage.jooq.generated.tables.records.UsersRecord> USER_EVENTS__FK_USER_EVENTS_USERS = ForeignKeys0.USER_EVENTS__FK_USER_EVENTS_USERS;
	public static final org.jooq.ForeignKey<com.github.saem.appendage.jooq.generated.tables.records.UserEventsRecord, com.github.saem.appendage.jooq.generated.tables.records.UserStatesRecord> USER_EVENTS__FK_USER_EVENTS_USER_STATES = ForeignKeys0.USER_EVENTS__FK_USER_EVENTS_USER_STATES;
	public static final org.jooq.ForeignKey<com.github.saem.appendage.jooq.generated.tables.records.UserStatesRecord, com.github.saem.appendage.jooq.generated.tables.records.UsersRecord> USER_STATES__FK_USER_STATES_USERS = ForeignKeys0.USER_STATES__FK_USER_STATES_USERS;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<com.github.saem.appendage.jooq.generated.tables.records.EventsRecord, java.lang.Long> IDENTITY_EVENTS = createIdentity(com.github.saem.appendage.jooq.generated.tables.Events.EVENTS, com.github.saem.appendage.jooq.generated.tables.Events.EVENTS.SEQUENCE);
		public static org.jooq.Identity<com.github.saem.appendage.jooq.generated.tables.records.UsersRecord, java.lang.Long> IDENTITY_USERS = createIdentity(com.github.saem.appendage.jooq.generated.tables.Users.USERS, com.github.saem.appendage.jooq.generated.tables.Users.USERS.USER_ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangeloglockRecord> PK_DATABASECHANGELOGLOCK = createUniqueKey(com.github.saem.appendage.jooq.generated.tables.Databasechangeloglock.DATABASECHANGELOGLOCK, com.github.saem.appendage.jooq.generated.tables.Databasechangeloglock.DATABASECHANGELOGLOCK.ID);
		public static final org.jooq.UniqueKey<com.github.saem.appendage.jooq.generated.tables.records.EventsRecord> PK_EVENTS_SEQUENCE = createUniqueKey(com.github.saem.appendage.jooq.generated.tables.Events.EVENTS, com.github.saem.appendage.jooq.generated.tables.Events.EVENTS.SEQUENCE);
		public static final org.jooq.UniqueKey<com.github.saem.appendage.jooq.generated.tables.records.UsersRecord> PK_USERS_USER_ID = createUniqueKey(com.github.saem.appendage.jooq.generated.tables.Users.USERS, com.github.saem.appendage.jooq.generated.tables.Users.USERS.USER_ID);
		public static final org.jooq.UniqueKey<com.github.saem.appendage.jooq.generated.tables.records.UserStatesRecord> PK_USERS_USER_STATES_ID = createUniqueKey(com.github.saem.appendage.jooq.generated.tables.UserStates.USER_STATES, com.github.saem.appendage.jooq.generated.tables.UserStates.USER_STATES.USER_STATE_ID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<com.github.saem.appendage.jooq.generated.tables.records.EventsRecord, com.github.saem.appendage.jooq.generated.tables.records.UsersRecord> EVENTS__FK_EVENTS_USERS = createForeignKey(com.github.saem.appendage.jooq.generated.Keys.PK_USERS_USER_ID, com.github.saem.appendage.jooq.generated.tables.Events.EVENTS, com.github.saem.appendage.jooq.generated.tables.Events.EVENTS.USER_ID);
		public static final org.jooq.ForeignKey<com.github.saem.appendage.jooq.generated.tables.records.UserEventsRecord, com.github.saem.appendage.jooq.generated.tables.records.EventsRecord> USER_EVENTS__FK_USER_EVENTS_EVENTS = createForeignKey(com.github.saem.appendage.jooq.generated.Keys.PK_EVENTS_SEQUENCE, com.github.saem.appendage.jooq.generated.tables.UserEvents.USER_EVENTS, com.github.saem.appendage.jooq.generated.tables.UserEvents.USER_EVENTS.SEQUENCE);
		public static final org.jooq.ForeignKey<com.github.saem.appendage.jooq.generated.tables.records.UserEventsRecord, com.github.saem.appendage.jooq.generated.tables.records.UsersRecord> USER_EVENTS__FK_USER_EVENTS_USERS = createForeignKey(com.github.saem.appendage.jooq.generated.Keys.PK_USERS_USER_ID, com.github.saem.appendage.jooq.generated.tables.UserEvents.USER_EVENTS, com.github.saem.appendage.jooq.generated.tables.UserEvents.USER_EVENTS.USER_ID);
		public static final org.jooq.ForeignKey<com.github.saem.appendage.jooq.generated.tables.records.UserEventsRecord, com.github.saem.appendage.jooq.generated.tables.records.UserStatesRecord> USER_EVENTS__FK_USER_EVENTS_USER_STATES = createForeignKey(com.github.saem.appendage.jooq.generated.Keys.PK_USERS_USER_STATES_ID, com.github.saem.appendage.jooq.generated.tables.UserEvents.USER_EVENTS, com.github.saem.appendage.jooq.generated.tables.UserEvents.USER_EVENTS.USER_STATE_ID);
		public static final org.jooq.ForeignKey<com.github.saem.appendage.jooq.generated.tables.records.UserStatesRecord, com.github.saem.appendage.jooq.generated.tables.records.UsersRecord> USER_STATES__FK_USER_STATES_USERS = createForeignKey(com.github.saem.appendage.jooq.generated.Keys.PK_USERS_USER_ID, com.github.saem.appendage.jooq.generated.tables.UserStates.USER_STATES, com.github.saem.appendage.jooq.generated.tables.UserStates.USER_STATES.USER_ID);
	}
}
