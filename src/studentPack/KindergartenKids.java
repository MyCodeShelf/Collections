package studentPack;

public class KindergartenKids {
private int Kid;
private String KidName;
public KindergartenKids(int kid, String kidName) {
	super();
	Kid = kid;
	KidName = kidName;
}
public int getKid() {
	return Kid;
}

public String getKidName() {
	return KidName;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Kid;
	return result;
}
@Override
public boolean equals(Object obj) {
	
	KindergartenKids other = (KindergartenKids) obj;
	if (Kid != other.Kid)
		return false;
	return true;
}

}
