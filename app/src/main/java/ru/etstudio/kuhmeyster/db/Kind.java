package ru.etstudio.kuhmeyster.db;

import android.provider.BaseColumns;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public final class Kind {

    public static List<String> initialKinds = new LinkedList<>();

    static {
        initialKinds.add("Салаты");
        initialKinds.add("Закуски и бутерброды");
        initialKinds.add("Первые блюда");
        initialKinds.add("Вторые блюда");
        initialKinds.add("Рыба и морепродукты");
        initialKinds.add("Выпечка");
        initialKinds.add("Несладкая выпечка");
        initialKinds.add("Блины, оладьи, сырники");
        initialKinds.add("Торты и пирожные");
        initialKinds.add("Десерты");
        initialKinds.add("Напитки");
        initialKinds.add("Разное");
    }

    public static final String SQL_CREATE_TABLE = new StringBuffer()
            .append("CREATE TABLE ")
            .append(Entry.TABLE_NAME)
            .append(" (")
            .append(Entry._ID).append(" INTEGER PRIMARY KEY, ")
            .append(Entry.COLUMN_KIND).append(" TEXT, ")
            .append(Entry.COLUMN_CREATED_AT).append(" DATETIME DEFAULT CURRENT_TIMESTAMP")
            .append(")").toString();

    public static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + Entry.TABLE_NAME;

    private int _id;

    private String kind;

    private Date createdAt;

    public Kind() {

    }

    public Kind(int id, String kind) {
        this._id = id;
        this.kind = kind;
    }

    public Kind(String kind) {
        this.kind = kind;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public static abstract class Entry implements BaseColumns {

        public static final String TABLE_NAME = "kind";

        public static final String COLUMN_KIND = "kind";

        public static final String COLUMN_CREATED_AT = "created_at";
    }
}
