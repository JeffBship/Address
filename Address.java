//  Address.java       Author: Lewis/Loftus
//  Represents a street address. 

public class Address{
   private String streetAddress;
   private String city;
   private String state;
   private long zipCode;

    //  Constructor: Sets up this address with the specified data.
   public Address(String streetAddress, String city, String state, long zipCode){
      this.streetAddress = streetAddress;
      this.city = city;
      this.state = state;
      this.zipCode = zipCode;
   }
   
   //  Returns a description of this Address object.
   public String toString(){
      String result;

      result = streetAddress + "\n";
      result += city + ", " + state + "  " + zipCode;

      return result;
   }
   
   public boolean equals (Address that){
     boolean result = false;
     result = (this.zipCode == that.zipCode) 
            && this.streetAddress.equals(that.streetAddress)
            && this.city.equals(that.city)
            && this.state.equals(that.state);
     
     
     return result;
   }
   
   
}












