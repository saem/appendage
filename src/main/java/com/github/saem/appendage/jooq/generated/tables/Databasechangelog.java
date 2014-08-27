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
public class Databasechangelog extends org.jooq.impl.TableImpl<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangelogRecord> {

	private static final long serialVersionUID = -1616290368;

	/**
	 * The singleton instance of <code>public.databasechangelog</code>
	 */
	public static final com.github.saem.appendage.jooq.generated.tables.Databasechangelog DATABASECHANGELOG = new com.github.saem.appendage.jooq.generated.tables.Databasechangelog();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangelogRecord> getRecordType() {
		return com.github.saem.appendage.jooq.generated.tables.records.DatabasechangelogRecord.class;
	}

	/**
	 * The column <code>public.databasechangelog.id</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangelogRecord, java.lang.String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>public.databasechangelog.author</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangelogRecord, java.lang.String> AUTHOR = createField("author", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>public.databasechangelog.filename</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangelogRecord, java.lang.String> FILENAME = createField("filename", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>public.databasechangelog.dateexecuted</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangelogRecord, java.sql.Timestamp> DATEEXECUTED = createField("dateexecuted", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * The column <code>public.databasechangelog.orderexecuted</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangelogRecord, java.lang.Integer> ORDEREXECUTED = createField("orderexecuted", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.databasechangelog.exectype</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangelogRecord, java.lang.String> EXECTYPE = createField("exectype", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

	/**
	 * The column <code>public.databasechangelog.md5sum</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangelogRecord, java.lang.String> MD5SUM = createField("md5sum", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>public.databasechangelog.description</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangelogRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>public.databasechangelog.comments</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangelogRecord, java.lang.String> COMMENTS = createField("comments", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>public.databasechangelog.tag</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangelogRecord, java.lang.String> TAG = createField("tag", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>public.databasechangelog.liquibase</code>.
	 */
	public final org.jooq.TableField<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangelogRecord, java.lang.String> LIQUIBASE = createField("liquibase", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * Create a <code>public.databasechangelog</code> table reference
	 */
	public Databasechangelog() {
		this("databasechangelog", null);
	}

	/**
	 * Create an aliased <code>public.databasechangelog</code> table reference
	 */
	public Databasechangelog(java.lang.String alias) {
		this(alias, com.github.saem.appendage.jooq.generated.tables.Databasechangelog.DATABASECHANGELOG);
	}

	private Databasechangelog(java.lang.String alias, org.jooq.Table<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangelogRecord> aliased) {
		this(alias, aliased, null);
	}

	private Databasechangelog(java.lang.String alias, org.jooq.Table<com.github.saem.appendage.jooq.generated.tables.records.DatabasechangelogRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.github.saem.appendage.jooq.generated.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.github.saem.appendage.jooq.generated.tables.Databasechangelog as(java.lang.String alias) {
		return new com.github.saem.appendage.jooq.generated.tables.Databasechangelog(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.github.saem.appendage.jooq.generated.tables.Databasechangelog rename(java.lang.String name) {
		return new com.github.saem.appendage.jooq.generated.tables.Databasechangelog(name, null);
	}
}
