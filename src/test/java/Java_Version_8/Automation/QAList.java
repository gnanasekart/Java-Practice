package Java_Version_8.Automation;

public class QAList {
	
	private long empId;
	private String name;
	private String post;
	
	public QAList(long empId, String name, String post) {
		this.empId = empId;
		this.name = name;
		this.post = post;
	}
	
	public String getPost() {
		return post;
	}
	
	public void setPost(String post) {
		this.post = post;
	}
	
	public long getEmpId() {
		return empId;
	}
	
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "empId=" + empId + ", name=" + name + ", post=" + post;
	}
	
}
