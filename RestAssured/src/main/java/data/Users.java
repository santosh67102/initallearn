package data;

//POJO-plain old java object

public class Users {

	//define variables 
	String name;
	String job;
	
	//constructor
	public Users() {
		
	}

		//Constructor for variables/ to call from the test class 
		public Users(String name, String job) {
			this.name = name;
			this.job = job;
	}
		//getters and setters method

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getJob() {
			return job;
		}

		public void setJob(String job) {
			this.job = job;
		}
		
		
	

		
	
	
	
}
