package song;

public class Songs {
	private String s1;
	private String  s2;//Song s2
	private String  s3;//Song s3
	private String  s4;
   //private String title;
   // private double duration;
	public Songs() {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
	}
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		if((s1SongPlayed(s1))) {
		this.s1 = s1;
		System.out.println("The Playllist is displayed as: s4,s2,s1");
		}else {
			System.out.println("The given playlist is invalid");
		}
	}
	
	private boolean s1SongPlayed(String s12) {
		if(s12.matches("s4,s2,s1")) {
			return true;
		}else {
		return false;
	}
	}
	public String getS2() {
		return s2;
	}
	public void setS2(String s2) {
		if((s2SongPlayed(s2))) {
			this.s2 = s2;
			System.out.println("The Playllist is displayed as: s3,s4,s2");
			}else {
				System.out.println("The given playlist is invalid");
			}
	}
	private boolean s2SongPlayed(String s22) {
		if(s22.matches("s3,s4,s2")) {
			return true;
		}else {
		return false;
	}
		
	}
	public String getS3() {
		return s3;
	}
	public void setS3(String s3) {
		this.s3 = s3;
	}
	public String getS4() {
		return s4;
	}
	public void setS4(String s4) {
		if((s4SongPlayed(s4))) {
			this.s4 = s4;
			System.out.println("The Playllist is displayed as: s2,s3,s4");
			}else {
				System.out.println("The given playlist is invalid");
			}
	}
	private boolean s4SongPlayed(String s42) {
		if(s42.matches("s2,s3,s4")) {
			return true;
		}else {
		return false;
	}
	}
	
	
	
	

    
    };
		
	
	
	

	
	
	

	
	
	
	

