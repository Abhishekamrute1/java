package Qutions;

import java.util.Scanner;

public class q8 
{
 public static void main(String[] args) 
 {
  try (Scanner sc = new Scanner(System.in)) {
    System.out.println("enter the marks in ");
    System.out.println("pysics");
    int py = sc.nextInt();
    System.out.println("maths");
    int ma = sc.nextInt();
    System.out.println("chemistry");
    int ch = sc.nextInt();
    System.err.println("faundation corse");
    int fc = sc.nextInt();
    int sum = py + ma + ch + fc;
    float per = (float)sum / 5.5f;
    System.out.println("totle no is =");
    System.out.println(sum);
    System.out.println("persentage is =");
    System.out.println(per);
    if(per>=33)
    {
      System.out.println("your gret is");
      if(per>=85)
      {
          System.out.println("A+");
      }
      else if(per>=70)
      {
          System.out.println("A");
      }
      else if(per>=60)
      {
          System.out.println("B");
      }
      else
      {
          System.out.println("C");
      }
    }
    else
    {
      System.out.println("you are fall");
    }
  }
  } 
 }   
