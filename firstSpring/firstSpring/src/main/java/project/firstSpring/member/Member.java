package project.firstSpring.member;

public class Member {
    private Long id;
    private String name;
    private Grade grade;

    public Member(Long id, String name, Grade grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Grade getGrade(){
        return grade;
    }
    public void setId(){
        this.id = id;
    }
    public void setName(){
        this.name = name;
    }
    public void setGrade(){
        this.grade = grade;
    }
}
