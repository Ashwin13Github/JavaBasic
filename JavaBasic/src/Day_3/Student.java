package Day_3;
public class Student {
private int s_id;
private String s_name;
private String city;
public int getS_id() {
	return s_id;
}
public void setS_id(int s_id) {
	this.s_id = s_id;
}
public String getS_name() {
	return s_name;
}
public void setS_name(String s_name) {
	this.s_name = s_name;
}
public String getcity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString()
{
	return "Studentinfo [Sid="+s_id+",sname="+s_name+",city="+city+"]";
}

}