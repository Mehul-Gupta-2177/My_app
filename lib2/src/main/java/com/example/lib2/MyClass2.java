package com.example.lib2;
import java.util.*;

class Interview_details
{
    String city;
    int Backend;
    int Android;
    int IOS;

    Interview_details(String city,int Backend,int Android,int IOS)
    {
        this.city = city;
        this.Backend = Backend;
        this.Android = Android;
        this.IOS = IOS;
    }

}

public class MyClass2 {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Backend",0);
        map.put("Android",0);
        map.put("IOS",0);

        LinkedList<Interview_details> ll = new LinkedList<Interview_details>();

        Interview_details first = new Interview_details("Bangalore",3,6,9);
        Interview_details second = new Interview_details("Chennai",6,2,4);
        Interview_details third = new Interview_details("Hyderabad",1,10,3);

        ll.add(first);
        ll.add(second);
        ll.add(third);

        String Back_city = "";
        String And_city = " ";
        String IOS_city = " ";


        for(int i = 0; i < ll.size(); i++)
        {
            System.out.println((ll.get(i)).IOS );
            if((ll.get(i)).Backend > map.get("Backend"))
            {
                Back_city = (ll.get(i)).city;
                map.put("Backend",(ll.get(i)).Backend);
            }

            if((ll.get(i)).Android > map.get("Android"))
            {
                And_city = (ll.get(i)).city;
                map.put("Android",(ll.get(i)).Android);
            }

            if((ll.get(i)).IOS > map.get("IOS"))
            {

                IOS_city = (ll.get(i)).city;
                map.put("IOS",(ll.get(i)).IOS);
            }
        }

        System.out.println("Backend Interview - " + Back_city );
        System.out.println("Android Interview - " + And_city );
        System.out.println("IOS Interview - " + IOS_city );
    }
}
