package nonweb.utils;

import java.util.HashMap;

class MyKey {

/*	@Override
	public boolean equals(Object obj) {
		System.out.println("anubhav");
		return ((MyKey) obj).key.equals(this.key);
	}
*/
/*	@Override
	public int hashCode() {
		System.out.println("anubhavhash v=code");
		return key.hashCode();
	}
*/
	private String key;

	@Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyKey other = (MyKey) obj;
        if (key == null)
        {
            if (other.key != null)
                return false;
        }
        else if (!key.equals(other.key))
            return false;
        return true;
    }

    public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return key;
	}
	

}

public class UserObjAsHashMapKey {
	public static void main(String[] args) {
		HashMap<MyKey, String> hm = new HashMap<MyKey, String>();

		MyKey mc = new MyKey();
		mc.setKey("k1");
		
		hm.put(mc, "value 1");
System.out.println("--------------------------");
		mc = new MyKey();
		mc.setKey("k1");
		hm.put(mc, "v2");
		System.out.println("--------------------------");
		mc = new MyKey();
		mc.setKey("k3");
		hm.put(mc, "v3");
		System.out.println("--------------------------");
		/*MyKey tempKey = new MyKey();
		tempKey.setKey("k1");
		
		System.out.println("--------------------------");
		System.out.println(hm.get(tempKey));*/
		System.out.println(hm);

	}
}
