package hospitalCSE360;

public class BodyPartEffected{
	
	private String username;
	private String bodyPart;
	private String date;

	public BodyPartEffected(String username, String bodyPart, String date){
		super();
		this.date = date;
		this.username = username;
		this.bodyPart = bodyPart;
	}

	public String getDate(){
		return this.date;
	}

	public String getUsername(){
		return username;
	}

	public String getBodyPart(){
		return bodyPart;
	}

	/*
	public String getPatientName() {
		
	}
	*/
}
