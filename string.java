public class string {
    public static void main(String[]args){
        String name = "arthika";
        String name1 = "anu";
        String fullname= name + name1;
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(5));
        System.out.println(name.substring(1,5));
        System.out.println(fullname);
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
       String str = new String(chars);
      System.out.println(str);
      char[] chars1 = {'H', 'e', 'l', 'l', 'o'};
       String str1 = new String(chars1);

         System.out.println(str1);
    }
    
}
