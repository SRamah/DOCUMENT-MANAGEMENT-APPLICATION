package Search_File;

public class listLin {
	private Fil1 file ;
	private int score=0 ;
	public listLin() {
		super();
	}
	public listLin(Fil1 file, int score) {
		super();
		this.file = file;
		this.score = score;
	}
	public Fil1 getFile() {
		return file;
	}
	public void setFile(Fil1 file) {
		this.file = file;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}
