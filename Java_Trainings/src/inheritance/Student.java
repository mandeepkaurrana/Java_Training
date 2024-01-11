package inheritance;

public class Student extends PostalAddress{
		private String name;
		private String branch;
		void setStudentValues(String name,String branch) {
			this.name=name;
			this.branch=branch;
			
		}
		void getStudentvalues() {
			System.out.println(name+" "+branch);
			System.out.println(hno+" "+street+" "+city);
		}
}
