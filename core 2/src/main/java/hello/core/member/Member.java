package hello.core.member;

public class Member {
	private Long id;
	private String member;
	private Grade grade;

	public Member(Long id, String member, Grade grade) {
		this.id = id;
		this.member = member;
		this.grade = grade;
	}

	public Long getId() {
		return id;
	}

	public String getMember() {
		return member;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}
}
