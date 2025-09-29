import java.util.Scanner;
class days_of_year{
public static void main(String []args){
Scanner kbd = new Scanner(System.in);
int mm;
int dd;
int doy;   //date of the year 
mm= kbd.nextInt();
dd= kbd.nextInt();
doy = dd;
switch (mm-1){
case 11 :                              
doy += 30;                                      
case 10:
doy += 31;
case 9 :
doy+=30;
case 8:
doy+=31;
case 7:
doy+=30;
case 6:
doy+= 31;9
case 5:
doy +=30;
case 4:
doy += 31;
case 3:
doy +=30;
case 2:
doy+= 28;
case 1:
doy+=31;

}
System.out.printf("date of the year = %d for %d-%d",doy,mm,dd);
}
}
/*
8  24
*/