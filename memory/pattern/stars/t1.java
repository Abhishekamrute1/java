// package pattern.stars;

// import java.util.Scanner;

// public class t1 {
//     public static void main(String[] args) {
//      try (Scanner sq = new Scanner(System.in)) {
//         System.out.println("how many variable you want");
//          int n = sq.nextInt();
//          String[] variableNames = new String[n];
//          String[] variableTypes = new String[n];
//          Object[] variableValues = new Object[n];
//          for (int i = 0; i <n; i++) {
//             System.out.println("Enter details for variable " + (i + 1) + ":");
//             System.out.print("Data Type: ");
//             variableTypes[i] = sq.next();
//             System.out.print("Name: ");
//             variableNames[i] = sq.next();
//             // Get value based on data type
//             System.out.print("Value: ");
//             switch (variableTypes[i]) {
//                 case "int":
//                     variableValues[i] = sq.nextInt();
//                     break;
//                 case "double":
//                     variableValues[i] = sq.nextDouble();
//                     break;
//                 case "char":
//                     variableValues[i] = sq.next().charAt(0);
//                     break;
//                 case "String":
//                     variableValues[i] = sq.next();
//                     break;
//                 case "float":
//                       variableValues[i] = sq.next();
//                     break;
//                  case "long":
//                       variableValues[i] = sq.next();
//                     break;
//                  case "short":
//                       variableValues[i] = sq.next();
//                     break;
//                 case "boolean":
//                       variableValues[i] = sq.next();
//                     break;
//                 case "byte":
//                       variableValues[i] = sq.next();
//                     break;
//                 default:
//                     System.out.println("Unsupported data type. Please enter a valid data type.");
//                     i--; // Decrement i to re-enter details for the current variable
//             }
//         }
//          // Print the variables along with their values
//         //  System.out.println("\nVariables and their values:");
//         //  for (int i = 0; i < n; i++) {
//         //      System.out.println(variableNames[i] + " (" + variableTypes[i] + "): " + variableValues[i]);
//         //  }
//         System.out.println("Enter the mathematical operation (+, -, *, /): ");
//         String operation = sq.next();

//         if (!isValidOperation(operation)) {
//             System.out.println("Invalid operation. Exiting program.");
//             System.exit(1);
//         }

//         // Print the variables along with their values
//         System.out.println("Variables and their values:");
//         for (int i = 0; i < n; i++) {
//             System.out.println(variableNames[i] + " (" + variableTypes[i] + "): " + variableValues[i]);
//         }

//         // Perform the specified mathematical operation
//         performOperation(variableValues, operation);

//         sq.close();
//      }
//     }
// }
    

//      private static boolean isValidOperation(String operation) {
//         return operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/");
//     }

//     private static void performOperation(Object[] variableValues, String operation) {
//         Scanner scanner = new Scanner(System.in);
//         double result = 0;

//         switch (operation) {
//             case "+":
//                 result = (double) variableValues[0] + (double) variableValues[1];
//                 break;
//             case "-":
//                 result = (double) variableValues[0] - (double) variableValues[1];
//                 break;
//             case "*":
//                 result = (double) variableValues[0] * (double) variableValues[1];
//                 break;
//             case "/":
//                 result = (double) variableValues[0] / (double) variableValues[1];
//                 break;
//         }

//         System.out.println("Result of " + variableValues[0] + " " + operation + " " + variableValues[1] + " is: " + result);
     
//   }
// }