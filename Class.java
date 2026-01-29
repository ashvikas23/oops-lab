import java.io.*;
import java.util.Scanner;
class CPU{
int price;
CPU(int price)
{
this.price=price;
}
class processor{
int cores;
String manufacturer;
processor(int cores,String manufacturer){
this.cores=cores;
this.manufacturer=manufacturer;
}
void display(){
System.out.println("Number of cores: "+cores);
System.out.println("Manufacturer of processor: "+manufacturer);
}
}
static class RAM{
int memory;
String manufacturer;
RAM(int mem,String m)
{
memory=mem;
manufacturer=m;
}
void display(){
System.out.println("Memory: "+memory);
System.out.println("Manufacturer of RAM: "+manufacturer);
}
}
void display(){
System.out.println("Price of CPU: "+price);
}
}
class Class
{
public static void main(String[] args)
{
CPU obj=new CPU(222000);
CPU.processor pro=obj.new processor(3,"intel");
CPU.RAM rm=new CPU.RAM(32,"Del");
obj.display();
pro.display();
rm.display();
}
}


