// ORM class for table 'courseware_studentmodulehistory'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Jun 21 10:08:40 UTC 2014
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

public class courseware_studentmodulehistory extends SqoopRecord  implements DBWritable, Writable {
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
  public courseware_studentmodulehistory with_id(Integer id) {
    this.id = id;
    return this;
  }
  private Integer student_module_id;
  public Integer get_student_module_id() {
    return student_module_id;
  }
  public void set_student_module_id(Integer student_module_id) {
    this.student_module_id = student_module_id;
  }
  public courseware_studentmodulehistory with_student_module_id(Integer student_module_id) {
    this.student_module_id = student_module_id;
    return this;
  }
  private String version;
  public String get_version() {
    return version;
  }
  public void set_version(String version) {
    this.version = version;
  }
  public courseware_studentmodulehistory with_version(String version) {
    this.version = version;
    return this;
  }
  private java.sql.Timestamp created;
  public java.sql.Timestamp get_created() {
    return created;
  }
  public void set_created(java.sql.Timestamp created) {
    this.created = created;
  }
  public courseware_studentmodulehistory with_created(java.sql.Timestamp created) {
    this.created = created;
    return this;
  }
  private String state;
  public String get_state() {
    return state;
  }
  public void set_state(String state) {
    this.state = state;
  }
  public courseware_studentmodulehistory with_state(String state) {
    this.state = state;
    return this;
  }
  private Double grade;
  public Double get_grade() {
    return grade;
  }
  public void set_grade(Double grade) {
    this.grade = grade;
  }
  public courseware_studentmodulehistory with_grade(Double grade) {
    this.grade = grade;
    return this;
  }
  private Double max_grade;
  public Double get_max_grade() {
    return max_grade;
  }
  public void set_max_grade(Double max_grade) {
    this.max_grade = max_grade;
  }
  public courseware_studentmodulehistory with_max_grade(Double max_grade) {
    this.max_grade = max_grade;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof courseware_studentmodulehistory)) {
      return false;
    }
    courseware_studentmodulehistory that = (courseware_studentmodulehistory) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.student_module_id == null ? that.student_module_id == null : this.student_module_id.equals(that.student_module_id));
    equal = equal && (this.version == null ? that.version == null : this.version.equals(that.version));
    equal = equal && (this.created == null ? that.created == null : this.created.equals(that.created));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.grade == null ? that.grade == null : this.grade.equals(that.grade));
    equal = equal && (this.max_grade == null ? that.max_grade == null : this.max_grade.equals(that.max_grade));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.student_module_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.version = JdbcWritableBridge.readString(3, __dbResults);
    this.created = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.state = JdbcWritableBridge.readString(5, __dbResults);
    this.grade = JdbcWritableBridge.readDouble(6, __dbResults);
    this.max_grade = JdbcWritableBridge.readDouble(7, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(student_module_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(version, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(state, 5 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeDouble(grade, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(max_grade, 7 + __off, 8, __dbStmt);
    return 7;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.student_module_id = null;
    } else {
    this.student_module_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.version = null;
    } else {
    this.version = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.created = null;
    } else {
    this.created = new Timestamp(__dataIn.readLong());
    this.created.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.state = null;
    } else {
    this.state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.grade = null;
    } else {
    this.grade = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.max_grade = null;
    } else {
    this.max_grade = Double.valueOf(__dataIn.readDouble());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.student_module_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.student_module_id);
    }
    if (null == this.version) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, version);
    }
    if (null == this.created) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created.getTime());
    __dataOut.writeInt(this.created.getNanos());
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.grade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.grade);
    }
    if (null == this.max_grade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.max_grade);
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
    __sb.append(FieldFormatter.escapeAndEnclose(student_module_id==null?"null":"" + student_module_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(version==null?"null":version, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created==null?"null":"" + created, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(grade==null?"null":"" + grade, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(max_grade==null?"null":"" + max_grade, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.student_module_id = null; } else {
      this.student_module_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.version = null; } else {
      this.version = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created = null; } else {
      this.created = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.grade = null; } else {
      this.grade = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.max_grade = null; } else {
      this.max_grade = Double.valueOf(__cur_str);
    }

  }

  public Object clone() throws CloneNotSupportedException {
    courseware_studentmodulehistory o = (courseware_studentmodulehistory) super.clone();
    o.created = (o.created != null) ? (java.sql.Timestamp) o.created.clone() : null;
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("student_module_id", this.student_module_id);
    __sqoop$field_map.put("version", this.version);
    __sqoop$field_map.put("created", this.created);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("grade", this.grade);
    __sqoop$field_map.put("max_grade", this.max_grade);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("student_module_id".equals(__fieldName)) {
      this.student_module_id = (Integer) __fieldVal;
    }
    else    if ("version".equals(__fieldName)) {
      this.version = (String) __fieldVal;
    }
    else    if ("created".equals(__fieldName)) {
      this.created = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("state".equals(__fieldName)) {
      this.state = (String) __fieldVal;
    }
    else    if ("grade".equals(__fieldName)) {
      this.grade = (Double) __fieldVal;
    }
    else    if ("max_grade".equals(__fieldName)) {
      this.max_grade = (Double) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
