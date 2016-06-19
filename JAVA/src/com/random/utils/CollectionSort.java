package nonweb.utils;
import java.util.ArrayList;
import java.util.Collections;

class Song implements Comparable<Song> {
	Integer name;
	int price;

	public Integer getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int compareTo(Song s) {
		return -1;//this.name - s.name;
	}

}

public class CollectionSort {
	public static void main(String[] args) {
		Song s = new Song();
		s.setName(2);
		s.setPrice(10);
		ArrayList<Song> al = new ArrayList<Song>();
		al.add(s);

		s = new Song();
		s.setName(1);
		s.setPrice(10);
		al.add(s);
		System.out.println(al.get(0).name);
		System.out.println(al.get(1).name);
		Collections.sort(al);
		System.out.println(al.get(0).name);
		System.out.println(al.get(1).name);

	}

}
