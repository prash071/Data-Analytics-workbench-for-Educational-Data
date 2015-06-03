// ORM class for table 'celery_taskmeta'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Jun 21 10:06:12 UTC 2014
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

public class celery_taskmeta extends SqoopRecord  implements DBWritable, Writable {
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
  public celery_taskmeta with_id(Integer id) {
    this.id = id;
    return this;
  }
  private String task_id;
  public String get_task_id() {
    return task_id;
  }
  public void set_task_id(String task_id) {
    this.task_id = task_id;
  }
  public celery_taskmeta with_task_id(String task_id) {
    this.task_id = task_id;
    return this;
  }
  private String status;
  public String get_status() {
    return status;
  }
  public void set_status(String status) {
    this.status = status;
  }
  public celery_taskmeta with_status(String status) {
    this.status = status;
    return this;
  }
  private String result;
  public String get_result() {
    return result;
  }
  public void set_result(String result) {
    this.result = result;
  }
  public celery_taskmeta with_result(String result) {
    this.result = result;
    return this;
  }
  private java.sql.Timestamp date_done;
  public java.sql.Timestamp get_date_done() {
    return date_done;
  }
  public void set_date_done(java.sql.Timestamp date_done) {
    this.date_done = date_done;
  }
  public celery_taskmeta with_date_done(java.sql.Timestamp date_done) {
    this.date_done = date_done;
    return this;
  }
  private String traceback;
  public String get_traceback() {
    return traceback;
  }
  public void set_traceback(String traceback) {
    this.traceback = traceback;
  }
  public celery_taskmeta with_traceback(String traceback) {
    this.traceback = traceback;
    return this;
  }
  private Boolean hidden;
  public Boolean get_hidden() {
    return hidden;
  }
  public void set_hidden(Boolean hidden) {
    this.hidden = hidden;
  }
  public celery_taskmeta with_hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }
  private String meta;
  public String get_meta() {
    return meta;
  }
  public void set_meta(String meta) {
    this.meta = meta;
  }
  public celery_taskmeta with_meta(String meta) {
    this.meta = meta;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof celery_taskmeta)) {
      return false;
    }
    celery_taskmeta that = (celery_taskmeta) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.task_id == null ? that.task_id == null : this.task_id.equals(that.task_id));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.result == null ? that.result == null : this.result.equals(that.result));
    equal = equal && (this.date_done == null ? that.date_done == null : this.date_done.equals(that.date_done));
    equal = equal && (this.traceback == null ? that.traceback == null : this.traceback.equals(that.traceback));
    equal = equal && (this.hidden == null ? that.hidden == null : this.hidden.equals(that.hidden));
    equal = equal && (this.meta == null ? that.meta == null : this.meta.equals(that.meta));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.task_id = JdbcWritableBridge.readString(2, __dbResults);
    this.status = JdbcWritableBridge.readString(3, __dbResults);
    this.result = JdbcWritableBridge.readString(4, __dbResults);
    this.date_done = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.traceback = JdbcWritableBridge.readString(6, __dbResults);
    this.hidden = JdbcWritableBridge.readBoolean(7, __dbResults);
    this.meta = JdbcWritableBridge.readString(8, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(task_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(result, 4 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(date_done, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(traceback, 6 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeBoolean(hidden, 7 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(meta, 8 + __off, -1, __dbStmt);
    return 8;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.task_id = null;
    } else {
    this.task_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.status = null;
    } else {
    this.status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.result = null;
    } else {
    this.result = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date_done = null;
    } else {
    this.date_done = new Timestamp(__dataIn.readLong());
    this.date_done.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.traceback = null;
    } else {
    this.traceback = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hidden = null;
    } else {
    this.hidden = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.meta = null;
    } else {
    this.meta = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.task_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, task_id);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
    if (null == this.result) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, result);
    }
    if (null == this.date_done) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.date_done.getTime());
    __dataOut.writeInt(this.date_done.getNanos());
    }
    if (null == this.traceback) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, traceback);
    }
    if (null == this.hidden) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.hidden);
    }
    if (null == this.meta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, meta);
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
    __sb.append(FieldFormatter.escapeAndEnclose(task_id==null?"null":task_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(result==null?"null":result, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_done==null?"null":"" + date_done, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(traceback==null?"null":traceback, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hidden==null?"null":"" + hidden, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(meta==null?"null":meta, delimiters));
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
    if (__cur_str.equals("null")) { this.task_id = null; } else {
      this.task_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.result = null; } else {
      this.result = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.date_done = null; } else {
      this.date_done = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.traceback = null; } else {
      this.traceback = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hidden = null; } else {
      this.hidden = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.meta = null; } else {
      this.meta = __cur_str;
    }

  }

  public Object clone() throws CloneNotSupportedException {
    celery_taskmeta o = (celery_taskmeta) super.clone();
    o.date_done = (o.date_done != null) ? (java.sql.Timestamp) o.date_done.clone() : null;
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("task_id", this.task_id);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("result", this.result);
    __sqoop$field_map.put("date_done", this.date_done);
    __sqoop$field_map.put("traceback", this.traceback);
    __sqoop$field_map.put("hidden", this.hidden);
    __sqoop$field_map.put("meta", this.meta);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("task_id".equals(__fieldName)) {
      this.task_id = (String) __fieldVal;
    }
    else    if ("status".equals(__fieldName)) {
      this.status = (String) __fieldVal;
    }
    else    if ("result".equals(__fieldName)) {
      this.result = (String) __fieldVal;
    }
    else    if ("date_done".equals(__fieldName)) {
      this.date_done = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("traceback".equals(__fieldName)) {
      this.traceback = (String) __fieldVal;
    }
    else    if ("hidden".equals(__fieldName)) {
      this.hidden = (Boolean) __fieldVal;
    }
    else    if ("meta".equals(__fieldName)) {
      this.meta = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
