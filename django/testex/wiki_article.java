// ORM class for table 'wiki_article'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Jun 21 10:10:39 UTC 2014
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

public class wiki_article extends SqoopRecord  implements DBWritable, Writable {
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
  public wiki_article with_id(Integer id) {
    this.id = id;
    return this;
  }
  private Integer current_revision_id;
  public Integer get_current_revision_id() {
    return current_revision_id;
  }
  public void set_current_revision_id(Integer current_revision_id) {
    this.current_revision_id = current_revision_id;
  }
  public wiki_article with_current_revision_id(Integer current_revision_id) {
    this.current_revision_id = current_revision_id;
    return this;
  }
  private java.sql.Timestamp created;
  public java.sql.Timestamp get_created() {
    return created;
  }
  public void set_created(java.sql.Timestamp created) {
    this.created = created;
  }
  public wiki_article with_created(java.sql.Timestamp created) {
    this.created = created;
    return this;
  }
  private java.sql.Timestamp modified;
  public java.sql.Timestamp get_modified() {
    return modified;
  }
  public void set_modified(java.sql.Timestamp modified) {
    this.modified = modified;
  }
  public wiki_article with_modified(java.sql.Timestamp modified) {
    this.modified = modified;
    return this;
  }
  private Integer owner_id;
  public Integer get_owner_id() {
    return owner_id;
  }
  public void set_owner_id(Integer owner_id) {
    this.owner_id = owner_id;
  }
  public wiki_article with_owner_id(Integer owner_id) {
    this.owner_id = owner_id;
    return this;
  }
  private Integer group_id;
  public Integer get_group_id() {
    return group_id;
  }
  public void set_group_id(Integer group_id) {
    this.group_id = group_id;
  }
  public wiki_article with_group_id(Integer group_id) {
    this.group_id = group_id;
    return this;
  }
  private Boolean group_read;
  public Boolean get_group_read() {
    return group_read;
  }
  public void set_group_read(Boolean group_read) {
    this.group_read = group_read;
  }
  public wiki_article with_group_read(Boolean group_read) {
    this.group_read = group_read;
    return this;
  }
  private Boolean group_write;
  public Boolean get_group_write() {
    return group_write;
  }
  public void set_group_write(Boolean group_write) {
    this.group_write = group_write;
  }
  public wiki_article with_group_write(Boolean group_write) {
    this.group_write = group_write;
    return this;
  }
  private Boolean other_read;
  public Boolean get_other_read() {
    return other_read;
  }
  public void set_other_read(Boolean other_read) {
    this.other_read = other_read;
  }
  public wiki_article with_other_read(Boolean other_read) {
    this.other_read = other_read;
    return this;
  }
  private Boolean other_write;
  public Boolean get_other_write() {
    return other_write;
  }
  public void set_other_write(Boolean other_write) {
    this.other_write = other_write;
  }
  public wiki_article with_other_write(Boolean other_write) {
    this.other_write = other_write;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof wiki_article)) {
      return false;
    }
    wiki_article that = (wiki_article) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.current_revision_id == null ? that.current_revision_id == null : this.current_revision_id.equals(that.current_revision_id));
    equal = equal && (this.created == null ? that.created == null : this.created.equals(that.created));
    equal = equal && (this.modified == null ? that.modified == null : this.modified.equals(that.modified));
    equal = equal && (this.owner_id == null ? that.owner_id == null : this.owner_id.equals(that.owner_id));
    equal = equal && (this.group_id == null ? that.group_id == null : this.group_id.equals(that.group_id));
    equal = equal && (this.group_read == null ? that.group_read == null : this.group_read.equals(that.group_read));
    equal = equal && (this.group_write == null ? that.group_write == null : this.group_write.equals(that.group_write));
    equal = equal && (this.other_read == null ? that.other_read == null : this.other_read.equals(that.other_read));
    equal = equal && (this.other_write == null ? that.other_write == null : this.other_write.equals(that.other_write));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.current_revision_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.created = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.modified = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.owner_id = JdbcWritableBridge.readInteger(5, __dbResults);
    this.group_id = JdbcWritableBridge.readInteger(6, __dbResults);
    this.group_read = JdbcWritableBridge.readBoolean(7, __dbResults);
    this.group_write = JdbcWritableBridge.readBoolean(8, __dbResults);
    this.other_read = JdbcWritableBridge.readBoolean(9, __dbResults);
    this.other_write = JdbcWritableBridge.readBoolean(10, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(current_revision_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(modified, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(owner_id, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(group_id, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBoolean(group_read, 7 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(group_write, 8 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(other_read, 9 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(other_write, 10 + __off, -7, __dbStmt);
    return 10;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.current_revision_id = null;
    } else {
    this.current_revision_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.created = null;
    } else {
    this.created = new Timestamp(__dataIn.readLong());
    this.created.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.modified = null;
    } else {
    this.modified = new Timestamp(__dataIn.readLong());
    this.modified.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.owner_id = null;
    } else {
    this.owner_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.group_id = null;
    } else {
    this.group_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.group_read = null;
    } else {
    this.group_read = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.group_write = null;
    } else {
    this.group_write = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.other_read = null;
    } else {
    this.other_read = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.other_write = null;
    } else {
    this.other_write = Boolean.valueOf(__dataIn.readBoolean());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.current_revision_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.current_revision_id);
    }
    if (null == this.created) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created.getTime());
    __dataOut.writeInt(this.created.getNanos());
    }
    if (null == this.modified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.modified.getTime());
    __dataOut.writeInt(this.modified.getNanos());
    }
    if (null == this.owner_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.owner_id);
    }
    if (null == this.group_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.group_id);
    }
    if (null == this.group_read) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.group_read);
    }
    if (null == this.group_write) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.group_write);
    }
    if (null == this.other_read) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.other_read);
    }
    if (null == this.other_write) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.other_write);
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
    __sb.append(FieldFormatter.escapeAndEnclose(current_revision_id==null?"null":"" + current_revision_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created==null?"null":"" + created, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modified==null?"null":"" + modified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(owner_id==null?"null":"" + owner_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(group_id==null?"null":"" + group_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(group_read==null?"null":"" + group_read, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(group_write==null?"null":"" + group_write, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(other_read==null?"null":"" + other_read, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(other_write==null?"null":"" + other_write, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.current_revision_id = null; } else {
      this.current_revision_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created = null; } else {
      this.created = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.modified = null; } else {
      this.modified = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.owner_id = null; } else {
      this.owner_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.group_id = null; } else {
      this.group_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.group_read = null; } else {
      this.group_read = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.group_write = null; } else {
      this.group_write = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.other_read = null; } else {
      this.other_read = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.other_write = null; } else {
      this.other_write = BooleanParser.valueOf(__cur_str);
    }

  }

  public Object clone() throws CloneNotSupportedException {
    wiki_article o = (wiki_article) super.clone();
    o.created = (o.created != null) ? (java.sql.Timestamp) o.created.clone() : null;
    o.modified = (o.modified != null) ? (java.sql.Timestamp) o.modified.clone() : null;
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("current_revision_id", this.current_revision_id);
    __sqoop$field_map.put("created", this.created);
    __sqoop$field_map.put("modified", this.modified);
    __sqoop$field_map.put("owner_id", this.owner_id);
    __sqoop$field_map.put("group_id", this.group_id);
    __sqoop$field_map.put("group_read", this.group_read);
    __sqoop$field_map.put("group_write", this.group_write);
    __sqoop$field_map.put("other_read", this.other_read);
    __sqoop$field_map.put("other_write", this.other_write);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("current_revision_id".equals(__fieldName)) {
      this.current_revision_id = (Integer) __fieldVal;
    }
    else    if ("created".equals(__fieldName)) {
      this.created = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("modified".equals(__fieldName)) {
      this.modified = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("owner_id".equals(__fieldName)) {
      this.owner_id = (Integer) __fieldVal;
    }
    else    if ("group_id".equals(__fieldName)) {
      this.group_id = (Integer) __fieldVal;
    }
    else    if ("group_read".equals(__fieldName)) {
      this.group_read = (Boolean) __fieldVal;
    }
    else    if ("group_write".equals(__fieldName)) {
      this.group_write = (Boolean) __fieldVal;
    }
    else    if ("other_read".equals(__fieldName)) {
      this.other_read = (Boolean) __fieldVal;
    }
    else    if ("other_write".equals(__fieldName)) {
      this.other_write = (Boolean) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
