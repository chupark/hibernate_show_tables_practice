package domain;

import java.sql.Blob;
import java.text.ParseException;
import java.util.Date;

public class TB_Board {
	private Integer num;
	private String name;
	private String title;
	private Blob content;
	private Integer read_count;
	private Date write_date;
	
	public TB_Board() {}
	
	public TB_Board(Integer num, String name, String title, Blob content, Integer read_count, Date write_date) throws ParseException {
		this.setNum(num);
		this.setName(name);
		this.setTitle(title);
		this.setContent(content);
		this.setRead_count(read_count);
		this.setWrite_date(write_date);
	}

	public int getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Blob getContent() {
		return content;
	}

	public void setContent(Blob content) {
		this.content = content;
	}

	public Integer getRead_count() {
		return read_count;
	}

	public void setRead_count(Integer read_count) {
		this.read_count = read_count;
	}

	public Date getWrite_date() throws ParseException {
		return write_date;
	}

	public void setWrite_date(Date write_date) throws ParseException {
		this.write_date = write_date;
	}
}
