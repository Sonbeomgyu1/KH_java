package kh.test.jdbckh.board.model.dto;

public class ArrachFileDto {
	private int bno;
	private String filepath;
	private String fileno;
	
	
	
	




	public ArrachFileDto() {
		super();
	}




	public ArrachFileDto(String filepath) {
		super();
		this.filepath = filepath;
	}




	@Override
	public String toString() {
		return "ArrachFileDto [bno=" + bno + ", filepath=" + filepath + ", fileno=" + fileno + "]";
	}




	public int getBno() {
		return bno;
	}




	public void setBno(int bno) {
		this.bno = bno;
	}




	public String getFilepath() {
		return filepath;
	}




	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}




	public String getFileno() {
		return fileno;
	}




	public void setFileno(String fileno) {
		this.fileno = fileno;
	}
	
	
	
	
	
}
