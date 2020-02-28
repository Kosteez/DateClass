/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objrefsample;
import java.util.Date;
/**
 *
 * @author cstuser
 */
public class ObjRefSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date today = new Date();
        Date copyToday = today;
        Date cloneToday = (Date) today.clone();
        
        System.out.println("Today: " + today);
        System.out.println("copyToday: " + copyToday);
        System.out.println("cloneToday: " + cloneToday);
        
        System.out.println();
        
        if (today==copyToday) {
            System.out.println("\ntoday and copyToday ARE refering to the same object.");
        } else {
            System.out.println("\ntoday and copyToday ARE NOT  refering to the same object.");
        }
       
        System.out.println();
        
        if (today==cloneToday) {
            System.out.println("\ntoday and cloneToday ARE refering to the same object.");
        } else {
            System.out.println("\ntoday and cloneToday ARE NOT  refering to the same object.");
        }
        System.out.println();
        
        today.setMonth(5);
        cloneToday.setMonth(5);
        
        System.out.println("Today: " + today);
        System.out.println("copyToday: " + copyToday);
        System.out.println("cloneToday: " + cloneToday);
    }
}
