// ORM class for table 'certificates_generatedcertificate'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Jun 21 10:09:45 UTC 2014
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

public class certificates_generatedcertificate extends SqoopRecord  implements DBWritable, Writable {
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
  public certificates_generatedcertificate with_id(Integer id) {
    this.id = id;
    return this;
  }
  private Integer user_id;
  public Integer get_user_id() {
    return user_id;
  }
  public void set_user_id(Integer user_id) {
    this.user_id = user_id;
  }
  public certificates_generatedcertificate with_user_id(Integer user_id) {
    this.user_id = user_id;
    return this;
  }
  private String download_url;
  public String get_download_url() {
    return download_url;
  }
  public void set_download_url(String download_url) {
    this.download_url = download_url;
  }
  public certificates_generatedcertificate with_download_url(String download_url) {
    this.download_url = download_url;
    return this;
  }
  private String grade;
  public String get_grade() {
    return grade;
  }
  public void set_grade(String grade) {
    this.grade = grade;
  }
  public certificates_generatedcertificate with_grade(String grade) {
    this.grade = grade;
    return this;
  }
  private String course_id;
  public String get_course_id() {
    return course_id;
  }
  public void set_course_id(String course_id) {
    this.course_id = course_id;
  }
  public certificates_generatedcertificate with_course_id(String course_id) {
    this.course_id = course_id;
    return this;
  }
  private String key;
  public String get_key() {
    return key;
  }
  public void set_key(String key) {
    this.key = key;
  }
  public certificates_generatedcertificate with_key(String key) {
    this.key = key;
    return this;
  }
  private Boolean distinction;
  public Boolean get_distinction() {
    return distinction;
  }
  public void set_distinction(Boolean distinction) {
    this.distinction = distinction;
  }
  public certificates_generatedcertificate with_distinction(Boolean distinction) {
    this.distinction = distinction;
    return this;
  }
  private String status;
  public String get_status() {
    return status;
  }
  public void set_status(String status) {
    this.status = status;
  }
  public certificates_generatedcertificate with_status(String status) {
    this.status = status;
    return this;
  }
  private String verify_uuid;
  public String get_verify_uuid() {
    return verify_uuid;
  }
  public void set_verify_uuid(String verify_uuid) {
    this.verify_uuid = verify_uuid;
  }
  public certificates_generatedcertificate with_verify_uuid(String verify_uuid) {
    this.verify_uuid = verify_uuid;
    return this;
  }
  private String download_uuid;
  public String get_download_uuid() {
    return download_uuid;
  }
  public void set_download_uuid(String download_uuid) {
    this.download_uuid = download_uuid;
  }
  public certificates_generatedcertificate with_download_uuid(String download_uuid) {
    this.download_uuid = download_uuid;
    return this;
  }
  private String name;
  public String get_name() {
    return name;
  }
  public void set_name(String name) {
    this.name = name;
  }
  public certificates_generatedcertificate with_name(String name) {
    this.name = name;
    return this;
  }
  private java.sql.Timestamp created_date;
  public java.sql.Timestamp get_created_date() {
    return created_date;
  }
  public void set_created_date(java.sql.Timestamp created_date) {
    this.created_date = created_date;
  }
  public certificates_generatedcertificate with_created_date(java.sql.Timestamp created_date) {
    this.created_date = created_date;
    return this;
  }
  private java.sql.Timestamp modified_date;
  public java.sql.Timestamp get_modified_date() {
    return modified_date;
  }
  public void set_modified_date(java.sql.Timestamp modified_date) {
    this.modified_date = modified_date;
  }
  public certificates_generatedcertificate with_modified_date(java.sql.Timestamp modified_date) {
    this.modified_date = modified_date;
    return this;
  }
  private String error_reason;
  public String get_error_reason() {
    return error_reason;
  }
  public void set_error_reason(String error_reason) {
    this.error_reason = error_reason;
  }
  public certificates_generatedcertificate with_error_reason(String error_reason) {
    this.error_reason = error_reason;
    return this;
  }
  private String mode;
  public String get_mode() {
    return mode;
  }
  public void set_mode(String mode) {
    this.mode = mode;
  }
  public certificates_generatedcertificate with_mode(String mode) {
    this.mode = mode;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof certificates_generatedcertificate)) {
      return false;
    }
    certificates_generatedcertificate that = (certificates_generatedcertificate) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.download_url == null ? that.download_url == null : this.download_url.equals(that.download_url));
    equal = equal && (this.grade == null ? that.grade == null : this.grade.equals(that.grade));
    equal = equal && (this.course_id == null ? that.course_id == null : this.course_id.equals(that.course_id));
    equal = equal && (this.key == null ? that.key == null : this.key.equals(that.key));
    equal = equal && (this.distinction == null ? that.distinction == null : this.distinction.equals(that.distinction));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.verify_uuid == null ? that.verify_uuid == null : this.verify_uuid.equals(that.verify_uuid));
    equal = equal && (this.download_uuid == null ? that.download_uuid == null : this.download_uuid.equals(that.download_uuid));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.created_date == null ? that.created_date == null : this.created_date.equals(that.created_date));
    equal = equal && (this.modified_date == null ? that.modified_date == null : this.modified_date.equals(that.modified_date));
    equal = equal && (this.error_reason == null ? that.error_reason == null : this.error_reason.equals(that.error_reason));
    equal = equal && (this.mode == null ? that.mode == null : this.mode.equals(that.mode));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.user_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.download_url = JdbcWritableBridge.readString(3, __dbResults);
    this.grade = JdbcWritableBridge.readString(4, __dbResults);
    this.course_id = JdbcWritableBridge.readString(5, __dbResults);
    this.key = JdbcWritableBridge.readString(6, __dbResults);
    this.distinction = JdbcWritableBridge.readBoolean(7, __dbResults);
    this.status = JdbcWritableBridge.readString(8, __dbResults);
    this.verify_uuid = JdbcWritableBridge.readString(9, __dbResults);
    this.download_uuid = JdbcWritableBridge.readString(10, __dbResults);
    this.name = JdbcWritableBridge.readString(11, __dbResults);
    this.created_date = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.modified_date = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.error_reason = JdbcWritableBridge.readString(14, __dbResults);
    this.mode = JdbcWritableBridge.readString(15, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(user_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(download_url, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(grade, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(course_id, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(key, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(distinction, 7 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(status, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(verify_uuid, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(download_uuid, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_date, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(modified_date, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(error_reason, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mode, 15 + __off, 12, __dbStmt);
    return 15;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.user_id = null;
    } else {
    this.user_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.download_url = null;
    } else {
    this.download_url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.grade = null;
    } else {
    this.grade = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.course_id = null;
    } else {
    this.course_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.key = null;
    } else {
    this.key = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.distinction = null;
    } else {
    this.distinction = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.status = null;
    } else {
    this.status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.verify_uuid = null;
    } else {
    this.verify_uuid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.download_uuid = null;
    } else {
    this.download_uuid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.name = null;
    } else {
    this.name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.created_date = null;
    } else {
    this.created_date = new Timestamp(__dataIn.readLong());
    this.created_date.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.modified_date = null;
    } else {
    this.modified_date = new Timestamp(__dataIn.readLong());
    this.modified_date.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.error_reason = null;
    } else {
    this.error_reason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.mode = null;
    } else {
    this.mode = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_id);
    }
    if (null == this.download_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, download_url);
    }
    if (null == this.grade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, grade);
    }
    if (null == this.course_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, course_id);
    }
    if (null == this.key) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, key);
    }
    if (null == this.distinction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.distinction);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
    if (null == this.verify_uuid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, verify_uuid);
    }
    if (null == this.download_uuid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, download_uuid);
    }
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.created_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created_date.getTime());
    __dataOut.writeInt(this.created_date.getNanos());
    }
    if (null == this.modified_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.modified_date.getTime());
    __dataOut.writeInt(this.modified_date.getNanos());
    }
    if (null == this.error_reason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, error_reason);
    }
    if (null == this.mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mode);
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
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(download_url==null?"null":download_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(grade==null?"null":grade, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(course_id==null?"null":course_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(key==null?"null":key, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(distinction==null?"null":"" + distinction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(verify_uuid==null?"null":verify_uuid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(download_uuid==null?"null":download_uuid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name==null?"null":name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_date==null?"null":"" + created_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modified_date==null?"null":"" + modified_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(error_reason==null?"null":error_reason, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mode==null?"null":mode, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.download_url = null; } else {
      this.download_url = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.grade = null; } else {
      this.grade = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.course_id = null; } else {
      this.course_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.key = null; } else {
      this.key = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.distinction = null; } else {
      this.distinction = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.verify_uuid = null; } else {
      this.verify_uuid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.download_uuid = null; } else {
      this.download_uuid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created_date = null; } else {
      this.created_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.modified_date = null; } else {
      this.modified_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.error_reason = null; } else {
      this.error_reason = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.mode = null; } else {
      this.mode = __cur_str;
    }

  }

  public Object clone() throws CloneNotSupportedException {
    certificates_generatedcertificate o = (certificates_generatedcertificate) super.clone();
    o.created_date = (o.created_date != null) ? (java.sql.Timestamp) o.created_date.clone() : null;
    o.modified_date = (o.modified_date != null) ? (java.sql.Timestamp) o.modified_date.clone() : null;
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("download_url", this.download_url);
    __sqoop$field_map.put("grade", this.grade);
    __sqoop$field_map.put("course_id", this.course_id);
    __sqoop$field_map.put("key", this.key);
    __sqoop$field_map.put("distinction", this.distinction);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("verify_uuid", this.verify_uuid);
    __sqoop$field_map.put("download_uuid", this.download_uuid);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("created_date", this.created_date);
    __sqoop$field_map.put("modified_date", this.modified_date);
    __sqoop$field_map.put("error_reason", this.error_reason);
    __sqoop$field_map.put("mode", this.mode);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("user_id".equals(__fieldName)) {
      this.user_id = (Integer) __fieldVal;
    }
    else    if ("download_url".equals(__fieldName)) {
      this.download_url = (String) __fieldVal;
    }
    else    if ("grade".equals(__fieldName)) {
      this.grade = (String) __fieldVal;
    }
    else    if ("course_id".equals(__fieldName)) {
      this.course_id = (String) __fieldVal;
    }
    else    if ("key".equals(__fieldName)) {
      this.key = (String) __fieldVal;
    }
    else    if ("distinction".equals(__fieldName)) {
      this.distinction = (Boolean) __fieldVal;
    }
    else    if ("status".equals(__fieldName)) {
      this.status = (String) __fieldVal;
    }
    else    if ("verify_uuid".equals(__fieldName)) {
      this.verify_uuid = (String) __fieldVal;
    }
    else    if ("download_uuid".equals(__fieldName)) {
      this.download_uuid = (String) __fieldVal;
    }
    else    if ("name".equals(__fieldName)) {
      this.name = (String) __fieldVal;
    }
    else    if ("created_date".equals(__fieldName)) {
      this.created_date = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("modified_date".equals(__fieldName)) {
      this.modified_date = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("error_reason".equals(__fieldName)) {
      this.error_reason = (String) __fieldVal;
    }
    else    if ("mode".equals(__fieldName)) {
      this.mode = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
