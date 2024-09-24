import java.util.Random;

public class random {

    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";
        String special="<>,.?/[]{}~`|/!@#$%^&*)(_+-=";
        String c=upper+lower+special+num;
        int l=10;
        char [] password=new char[l];
        Random r = new Random();
        for(int i=0;i<l;i++){
            password[i]=c.charAt(r.nextInt(c.length()));
        }
        System.out.println("Generted Password:"+new String(password));

        
    }
    
}
