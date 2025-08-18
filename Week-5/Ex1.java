class StringMethods {
  public static void main(String[] args) {
    System.out.println("Navaneedan S\n2024503557");
    String s1= "Welcome to Java" ;
    String s2 = s1;
    String s3 = new String("Welcome to Java");
    String s4 = s1.intern();
    System.out.println("s1 = "+s1+"\ns2 = "+s2+"\ns3 = "+s3+"\ns4 = "+s4);
    if(s1==s2) {
        System.out.println("Both s1 and s2 have same references");
    } else {
        System.out.println("s1 and s2 have different references");
    }
    if(s2==s3) {
        System.out.println("Both s1 and s2 have same references");
    } else {
        System.out.println("s1 and s2 have different references");
    }
    if(s1.equalsIgnoreCase(s2)) {
        System.out.println("s1 and s2 are equal while ignoring case");
    } else {
        System.out.println("s1 and s2 are not equal while ignoring case");
    }
    if(s2.equals(s3)) {
        System.out.println("s2 and s3 are equal");
    } else {
        System.out.println("s2 and s3 are not equal");
    }
    int val = s1.compareTo(s2);
    if(val == 0) {
        System.out.println("s1 and s2 are equal");
    } else if(val > 0) {
        System.out.println("s1 is greater than s2");
    } else {
        System.out.println("s2 is greater than s1");
    }
    if(s1 == s4) {
        System.out.println("s1 and s4 have same references");
    } else {
        System.out.println("s1 and s2 have different references");
    }
    String str = s1+s2;
    System.out.println("s1+s2 = "+str);
    System.out.println("s1.charAt(0) = "+s1.charAt(0));
    System.out.println("s1.indexOf('j') = "+s1.indexOf('j'));
    System.out.println("s1.indexOf(\"to\") = "+s1.indexOf("to"));
    System.out.println("s1.lastIndex('a') = "+s1.lastIndexOf('a'));
    System.out.println("s1.lastIndexOf(\"o\",10) = "+s1.lastIndexOf("o",14));
    System.out.println("s1.code.Point.Count(0,s1.length()) = "+s1.codePointCount(0,s1.length()));
    String strJoin = String.join("-",s1,s2,s3);
    System.out.println("String.join(' ',s1,s2,s3) = "+strJoin);
    System.out.println("s1.length() = "+s1.length());
    System.out.println("s1.substring(3) = "+s1.substring(3));
    System.out.println("s1.substring(1,3) = "+s1.substring(1, 3));
    System.out.println("s1.startsWith(\"Wel\") = "+s1.startsWith("Wel"));
    System.out.println("s1.endsWith(\"Java\") = "+s1.endsWith("Java"));
    System.out.println("s1.toLowerCase() = "+s1.toLowerCase());
    System.out.println("s1.toUpperCase() = "+s1.toUpperCase());
    System.out.println("\"  Hi\".trim() = "+"  Hi".trim());
    System.out.println("s1.replace('o','O') = "+s1.replace('o','O'));
    System.out.println("s1.replaceAll(\"o\",\"O\") = "+s1.replaceAll("o", "O"));
    System.out.println("s1.replaceFirst(\"o\",\"O\") = "+s1.replaceFirst("o", "O"));
    String[] split = s1.split(" ");
    System.out.println("String[] split = s1.split(\" \")\nsplit[0] = "+split[0]);
    System.out.println("split[1] = "+split[1]);
    System.out.println("split[2] = "+split[2]);
    String[] split2 = s1.split("o",3);
    System.out.println("String[] split2 = s1.split(\" \")\nsplit2[0] = "+split2[0]);
    System.out.println("split2[1] = "+split2[1]);
    System.out.println("split2[2] = "+split2[2]);
    char[] charArr = s1.toCharArray();
    System.out.print("Char array : ");
    for(int i=0;i<charArr.length;i++) {
        System.out.print(charArr[i]);
    }
    System.out.println("s1.codePointAt(0) = "+s1.codePointAt(0));
    System.out.println("s1.contains(\"or\") = "+s1.contains("or"));
  }  
}