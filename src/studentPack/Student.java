package studentPack;

public class Student {
private int Sid;
private String name;
private String SchoolName;
public Student(int sid, String name, String schoolName) {
	super();
	Sid = sid;
	this.name = name;
	SchoolName = schoolName;
}
public String getSchoolName() {
	return SchoolName;
}

public int getSid() {
	return Sid;
}

public String getName() {
	String s=new String(name);
	return s;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	//result = prime * result + ((SchoolName == null) ? 0 : SchoolName.hashCode());
	result=prime*result;
	return result;
}
/**
 *
 */
@Override
public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if (getClass() != obj.getClass())
//		return false;
//	Student other = (Student) obj;
//	if (SchoolName == null) {
//		if (other.SchoolName != null)
//			return false;
//	} else if (SchoolName.equals(other.SchoolName))
//		return false;
	return false;
}

/*
/*
@Override
public int hashCode() {
  final int prime = 31;
	/*int result = 1;
	result = prime * result + ((SchoolName == null) ? 0 : SchoolName.hashCode());
	return result;  */
//	return 1; //if we ovveride hashcode method of object class then if our hashcode method returns a constant 
	// no then only one entry possible in hashmap)
//} */
//@Override
//public boolean equals(Object obj) {
//	if (this == obj)
//		return false;
//	if (obj == null)
//		return false;
//	if (getClass() == obj.getClass())
//		return false; 
//	Student other = (Student) obj;
//	if (SchoolName == null) {
//		if (other.SchoolName != null)
//			return false;
//	} else if (SchoolName.equals(other.SchoolName))
//		return false;
//	return true;
//}


}
