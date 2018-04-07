package com.github.Petrnet.Domaciukol1.logika;


public class Vocabulary
{
 private String cesky;
 private String anglicky;
 private String UriObrazku;
 
 public Vocabulary(String cesky, String anglicky, String UriObrazku)
 {
     this.cesky = cesky;
     this.anglicky = anglicky;
     this.UriObrazku = UriObrazku;
   
 }
 public String getCesky() 
 {
     return cesky;
 }
 public String getAnglicky() 
 {
     return anglicky;
 }
     
 public String getUriObrazku() 
     {
         return UriObrazku;    
     
 }
}