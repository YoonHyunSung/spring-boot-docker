package SBoot.SpringDocker.inheritance;

import lombok.Data;
import lombok.NoArgsConstructor;
public class MyFriends {
    public Friend[] getFriends() {
        Friend[] friends = new Friend[4];
        String[] names = {"Lee", "SE0", "YOON", "PARK"};
        String[] majors = {"Computer", "Electronics"};
        String[] departments = {"R&D 1", "R&D 2"};
        String[] phone = {"010-1234", "010-2345", "010-5566", "010-7787"};
        for (int i = 0; i <friends.length; i++) {
                friends[i] = (i < 2) ? new UnivFriend(names[i], majors[i], phone[i]):
                        new CompFriend(names[i], departments[i-2], phone[i]);
            }
            return friends;
        }
}

@NoArgsConstructor
@Data class Friend{
    protected String name;
    protected String phone;
    public Friend(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
}
@Data class UnivFriend extends Friend{
    private String major;
    public UnivFriend(String name, String major, String phone){
        super(name, phone);
        this.major= major;
    }
    @Override public String toString(){
        return String.format("대학친구: %s %s %s",name,major,phone);
    }

}
//class 에서의 final은 상속을 받지않는다.
@Data final class CompFriend extends Friend{
    private String department;
    public CompFriend(String name, String department, String phone){
        super(name, phone);
        this.department= department;
    }
    @Override public String toString(){
        return String.format("직장동료: %s %s %s",name,department,phone);
    }
}