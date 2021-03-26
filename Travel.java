import java.util.*;
public class Travel {


private String Name;
private double price;
private int Days;


public Travel(String Name, double price, int Days) {

    this.setName(Name);
    this.setPrice(price);
    this.setDays(Days);
}


public String getName() {
    return Name;
}

public void setName(String Name) {
    this.Name = Name;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}

public int getDays() {
    return Days;
}

public void setDays(int days) {
    this.Days = days;
}

public static void printTableHeader() {
    System.out.println(String.format("%30s %25s %10s %25s %10s", "Place", "|", "Price($)", "|", "Days"));
    System.out.println(String.format("%s", "----------------------------------------------------------------------------------------------------------------"));
}
public void printTable() {
    System.out.println(String.format("%30s %25s %10.2f %25s %10s", this.getName(), "|", this.getPrice(), "|", this.getDays()));
}


public static List<Travel> buildTable() {
    List<Travel> placeList = new ArrayList<>();
    placeList.add(new Travel("BTM LAYOUT", 200, 5));
    placeList.add(new Travel("KORAMANGALA", 350, 4));
    placeList.add(new Travel("ADUGODI", 470, 8));
	 placeList.add(new Travel("ANEPALYA", 520, 6));
	  placeList.add(new Travel("JC MARKET", 600, 10));
	  placeList.add(new Travel("HSR LAYOUT", 280, 4));
	   placeList.add(new Travel("BOMMANAHALLI", 210, 6));
	    placeList.add(new Travel("ELECTRONIC CITY", 450, 8));
    return placeList;
}

public static void main (String[] args) {

    Travel.printTableHeader();
Travel.buildTable().forEach(Travel::printTable);
   
 }
}
