
import java.util.Objects;

public class Customer implements Comparable<Customer> {
private int customerId;
private static int count=0;
public static int getCount() {
	return count;
}
 
private String name;
String location;
String email;
void setCustomerId(int customerId)
{  
	 this.customerId=customerId;
}
int getCustomerId()
{
	 return customerId;
}
Customer(int customerId,String name,String location,String email)
{
	 this.customerId=customerId;
	 this.name=name;
	 this.location=location;
	 this.email=email;
	 count=count+1;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public int compareTo(Customer o) {
	// TODO Auto-generated method stub
		return this.customerId-o.getCustomerId();
	
}
public String toString()
{
	return name+" "+location+" "+ email+" "+customerId;
}
@Override
public int hashCode() {
	return Objects.hash(customerId, email, location, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	return customerId == other.customerId && Objects.equals(email, other.email)
			&& Objects.equals(location, other.location) && Objects.equals(name, other.name);
}
 
 
 
 
}