/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fboy;

/**
 *
 * @author L410-S01
 */
public class Fboy {

    public static int maximum(int[] a) {
            int max = a[0];
            for(int i = 1; i < a.length;i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}

    }
        
        return max;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] a ={ 20, 30, 50, 4, 71, 100};
        int v = maximum(a);
       System.out.println("From The Array Element Largest Number is:" + v);
    }
}
