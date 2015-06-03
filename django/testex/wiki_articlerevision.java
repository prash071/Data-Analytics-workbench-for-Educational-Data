// ORM class for table 'wiki_articlerevision'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Jun 21 10:10:09 UTC 2014
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class wiki_articlerevision extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public wiki_articlerevision with_id(Integer id) {
    this.id = id;
    return this;
  }
  private Integer revision_number;
  public Integer get_revision_number() {
    return revision_number;
  }
  public void set_revision_number(Integer revision_number) {
    this.revision_number = revision_number;
  }
  public wiki_articlerevision with_revision_number(Integer revision_number) {
    this.revision_number = revision_number;
    return this;
  }
  private String user_message;
  public String get_user_message() {
    return user_message;
  }
  public void set_user_message(String user_message) {
    this.user_message = user_message;
  }
  public wiki_articlerevision with_user_message(String user_message) {
    this.user_message = user_message;
    return this;
  }
  private String automatic_log;
  public String get_automatic_log() {
    return automatic_log;
  }
  public void set_automatic_log(String automatic_log) {
    this.automatic_log = automatic_log;
  }
  public wiki_articlerevision with_automatic_log(String automatic_log) {
    this.automatic_log = automatic_log;
    return this;
  }
  private String ip_address;
  public String get_ip_address() {
    return ip_address;
  }
  public void set_ip_address(String ip_address) {
    this.ip_address = ip_address;
  }
  public wiki_articlerevision with_ip_address(String ip_address) {
    this.ip_address = ip_address;
    return this;
  }
  private Integer user_id;
  public Integer get_user_id() {
    return user_id;
  }
  public void set_user_id(Integer user_id) {
    this.user_id = user_id;
  }
  public wiki_articlerevision with_user_id(Integer user_id) {
    this.user_id = user_id;
    return this;
  }
  private java.sql.Timestamp modified;
  public java.sql.Timestamp get_modified() {
    return modified;
  }
  public void set_modified(java.sql.Timestamp modified) {
    this.modified = modified;
  }
  public wiki_articlerevision with_modified(java.sql.Timestamp modified) {
    this.modified = modified;
    return this;
  }
  private java.sql.Timestamp created;
  public java.sql.Timestamp get_created() {
    return created;
  }
  public void set_created(java.sql.Timestamp created) {
    this.created = created;
  }
  public wiki_articlerevision with_created(java.sql.Timestamp created) {
    this.created = created;
    return this;
  }
  private Integer previous_revision_id;
  public Integer get_previous_revision_id() {
    return previous_revision_id;
  }
  public void set_previous_revision_id(Integer previous_revision_id) {
    this.previous_revision_id = previous_revision_id;
  }
  public wiki_articlerevision with_previous_revision_id(Integer previous_revision_id) {
    this.previous_revision_id = previous_revision_id;
    return this;
  }
  private Boolean deleted;
  public Boolean get_deleted() {
    return deleted;
  }
  public void set_deleted(Boolean deleted) {
    this.deleted = deleted;
  }
  public wiki_articlerevision with_deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }
  private Boolean locked;
  public Boolean get_locked() {
    return locked;
  }
  public void set_locked(Boolean locked) {
    this.locked = locked;
  }
  public wiki_articlerevision with_locked(Boolean locked) {
    this.locked = locked;
    return this;
  }
  private Integer article_id;
  public Integer get_article_id() {
    return article_id;
  }
  public void set_article_id(Integer article_id) {
    this.article_id = article_id;
  }
  public wiki_articlerevision with_article_id(Integer article_id) {
    this.article_id = article_id;
    return this;
  }
  private String content;
  public String get_content() {
    return content;
  }
  public void set_content(String content) {
    this.content = content;
  }
  public wiki_articlerevision with_content(String content) {
    this.content = content;
    return this;
  }
  private String title;
  public String get_title() {
    return title;
  }
  public void set_title(String title) {
    this.title = title;
  }
  public wiki_articlerevision with_title(String title) {
    this.title = title;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof wiki_articlerevision)) {
      return false;
    }
    wiki_articlerevision that = (wiki_articlerevision) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.revision_number == null ? that.revision_number == null : this.revision_number.equals(that.revision_number));
    equal = equal && (this.user_message == null ? that.user_message == null : this.user_message.equals(that.user_message));
    equal = equal && (this.automatic_log == null ? that.automatic_log == null : this.automatic_log.equals(that.automatic_log));
    equal = equal && (this.ip_address == null ? that.ip_address == null : this.ip_address.equals(that.ip_address));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.modified == null ? that.modified == null : this.modified.equals(that.modified));
    equal = equal && (this.created == null ? that.created == null : this.created.equals(that.created));
    equal = equal && (this.previous_revision_id == null ? that.previous_revision_id == null : this.previous_revision_id.equals(that.previous_revision_id));
    equal = equal && (this.deleted == null ? that.deleted == null : this.deleted.equals(that.deleted));
    equal = equal && (this.locked == null ? that.locked == null : this.locked.equals(that.locked));
    equal = equal && (this.article_id == null ? that.article_id == null : this.article_id.equals(that.article_id));
    equal = equal && (this.content == null ? that.content == null : this.content.equals(that.content));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.revision_number = JdbcWritableBridge.readInteger(2, __dbResults);
    this.user_message = JdbcWritableBridge.readString(3, __dbResults);
    this.automatic_log = JdbcWritableBridge.readString(4, __dbResults);
    this.ip_address = JdbcWritableBridge.readString(5, __dbResults);
    this.user_id = JdbcWritableBridge.readInteger(6, __dbResults);
    this.modified = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.created = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.previous_revision_id = JdbcWritableBridge.readInteger(9, __dbResults);
    this.deleted = JdbcWritableBridge.readBoolean(10, __dbResults);
    this.locked = JdbcWritableBridge.readBoolean(11, __dbResults);
    this.article_id = JdbcWritableBridge.readInteger(12, __dbResults);
    this.content = JdbcWritableBridge.readString(13, __dbResults);
    this.title = JdbcWritableBridge.readString(14, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(revision_number, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(user_message, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(automatic_log, 4 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(ip_address, 5 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(user_id, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(modified, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(previous_revision_id, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBoolean(deleted, 10 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(locked, 11 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeInteger(article_id, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(content, 13 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(title, 14 + __off, 12, __dbStmt);
    return 14;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.revision_number = null;
    } else {
    this.revision_number = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.user_message = null;
    } else {
    this.user_message = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.automatic_log = null;
    } else {
    this.automatic_log = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ip_address = null;
    } else {
    this.ip_address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.user_id = null;
    } else {
    this.user_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.modified = null;
    } else {
    this.modified = new Timestamp(__dataIn.readLong());
    this.modified.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.created = null;
    } else {
    this.created = new Timestamp(__dataIn.readLong());
    this.created.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.previous_revision_id = null;
    } else {
    this.previous_revision_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.deleted = null;
    } else {
    this.deleted = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.locked = null;
    } else {
    this.locked = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.article_id = null;
    } else {
    this.article_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.content = null;
    } else {
    this.content = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.title = null;
    } else {
    this.title = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.revision_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.revision_number);
    }
    if (null == this.user_message) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_message);
    }
    if (null == this.automatic_log) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, automatic_log);
    }
    if (null == this.ip_address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ip_address);
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_id);
    }
    if (null == this.modified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.modified.getTime());
    __dataOut.writeInt(this.modified.getNanos());
    }
    if (null == this.created) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created.getTime());
    __dataOut.writeInt(this.created.getNanos());
    }
    if (null == this.previous_revision_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.previous_revision_id);
    }
    if (null == this.deleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.deleted);
    }
    if (null == this.locked) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.locked);
    }
    if (null == this.article_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.article_id);
    }
    if (null == this.content) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, content);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
  }
  private final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(revision_number==null?"null":"" + revision_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_message==null?"null":user_message, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(automatic_log==null?"null":automatic_log, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ip_address==null?"null":ip_address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modified==null?"null":"" + modified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created==null?"null":"" + created, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(previous_revision_id==null?"null":"" + previous_revision_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(deleted==null?"null":"" + deleted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(locked==null?"null":"" + locked, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(article_id==null?"null":"" + article_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(content==null?"null":content, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  private final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str;
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.revision_number = null; } else {
      this.revision_number = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.user_message = null; } else {
      this.user_message = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.automatic_log = null; } else {
      this.automatic_log = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ip_address = null; } else {
      this.ip_address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.modified = null; } else {
      this.modified = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created = null; } else {
      this.created = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.previous_revision_id = null; } else {
      this.previous_revision_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.deleted = null; } else {
      this.deleted = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.locked = null; } else {
      this.locked = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.article_id = null; } else {
      this.article_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.content = null; } else {
      this.content = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

  }

  public Object clone() throws CloneNotSupportedException {
    wiki_articlerevision o = (wiki_articlerevision) super.clone();
    o.modified = (o.modified != null) ? (java.sql.Timestamp) o.modified.clone() : null;
    o.created = (o.created != null) ? (java.sql.Timestamp) o.created.clone() : null;
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("revision_number", this.revision_number);
    __sqoop$field_map.put("user_message", this.user_message);
    __sqoop$field_map.put("automatic_log", this.automatic_log);
    __sqoop$field_map.put("ip_address", this.ip_address);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("modified", this.modified);
    __sqoop$field_map.put("created", this.created);
    __sqoop$field_map.put("previous_revision_id", this.previous_revision_id);
    __sqoop$field_map.put("deleted", this.deleted);
    __sqoop$field_map.put("locked", this.locked);
    __sqoop$field_map.put("article_id", this.article_id);
    __sqoop$field_map.put("content", this.content);
    __sqoop$field_map.put("title", this.title);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("revision_number".equals(__fieldName)) {
      this.revision_number = (Integer) __fieldVal;
    }
    else    if ("user_message".equals(__fieldName)) {
      this.user_message = (String) __fieldVal;
    }
    else    if ("automatic_log".equals(__fieldName)) {
      this.automatic_log = (String) __fieldVal;
    }
    else    if ("ip_address".equals(__fieldName)) {
      this.ip_address = (String) __fieldVal;
    }
    else    if ("user_id".equals(__fieldName)) {
      this.user_id = (Integer) __fieldVal;
    }
    else    if ("modified".equals(__fieldName)) {
      this.modified = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("created".equals(__fieldName)) {
      this.created = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("previous_revision_id".equals(__fieldName)) {
      this.previous_revision_id = (Integer) __fieldVal;
    }
    else    if ("deleted".equals(__fieldName)) {
      this.deleted = (Boolean) __fieldVal;
    }
    else    if ("locked".equals(__fieldName)) {
      this.locked = (Boolean) __fieldVal;
    }
    else    if ("article_id".equals(__fieldName)) {
      this.article_id = (Integer) __fieldVal;
    }
    else    if ("content".equals(__fieldName)) {
      this.content = (String) __fieldVal;
    }
    else    if ("title".equals(__fieldName)) {
      this.title = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
