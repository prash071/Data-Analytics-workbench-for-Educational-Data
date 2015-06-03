// ORM class for table 'auth_user'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 20 09:29:42 UTC 2014
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

public class auth_user extends SqoopRecord  implements DBWritable, Writable {
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
  public auth_user with_id(Integer id) {
    this.id = id;
    return this;
  }
  private String username;
  public String get_username() {
    return username;
  }
  public void set_username(String username) {
    this.username = username;
  }
  public auth_user with_username(String username) {
    this.username = username;
    return this;
  }
  private String first_name;
  public String get_first_name() {
    return first_name;
  }
  public void set_first_name(String first_name) {
    this.first_name = first_name;
  }
  public auth_user with_first_name(String first_name) {
    this.first_name = first_name;
    return this;
  }
  private String last_name;
  public String get_last_name() {
    return last_name;
  }
  public void set_last_name(String last_name) {
    this.last_name = last_name;
  }
  public auth_user with_last_name(String last_name) {
    this.last_name = last_name;
    return this;
  }
  private String email;
  public String get_email() {
    return email;
  }
  public void set_email(String email) {
    this.email = email;
  }
  public auth_user with_email(String email) {
    this.email = email;
    return this;
  }
  private String password;
  public String get_password() {
    return password;
  }
  public void set_password(String password) {
    this.password = password;
  }
  public auth_user with_password(String password) {
    this.password = password;
    return this;
  }
  private Boolean is_staff;
  public Boolean get_is_staff() {
    return is_staff;
  }
  public void set_is_staff(Boolean is_staff) {
    this.is_staff = is_staff;
  }
  public auth_user with_is_staff(Boolean is_staff) {
    this.is_staff = is_staff;
    return this;
  }
  private Boolean is_active;
  public Boolean get_is_active() {
    return is_active;
  }
  public void set_is_active(Boolean is_active) {
    this.is_active = is_active;
  }
  public auth_user with_is_active(Boolean is_active) {
    this.is_active = is_active;
    return this;
  }
  private Boolean is_superuser;
  public Boolean get_is_superuser() {
    return is_superuser;
  }
  public void set_is_superuser(Boolean is_superuser) {
    this.is_superuser = is_superuser;
  }
  public auth_user with_is_superuser(Boolean is_superuser) {
    this.is_superuser = is_superuser;
    return this;
  }
  private java.sql.Timestamp last_login;
  public java.sql.Timestamp get_last_login() {
    return last_login;
  }
  public void set_last_login(java.sql.Timestamp last_login) {
    this.last_login = last_login;
  }
  public auth_user with_last_login(java.sql.Timestamp last_login) {
    this.last_login = last_login;
    return this;
  }
  private java.sql.Timestamp date_joined;
  public java.sql.Timestamp get_date_joined() {
    return date_joined;
  }
  public void set_date_joined(java.sql.Timestamp date_joined) {
    this.date_joined = date_joined;
  }
  public auth_user with_date_joined(java.sql.Timestamp date_joined) {
    this.date_joined = date_joined;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof auth_user)) {
      return false;
    }
    auth_user that = (auth_user) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.username == null ? that.username == null : this.username.equals(that.username));
    equal = equal && (this.first_name == null ? that.first_name == null : this.first_name.equals(that.first_name));
    equal = equal && (this.last_name == null ? that.last_name == null : this.last_name.equals(that.last_name));
    equal = equal && (this.email == null ? that.email == null : this.email.equals(that.email));
    equal = equal && (this.password == null ? that.password == null : this.password.equals(that.password));
    equal = equal && (this.is_staff == null ? that.is_staff == null : this.is_staff.equals(that.is_staff));
    equal = equal && (this.is_active == null ? that.is_active == null : this.is_active.equals(that.is_active));
    equal = equal && (this.is_superuser == null ? that.is_superuser == null : this.is_superuser.equals(that.is_superuser));
    equal = equal && (this.last_login == null ? that.last_login == null : this.last_login.equals(that.last_login));
    equal = equal && (this.date_joined == null ? that.date_joined == null : this.date_joined.equals(that.date_joined));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.username = JdbcWritableBridge.readString(2, __dbResults);
    this.first_name = JdbcWritableBridge.readString(3, __dbResults);
    this.last_name = JdbcWritableBridge.readString(4, __dbResults);
    this.email = JdbcWritableBridge.readString(5, __dbResults);
    this.password = JdbcWritableBridge.readString(6, __dbResults);
    this.is_staff = JdbcWritableBridge.readBoolean(7, __dbResults);
    this.is_active = JdbcWritableBridge.readBoolean(8, __dbResults);
    this.is_superuser = JdbcWritableBridge.readBoolean(9, __dbResults);
    this.last_login = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.date_joined = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(username, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(first_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(last_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(email, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(password, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(is_staff, 7 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(is_active, 8 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(is_superuser, 9 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeTimestamp(last_login, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(date_joined, 11 + __off, 93, __dbStmt);
    return 11;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.username = null;
    } else {
    this.username = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.first_name = null;
    } else {
    this.first_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.last_name = null;
    } else {
    this.last_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.email = null;
    } else {
    this.email = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.password = null;
    } else {
    this.password = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.is_staff = null;
    } else {
    this.is_staff = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.is_active = null;
    } else {
    this.is_active = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.is_superuser = null;
    } else {
    this.is_superuser = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.last_login = null;
    } else {
    this.last_login = new Timestamp(__dataIn.readLong());
    this.last_login.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.date_joined = null;
    } else {
    this.date_joined = new Timestamp(__dataIn.readLong());
    this.date_joined.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.username) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, username);
    }
    if (null == this.first_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, first_name);
    }
    if (null == this.last_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, last_name);
    }
    if (null == this.email) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, email);
    }
    if (null == this.password) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, password);
    }
    if (null == this.is_staff) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.is_staff);
    }
    if (null == this.is_active) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.is_active);
    }
    if (null == this.is_superuser) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.is_superuser);
    }
    if (null == this.last_login) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_login.getTime());
    __dataOut.writeInt(this.last_login.getNanos());
    }
    if (null == this.date_joined) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.date_joined.getTime());
    __dataOut.writeInt(this.date_joined.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(username==null?"null":username, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_name==null?"null":first_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_name==null?"null":last_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(email==null?"null":email, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(password==null?"null":password, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_staff==null?"null":"" + is_staff, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_active==null?"null":"" + is_active, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_superuser==null?"null":"" + is_superuser, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_login==null?"null":"" + last_login, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_joined==null?"null":"" + date_joined, delimiters));
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
    if (__cur_str.equals("null")) { this.username = null; } else {
      this.username = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.first_name = null; } else {
      this.first_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.last_name = null; } else {
      this.last_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.email = null; } else {
      this.email = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.password = null; } else {
      this.password = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_staff = null; } else {
      this.is_staff = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_active = null; } else {
      this.is_active = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_superuser = null; } else {
      this.is_superuser = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_login = null; } else {
      this.last_login = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.date_joined = null; } else {
      this.date_joined = java.sql.Timestamp.valueOf(__cur_str);
    }

  }

  public Object clone() throws CloneNotSupportedException {
    auth_user o = (auth_user) super.clone();
    o.last_login = (o.last_login != null) ? (java.sql.Timestamp) o.last_login.clone() : null;
    o.date_joined = (o.date_joined != null) ? (java.sql.Timestamp) o.date_joined.clone() : null;
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("username", this.username);
    __sqoop$field_map.put("first_name", this.first_name);
    __sqoop$field_map.put("last_name", this.last_name);
    __sqoop$field_map.put("email", this.email);
    __sqoop$field_map.put("password", this.password);
    __sqoop$field_map.put("is_staff", this.is_staff);
    __sqoop$field_map.put("is_active", this.is_active);
    __sqoop$field_map.put("is_superuser", this.is_superuser);
    __sqoop$field_map.put("last_login", this.last_login);
    __sqoop$field_map.put("date_joined", this.date_joined);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("username".equals(__fieldName)) {
      this.username = (String) __fieldVal;
    }
    else    if ("first_name".equals(__fieldName)) {
      this.first_name = (String) __fieldVal;
    }
    else    if ("last_name".equals(__fieldName)) {
      this.last_name = (String) __fieldVal;
    }
    else    if ("email".equals(__fieldName)) {
      this.email = (String) __fieldVal;
    }
    else    if ("password".equals(__fieldName)) {
      this.password = (String) __fieldVal;
    }
    else    if ("is_staff".equals(__fieldName)) {
      this.is_staff = (Boolean) __fieldVal;
    }
    else    if ("is_active".equals(__fieldName)) {
      this.is_active = (Boolean) __fieldVal;
    }
    else    if ("is_superuser".equals(__fieldName)) {
      this.is_superuser = (Boolean) __fieldVal;
    }
    else    if ("last_login".equals(__fieldName)) {
      this.last_login = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("date_joined".equals(__fieldName)) {
      this.date_joined = (java.sql.Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
