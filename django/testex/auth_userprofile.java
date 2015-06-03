// ORM class for table 'auth_userprofile'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Jun 21 09:54:36 UTC 2014
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

public class auth_userprofile extends SqoopRecord  implements DBWritable, Writable {
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
  public auth_userprofile with_id(Integer id) {
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
  public auth_userprofile with_user_id(Integer user_id) {
    this.user_id = user_id;
    return this;
  }
  private String name;
  public String get_name() {
    return name;
  }
  public void set_name(String name) {
    this.name = name;
  }
  public auth_userprofile with_name(String name) {
    this.name = name;
    return this;
  }
  private String language;
  public String get_language() {
    return language;
  }
  public void set_language(String language) {
    this.language = language;
  }
  public auth_userprofile with_language(String language) {
    this.language = language;
    return this;
  }
  private String location;
  public String get_location() {
    return location;
  }
  public void set_location(String location) {
    this.location = location;
  }
  public auth_userprofile with_location(String location) {
    this.location = location;
    return this;
  }
  private String meta;
  public String get_meta() {
    return meta;
  }
  public void set_meta(String meta) {
    this.meta = meta;
  }
  public auth_userprofile with_meta(String meta) {
    this.meta = meta;
    return this;
  }
  private String courseware;
  public String get_courseware() {
    return courseware;
  }
  public void set_courseware(String courseware) {
    this.courseware = courseware;
  }
  public auth_userprofile with_courseware(String courseware) {
    this.courseware = courseware;
    return this;
  }
  private String gender;
  public String get_gender() {
    return gender;
  }
  public void set_gender(String gender) {
    this.gender = gender;
  }
  public auth_userprofile with_gender(String gender) {
    this.gender = gender;
    return this;
  }
  private String mailing_address;
  public String get_mailing_address() {
    return mailing_address;
  }
  public void set_mailing_address(String mailing_address) {
    this.mailing_address = mailing_address;
  }
  public auth_userprofile with_mailing_address(String mailing_address) {
    this.mailing_address = mailing_address;
    return this;
  }
  private Integer year_of_birth;
  public Integer get_year_of_birth() {
    return year_of_birth;
  }
  public void set_year_of_birth(Integer year_of_birth) {
    this.year_of_birth = year_of_birth;
  }
  public auth_userprofile with_year_of_birth(Integer year_of_birth) {
    this.year_of_birth = year_of_birth;
    return this;
  }
  private String level_of_education;
  public String get_level_of_education() {
    return level_of_education;
  }
  public void set_level_of_education(String level_of_education) {
    this.level_of_education = level_of_education;
  }
  public auth_userprofile with_level_of_education(String level_of_education) {
    this.level_of_education = level_of_education;
    return this;
  }
  private String goals;
  public String get_goals() {
    return goals;
  }
  public void set_goals(String goals) {
    this.goals = goals;
  }
  public auth_userprofile with_goals(String goals) {
    this.goals = goals;
    return this;
  }
  private Boolean allow_certificate;
  public Boolean get_allow_certificate() {
    return allow_certificate;
  }
  public void set_allow_certificate(Boolean allow_certificate) {
    this.allow_certificate = allow_certificate;
  }
  public auth_userprofile with_allow_certificate(Boolean allow_certificate) {
    this.allow_certificate = allow_certificate;
    return this;
  }
  private String country;
  public String get_country() {
    return country;
  }
  public void set_country(String country) {
    this.country = country;
  }
  public auth_userprofile with_country(String country) {
    this.country = country;
    return this;
  }
  private String city;
  public String get_city() {
    return city;
  }
  public void set_city(String city) {
    this.city = city;
  }
  public auth_userprofile with_city(String city) {
    this.city = city;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof auth_userprofile)) {
      return false;
    }
    auth_userprofile that = (auth_userprofile) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.language == null ? that.language == null : this.language.equals(that.language));
    equal = equal && (this.location == null ? that.location == null : this.location.equals(that.location));
    equal = equal && (this.meta == null ? that.meta == null : this.meta.equals(that.meta));
    equal = equal && (this.courseware == null ? that.courseware == null : this.courseware.equals(that.courseware));
    equal = equal && (this.gender == null ? that.gender == null : this.gender.equals(that.gender));
    equal = equal && (this.mailing_address == null ? that.mailing_address == null : this.mailing_address.equals(that.mailing_address));
    equal = equal && (this.year_of_birth == null ? that.year_of_birth == null : this.year_of_birth.equals(that.year_of_birth));
    equal = equal && (this.level_of_education == null ? that.level_of_education == null : this.level_of_education.equals(that.level_of_education));
    equal = equal && (this.goals == null ? that.goals == null : this.goals.equals(that.goals));
    equal = equal && (this.allow_certificate == null ? that.allow_certificate == null : this.allow_certificate.equals(that.allow_certificate));
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.user_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.name = JdbcWritableBridge.readString(3, __dbResults);
    this.language = JdbcWritableBridge.readString(4, __dbResults);
    this.location = JdbcWritableBridge.readString(5, __dbResults);
    this.meta = JdbcWritableBridge.readString(6, __dbResults);
    this.courseware = JdbcWritableBridge.readString(7, __dbResults);
    this.gender = JdbcWritableBridge.readString(8, __dbResults);
    this.mailing_address = JdbcWritableBridge.readString(9, __dbResults);
    this.year_of_birth = JdbcWritableBridge.readInteger(10, __dbResults);
    this.level_of_education = JdbcWritableBridge.readString(11, __dbResults);
    this.goals = JdbcWritableBridge.readString(12, __dbResults);
    this.allow_certificate = JdbcWritableBridge.readBoolean(13, __dbResults);
    this.country = JdbcWritableBridge.readString(14, __dbResults);
    this.city = JdbcWritableBridge.readString(15, __dbResults);
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
    JdbcWritableBridge.writeString(name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(language, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(location, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(meta, 6 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(courseware, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(gender, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mailing_address, 9 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(year_of_birth, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(level_of_education, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(goals, 12 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeBoolean(allow_certificate, 13 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(country, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 15 + __off, -1, __dbStmt);
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
        this.name = null;
    } else {
    this.name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.language = null;
    } else {
    this.language = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.location = null;
    } else {
    this.location = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.meta = null;
    } else {
    this.meta = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.courseware = null;
    } else {
    this.courseware = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.gender = null;
    } else {
    this.gender = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.mailing_address = null;
    } else {
    this.mailing_address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.year_of_birth = null;
    } else {
    this.year_of_birth = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.level_of_education = null;
    } else {
    this.level_of_education = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.goals = null;
    } else {
    this.goals = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.allow_certificate = null;
    } else {
    this.allow_certificate = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.country = null;
    } else {
    this.country = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city = null;
    } else {
    this.city = Text.readString(__dataIn);
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
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.language) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, language);
    }
    if (null == this.location) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, location);
    }
    if (null == this.meta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, meta);
    }
    if (null == this.courseware) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, courseware);
    }
    if (null == this.gender) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, gender);
    }
    if (null == this.mailing_address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mailing_address);
    }
    if (null == this.year_of_birth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.year_of_birth);
    }
    if (null == this.level_of_education) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, level_of_education);
    }
    if (null == this.goals) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, goals);
    }
    if (null == this.allow_certificate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.allow_certificate);
    }
    if (null == this.country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
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
    __sb.append(FieldFormatter.escapeAndEnclose(name==null?"null":name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(language==null?"null":language, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(location==null?"null":location, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(meta==null?"null":meta, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(courseware==null?"null":courseware, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gender==null?"null":gender, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mailing_address==null?"null":mailing_address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(year_of_birth==null?"null":"" + year_of_birth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(level_of_education==null?"null":level_of_education, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(goals==null?"null":goals, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(allow_certificate==null?"null":"" + allow_certificate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
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
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.language = null; } else {
      this.language = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.location = null; } else {
      this.location = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.meta = null; } else {
      this.meta = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.courseware = null; } else {
      this.courseware = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.gender = null; } else {
      this.gender = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.mailing_address = null; } else {
      this.mailing_address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.year_of_birth = null; } else {
      this.year_of_birth = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.level_of_education = null; } else {
      this.level_of_education = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.goals = null; } else {
      this.goals = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.allow_certificate = null; } else {
      this.allow_certificate = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.country = null; } else {
      this.country = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

  }

  public Object clone() throws CloneNotSupportedException {
    auth_userprofile o = (auth_userprofile) super.clone();
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("language", this.language);
    __sqoop$field_map.put("location", this.location);
    __sqoop$field_map.put("meta", this.meta);
    __sqoop$field_map.put("courseware", this.courseware);
    __sqoop$field_map.put("gender", this.gender);
    __sqoop$field_map.put("mailing_address", this.mailing_address);
    __sqoop$field_map.put("year_of_birth", this.year_of_birth);
    __sqoop$field_map.put("level_of_education", this.level_of_education);
    __sqoop$field_map.put("goals", this.goals);
    __sqoop$field_map.put("allow_certificate", this.allow_certificate);
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("city", this.city);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("user_id".equals(__fieldName)) {
      this.user_id = (Integer) __fieldVal;
    }
    else    if ("name".equals(__fieldName)) {
      this.name = (String) __fieldVal;
    }
    else    if ("language".equals(__fieldName)) {
      this.language = (String) __fieldVal;
    }
    else    if ("location".equals(__fieldName)) {
      this.location = (String) __fieldVal;
    }
    else    if ("meta".equals(__fieldName)) {
      this.meta = (String) __fieldVal;
    }
    else    if ("courseware".equals(__fieldName)) {
      this.courseware = (String) __fieldVal;
    }
    else    if ("gender".equals(__fieldName)) {
      this.gender = (String) __fieldVal;
    }
    else    if ("mailing_address".equals(__fieldName)) {
      this.mailing_address = (String) __fieldVal;
    }
    else    if ("year_of_birth".equals(__fieldName)) {
      this.year_of_birth = (Integer) __fieldVal;
    }
    else    if ("level_of_education".equals(__fieldName)) {
      this.level_of_education = (String) __fieldVal;
    }
    else    if ("goals".equals(__fieldName)) {
      this.goals = (String) __fieldVal;
    }
    else    if ("allow_certificate".equals(__fieldName)) {
      this.allow_certificate = (Boolean) __fieldVal;
    }
    else    if ("country".equals(__fieldName)) {
      this.country = (String) __fieldVal;
    }
    else    if ("city".equals(__fieldName)) {
      this.city = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
