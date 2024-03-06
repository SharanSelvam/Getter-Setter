class IndianRupeeTester
{
 public static void main(String args[])
 {  
  IndianRupee.noOfLanguages = 15;
  IndianRupee rupee = new IndianRupee();
  rupee.setRupeeId("R1");
  rupee.setRupeeName("Twenty Rupee");
  rupee.setPrintDate(2019);
  rupee.setColor("Green");
  rupee.setSerialNo("00A373512");
  rupee.setBackSidePlaceName("Ellora Caves");
  rupee.setLocation("Delhi");
  rupee.setSize("14.7 X 6.2 cm");
  
  System.out.println("Rupee id is: " +rupee.getRupeeId());
  System.out.println("Rupee name is: " +rupee.getRupeeName());
  System.out.println("Date of print is: " +rupee.getprintDate());
  System.out.println("Color of note is: " +rupee.getColor());
  System.out.println("Serial no is: " +rupee.getSerialNo());
  System.out.println("No of languages is: " +IndianRupee.noOfLanguages);
  System.out.println("Name of monument is: " +rupee.getBackSidePlaceName());
  System.out.println("Location: " +rupee.getLocation());
  System.out.println("Size of note is: " +rupee.getSize());
  System.out.println();
  
  IndianRupee rupee1 = new IndianRupee();
  rupee1.setRupeeId("R2");
  rupee1.setRupeeName("Fifty Rupee");
  rupee1.setPrintDate(2023);
  rupee1.setColor("Blue");
  rupee1.setSerialNo("00A375312");
  rupee1.setBackSidePlaceName(" Hampi");
  rupee1.setLocation("Karnataka");
  rupee1.setSize("66 X 135 mm");
  
  System.out.println("Rupee id is: " +rupee1.getRupeeId());
  System.out.println("Rupee name is: " +rupee1.getRupeeName());
  System.out.println("Date of print is: " +rupee1.getprintDate());
  System.out.println("Color of note is: " +rupee1.getColor());
  System.out.println("Serial no is: " +rupee1.getSerialNo());
  System.out.println("No of languages is: " +IndianRupee.noOfLanguages);
  System.out.println("Name of monument is: " +rupee1.getBackSidePlaceName());
  System.out.println("Location: " +rupee1.getLocation());
  System.out.println("Size of note is: " +rupee1.getSize());
  System.out.println();
  
  IndianRupee rupee2 = new IndianRupee();
  rupee2.setRupeeId("R3");
  rupee2.setRupeeName("Two hundred Rupee");
  rupee2.setPrintDate(2022);
  rupee2.setColor("Orange");
  rupee2.setSerialNo("00A775312");
  rupee2.setBackSidePlaceName(" Sanchi Stupa");
  rupee2.setLocation("Nashik");
  rupee2.setSize("66 X 150 mm");
  
  System.out.println("Rupee id is: " +rupee2.getRupeeId());
  System.out.println("Rupee name is: " +rupee2.getRupeeName());
  System.out.println("Date of print is: " +rupee2.getprintDate());
  System.out.println("Color of note is: " +rupee2.getColor());
  System.out.println("Serial no is: " +rupee2.getSerialNo());
  System.out.println("No of languages is: " +IndianRupee.noOfLanguages);
  System.out.println("Name of monument is: " +rupee2.getBackSidePlaceName());
  System.out.println("Location: " +rupee2.getLocation());
  System.out.println("Size of note is: " +rupee2.getSize());
  System.out.println();
  }
  }