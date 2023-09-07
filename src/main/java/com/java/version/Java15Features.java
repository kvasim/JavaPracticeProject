package com.java.version;
/*
1- Text Blocks
2- Helpful NullPointerException
3- Records
4- Sealed class and interface
5- GC changes and deprication
 */
public class Java15Features {
    public static void main(String[] args) {
        //Represent multiline text line
        String nameTextBlock = """
                    My name is Wasim khan
                    """;
        System.out.println(nameTextBlock);

        // Records Example
        Location location = new Location("India", 20.434,78.333);
        Location locationTwo = new Location("India", 20.434,78.333);
        System.out.println("Same Location : "+ locationTwo.equals(locationTwo));
        System.out.println("Latitude : "+location.latitude());
        System.out.println("Longitude : "+location.longitude());
        System.out.println(location);


    }
}
