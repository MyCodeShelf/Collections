package studentPack;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Student> store= new HashMap<>();
ArrayList<Student> storeList=new ArrayList<>();
Student st1=new Student(12, "a", "ajax");
Student st2=new Student(21,"b", "ajax");
Student st3=new Student(23, "c", "kent");
storeList.add(st1);
storeList.add(st2);
storeList.add(st3);
ArrayList<Student> filteredData=new ArrayList<>();
storeList.stream().filter(x -> x.getSid()<11).forEach(x->System.out.println(x.getName()));
storeList.stream().map(y -> (y.getSid())*2).forEach(y->System.out.println(y));
storeList.forEach(x->System.out.println(x.getSid()+" "+x.getName()+" "+x.getSchoolName()));
//storeList.stream().map(y -> (y.getSid()*2)).forEach(y->System.out.println(y));
//filteredData=storeList.stream().map(y -> y.getSid()*2 & y.getName() & y.getName()).collect(Collectors.toList());

store.put(st1.getSchoolName(), st1);
store.put(st2.getSchoolName(), st2);

//System.out.println(store.);
store.forEach((k,v)-> System.out.println("\n"+ k + "  "+v.getName()+" "+v.getSid()));

/**********************************************/
School sc1=new  School("Abc");

School sc2=new School("Abc");
HashMap<School , Student> sameschool =new HashMap<>();
sameschool.put(sc1, st1);
sameschool.put(sc2, st2);
sameschool.forEach((k,v)->System.out.println(k + "  " +v.getName()));

/********************************/

KindergartenKids kid1=new KindergartenKids(12, "alex");
KindergartenKids kid2=new KindergartenKids(12, "stuart");
//here kid1 objects calls equals method on kid2 and finds same object due to 
if(kid1.equals(kid2))
	System.out.println("Kid 1: "+kid1.hashCode() +" kid 2: "+kid2.hashCode());
else
System.out.println("not same objects");
	}

}
